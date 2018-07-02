
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDetailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lineItem" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="locBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="shortNm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oOval1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oOval2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oOval3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oOval4" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oOval5" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="unitCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oOval6" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="oOval7" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="oOval8" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="oOval9" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="oOval10" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxGroupCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oOval11" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oOval12" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oOval13" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oOval14" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oOval15" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="skuPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productTypGrpId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxMethodCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="qtyRep1" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="serialNoRep1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unitPriceRep1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promoPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lineItemType" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="markdownType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ovrdReasonId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="kitTrigger" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kitLineItem" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="kitCmpntPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="kitId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promptForPrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trackByLot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="srepBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="disAuthBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ovrAuthBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="directFulfill" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dactAuthBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="activationDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountLineno" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="actvVldnIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actDiscountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="whseCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asiOrderNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sysTrceAuditNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gcStatusIndcr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nmsManfNme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="p2kSrvcNme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="directShipEsn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnAsiSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rmaNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eticketNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxBasis" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="useTax" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tax1Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax2Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax3Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax4Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax5Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="retTaxamt1" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxamt2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxamt3" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxamt4" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxamt5" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipmentTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNoImeiId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNoMsnId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialSimId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productSimSkuId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="simSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="grossRecRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="grossRecAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="srvcXchgCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="srvcXchgAuthBaid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="armOverrideIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trackAsArmIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productStatusSeqId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="armRebateId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rebatePlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="priceOverideAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="recycleSku" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxMethod1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recycTranRefrNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recycItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applyCaTaxRulesIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bogoOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bogoDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="confirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isSkuAssignedMixMatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="setOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="setGroupLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="setSubGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="btaElgblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="grossReceiptTax1" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax3" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax4" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax5" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="erecyclePromoCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buybackPretaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cityLevelGrossRec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cityGrossRecRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cityGrossRecAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cityGrossReceiptTax1" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax3" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax4" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax5" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="upgradenowFeeLineItemNbr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="discountOfferType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buybackLineItemNbr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="buybackOverrideIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ovrBuybackAuthBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="webOrderLineItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="equipInstlBillEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eibVisible" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eibEnblIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="downpaymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="flStampTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="shoppingCartLineItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="assistedSrepId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="backOrderIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="motorolaXpersonalizeIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mrcdiscIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipInstlBillAgreemntNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipInstlBillLoanSeqNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="contractTerm" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="applnid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appleOvrdBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="depositAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="activationSequnceNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="depositSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="exchDepositamt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="equipLeaseIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ibSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originalDirectFulfill" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addnlDowpaymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="addnlDpDiscountAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="buybackDownpaymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="buybackAddnlDownpaymentAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="buybackFundPayment" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="buybackOtherSaleAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="buybackTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="maxAllowDownpmtAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="gvbkSerialNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dsSecondTransaction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="turninCreditAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="singleSkuCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brndCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reltedSkuNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shortNmReltdSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bopuisOrdrIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bopuisPrchOptCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="omimRtrnReasCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax6" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tax7" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tax8" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tax9" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxid6" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxid7" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxid8" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxid9" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxnm6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxnm7" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxnm8" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxnm9" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax6Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax7Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax8Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tax9Rule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="retTaxAmt6" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxAmt7" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxAmt8" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="retTaxAmt9" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="taxMethod6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod7" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod8" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxMethod9" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="grossReceiptTax6" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax7" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax8" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="grossReceiptTax9" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax6" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax7" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax8" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cityGrossReceiptTax9" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="deleteActvnUpgdFeeAuthBaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rowNbr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prntRowNbr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hcOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asmtCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intRtQty" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totIntAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="purchaseType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchangeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="srpDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="instlPaidCnt" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="upgrEarlyCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trdinSerialNbr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appliedLeaseDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="appliedLeaseAdpsDiscAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="turninOriginalSku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acctPostAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="oneclickIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oneclickReadyIndcr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rtrnDevModelNme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trdinPromoCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newSkuHcp2Contract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ibCheckbox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="devDamageFeeTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="excdQtyOvrBaId" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="deviceExistsInInventory" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="exchangeovrdbaid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="exchangeReasonCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetailInfo", propOrder = {
    "transNo",
    "lineItem",
    "locBaId",
    "productId",
    "qty",
    "unitPrice",
    "shortNm",
    "discountRate",
    "discountAmt",
    "oOval1",
    "oOval2",
    "oOval3",
    "oOval4",
    "oOval5",
    "unitCost",
    "oOval6",
    "oOval7",
    "oOval8",
    "oOval9",
    "oOval10",
    "taxGroupCd",
    "oOval11",
    "oOval12",
    "oOval13",
    "oOval14",
    "oOval15",
    "skuPrice",
    "serialNo",
    "productTypGrpId",
    "taxMethodCd",
    "qtyRep1",
    "serialNoRep1",
    "unitPriceRep1",
    "discountId",
    "promoId",
    "promoPrice",
    "sku",
    "lineItemType",
    "markdownType",
    "ovrdReasonId",
    "kitTrigger",
    "kitLineItem",
    "kitCmpntPrice",
    "kitId",
    "promptForPrice",
    "trackByLot",
    "transId",
    "srepBaId",
    "disAuthBaId",
    "ovrAuthBaId",
    "directFulfill",
    "dactAuthBaId",
    "flag",
    "activationDiscount",
    "discountInfo",
    "discountLineno",
    "actvVldnIndcr",
    "actDiscountId",
    "whseCd",
    "asiOrderNbr",
    "cardNbr",
    "sysTrceAuditNbr",
    "tranId",
    "gcStatusIndcr",
    "nmsManfNme",
    "p2KSrvcNme",
    "directShipEsn",
    "returnAsiSku",
    "rmaNbr",
    "eticketNbr",
    "taxBasis",
    "useTax",
    "tax1Rule",
    "tax2Rule",
    "tax3Rule",
    "tax4Rule",
    "tax5Rule",
    "retTaxamt1",
    "retTaxamt2",
    "retTaxamt3",
    "retTaxamt4",
    "retTaxamt5",
    "source",
    "equipmentTypeCd",
    "serialNoImeiId",
    "serialNoMsnId",
    "serialSimId",
    "productSimSkuId",
    "simSku",
    "grossRecRate",
    "grossRecAmt",
    "srvcXchgCd",
    "srvcXchgAuthBaid",
    "armOverrideIndcr",
    "trackAsArmIndcr",
    "productStatusSeqId",
    "armRebateId",
    "rebatePlanCd",
    "priceOverideAmount",
    "recycleSku",
    "taxMethod1",
    "taxMethod2",
    "taxMethod3",
    "taxMethod4",
    "taxMethod5",
    "recycTranRefrNbr",
    "recycItemId",
    "applyCaTaxRulesIndcr",
    "bogoOfferId",
    "bogoDiscAmt",
    "reservationId",
    "confirmationNumber",
    "isSkuAssignedMixMatch",
    "setOfferId",
    "setGroupLevel",
    "setSubGroupName",
    "btaElgblIndcr",
    "grossReceiptTax1",
    "grossReceiptTax2",
    "grossReceiptTax3",
    "grossReceiptTax4",
    "grossReceiptTax5",
    "erecyclePromoCd",
    "buybackPretaxAmt",
    "cityLevelGrossRec",
    "cityGrossRecRate",
    "cityGrossRecAmt",
    "cityGrossReceiptTax1",
    "cityGrossReceiptTax2",
    "cityGrossReceiptTax3",
    "cityGrossReceiptTax4",
    "cityGrossReceiptTax5",
    "upgradenowFeeLineItemNbr",
    "discountOfferType",
    "buybackLineItemNbr",
    "buybackOverrideIndcr",
    "ovrBuybackAuthBaId",
    "webOrderLineItemId",
    "equipInstlBillEnblIndcr",
    "eibVisible",
    "eibEnblIndcr",
    "downpaymentAmt",
    "flStampTaxAmt",
    "shoppingCartLineItemId",
    "assistedSrepId",
    "backOrderIndcr",
    "motorolaXpersonalizeIndcr",
    "mrcdiscIndcr",
    "equipInstlBillAgreemntNbr",
    "equipInstlBillLoanSeqNo",
    "contractTerm",
    "applnid",
    "appleOvrdBaId",
    "depositAmount",
    "activationSequnceNumber",
    "depositSequenceNumber",
    "exchDepositamt",
    "equipLeaseIndcr",
    "ibSerialNo",
    "originalDirectFulfill",
    "addnlDowpaymentAmt",
    "addnlDpDiscountAmt",
    "buybackDownpaymentAmt",
    "buybackAddnlDownpaymentAmt",
    "buybackFundPayment",
    "buybackOtherSaleAmt",
    "buybackTaxAmount",
    "maxAllowDownpmtAmt",
    "gvbkSerialNbr",
    "dsSecondTransaction",
    "turninCreditAmt",
    "singleSkuCd",
    "brndCd",
    "reltedSkuNbr",
    "shortNmReltdSku",
    "bopuisOrdrIndcr",
    "bopuisPrchOptCd",
    "omimRtrnReasCd",
    "tax6",
    "tax7",
    "tax8",
    "tax9",
    "taxid6",
    "taxid7",
    "taxid8",
    "taxid9",
    "taxnm6",
    "taxnm7",
    "taxnm8",
    "taxnm9",
    "tax6Rule",
    "tax7Rule",
    "tax8Rule",
    "tax9Rule",
    "retTaxAmt6",
    "retTaxAmt7",
    "retTaxAmt8",
    "retTaxAmt9",
    "taxMethod6",
    "taxMethod7",
    "taxMethod8",
    "taxMethod9",
    "grossReceiptTax6",
    "grossReceiptTax7",
    "grossReceiptTax8",
    "grossReceiptTax9",
    "cityGrossReceiptTax6",
    "cityGrossReceiptTax7",
    "cityGrossReceiptTax8",
    "cityGrossReceiptTax9",
    "deleteActvnUpgdFeeAuthBaId",
    "rowNbr",
    "prntRowNbr",
    "hcOfferId",
    "asmtCd",
    "intRtQty",
    "totIntAmt",
    "purchaseType",
    "exchangeType",
    "srpDiscountAmount",
    "instlPaidCnt",
    "upgrEarlyCd",
    "trdinSerialNbr",
    "appliedLeaseDiscAmt",
    "appliedLeaseAdpsDiscAmt",
    "turninOriginalSku",
    "acctPostAmt",
    "oneclickIndcr",
    "oneclickReadyIndcr",
    "rtrnDevModelNme",
    "trdinPromoCd",
    "newSkuHcp2Contract",
    "ibCheckbox",
    "devDamageFeeTaxAmt",
    "excdQtyOvrBaId",
    "deviceExistsInInventory",
    "exchangeovrdbaid",
    "exchangeReasonCode",
    "serviceType"
})
public class TransactionDetailInfo {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long transNo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lineItem;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long locBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long productId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long qty;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double unitPrice;
    @XmlElement(required = true, nillable = true)
    protected String shortNm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double discountRate;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double discountAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double oOval1;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double oOval2;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double oOval3;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double oOval4;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double oOval5;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double unitCost;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long oOval6;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long oOval7;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long oOval8;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long oOval9;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long oOval10;
    @XmlElement(required = true, nillable = true)
    protected String taxGroupCd;
    @XmlElement(required = true, nillable = true)
    protected String oOval11;
    @XmlElement(required = true, nillable = true)
    protected String oOval12;
    @XmlElement(required = true, nillable = true)
    protected String oOval13;
    @XmlElement(required = true, nillable = true)
    protected String oOval14;
    @XmlElement(required = true, nillable = true)
    protected String oOval15;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double skuPrice;
    @XmlElement(required = true, nillable = true)
    protected String serialNo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long productTypGrpId;
    @XmlElement(required = true, nillable = true)
    protected String taxMethodCd;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long qtyRep1;
    @XmlElement(required = true, nillable = true)
    protected String serialNoRep1;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double unitPriceRep1;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long discountId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long promoId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double promoPrice;
    @XmlElement(required = true, nillable = true)
    protected String sku;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lineItemType;
    @XmlElement(required = true, nillable = true)
    protected String markdownType;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long ovrdReasonId;
    @XmlElement(required = true, nillable = true)
    protected String kitTrigger;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long kitLineItem;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double kitCmpntPrice;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long kitId;
    @XmlElement(required = true, nillable = true)
    protected String promptForPrice;
    @XmlElement(required = true, nillable = true)
    protected String trackByLot;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long transId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long srepBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long disAuthBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long ovrAuthBaId;
    @XmlElement(required = true, nillable = true)
    protected String directFulfill;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long dactAuthBaId;
    @XmlElement(required = true, nillable = true)
    protected String flag;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double activationDiscount;
    @XmlElement(required = true, nillable = true)
    protected String discountInfo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long discountLineno;
    @XmlElement(required = true, nillable = true)
    protected String actvVldnIndcr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long actDiscountId;
    @XmlElement(required = true, nillable = true)
    protected String whseCd;
    @XmlElement(required = true, nillable = true)
    protected String asiOrderNbr;
    @XmlElement(required = true, nillable = true)
    protected String cardNbr;
    @XmlElement(required = true, nillable = true)
    protected String sysTrceAuditNbr;
    @XmlElement(required = true, nillable = true)
    protected String tranId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long gcStatusIndcr;
    @XmlElement(required = true, nillable = true)
    protected String nmsManfNme;
    @XmlElement(name = "p2kSrvcNme", required = true, nillable = true)
    protected String p2KSrvcNme;
    @XmlElement(required = true, nillable = true)
    protected String directShipEsn;
    @XmlElement(required = true, nillable = true)
    protected String returnAsiSku;
    @XmlElement(required = true, nillable = true)
    protected String rmaNbr;
    @XmlElement(required = true, nillable = true)
    protected String eticketNbr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxBasis;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long useTax;
    @XmlElement(required = true, nillable = true)
    protected String tax1Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax2Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax3Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax4Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax5Rule;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxamt1;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxamt2;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxamt3;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxamt4;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxamt5;
    @XmlElement(required = true, nillable = true)
    protected String source;
    @XmlElement(required = true, nillable = true)
    protected String equipmentTypeCd;
    @XmlElement(required = true, nillable = true)
    protected String serialNoImeiId;
    @XmlElement(required = true, nillable = true)
    protected String serialNoMsnId;
    @XmlElement(required = true, nillable = true)
    protected String serialSimId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long productSimSkuId;
    @XmlElement(required = true, nillable = true)
    protected String simSku;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double grossRecRate;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double grossRecAmt;
    @XmlElement(required = true, nillable = true)
    protected String srvcXchgCd;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long srvcXchgAuthBaid;
    @XmlElement(required = true, nillable = true)
    protected String armOverrideIndcr;
    @XmlElement(required = true, nillable = true)
    protected String trackAsArmIndcr;
    @XmlElement(required = true, nillable = true)
    protected String productStatusSeqId;
    @XmlElement(required = true, nillable = true)
    protected String armRebateId;
    @XmlElement(required = true, nillable = true)
    protected String rebatePlanCd;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double priceOverideAmount;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long recycleSku;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod1;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod2;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod3;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod4;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod5;
    @XmlElement(required = true, nillable = true)
    protected String recycTranRefrNbr;
    @XmlElement(required = true, nillable = true)
    protected String recycItemId;
    @XmlElement(required = true, nillable = true)
    protected String applyCaTaxRulesIndcr;
    @XmlElement(required = true, nillable = true)
    protected String bogoOfferId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double bogoDiscAmt;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long reservationId;
    @XmlElement(required = true, nillable = true)
    protected String confirmationNumber;
    @XmlElement(required = true, nillable = true)
    protected String isSkuAssignedMixMatch;
    @XmlElement(required = true, nillable = true)
    protected String setOfferId;
    @XmlElement(required = true, nillable = true)
    protected String setGroupLevel;
    @XmlElement(required = true, nillable = true)
    protected String setSubGroupName;
    @XmlElement(required = true, nillable = true)
    protected String btaElgblIndcr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax1;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax2;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax3;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax4;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax5;
    @XmlElement(required = true, nillable = true)
    protected String erecyclePromoCd;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buybackPretaxAmt;
    @XmlElement(required = true, nillable = true)
    protected String cityLevelGrossRec;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double cityGrossRecRate;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double cityGrossRecAmt;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax1;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax2;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax3;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax4;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax5;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long upgradenowFeeLineItemNbr;
    @XmlElement(required = true, nillable = true)
    protected String discountOfferType;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long buybackLineItemNbr;
    @XmlElement(required = true, nillable = true)
    protected String buybackOverrideIndcr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long ovrBuybackAuthBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long webOrderLineItemId;
    @XmlElement(required = true, nillable = true)
    protected String equipInstlBillEnblIndcr;
    @XmlElement(required = true, nillable = true)
    protected String eibVisible;
    @XmlElement(required = true, nillable = true)
    protected String eibEnblIndcr;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double downpaymentAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double flStampTaxAmt;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long shoppingCartLineItemId;
    @XmlElement(required = true, nillable = true)
    protected String assistedSrepId;
    @XmlElement(required = true, nillable = true)
    protected String backOrderIndcr;
    @XmlElement(required = true, nillable = true)
    protected String motorolaXpersonalizeIndcr;
    @XmlElement(required = true, nillable = true)
    protected String mrcdiscIndcr;
    @XmlElement(required = true, nillable = true)
    protected String equipInstlBillAgreemntNbr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long equipInstlBillLoanSeqNo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long contractTerm;
    @XmlElement(required = true, nillable = true)
    protected String applnid;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long appleOvrdBaId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double depositAmount;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long activationSequnceNumber;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long depositSequenceNumber;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double exchDepositamt;
    @XmlElement(required = true, nillable = true)
    protected String equipLeaseIndcr;
    @XmlElement(required = true, nillable = true)
    protected String ibSerialNo;
    @XmlElement(required = true, nillable = true)
    protected String originalDirectFulfill;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double addnlDowpaymentAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double addnlDpDiscountAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buybackDownpaymentAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buybackAddnlDownpaymentAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buybackFundPayment;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buybackOtherSaleAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double buybackTaxAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double maxAllowDownpmtAmt;
    @XmlElement(required = true, nillable = true)
    protected String gvbkSerialNbr;
    @XmlElement(required = true, nillable = true)
    protected String dsSecondTransaction;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double turninCreditAmt;
    @XmlElement(required = true, nillable = true)
    protected String singleSkuCd;
    @XmlElement(required = true, nillable = true)
    protected String brndCd;
    @XmlElement(required = true, nillable = true)
    protected String reltedSkuNbr;
    @XmlElement(required = true, nillable = true)
    protected String shortNmReltdSku;
    @XmlElement(required = true, nillable = true)
    protected String bopuisOrdrIndcr;
    @XmlElement(required = true, nillable = true)
    protected String bopuisPrchOptCd;
    @XmlElement(required = true, nillable = true)
    protected String omimRtrnReasCd;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tax6;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tax7;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tax8;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tax9;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxid6;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxid7;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxid8;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taxid9;
    @XmlElement(required = true, nillable = true)
    protected String taxnm6;
    @XmlElement(required = true, nillable = true)
    protected String taxnm7;
    @XmlElement(required = true, nillable = true)
    protected String taxnm8;
    @XmlElement(required = true, nillable = true)
    protected String taxnm9;
    @XmlElement(required = true, nillable = true)
    protected String tax6Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax7Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax8Rule;
    @XmlElement(required = true, nillable = true)
    protected String tax9Rule;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxAmt6;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxAmt7;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxAmt8;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long retTaxAmt9;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod6;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod7;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod8;
    @XmlElement(required = true, nillable = true)
    protected String taxMethod9;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax6;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax7;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax8;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long grossReceiptTax9;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax6;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax7;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax8;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cityGrossReceiptTax9;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long deleteActvnUpgdFeeAuthBaId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long rowNbr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long prntRowNbr;
    @XmlElement(required = true, nillable = true)
    protected String hcOfferId;
    @XmlElement(required = true, nillable = true)
    protected String asmtCd;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double intRtQty;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totIntAmt;
    @XmlElement(required = true, nillable = true)
    protected String purchaseType;
    @XmlElement(required = true, nillable = true)
    protected String exchangeType;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double srpDiscountAmount;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long instlPaidCnt;
    @XmlElement(required = true, nillable = true)
    protected String upgrEarlyCd;
    @XmlElement(required = true, nillable = true)
    protected String trdinSerialNbr;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double appliedLeaseDiscAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double appliedLeaseAdpsDiscAmt;
    @XmlElement(required = true, nillable = true)
    protected String turninOriginalSku;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double acctPostAmt;
    @XmlElement(required = true, nillable = true)
    protected String oneclickIndcr;
    @XmlElement(required = true, nillable = true)
    protected String oneclickReadyIndcr;
    @XmlElement(required = true, nillable = true)
    protected String rtrnDevModelNme;
    @XmlElement(required = true, nillable = true)
    protected String trdinPromoCd;
    @XmlElement(required = true, nillable = true)
    protected String newSkuHcp2Contract;
    @XmlElement(required = true, nillable = true)
    protected String ibCheckbox;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double devDamageFeeTaxAmt;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double excdQtyOvrBaId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer deviceExistsInInventory;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer exchangeovrdbaid;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long exchangeReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String serviceType;

    /**
     * Gets the value of the transNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransNo() {
        return transNo;
    }

    /**
     * Sets the value of the transNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransNo(Long value) {
        this.transNo = value;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItem(Long value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the locBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocBaId() {
        return locBaId;
    }

    /**
     * Sets the value of the locBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocBaId(Long value) {
        this.locBaId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQty(Long value) {
        this.qty = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the shortNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNm() {
        return shortNm;
    }

    /**
     * Sets the value of the shortNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNm(String value) {
        this.shortNm = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountRate(Double value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountAmt(Double value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the oOval1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOOval1() {
        return oOval1;
    }

    /**
     * Sets the value of the oOval1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOOval1(Double value) {
        this.oOval1 = value;
    }

    /**
     * Gets the value of the oOval2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOOval2() {
        return oOval2;
    }

    /**
     * Sets the value of the oOval2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOOval2(Double value) {
        this.oOval2 = value;
    }

    /**
     * Gets the value of the oOval3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOOval3() {
        return oOval3;
    }

    /**
     * Sets the value of the oOval3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOOval3(Double value) {
        this.oOval3 = value;
    }

    /**
     * Gets the value of the oOval4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOOval4() {
        return oOval4;
    }

    /**
     * Sets the value of the oOval4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOOval4(Double value) {
        this.oOval4 = value;
    }

    /**
     * Gets the value of the oOval5 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOOval5() {
        return oOval5;
    }

    /**
     * Sets the value of the oOval5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOOval5(Double value) {
        this.oOval5 = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCost(Double value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the oOval6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOOval6() {
        return oOval6;
    }

    /**
     * Sets the value of the oOval6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOOval6(Long value) {
        this.oOval6 = value;
    }

    /**
     * Gets the value of the oOval7 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOOval7() {
        return oOval7;
    }

    /**
     * Sets the value of the oOval7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOOval7(Long value) {
        this.oOval7 = value;
    }

    /**
     * Gets the value of the oOval8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOOval8() {
        return oOval8;
    }

    /**
     * Sets the value of the oOval8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOOval8(Long value) {
        this.oOval8 = value;
    }

    /**
     * Gets the value of the oOval9 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOOval9() {
        return oOval9;
    }

    /**
     * Sets the value of the oOval9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOOval9(Long value) {
        this.oOval9 = value;
    }

    /**
     * Gets the value of the oOval10 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOOval10() {
        return oOval10;
    }

    /**
     * Sets the value of the oOval10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOOval10(Long value) {
        this.oOval10 = value;
    }

    /**
     * Gets the value of the taxGroupCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroupCd() {
        return taxGroupCd;
    }

    /**
     * Sets the value of the taxGroupCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroupCd(String value) {
        this.taxGroupCd = value;
    }

    /**
     * Gets the value of the oOval11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOOval11() {
        return oOval11;
    }

    /**
     * Sets the value of the oOval11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOOval11(String value) {
        this.oOval11 = value;
    }

    /**
     * Gets the value of the oOval12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOOval12() {
        return oOval12;
    }

    /**
     * Sets the value of the oOval12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOOval12(String value) {
        this.oOval12 = value;
    }

    /**
     * Gets the value of the oOval13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOOval13() {
        return oOval13;
    }

    /**
     * Sets the value of the oOval13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOOval13(String value) {
        this.oOval13 = value;
    }

    /**
     * Gets the value of the oOval14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOOval14() {
        return oOval14;
    }

    /**
     * Sets the value of the oOval14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOOval14(String value) {
        this.oOval14 = value;
    }

    /**
     * Gets the value of the oOval15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOOval15() {
        return oOval15;
    }

    /**
     * Sets the value of the oOval15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOOval15(String value) {
        this.oOval15 = value;
    }

    /**
     * Gets the value of the skuPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSkuPrice() {
        return skuPrice;
    }

    /**
     * Sets the value of the skuPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSkuPrice(Double value) {
        this.skuPrice = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the productTypGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductTypGrpId() {
        return productTypGrpId;
    }

    /**
     * Sets the value of the productTypGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductTypGrpId(Long value) {
        this.productTypGrpId = value;
    }

    /**
     * Gets the value of the taxMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethodCd() {
        return taxMethodCd;
    }

    /**
     * Sets the value of the taxMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethodCd(String value) {
        this.taxMethodCd = value;
    }

    /**
     * Gets the value of the qtyRep1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtyRep1() {
        return qtyRep1;
    }

    /**
     * Sets the value of the qtyRep1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtyRep1(Long value) {
        this.qtyRep1 = value;
    }

    /**
     * Gets the value of the serialNoRep1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNoRep1() {
        return serialNoRep1;
    }

    /**
     * Sets the value of the serialNoRep1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNoRep1(String value) {
        this.serialNoRep1 = value;
    }

    /**
     * Gets the value of the unitPriceRep1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPriceRep1() {
        return unitPriceRep1;
    }

    /**
     * Sets the value of the unitPriceRep1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPriceRep1(Double value) {
        this.unitPriceRep1 = value;
    }

    /**
     * Gets the value of the discountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountId() {
        return discountId;
    }

    /**
     * Sets the value of the discountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountId(Long value) {
        this.discountId = value;
    }

    /**
     * Gets the value of the promoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromoId() {
        return promoId;
    }

    /**
     * Sets the value of the promoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromoId(Long value) {
        this.promoId = value;
    }

    /**
     * Gets the value of the promoPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPromoPrice() {
        return promoPrice;
    }

    /**
     * Sets the value of the promoPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPromoPrice(Double value) {
        this.promoPrice = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemType(Long value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the markdownType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkdownType() {
        return markdownType;
    }

    /**
     * Sets the value of the markdownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkdownType(String value) {
        this.markdownType = value;
    }

    /**
     * Gets the value of the ovrdReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOvrdReasonId() {
        return ovrdReasonId;
    }

    /**
     * Sets the value of the ovrdReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOvrdReasonId(Long value) {
        this.ovrdReasonId = value;
    }

    /**
     * Gets the value of the kitTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitTrigger() {
        return kitTrigger;
    }

    /**
     * Sets the value of the kitTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitTrigger(String value) {
        this.kitTrigger = value;
    }

    /**
     * Gets the value of the kitLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKitLineItem() {
        return kitLineItem;
    }

    /**
     * Sets the value of the kitLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKitLineItem(Long value) {
        this.kitLineItem = value;
    }

    /**
     * Gets the value of the kitCmpntPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKitCmpntPrice() {
        return kitCmpntPrice;
    }

    /**
     * Sets the value of the kitCmpntPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKitCmpntPrice(Double value) {
        this.kitCmpntPrice = value;
    }

    /**
     * Gets the value of the kitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKitId() {
        return kitId;
    }

    /**
     * Sets the value of the kitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKitId(Long value) {
        this.kitId = value;
    }

    /**
     * Gets the value of the promptForPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptForPrice() {
        return promptForPrice;
    }

    /**
     * Sets the value of the promptForPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptForPrice(String value) {
        this.promptForPrice = value;
    }

    /**
     * Gets the value of the trackByLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackByLot() {
        return trackByLot;
    }

    /**
     * Sets the value of the trackByLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackByLot(String value) {
        this.trackByLot = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransId(Long value) {
        this.transId = value;
    }

    /**
     * Gets the value of the srepBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrepBaId() {
        return srepBaId;
    }

    /**
     * Sets the value of the srepBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrepBaId(Long value) {
        this.srepBaId = value;
    }

    /**
     * Gets the value of the disAuthBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisAuthBaId() {
        return disAuthBaId;
    }

    /**
     * Sets the value of the disAuthBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisAuthBaId(Long value) {
        this.disAuthBaId = value;
    }

    /**
     * Gets the value of the ovrAuthBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOvrAuthBaId() {
        return ovrAuthBaId;
    }

    /**
     * Sets the value of the ovrAuthBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOvrAuthBaId(Long value) {
        this.ovrAuthBaId = value;
    }

    /**
     * Gets the value of the directFulfill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectFulfill() {
        return directFulfill;
    }

    /**
     * Sets the value of the directFulfill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectFulfill(String value) {
        this.directFulfill = value;
    }

    /**
     * Gets the value of the dactAuthBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDactAuthBaId() {
        return dactAuthBaId;
    }

    /**
     * Sets the value of the dactAuthBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDactAuthBaId(Long value) {
        this.dactAuthBaId = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the activationDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActivationDiscount() {
        return activationDiscount;
    }

    /**
     * Sets the value of the activationDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActivationDiscount(Double value) {
        this.activationDiscount = value;
    }

    /**
     * Gets the value of the discountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountInfo() {
        return discountInfo;
    }

    /**
     * Sets the value of the discountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountInfo(String value) {
        this.discountInfo = value;
    }

    /**
     * Gets the value of the discountLineno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountLineno() {
        return discountLineno;
    }

    /**
     * Sets the value of the discountLineno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountLineno(Long value) {
        this.discountLineno = value;
    }

    /**
     * Gets the value of the actvVldnIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvVldnIndcr() {
        return actvVldnIndcr;
    }

    /**
     * Sets the value of the actvVldnIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActvVldnIndcr(String value) {
        this.actvVldnIndcr = value;
    }

    /**
     * Gets the value of the actDiscountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActDiscountId() {
        return actDiscountId;
    }

    /**
     * Sets the value of the actDiscountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActDiscountId(Long value) {
        this.actDiscountId = value;
    }

    /**
     * Gets the value of the whseCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhseCd() {
        return whseCd;
    }

    /**
     * Sets the value of the whseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhseCd(String value) {
        this.whseCd = value;
    }

    /**
     * Gets the value of the asiOrderNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiOrderNbr() {
        return asiOrderNbr;
    }

    /**
     * Sets the value of the asiOrderNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiOrderNbr(String value) {
        this.asiOrderNbr = value;
    }

    /**
     * Gets the value of the cardNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNbr() {
        return cardNbr;
    }

    /**
     * Sets the value of the cardNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNbr(String value) {
        this.cardNbr = value;
    }

    /**
     * Gets the value of the sysTrceAuditNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTrceAuditNbr() {
        return sysTrceAuditNbr;
    }

    /**
     * Sets the value of the sysTrceAuditNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTrceAuditNbr(String value) {
        this.sysTrceAuditNbr = value;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the gcStatusIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGcStatusIndcr() {
        return gcStatusIndcr;
    }

    /**
     * Sets the value of the gcStatusIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGcStatusIndcr(Long value) {
        this.gcStatusIndcr = value;
    }

    /**
     * Gets the value of the nmsManfNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsManfNme() {
        return nmsManfNme;
    }

    /**
     * Sets the value of the nmsManfNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsManfNme(String value) {
        this.nmsManfNme = value;
    }

    /**
     * Gets the value of the p2KSrvcNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2KSrvcNme() {
        return p2KSrvcNme;
    }

    /**
     * Sets the value of the p2KSrvcNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2KSrvcNme(String value) {
        this.p2KSrvcNme = value;
    }

    /**
     * Gets the value of the directShipEsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectShipEsn() {
        return directShipEsn;
    }

    /**
     * Sets the value of the directShipEsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectShipEsn(String value) {
        this.directShipEsn = value;
    }

    /**
     * Gets the value of the returnAsiSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAsiSku() {
        return returnAsiSku;
    }

    /**
     * Sets the value of the returnAsiSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAsiSku(String value) {
        this.returnAsiSku = value;
    }

    /**
     * Gets the value of the rmaNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmaNbr() {
        return rmaNbr;
    }

    /**
     * Sets the value of the rmaNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmaNbr(String value) {
        this.rmaNbr = value;
    }

    /**
     * Gets the value of the eticketNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEticketNbr() {
        return eticketNbr;
    }

    /**
     * Sets the value of the eticketNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEticketNbr(String value) {
        this.eticketNbr = value;
    }

    /**
     * Gets the value of the taxBasis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxBasis() {
        return taxBasis;
    }

    /**
     * Sets the value of the taxBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxBasis(Long value) {
        this.taxBasis = value;
    }

    /**
     * Gets the value of the useTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseTax() {
        return useTax;
    }

    /**
     * Sets the value of the useTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseTax(Long value) {
        this.useTax = value;
    }

    /**
     * Gets the value of the tax1Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax1Rule() {
        return tax1Rule;
    }

    /**
     * Sets the value of the tax1Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax1Rule(String value) {
        this.tax1Rule = value;
    }

    /**
     * Gets the value of the tax2Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax2Rule() {
        return tax2Rule;
    }

    /**
     * Sets the value of the tax2Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax2Rule(String value) {
        this.tax2Rule = value;
    }

    /**
     * Gets the value of the tax3Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax3Rule() {
        return tax3Rule;
    }

    /**
     * Sets the value of the tax3Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax3Rule(String value) {
        this.tax3Rule = value;
    }

    /**
     * Gets the value of the tax4Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax4Rule() {
        return tax4Rule;
    }

    /**
     * Sets the value of the tax4Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax4Rule(String value) {
        this.tax4Rule = value;
    }

    /**
     * Gets the value of the tax5Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax5Rule() {
        return tax5Rule;
    }

    /**
     * Sets the value of the tax5Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax5Rule(String value) {
        this.tax5Rule = value;
    }

    /**
     * Gets the value of the retTaxamt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxamt1() {
        return retTaxamt1;
    }

    /**
     * Sets the value of the retTaxamt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxamt1(Long value) {
        this.retTaxamt1 = value;
    }

    /**
     * Gets the value of the retTaxamt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxamt2() {
        return retTaxamt2;
    }

    /**
     * Sets the value of the retTaxamt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxamt2(Long value) {
        this.retTaxamt2 = value;
    }

    /**
     * Gets the value of the retTaxamt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxamt3() {
        return retTaxamt3;
    }

    /**
     * Sets the value of the retTaxamt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxamt3(Long value) {
        this.retTaxamt3 = value;
    }

    /**
     * Gets the value of the retTaxamt4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxamt4() {
        return retTaxamt4;
    }

    /**
     * Sets the value of the retTaxamt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxamt4(Long value) {
        this.retTaxamt4 = value;
    }

    /**
     * Gets the value of the retTaxamt5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxamt5() {
        return retTaxamt5;
    }

    /**
     * Sets the value of the retTaxamt5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxamt5(Long value) {
        this.retTaxamt5 = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the equipmentTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentTypeCd() {
        return equipmentTypeCd;
    }

    /**
     * Sets the value of the equipmentTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentTypeCd(String value) {
        this.equipmentTypeCd = value;
    }

    /**
     * Gets the value of the serialNoImeiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNoImeiId() {
        return serialNoImeiId;
    }

    /**
     * Sets the value of the serialNoImeiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNoImeiId(String value) {
        this.serialNoImeiId = value;
    }

    /**
     * Gets the value of the serialNoMsnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNoMsnId() {
        return serialNoMsnId;
    }

    /**
     * Sets the value of the serialNoMsnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNoMsnId(String value) {
        this.serialNoMsnId = value;
    }

    /**
     * Gets the value of the serialSimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialSimId() {
        return serialSimId;
    }

    /**
     * Sets the value of the serialSimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialSimId(String value) {
        this.serialSimId = value;
    }

    /**
     * Gets the value of the productSimSkuId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductSimSkuId() {
        return productSimSkuId;
    }

    /**
     * Sets the value of the productSimSkuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductSimSkuId(Long value) {
        this.productSimSkuId = value;
    }

    /**
     * Gets the value of the simSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimSku() {
        return simSku;
    }

    /**
     * Sets the value of the simSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimSku(String value) {
        this.simSku = value;
    }

    /**
     * Gets the value of the grossRecRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossRecRate() {
        return grossRecRate;
    }

    /**
     * Sets the value of the grossRecRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossRecRate(Double value) {
        this.grossRecRate = value;
    }

    /**
     * Gets the value of the grossRecAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrossRecAmt() {
        return grossRecAmt;
    }

    /**
     * Sets the value of the grossRecAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrossRecAmt(Double value) {
        this.grossRecAmt = value;
    }

    /**
     * Gets the value of the srvcXchgCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvcXchgCd() {
        return srvcXchgCd;
    }

    /**
     * Sets the value of the srvcXchgCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvcXchgCd(String value) {
        this.srvcXchgCd = value;
    }

    /**
     * Gets the value of the srvcXchgAuthBaid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrvcXchgAuthBaid() {
        return srvcXchgAuthBaid;
    }

    /**
     * Sets the value of the srvcXchgAuthBaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrvcXchgAuthBaid(Long value) {
        this.srvcXchgAuthBaid = value;
    }

    /**
     * Gets the value of the armOverrideIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmOverrideIndcr() {
        return armOverrideIndcr;
    }

    /**
     * Sets the value of the armOverrideIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmOverrideIndcr(String value) {
        this.armOverrideIndcr = value;
    }

    /**
     * Gets the value of the trackAsArmIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackAsArmIndcr() {
        return trackAsArmIndcr;
    }

    /**
     * Sets the value of the trackAsArmIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackAsArmIndcr(String value) {
        this.trackAsArmIndcr = value;
    }

    /**
     * Gets the value of the productStatusSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatusSeqId() {
        return productStatusSeqId;
    }

    /**
     * Sets the value of the productStatusSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatusSeqId(String value) {
        this.productStatusSeqId = value;
    }

    /**
     * Gets the value of the armRebateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmRebateId() {
        return armRebateId;
    }

    /**
     * Sets the value of the armRebateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmRebateId(String value) {
        this.armRebateId = value;
    }

    /**
     * Gets the value of the rebatePlanCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebatePlanCd() {
        return rebatePlanCd;
    }

    /**
     * Sets the value of the rebatePlanCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebatePlanCd(String value) {
        this.rebatePlanCd = value;
    }

    /**
     * Gets the value of the priceOverideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceOverideAmount() {
        return priceOverideAmount;
    }

    /**
     * Sets the value of the priceOverideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceOverideAmount(Double value) {
        this.priceOverideAmount = value;
    }

    /**
     * Gets the value of the recycleSku property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecycleSku() {
        return recycleSku;
    }

    /**
     * Sets the value of the recycleSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecycleSku(Long value) {
        this.recycleSku = value;
    }

    /**
     * Gets the value of the taxMethod1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod1() {
        return taxMethod1;
    }

    /**
     * Sets the value of the taxMethod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod1(String value) {
        this.taxMethod1 = value;
    }

    /**
     * Gets the value of the taxMethod2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod2() {
        return taxMethod2;
    }

    /**
     * Sets the value of the taxMethod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod2(String value) {
        this.taxMethod2 = value;
    }

    /**
     * Gets the value of the taxMethod3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod3() {
        return taxMethod3;
    }

    /**
     * Sets the value of the taxMethod3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod3(String value) {
        this.taxMethod3 = value;
    }

    /**
     * Gets the value of the taxMethod4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod4() {
        return taxMethod4;
    }

    /**
     * Sets the value of the taxMethod4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod4(String value) {
        this.taxMethod4 = value;
    }

    /**
     * Gets the value of the taxMethod5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod5() {
        return taxMethod5;
    }

    /**
     * Sets the value of the taxMethod5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod5(String value) {
        this.taxMethod5 = value;
    }

    /**
     * Gets the value of the recycTranRefrNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycTranRefrNbr() {
        return recycTranRefrNbr;
    }

    /**
     * Sets the value of the recycTranRefrNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycTranRefrNbr(String value) {
        this.recycTranRefrNbr = value;
    }

    /**
     * Gets the value of the recycItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycItemId() {
        return recycItemId;
    }

    /**
     * Sets the value of the recycItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycItemId(String value) {
        this.recycItemId = value;
    }

    /**
     * Gets the value of the applyCaTaxRulesIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCaTaxRulesIndcr() {
        return applyCaTaxRulesIndcr;
    }

    /**
     * Sets the value of the applyCaTaxRulesIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCaTaxRulesIndcr(String value) {
        this.applyCaTaxRulesIndcr = value;
    }

    /**
     * Gets the value of the bogoOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBogoOfferId() {
        return bogoOfferId;
    }

    /**
     * Sets the value of the bogoOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBogoOfferId(String value) {
        this.bogoOfferId = value;
    }

    /**
     * Gets the value of the bogoDiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBogoDiscAmt() {
        return bogoDiscAmt;
    }

    /**
     * Sets the value of the bogoDiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBogoDiscAmt(Double value) {
        this.bogoDiscAmt = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationId(Long value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the isSkuAssignedMixMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSkuAssignedMixMatch() {
        return isSkuAssignedMixMatch;
    }

    /**
     * Sets the value of the isSkuAssignedMixMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSkuAssignedMixMatch(String value) {
        this.isSkuAssignedMixMatch = value;
    }

    /**
     * Gets the value of the setOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetOfferId() {
        return setOfferId;
    }

    /**
     * Sets the value of the setOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetOfferId(String value) {
        this.setOfferId = value;
    }

    /**
     * Gets the value of the setGroupLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetGroupLevel() {
        return setGroupLevel;
    }

    /**
     * Sets the value of the setGroupLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetGroupLevel(String value) {
        this.setGroupLevel = value;
    }

    /**
     * Gets the value of the setSubGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetSubGroupName() {
        return setSubGroupName;
    }

    /**
     * Sets the value of the setSubGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetSubGroupName(String value) {
        this.setSubGroupName = value;
    }

    /**
     * Gets the value of the btaElgblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtaElgblIndcr() {
        return btaElgblIndcr;
    }

    /**
     * Sets the value of the btaElgblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtaElgblIndcr(String value) {
        this.btaElgblIndcr = value;
    }

    /**
     * Gets the value of the grossReceiptTax1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax1() {
        return grossReceiptTax1;
    }

    /**
     * Sets the value of the grossReceiptTax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax1(Long value) {
        this.grossReceiptTax1 = value;
    }

    /**
     * Gets the value of the grossReceiptTax2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax2() {
        return grossReceiptTax2;
    }

    /**
     * Sets the value of the grossReceiptTax2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax2(Long value) {
        this.grossReceiptTax2 = value;
    }

    /**
     * Gets the value of the grossReceiptTax3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax3() {
        return grossReceiptTax3;
    }

    /**
     * Sets the value of the grossReceiptTax3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax3(Long value) {
        this.grossReceiptTax3 = value;
    }

    /**
     * Gets the value of the grossReceiptTax4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax4() {
        return grossReceiptTax4;
    }

    /**
     * Sets the value of the grossReceiptTax4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax4(Long value) {
        this.grossReceiptTax4 = value;
    }

    /**
     * Gets the value of the grossReceiptTax5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax5() {
        return grossReceiptTax5;
    }

    /**
     * Sets the value of the grossReceiptTax5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax5(Long value) {
        this.grossReceiptTax5 = value;
    }

    /**
     * Gets the value of the erecyclePromoCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErecyclePromoCd() {
        return erecyclePromoCd;
    }

    /**
     * Sets the value of the erecyclePromoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErecyclePromoCd(String value) {
        this.erecyclePromoCd = value;
    }

    /**
     * Gets the value of the buybackPretaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackPretaxAmt() {
        return buybackPretaxAmt;
    }

    /**
     * Sets the value of the buybackPretaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackPretaxAmt(Double value) {
        this.buybackPretaxAmt = value;
    }

    /**
     * Gets the value of the cityLevelGrossRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityLevelGrossRec() {
        return cityLevelGrossRec;
    }

    /**
     * Sets the value of the cityLevelGrossRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityLevelGrossRec(String value) {
        this.cityLevelGrossRec = value;
    }

    /**
     * Gets the value of the cityGrossRecRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCityGrossRecRate() {
        return cityGrossRecRate;
    }

    /**
     * Sets the value of the cityGrossRecRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCityGrossRecRate(Double value) {
        this.cityGrossRecRate = value;
    }

    /**
     * Gets the value of the cityGrossRecAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCityGrossRecAmt() {
        return cityGrossRecAmt;
    }

    /**
     * Sets the value of the cityGrossRecAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCityGrossRecAmt(Double value) {
        this.cityGrossRecAmt = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax1() {
        return cityGrossReceiptTax1;
    }

    /**
     * Sets the value of the cityGrossReceiptTax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax1(Long value) {
        this.cityGrossReceiptTax1 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax2() {
        return cityGrossReceiptTax2;
    }

    /**
     * Sets the value of the cityGrossReceiptTax2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax2(Long value) {
        this.cityGrossReceiptTax2 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax3() {
        return cityGrossReceiptTax3;
    }

    /**
     * Sets the value of the cityGrossReceiptTax3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax3(Long value) {
        this.cityGrossReceiptTax3 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax4() {
        return cityGrossReceiptTax4;
    }

    /**
     * Sets the value of the cityGrossReceiptTax4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax4(Long value) {
        this.cityGrossReceiptTax4 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax5() {
        return cityGrossReceiptTax5;
    }

    /**
     * Sets the value of the cityGrossReceiptTax5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax5(Long value) {
        this.cityGrossReceiptTax5 = value;
    }

    /**
     * Gets the value of the upgradenowFeeLineItemNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpgradenowFeeLineItemNbr() {
        return upgradenowFeeLineItemNbr;
    }

    /**
     * Sets the value of the upgradenowFeeLineItemNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpgradenowFeeLineItemNbr(Long value) {
        this.upgradenowFeeLineItemNbr = value;
    }

    /**
     * Gets the value of the discountOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountOfferType() {
        return discountOfferType;
    }

    /**
     * Sets the value of the discountOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountOfferType(String value) {
        this.discountOfferType = value;
    }

    /**
     * Gets the value of the buybackLineItemNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuybackLineItemNbr() {
        return buybackLineItemNbr;
    }

    /**
     * Sets the value of the buybackLineItemNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuybackLineItemNbr(Long value) {
        this.buybackLineItemNbr = value;
    }

    /**
     * Gets the value of the buybackOverrideIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuybackOverrideIndcr() {
        return buybackOverrideIndcr;
    }

    /**
     * Sets the value of the buybackOverrideIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuybackOverrideIndcr(String value) {
        this.buybackOverrideIndcr = value;
    }

    /**
     * Gets the value of the ovrBuybackAuthBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOvrBuybackAuthBaId() {
        return ovrBuybackAuthBaId;
    }

    /**
     * Sets the value of the ovrBuybackAuthBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOvrBuybackAuthBaId(Long value) {
        this.ovrBuybackAuthBaId = value;
    }

    /**
     * Gets the value of the webOrderLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebOrderLineItemId() {
        return webOrderLineItemId;
    }

    /**
     * Sets the value of the webOrderLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebOrderLineItemId(Long value) {
        this.webOrderLineItemId = value;
    }

    /**
     * Gets the value of the equipInstlBillEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipInstlBillEnblIndcr() {
        return equipInstlBillEnblIndcr;
    }

    /**
     * Sets the value of the equipInstlBillEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipInstlBillEnblIndcr(String value) {
        this.equipInstlBillEnblIndcr = value;
    }

    /**
     * Gets the value of the eibVisible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEibVisible() {
        return eibVisible;
    }

    /**
     * Sets the value of the eibVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEibVisible(String value) {
        this.eibVisible = value;
    }

    /**
     * Gets the value of the eibEnblIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEibEnblIndcr() {
        return eibEnblIndcr;
    }

    /**
     * Sets the value of the eibEnblIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEibEnblIndcr(String value) {
        this.eibEnblIndcr = value;
    }

    /**
     * Gets the value of the downpaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownpaymentAmt() {
        return downpaymentAmt;
    }

    /**
     * Sets the value of the downpaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownpaymentAmt(Double value) {
        this.downpaymentAmt = value;
    }

    /**
     * Gets the value of the flStampTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlStampTaxAmt() {
        return flStampTaxAmt;
    }

    /**
     * Sets the value of the flStampTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlStampTaxAmt(Double value) {
        this.flStampTaxAmt = value;
    }

    /**
     * Gets the value of the shoppingCartLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShoppingCartLineItemId() {
        return shoppingCartLineItemId;
    }

    /**
     * Sets the value of the shoppingCartLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShoppingCartLineItemId(Long value) {
        this.shoppingCartLineItemId = value;
    }

    /**
     * Gets the value of the assistedSrepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistedSrepId() {
        return assistedSrepId;
    }

    /**
     * Sets the value of the assistedSrepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistedSrepId(String value) {
        this.assistedSrepId = value;
    }

    /**
     * Gets the value of the backOrderIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOrderIndcr() {
        return backOrderIndcr;
    }

    /**
     * Sets the value of the backOrderIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOrderIndcr(String value) {
        this.backOrderIndcr = value;
    }

    /**
     * Gets the value of the motorolaXpersonalizeIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorolaXpersonalizeIndcr() {
        return motorolaXpersonalizeIndcr;
    }

    /**
     * Sets the value of the motorolaXpersonalizeIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorolaXpersonalizeIndcr(String value) {
        this.motorolaXpersonalizeIndcr = value;
    }

    /**
     * Gets the value of the mrcdiscIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrcdiscIndcr() {
        return mrcdiscIndcr;
    }

    /**
     * Sets the value of the mrcdiscIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrcdiscIndcr(String value) {
        this.mrcdiscIndcr = value;
    }

    /**
     * Gets the value of the equipInstlBillAgreemntNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipInstlBillAgreemntNbr() {
        return equipInstlBillAgreemntNbr;
    }

    /**
     * Sets the value of the equipInstlBillAgreemntNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipInstlBillAgreemntNbr(String value) {
        this.equipInstlBillAgreemntNbr = value;
    }

    /**
     * Gets the value of the equipInstlBillLoanSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipInstlBillLoanSeqNo() {
        return equipInstlBillLoanSeqNo;
    }

    /**
     * Sets the value of the equipInstlBillLoanSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipInstlBillLoanSeqNo(Long value) {
        this.equipInstlBillLoanSeqNo = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractTerm(Long value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the applnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplnid() {
        return applnid;
    }

    /**
     * Sets the value of the applnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplnid(String value) {
        this.applnid = value;
    }

    /**
     * Gets the value of the appleOvrdBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppleOvrdBaId() {
        return appleOvrdBaId;
    }

    /**
     * Sets the value of the appleOvrdBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppleOvrdBaId(Long value) {
        this.appleOvrdBaId = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepositAmount(Double value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the activationSequnceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivationSequnceNumber() {
        return activationSequnceNumber;
    }

    /**
     * Sets the value of the activationSequnceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivationSequnceNumber(Long value) {
        this.activationSequnceNumber = value;
    }

    /**
     * Gets the value of the depositSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepositSequenceNumber() {
        return depositSequenceNumber;
    }

    /**
     * Sets the value of the depositSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepositSequenceNumber(Long value) {
        this.depositSequenceNumber = value;
    }

    /**
     * Gets the value of the exchDepositamt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchDepositamt() {
        return exchDepositamt;
    }

    /**
     * Sets the value of the exchDepositamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchDepositamt(Double value) {
        this.exchDepositamt = value;
    }

    /**
     * Gets the value of the equipLeaseIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipLeaseIndcr() {
        return equipLeaseIndcr;
    }

    /**
     * Sets the value of the equipLeaseIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipLeaseIndcr(String value) {
        this.equipLeaseIndcr = value;
    }

    /**
     * Gets the value of the ibSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbSerialNo() {
        return ibSerialNo;
    }

    /**
     * Sets the value of the ibSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbSerialNo(String value) {
        this.ibSerialNo = value;
    }

    /**
     * Gets the value of the originalDirectFulfill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDirectFulfill() {
        return originalDirectFulfill;
    }

    /**
     * Sets the value of the originalDirectFulfill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDirectFulfill(String value) {
        this.originalDirectFulfill = value;
    }

    /**
     * Gets the value of the addnlDowpaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddnlDowpaymentAmt() {
        return addnlDowpaymentAmt;
    }

    /**
     * Sets the value of the addnlDowpaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddnlDowpaymentAmt(Double value) {
        this.addnlDowpaymentAmt = value;
    }

    /**
     * Gets the value of the addnlDpDiscountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddnlDpDiscountAmt() {
        return addnlDpDiscountAmt;
    }

    /**
     * Sets the value of the addnlDpDiscountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddnlDpDiscountAmt(Double value) {
        this.addnlDpDiscountAmt = value;
    }

    /**
     * Gets the value of the buybackDownpaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackDownpaymentAmt() {
        return buybackDownpaymentAmt;
    }

    /**
     * Sets the value of the buybackDownpaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackDownpaymentAmt(Double value) {
        this.buybackDownpaymentAmt = value;
    }

    /**
     * Gets the value of the buybackAddnlDownpaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackAddnlDownpaymentAmt() {
        return buybackAddnlDownpaymentAmt;
    }

    /**
     * Sets the value of the buybackAddnlDownpaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackAddnlDownpaymentAmt(Double value) {
        this.buybackAddnlDownpaymentAmt = value;
    }

    /**
     * Gets the value of the buybackFundPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackFundPayment() {
        return buybackFundPayment;
    }

    /**
     * Sets the value of the buybackFundPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackFundPayment(Double value) {
        this.buybackFundPayment = value;
    }

    /**
     * Gets the value of the buybackOtherSaleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackOtherSaleAmt() {
        return buybackOtherSaleAmt;
    }

    /**
     * Sets the value of the buybackOtherSaleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackOtherSaleAmt(Double value) {
        this.buybackOtherSaleAmt = value;
    }

    /**
     * Gets the value of the buybackTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackTaxAmount() {
        return buybackTaxAmount;
    }

    /**
     * Sets the value of the buybackTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackTaxAmount(Double value) {
        this.buybackTaxAmount = value;
    }

    /**
     * Gets the value of the maxAllowDownpmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAllowDownpmtAmt() {
        return maxAllowDownpmtAmt;
    }

    /**
     * Sets the value of the maxAllowDownpmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAllowDownpmtAmt(Double value) {
        this.maxAllowDownpmtAmt = value;
    }

    /**
     * Gets the value of the gvbkSerialNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvbkSerialNbr() {
        return gvbkSerialNbr;
    }

    /**
     * Sets the value of the gvbkSerialNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGvbkSerialNbr(String value) {
        this.gvbkSerialNbr = value;
    }

    /**
     * Gets the value of the dsSecondTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsSecondTransaction() {
        return dsSecondTransaction;
    }

    /**
     * Sets the value of the dsSecondTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsSecondTransaction(String value) {
        this.dsSecondTransaction = value;
    }

    /**
     * Gets the value of the turninCreditAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTurninCreditAmt() {
        return turninCreditAmt;
    }

    /**
     * Sets the value of the turninCreditAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTurninCreditAmt(Double value) {
        this.turninCreditAmt = value;
    }

    /**
     * Gets the value of the singleSkuCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleSkuCd() {
        return singleSkuCd;
    }

    /**
     * Sets the value of the singleSkuCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleSkuCd(String value) {
        this.singleSkuCd = value;
    }

    /**
     * Gets the value of the brndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrndCd() {
        return brndCd;
    }

    /**
     * Sets the value of the brndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrndCd(String value) {
        this.brndCd = value;
    }

    /**
     * Gets the value of the reltedSkuNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReltedSkuNbr() {
        return reltedSkuNbr;
    }

    /**
     * Sets the value of the reltedSkuNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReltedSkuNbr(String value) {
        this.reltedSkuNbr = value;
    }

    /**
     * Gets the value of the shortNmReltdSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNmReltdSku() {
        return shortNmReltdSku;
    }

    /**
     * Sets the value of the shortNmReltdSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNmReltdSku(String value) {
        this.shortNmReltdSku = value;
    }

    /**
     * Gets the value of the bopuisOrdrIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopuisOrdrIndcr() {
        return bopuisOrdrIndcr;
    }

    /**
     * Sets the value of the bopuisOrdrIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopuisOrdrIndcr(String value) {
        this.bopuisOrdrIndcr = value;
    }

    /**
     * Gets the value of the bopuisPrchOptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopuisPrchOptCd() {
        return bopuisPrchOptCd;
    }

    /**
     * Sets the value of the bopuisPrchOptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopuisPrchOptCd(String value) {
        this.bopuisPrchOptCd = value;
    }

    /**
     * Gets the value of the omimRtrnReasCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmimRtrnReasCd() {
        return omimRtrnReasCd;
    }

    /**
     * Sets the value of the omimRtrnReasCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmimRtrnReasCd(String value) {
        this.omimRtrnReasCd = value;
    }

    /**
     * Gets the value of the tax6 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax6() {
        return tax6;
    }

    /**
     * Sets the value of the tax6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax6(Double value) {
        this.tax6 = value;
    }

    /**
     * Gets the value of the tax7 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax7() {
        return tax7;
    }

    /**
     * Sets the value of the tax7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax7(Double value) {
        this.tax7 = value;
    }

    /**
     * Gets the value of the tax8 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax8() {
        return tax8;
    }

    /**
     * Sets the value of the tax8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax8(Double value) {
        this.tax8 = value;
    }

    /**
     * Gets the value of the tax9 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax9() {
        return tax9;
    }

    /**
     * Sets the value of the tax9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax9(Double value) {
        this.tax9 = value;
    }

    /**
     * Gets the value of the taxid6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxid6() {
        return taxid6;
    }

    /**
     * Sets the value of the taxid6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxid6(Long value) {
        this.taxid6 = value;
    }

    /**
     * Gets the value of the taxid7 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxid7() {
        return taxid7;
    }

    /**
     * Sets the value of the taxid7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxid7(Long value) {
        this.taxid7 = value;
    }

    /**
     * Gets the value of the taxid8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxid8() {
        return taxid8;
    }

    /**
     * Sets the value of the taxid8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxid8(Long value) {
        this.taxid8 = value;
    }

    /**
     * Gets the value of the taxid9 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxid9() {
        return taxid9;
    }

    /**
     * Sets the value of the taxid9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxid9(Long value) {
        this.taxid9 = value;
    }

    /**
     * Gets the value of the taxnm6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxnm6() {
        return taxnm6;
    }

    /**
     * Sets the value of the taxnm6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxnm6(String value) {
        this.taxnm6 = value;
    }

    /**
     * Gets the value of the taxnm7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxnm7() {
        return taxnm7;
    }

    /**
     * Sets the value of the taxnm7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxnm7(String value) {
        this.taxnm7 = value;
    }

    /**
     * Gets the value of the taxnm8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxnm8() {
        return taxnm8;
    }

    /**
     * Sets the value of the taxnm8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxnm8(String value) {
        this.taxnm8 = value;
    }

    /**
     * Gets the value of the taxnm9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxnm9() {
        return taxnm9;
    }

    /**
     * Sets the value of the taxnm9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxnm9(String value) {
        this.taxnm9 = value;
    }

    /**
     * Gets the value of the tax6Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax6Rule() {
        return tax6Rule;
    }

    /**
     * Sets the value of the tax6Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax6Rule(String value) {
        this.tax6Rule = value;
    }

    /**
     * Gets the value of the tax7Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax7Rule() {
        return tax7Rule;
    }

    /**
     * Sets the value of the tax7Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax7Rule(String value) {
        this.tax7Rule = value;
    }

    /**
     * Gets the value of the tax8Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax8Rule() {
        return tax8Rule;
    }

    /**
     * Sets the value of the tax8Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax8Rule(String value) {
        this.tax8Rule = value;
    }

    /**
     * Gets the value of the tax9Rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax9Rule() {
        return tax9Rule;
    }

    /**
     * Sets the value of the tax9Rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax9Rule(String value) {
        this.tax9Rule = value;
    }

    /**
     * Gets the value of the retTaxAmt6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxAmt6() {
        return retTaxAmt6;
    }

    /**
     * Sets the value of the retTaxAmt6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxAmt6(Long value) {
        this.retTaxAmt6 = value;
    }

    /**
     * Gets the value of the retTaxAmt7 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxAmt7() {
        return retTaxAmt7;
    }

    /**
     * Sets the value of the retTaxAmt7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxAmt7(Long value) {
        this.retTaxAmt7 = value;
    }

    /**
     * Gets the value of the retTaxAmt8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxAmt8() {
        return retTaxAmt8;
    }

    /**
     * Sets the value of the retTaxAmt8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxAmt8(Long value) {
        this.retTaxAmt8 = value;
    }

    /**
     * Gets the value of the retTaxAmt9 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetTaxAmt9() {
        return retTaxAmt9;
    }

    /**
     * Sets the value of the retTaxAmt9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetTaxAmt9(Long value) {
        this.retTaxAmt9 = value;
    }

    /**
     * Gets the value of the taxMethod6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod6() {
        return taxMethod6;
    }

    /**
     * Sets the value of the taxMethod6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod6(String value) {
        this.taxMethod6 = value;
    }

    /**
     * Gets the value of the taxMethod7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod7() {
        return taxMethod7;
    }

    /**
     * Sets the value of the taxMethod7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod7(String value) {
        this.taxMethod7 = value;
    }

    /**
     * Gets the value of the taxMethod8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod8() {
        return taxMethod8;
    }

    /**
     * Sets the value of the taxMethod8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod8(String value) {
        this.taxMethod8 = value;
    }

    /**
     * Gets the value of the taxMethod9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMethod9() {
        return taxMethod9;
    }

    /**
     * Sets the value of the taxMethod9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMethod9(String value) {
        this.taxMethod9 = value;
    }

    /**
     * Gets the value of the grossReceiptTax6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax6() {
        return grossReceiptTax6;
    }

    /**
     * Sets the value of the grossReceiptTax6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax6(Long value) {
        this.grossReceiptTax6 = value;
    }

    /**
     * Gets the value of the grossReceiptTax7 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax7() {
        return grossReceiptTax7;
    }

    /**
     * Sets the value of the grossReceiptTax7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax7(Long value) {
        this.grossReceiptTax7 = value;
    }

    /**
     * Gets the value of the grossReceiptTax8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax8() {
        return grossReceiptTax8;
    }

    /**
     * Sets the value of the grossReceiptTax8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax8(Long value) {
        this.grossReceiptTax8 = value;
    }

    /**
     * Gets the value of the grossReceiptTax9 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossReceiptTax9() {
        return grossReceiptTax9;
    }

    /**
     * Sets the value of the grossReceiptTax9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossReceiptTax9(Long value) {
        this.grossReceiptTax9 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax6() {
        return cityGrossReceiptTax6;
    }

    /**
     * Sets the value of the cityGrossReceiptTax6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax6(Long value) {
        this.cityGrossReceiptTax6 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax7 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax7() {
        return cityGrossReceiptTax7;
    }

    /**
     * Sets the value of the cityGrossReceiptTax7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax7(Long value) {
        this.cityGrossReceiptTax7 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax8() {
        return cityGrossReceiptTax8;
    }

    /**
     * Sets the value of the cityGrossReceiptTax8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax8(Long value) {
        this.cityGrossReceiptTax8 = value;
    }

    /**
     * Gets the value of the cityGrossReceiptTax9 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityGrossReceiptTax9() {
        return cityGrossReceiptTax9;
    }

    /**
     * Sets the value of the cityGrossReceiptTax9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityGrossReceiptTax9(Long value) {
        this.cityGrossReceiptTax9 = value;
    }

    /**
     * Gets the value of the deleteActvnUpgdFeeAuthBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeleteActvnUpgdFeeAuthBaId() {
        return deleteActvnUpgdFeeAuthBaId;
    }

    /**
     * Sets the value of the deleteActvnUpgdFeeAuthBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeleteActvnUpgdFeeAuthBaId(Long value) {
        this.deleteActvnUpgdFeeAuthBaId = value;
    }

    /**
     * Gets the value of the rowNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowNbr() {
        return rowNbr;
    }

    /**
     * Sets the value of the rowNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowNbr(Long value) {
        this.rowNbr = value;
    }

    /**
     * Gets the value of the prntRowNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrntRowNbr() {
        return prntRowNbr;
    }

    /**
     * Sets the value of the prntRowNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrntRowNbr(Long value) {
        this.prntRowNbr = value;
    }

    /**
     * Gets the value of the hcOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcOfferId() {
        return hcOfferId;
    }

    /**
     * Sets the value of the hcOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcOfferId(String value) {
        this.hcOfferId = value;
    }

    /**
     * Gets the value of the asmtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsmtCd() {
        return asmtCd;
    }

    /**
     * Sets the value of the asmtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsmtCd(String value) {
        this.asmtCd = value;
    }

    /**
     * Gets the value of the intRtQty property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntRtQty() {
        return intRtQty;
    }

    /**
     * Sets the value of the intRtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntRtQty(Double value) {
        this.intRtQty = value;
    }

    /**
     * Gets the value of the totIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotIntAmt() {
        return totIntAmt;
    }

    /**
     * Sets the value of the totIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotIntAmt(Double value) {
        this.totIntAmt = value;
    }

    /**
     * Gets the value of the purchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets the value of the purchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseType(String value) {
        this.purchaseType = value;
    }

    /**
     * Gets the value of the exchangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeType() {
        return exchangeType;
    }

    /**
     * Sets the value of the exchangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeType(String value) {
        this.exchangeType = value;
    }

    /**
     * Gets the value of the srpDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSrpDiscountAmount() {
        return srpDiscountAmount;
    }

    /**
     * Sets the value of the srpDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSrpDiscountAmount(Double value) {
        this.srpDiscountAmount = value;
    }

    /**
     * Gets the value of the instlPaidCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstlPaidCnt() {
        return instlPaidCnt;
    }

    /**
     * Sets the value of the instlPaidCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstlPaidCnt(Long value) {
        this.instlPaidCnt = value;
    }

    /**
     * Gets the value of the upgrEarlyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgrEarlyCd() {
        return upgrEarlyCd;
    }

    /**
     * Sets the value of the upgrEarlyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgrEarlyCd(String value) {
        this.upgrEarlyCd = value;
    }

    /**
     * Gets the value of the trdinSerialNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdinSerialNbr() {
        return trdinSerialNbr;
    }

    /**
     * Sets the value of the trdinSerialNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdinSerialNbr(String value) {
        this.trdinSerialNbr = value;
    }

    /**
     * Gets the value of the appliedLeaseDiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAppliedLeaseDiscAmt() {
        return appliedLeaseDiscAmt;
    }

    /**
     * Sets the value of the appliedLeaseDiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAppliedLeaseDiscAmt(Double value) {
        this.appliedLeaseDiscAmt = value;
    }

    /**
     * Gets the value of the appliedLeaseAdpsDiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAppliedLeaseAdpsDiscAmt() {
        return appliedLeaseAdpsDiscAmt;
    }

    /**
     * Sets the value of the appliedLeaseAdpsDiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAppliedLeaseAdpsDiscAmt(Double value) {
        this.appliedLeaseAdpsDiscAmt = value;
    }

    /**
     * Gets the value of the turninOriginalSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurninOriginalSku() {
        return turninOriginalSku;
    }

    /**
     * Sets the value of the turninOriginalSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurninOriginalSku(String value) {
        this.turninOriginalSku = value;
    }

    /**
     * Gets the value of the acctPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAcctPostAmt() {
        return acctPostAmt;
    }

    /**
     * Sets the value of the acctPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAcctPostAmt(Double value) {
        this.acctPostAmt = value;
    }

    /**
     * Gets the value of the oneclickIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneclickIndcr() {
        return oneclickIndcr;
    }

    /**
     * Sets the value of the oneclickIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneclickIndcr(String value) {
        this.oneclickIndcr = value;
    }

    /**
     * Gets the value of the oneclickReadyIndcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneclickReadyIndcr() {
        return oneclickReadyIndcr;
    }

    /**
     * Sets the value of the oneclickReadyIndcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneclickReadyIndcr(String value) {
        this.oneclickReadyIndcr = value;
    }

    /**
     * Gets the value of the rtrnDevModelNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrnDevModelNme() {
        return rtrnDevModelNme;
    }

    /**
     * Sets the value of the rtrnDevModelNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrnDevModelNme(String value) {
        this.rtrnDevModelNme = value;
    }

    /**
     * Gets the value of the trdinPromoCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdinPromoCd() {
        return trdinPromoCd;
    }

    /**
     * Sets the value of the trdinPromoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdinPromoCd(String value) {
        this.trdinPromoCd = value;
    }

    /**
     * Gets the value of the newSkuHcp2Contract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSkuHcp2Contract() {
        return newSkuHcp2Contract;
    }

    /**
     * Sets the value of the newSkuHcp2Contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSkuHcp2Contract(String value) {
        this.newSkuHcp2Contract = value;
    }

    /**
     * Gets the value of the ibCheckbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbCheckbox() {
        return ibCheckbox;
    }

    /**
     * Sets the value of the ibCheckbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbCheckbox(String value) {
        this.ibCheckbox = value;
    }

    /**
     * Gets the value of the devDamageFeeTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDevDamageFeeTaxAmt() {
        return devDamageFeeTaxAmt;
    }

    /**
     * Sets the value of the devDamageFeeTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDevDamageFeeTaxAmt(Double value) {
        this.devDamageFeeTaxAmt = value;
    }

    /**
     * Gets the value of the excdQtyOvrBaId property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExcdQtyOvrBaId() {
        return excdQtyOvrBaId;
    }

    /**
     * Sets the value of the excdQtyOvrBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExcdQtyOvrBaId(Double value) {
        this.excdQtyOvrBaId = value;
    }

    /**
     * Gets the value of the deviceExistsInInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceExistsInInventory() {
        return deviceExistsInInventory;
    }

    /**
     * Sets the value of the deviceExistsInInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceExistsInInventory(Integer value) {
        this.deviceExistsInInventory = value;
    }

    /**
     * Gets the value of the exchangeovrdbaid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExchangeovrdbaid() {
        return exchangeovrdbaid;
    }

    /**
     * Sets the value of the exchangeovrdbaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExchangeovrdbaid(Integer value) {
        this.exchangeovrdbaid = value;
    }

    /**
     * Gets the value of the exchangeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeReasonCode() {
        return exchangeReasonCode;
    }

    /**
     * Sets the value of the exchangeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeReasonCode(Long value) {
        this.exchangeReasonCode = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
