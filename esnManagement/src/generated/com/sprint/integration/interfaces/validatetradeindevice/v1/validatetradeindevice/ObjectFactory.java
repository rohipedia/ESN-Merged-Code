
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateTradeInDevice_QNAME = new QName("http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd", "validateTradeInDevice");
    private final static QName _ValidateTradeInDeviceResponse_QNAME = new QName("http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd", "validateTradeInDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateTradeInDeviceRequestType }
     * 
     */
    public ValidateTradeInDeviceRequestType createValidateTradeInDeviceRequestType() {
        return new ValidateTradeInDeviceRequestType();
    }

    /**
     * Create an instance of {@link ValidateTradeInDeviceResponseType }
     * 
     */
    public ValidateTradeInDeviceResponseType createValidateTradeInDeviceResponseType() {
        return new ValidateTradeInDeviceResponseType();
    }

    /**
     * Create an instance of {@link AccountInfoType }
     * 
     */
    public AccountInfoType createAccountInfoType() {
        return new AccountInfoType();
    }

    /**
     * Create an instance of {@link AccountTypeInfoType }
     * 
     */
    public AccountTypeInfoType createAccountTypeInfoType() {
        return new AccountTypeInfoType();
    }

    /**
     * Create an instance of {@link ConditionAnswerInfoType }
     * 
     */
    public ConditionAnswerInfoType createConditionAnswerInfoType() {
        return new ConditionAnswerInfoType();
    }

    /**
     * Create an instance of {@link ConditionAnswerListType }
     * 
     */
    public ConditionAnswerListType createConditionAnswerListType() {
        return new ConditionAnswerListType();
    }

    /**
     * Create an instance of {@link DeviceInfoType }
     * 
     */
    public DeviceInfoType createDeviceInfoType() {
        return new DeviceInfoType();
    }

    /**
     * Create an instance of {@link ExistingAccountInfoType }
     * 
     */
    public ExistingAccountInfoType createExistingAccountInfoType() {
        return new ExistingAccountInfoType();
    }

    /**
     * Create an instance of {@link NewAccountInfoType }
     * 
     */
    public NewAccountInfoType createNewAccountInfoType() {
        return new NewAccountInfoType();
    }

    /**
     * Create an instance of {@link OfferGroupInfoType }
     * 
     */
    public OfferGroupInfoType createOfferGroupInfoType() {
        return new OfferGroupInfoType();
    }

    /**
     * Create an instance of {@link OfferGroupListType }
     * 
     */
    public OfferGroupListType createOfferGroupListType() {
        return new OfferGroupListType();
    }

    /**
     * Create an instance of {@link SprintDeviceInfoType }
     * 
     */
    public SprintDeviceInfoType createSprintDeviceInfoType() {
        return new SprintDeviceInfoType();
    }

    /**
     * Create an instance of {@link SingleDeviceInfoType }
     * 
     */
    public SingleDeviceInfoType createSingleDeviceInfoType() {
        return new SingleDeviceInfoType();
    }

    /**
     * Create an instance of {@link MultiDeviceListType }
     * 
     */
    public MultiDeviceListType createMultiDeviceListType() {
        return new MultiDeviceListType();
    }

    /**
     * Create an instance of {@link MultiDeviceInfoType }
     * 
     */
    public MultiDeviceInfoType createMultiDeviceInfoType() {
        return new MultiDeviceInfoType();
    }

    /**
     * Create an instance of {@link TradeInEligibilityInfoType }
     * 
     */
    public TradeInEligibilityInfoType createTradeInEligibilityInfoType() {
        return new TradeInEligibilityInfoType();
    }

    /**
     * Create an instance of {@link TradeInEligibilityStatusInfoType }
     * 
     */
    public TradeInEligibilityStatusInfoType createTradeInEligibilityStatusInfoType() {
        return new TradeInEligibilityStatusInfoType();
    }

    /**
     * Create an instance of {@link TradeInEligibilityStatusListType }
     * 
     */
    public TradeInEligibilityStatusListType createTradeInEligibilityStatusListType() {
        return new TradeInEligibilityStatusListType();
    }

    /**
     * Create an instance of {@link TradeInResponseListType }
     * 
     */
    public TradeInResponseListType createTradeInResponseListType() {
        return new TradeInResponseListType();
    }

    /**
     * Create an instance of {@link TradeInResponseInfoType }
     * 
     */
    public TradeInResponseInfoType createTradeInResponseInfoType() {
        return new TradeInResponseInfoType();
    }

    /**
     * Create an instance of {@link TradeInListType }
     * 
     */
    public TradeInListType createTradeInListType() {
        return new TradeInListType();
    }

    /**
     * Create an instance of {@link PurchaseDeviceListType }
     * 
     */
    public PurchaseDeviceListType createPurchaseDeviceListType() {
        return new PurchaseDeviceListType();
    }

    /**
     * Create an instance of {@link TradeInInfoType }
     * 
     */
    public TradeInInfoType createTradeInInfoType() {
        return new TradeInInfoType();
    }

    /**
     * Create an instance of {@link PurchaseDeviceInfoType }
     * 
     */
    public PurchaseDeviceInfoType createPurchaseDeviceInfoType() {
        return new PurchaseDeviceInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTradeInDeviceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd", name = "validateTradeInDevice")
    public JAXBElement<ValidateTradeInDeviceRequestType> createValidateTradeInDevice(ValidateTradeInDeviceRequestType value) {
        return new JAXBElement<ValidateTradeInDeviceRequestType>(_ValidateTradeInDevice_QNAME, ValidateTradeInDeviceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTradeInDeviceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd", name = "validateTradeInDeviceResponse")
    public JAXBElement<ValidateTradeInDeviceResponseType> createValidateTradeInDeviceResponse(ValidateTradeInDeviceResponseType value) {
        return new JAXBElement<ValidateTradeInDeviceResponseType>(_ValidateTradeInDeviceResponse_QNAME, ValidateTradeInDeviceResponseType.class, null, value);
    }

}
