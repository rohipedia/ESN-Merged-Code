package com.emt.utilities;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;

import com.emt.common.ESNConstants;
import com.emt.model.BridgeSKU;
import com.spcs.retailservices.base.RmsService;
import com.spcs.retailservices.base.RmsServicePortType;
import com.sprint.integration.common.header.wsmessageheader.v2.BasicCredentialInfoType;
import com.sprint.integration.common.header.wsmessageheader.v2.SecurityMessageHeaderType;
import com.sprint.integration.common.header.wsmessageheader.v2.TrackingMessageHeaderType;
import com.sprint.integration.common.header.wsmessageheader.v2.WsMessageHeaderType;
import com.sprint.integration.common.header.wsmessageheader.v2.WsMessageHeaderType.CallingApplicationInfo;
import com.sprint.integration.eai.services.querydeviceinfoservice.v1.querydeviceinfoservice_wsdl.Faultmessage2;
import com.sprint.integration.eai.services.querydeviceinfoservice.v1.querydeviceinfoservice_wsdl.QueryDeviceInfoPortType;
import com.sprint.integration.eai.services.querydeviceinfoservice.v1.querydeviceinfoservice_wsdl.QueryDeviceInfoService;
import com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11.DeviceDetailInfoType;
import com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11.DeviceInfoType;
import com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11.ValidateDeviceV11RequestType;
import com.sprint.integration.interfaces.validatedevice.v11.validatedevicev11.ValidateDeviceV11ResponseType;

import esn.com.spcs.retailservices.Header;
import esn.com.spcs.retailservices.KitInfo;
import esn.com.spcs.retailservices.ProductBasicInfo;
import esn.com.spcs.retailservices.ProductDetailInformationRequest;
import esn.com.spcs.retailservices.ProductDetailInformationResponse;
import esn.com.spcs.retailservices.StoreBasicInfo;
import esn.com.spcs.retailservices.StoreOtherInfo;
import esn.com.spcs.retailservices.ValidateSerialNumberRequest;
import esn.com.spcs.retailservices.ValidateSerialNumberResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * This class checks consumption status of ESN
 * 
 * @author kulwant.d.singh
 *
 */
@Slf4j
@Controller
public class EsnValidationUtility {

	/**
	 * This method calls validateDeviceV11,
	 * queryProductDetailInformation & validateSerialNumber for each entry of
	 * esn in tblEsnInfo.
	 * 
	 * @param esn
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 * @throws Faultmessage2
	 */
	public boolean esnValidation(String esn, BridgeSKU bridgeSKU)
			throws ParseException, DatatypeConfigurationException {
		int isEsnConsumed = 1;
		String preferredSerialNumber;
		try {
			preferredSerialNumber = validateDeviceV11(esn);
			if (StringUtils.isNotEmpty(preferredSerialNumber)) {
				int productId = queryProductDetailInformation(bridgeSKU);
				isEsnConsumed = validateSerialNumber(preferredSerialNumber, productId);
			}
			
			if (isEsnConsumed != 1) {
				log.info("ESN" +esn+ " is not consumed");
				return false;
			} else {
				log.info("ESN" +esn+ " is consumed");
				return true;
			}
		} catch (Faultmessage2 e) {
			log.error("Error occured while validating ESN " +esn+ " in utility", e);
		}
		return false;
	}

	/**
	 * This method invokes validateDeviceV11(EAI) service
	 * 
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 * @throws Faultmessage2
	 * 
	 * @returns
	 */
	public String validateDeviceV11(String esn) throws DatatypeConfigurationException, ParseException, Faultmessage2 {
		log.debug("Triggering validateDeviceV11 EAI Service on" +ESNConstants.DATE_TIME);
		QueryDeviceInfoService queryDeviceInfoService = new QueryDeviceInfoService();
		QueryDeviceInfoPortType queryDeviceInfoPortType = queryDeviceInfoService.getQueryDeviceInfoPortType();

		ValidateDeviceV11RequestType validateDeviceV11RequestType = new ValidateDeviceV11RequestType();

		DeviceDetailInfoType deviceDetailInfo = new DeviceDetailInfoType();
		deviceDetailInfo.setDeviceSerialNumber(esn);

		DeviceInfoType deviceInfoType = new DeviceInfoType();
		deviceInfoType.setDeviceDetailInfo(deviceDetailInfo);
		validateDeviceV11RequestType.setDeviceInfo(deviceInfoType);
		//validateDeviceV11RequestType.setBrandCode("SPR");

		/* setting current date for message header */
		Date currentDate = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(format.parse(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(currentDate)));
		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		TrackingMessageHeaderType trackingMessageHeaderType = new TrackingMessageHeaderType();
		trackingMessageHeaderType.setApplicationId("N01");
		trackingMessageHeaderType.setApplicationUserId("GSTTEST03");
		trackingMessageHeaderType.setConsumerId("N01");
		trackingMessageHeaderType.setMessageId("8cfcf208-08af-4d85-a62a-7475030294e5");
		trackingMessageHeaderType.setConversationId("success");
		BigInteger timeToLive = new BigInteger("180");
		trackingMessageHeaderType.setTimeToLive(timeToLive);
		trackingMessageHeaderType.setMessageDateTimeStamp(xmlGregCal);

		WsMessageHeaderType wsMessageHeader = new WsMessageHeaderType();
		wsMessageHeader.setTrackingMessageHeader(trackingMessageHeaderType);

		SecurityMessageHeaderType securityMessageHeaderType = new SecurityMessageHeaderType();
		BasicCredentialInfoType basicCredentialInfoType = new BasicCredentialInfoType();
		basicCredentialInfoType.setId("N01");
		basicCredentialInfoType.setPassword("c4a6qwbdul3xi01h7trg");
		securityMessageHeaderType.setBasicCredentialInfo(basicCredentialInfoType);
		securityMessageHeaderType.setCorpId("741852003");

		wsMessageHeader.setSecurityMessageHeader(securityMessageHeaderType);

		CallingApplicationInfo callingApplicationInfo = new CallingApplicationInfo();
		callingApplicationInfo.setPin("1808");
		callingApplicationInfo.setVendorCode("GR");
		callingApplicationInfo.setStoreId("57957752");

		wsMessageHeader.setCallingApplicationInfo(callingApplicationInfo);

		ValidateDeviceV11ResponseType validateDeviceV11ResponseType = queryDeviceInfoPortType
				.validateDeviceV11(validateDeviceV11RequestType);
		if (ESNConstants.VALIDATION_MESSAGE.equalsIgnoreCase(validateDeviceV11ResponseType.getValidationMessage())) {
			log.info("ValidateDeviceV11 EAI Service successful and ESN "+ esn +" is valid" + validateDeviceV11ResponseType.getValidationMessage());
			return validateDeviceV11ResponseType.getPreferredSerialNumber();
		} else {
			log.info("ValidateDeviceV11 EAI Service successful and ESN "+ esn +" is invalid"+ validateDeviceV11ResponseType.getValidationMessage());
			return StringUtils.EMPTY;
		}
	}

	/**
	 * This method invokes queryProductDetailInformation(RMS) service and
	 * returns productIdentifier of deviceSku
	 * 
	 * @return
	 */
	public int queryProductDetailInformation(BridgeSKU bridgeSKU) {
		
		log.debug("Triggering queryProductDetailInformation RMS Service on"+ESNConstants.DATE_TIME);
		RmsService rmsService = new RmsService();
		RmsServicePortType rmsServicePortType = rmsService.getRmsServicePort();
		ProductDetailInformationRequest productDetailInformationRequest = new ProductDetailInformationRequest();

		Header header = createRmsServiceHeader();

		ProductBasicInfo productBasicInfo = new ProductBasicInfo();
		productBasicInfo.setProductIdentifier(0);
		
		productBasicInfo.setSku(bridgeSKU.getSku());
		productBasicInfo.setQuantity(1);

		StoreBasicInfo storeBasicInfo = new StoreBasicInfo();
		storeBasicInfo.setStoreIdentifier(57957752);

		StoreOtherInfo storeOtherInfo = new StoreOtherInfo();
		storeOtherInfo.setGeographicRegionIdentifier(0);
		storeOtherInfo.setArchiveDaysNumber(0);
		storeOtherInfo.setDefaultFloatAmount(0);
		storeOtherInfo.setSatelliteStoreInventoryIdentifier(0);
		storeOtherInfo.setPriceLevelIdentifier(0);
		storeOtherInfo.setTaxRegionIdentifier(0);
		storeOtherInfo.setDealerCode("LAWND01X");

		productDetailInformationRequest.setActionType("i");
		productDetailInformationRequest.setRetrievePrepaidSkus(false);
		productDetailInformationRequest.setHeader(header);
		productDetailInformationRequest.setStoreOtherInfo(storeOtherInfo);
		productDetailInformationRequest.setStoreBasicInfo(storeBasicInfo);
		productDetailInformationRequest.setProductBasicInfo(productBasicInfo);

		ProductDetailInformationResponse productDetailInformationResponse = rmsServicePortType
				.queryProductDetailInformation(productDetailInformationRequest);

		return productDetailInformationResponse.getProductBasicInfo().getProductIdentifier();

	}

	/**
	 * This method invokes validateSerialNumber(RMS) service
	 * 
	 * @return
	 */
	public int validateSerialNumber(String esn, int productId) {
		log.debug("Triggering validateSerialNumber RMS Service on"+ESNConstants.DATE_TIME);
		RmsService rmsService = new RmsService();
		RmsServicePortType rmsServicePortType = rmsService.getRmsServicePort();

		ValidateSerialNumberRequest validateSerialNumberRequest = new ValidateSerialNumberRequest();
		Header header = createRmsServiceHeader();

		validateSerialNumberRequest.setHeader(header);
		validateSerialNumberRequest.setSaleReturnIndicator("sale");

		KitInfo kitInfo = new KitInfo();
		kitInfo.setKitItemIndicator("N");
		kitInfo.setItemType(0);
		kitInfo.setItemIdentifier(0);
		kitInfo.setLineItemNumber(0);
		validateSerialNumberRequest.setKitInfo(kitInfo);

		ProductBasicInfo productBasicInfo = new ProductBasicInfo();
		productBasicInfo.setProductIdentifier(productId);
		productBasicInfo.setQuantity(0);
		validateSerialNumberRequest.setProductBasicInfo(productBasicInfo);

		StoreBasicInfo storeBasicInfo = new StoreBasicInfo();
		storeBasicInfo.setStoreIdentifier(57957752);
		storeBasicInfo.setStoreDistrictIdentifier(0);
		validateSerialNumberRequest.setStoreBasicInfo(storeBasicInfo);

		validateSerialNumberRequest.setSerialNumber(esn);
		validateSerialNumberRequest.setTransactionNumber(0);
		validateSerialNumberRequest.setTransactionTypeCode(100);

		ValidateSerialNumberResponse validateSerialNumberResponse = rmsServicePortType
				.validateSerialNumber(validateSerialNumberRequest);

		return validateSerialNumberResponse.getReturnValue();
	}

	/**
	 * This method creates RMS Service Header
	 * 
	 * @return
	 */
	private Header createRmsServiceHeader() {
		Header header = new Header();
		header.setStoreIdentifier(ESNConstants.STORE_IDENTIFIER);
		header.setApplIdentifier(ESNConstants.APPL_IDENTIFIER);
		header.setApplUserIdentifier(ESNConstants.APPL_IDENTIFIER);
		header.setApplUserPwd(ESNConstants.APPL_PASSWORD);
		log.info("Header created for RMS Service on"+ESNConstants.DATE_TIME);
		return header;
	}
}