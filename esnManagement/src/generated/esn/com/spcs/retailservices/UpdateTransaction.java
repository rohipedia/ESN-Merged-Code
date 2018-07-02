
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateTransactionTimeInfo" type="{java:com.spcs.retailservices.domain}UpdateTransactionTimeInfo"/&gt;
 *         &lt;element name="updateTransactionServicesList" type="{java:com.spcs.retailservices.domain}UpdateTransactionServicesList" minOccurs="0"/&gt;
 *         &lt;element name="updateFastOrderIdInfo" type="{java:com.spcs.retailservices.domain}UpdateFastOrderIdInfo" minOccurs="0"/&gt;
 *         &lt;element name="createActionTypeList" type="{java:com.spcs.retailservices.domain}CreateActionTypeList"/&gt;
 *         &lt;element name="updateRecycleItemList" type="{java:com.spcs.retailservices.domain}UpdateRecycleItemList" minOccurs="0"/&gt;
 *         &lt;element name="updateTradeInItemList" type="{java:com.spcs.retailservices.domain}UpdateTradeInItemList" minOccurs="0"/&gt;
 *         &lt;element name="updateBogoList" type="{java:com.spcs.retailservices.domain}UpdateBogoList" minOccurs="0"/&gt;
 *         &lt;element name="transactionItemsGiftCardList" type="{java:com.spcs.retailservices.domain}TransactionItemsGiftCardList" minOccurs="0"/&gt;
 *         &lt;element name="releaseDsReservationList" type="{java:com.spcs.retailservices.domain}ReleaseDsReservationList" minOccurs="0"/&gt;
 *         &lt;element name="updatePRLottoInfo" type="{java:com.spcs.retailservices.domain}UpdatePRLottoInfo" minOccurs="0"/&gt;
 *         &lt;element name="updateWebOrderList" type="{java:com.spcs.retailservices.domain}UpdateWebOrderList" minOccurs="0"/&gt;
 *         &lt;element name="updateMsaItemList" type="{java:com.spcs.retailservices.domain}UpdateMsaItemList" minOccurs="0"/&gt;
 *         &lt;element name="updateOmimOrderList" type="{java:com.spcs.retailservices.domain}UpdateOmimOrderList" minOccurs="0"/&gt;
 *         &lt;element name="updateCustomerAccountInfo" type="{java:com.spcs.retailservices.domain}UpdateCustomerAccountInfo" minOccurs="0"/&gt;
 *         &lt;element name="updateMaintenanceDetailsInfoList" type="{java:com.spcs.retailservices.domain}UpdateMaintenanceDetailsInfoList" minOccurs="0"/&gt;
 *         &lt;element name="oneClickReadinessIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionAddOnDetailsList" type="{java:com.spcs.retailservices.domain}TransactionAddOnDetailsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransaction", propOrder = {
    "updateTransactionTimeInfo",
    "updateTransactionServicesList",
    "updateFastOrderIdInfo",
    "createActionTypeList",
    "updateRecycleItemList",
    "updateTradeInItemList",
    "updateBogoList",
    "transactionItemsGiftCardList",
    "releaseDsReservationList",
    "updatePRLottoInfo",
    "updateWebOrderList",
    "updateMsaItemList",
    "updateOmimOrderList",
    "updateCustomerAccountInfo",
    "updateMaintenanceDetailsInfoList",
    "oneClickReadinessIndicator",
    "transactionAddOnDetailsList"
})
public class UpdateTransaction {

    @XmlElement(required = true)
    protected UpdateTransactionTimeInfo updateTransactionTimeInfo;
    protected UpdateTransactionServicesList updateTransactionServicesList;
    protected UpdateFastOrderIdInfo updateFastOrderIdInfo;
    @XmlElement(required = true)
    protected CreateActionTypeList createActionTypeList;
    protected UpdateRecycleItemList updateRecycleItemList;
    protected UpdateTradeInItemList updateTradeInItemList;
    protected UpdateBogoList updateBogoList;
    protected TransactionItemsGiftCardList transactionItemsGiftCardList;
    protected ReleaseDsReservationList releaseDsReservationList;
    protected UpdatePRLottoInfo updatePRLottoInfo;
    protected UpdateWebOrderList updateWebOrderList;
    protected UpdateMsaItemList updateMsaItemList;
    protected UpdateOmimOrderList updateOmimOrderList;
    protected UpdateCustomerAccountInfo updateCustomerAccountInfo;
    protected UpdateMaintenanceDetailsInfoList updateMaintenanceDetailsInfoList;
    protected String oneClickReadinessIndicator;
    protected TransactionAddOnDetailsList transactionAddOnDetailsList;

    /**
     * Gets the value of the updateTransactionTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransactionTimeInfo }
     *     
     */
    public UpdateTransactionTimeInfo getUpdateTransactionTimeInfo() {
        return updateTransactionTimeInfo;
    }

    /**
     * Sets the value of the updateTransactionTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransactionTimeInfo }
     *     
     */
    public void setUpdateTransactionTimeInfo(UpdateTransactionTimeInfo value) {
        this.updateTransactionTimeInfo = value;
    }

    /**
     * Gets the value of the updateTransactionServicesList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransactionServicesList }
     *     
     */
    public UpdateTransactionServicesList getUpdateTransactionServicesList() {
        return updateTransactionServicesList;
    }

    /**
     * Sets the value of the updateTransactionServicesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransactionServicesList }
     *     
     */
    public void setUpdateTransactionServicesList(UpdateTransactionServicesList value) {
        this.updateTransactionServicesList = value;
    }

    /**
     * Gets the value of the updateFastOrderIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateFastOrderIdInfo }
     *     
     */
    public UpdateFastOrderIdInfo getUpdateFastOrderIdInfo() {
        return updateFastOrderIdInfo;
    }

    /**
     * Sets the value of the updateFastOrderIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateFastOrderIdInfo }
     *     
     */
    public void setUpdateFastOrderIdInfo(UpdateFastOrderIdInfo value) {
        this.updateFastOrderIdInfo = value;
    }

    /**
     * Gets the value of the createActionTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link CreateActionTypeList }
     *     
     */
    public CreateActionTypeList getCreateActionTypeList() {
        return createActionTypeList;
    }

    /**
     * Sets the value of the createActionTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateActionTypeList }
     *     
     */
    public void setCreateActionTypeList(CreateActionTypeList value) {
        this.createActionTypeList = value;
    }

    /**
     * Gets the value of the updateRecycleItemList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRecycleItemList }
     *     
     */
    public UpdateRecycleItemList getUpdateRecycleItemList() {
        return updateRecycleItemList;
    }

    /**
     * Sets the value of the updateRecycleItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRecycleItemList }
     *     
     */
    public void setUpdateRecycleItemList(UpdateRecycleItemList value) {
        this.updateRecycleItemList = value;
    }

    /**
     * Gets the value of the updateTradeInItemList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTradeInItemList }
     *     
     */
    public UpdateTradeInItemList getUpdateTradeInItemList() {
        return updateTradeInItemList;
    }

    /**
     * Sets the value of the updateTradeInItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTradeInItemList }
     *     
     */
    public void setUpdateTradeInItemList(UpdateTradeInItemList value) {
        this.updateTradeInItemList = value;
    }

    /**
     * Gets the value of the updateBogoList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBogoList }
     *     
     */
    public UpdateBogoList getUpdateBogoList() {
        return updateBogoList;
    }

    /**
     * Sets the value of the updateBogoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBogoList }
     *     
     */
    public void setUpdateBogoList(UpdateBogoList value) {
        this.updateBogoList = value;
    }

    /**
     * Gets the value of the transactionItemsGiftCardList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionItemsGiftCardList }
     *     
     */
    public TransactionItemsGiftCardList getTransactionItemsGiftCardList() {
        return transactionItemsGiftCardList;
    }

    /**
     * Sets the value of the transactionItemsGiftCardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionItemsGiftCardList }
     *     
     */
    public void setTransactionItemsGiftCardList(TransactionItemsGiftCardList value) {
        this.transactionItemsGiftCardList = value;
    }

    /**
     * Gets the value of the releaseDsReservationList property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseDsReservationList }
     *     
     */
    public ReleaseDsReservationList getReleaseDsReservationList() {
        return releaseDsReservationList;
    }

    /**
     * Sets the value of the releaseDsReservationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseDsReservationList }
     *     
     */
    public void setReleaseDsReservationList(ReleaseDsReservationList value) {
        this.releaseDsReservationList = value;
    }

    /**
     * Gets the value of the updatePRLottoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePRLottoInfo }
     *     
     */
    public UpdatePRLottoInfo getUpdatePRLottoInfo() {
        return updatePRLottoInfo;
    }

    /**
     * Sets the value of the updatePRLottoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePRLottoInfo }
     *     
     */
    public void setUpdatePRLottoInfo(UpdatePRLottoInfo value) {
        this.updatePRLottoInfo = value;
    }

    /**
     * Gets the value of the updateWebOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateWebOrderList }
     *     
     */
    public UpdateWebOrderList getUpdateWebOrderList() {
        return updateWebOrderList;
    }

    /**
     * Sets the value of the updateWebOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateWebOrderList }
     *     
     */
    public void setUpdateWebOrderList(UpdateWebOrderList value) {
        this.updateWebOrderList = value;
    }

    /**
     * Gets the value of the updateMsaItemList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMsaItemList }
     *     
     */
    public UpdateMsaItemList getUpdateMsaItemList() {
        return updateMsaItemList;
    }

    /**
     * Sets the value of the updateMsaItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMsaItemList }
     *     
     */
    public void setUpdateMsaItemList(UpdateMsaItemList value) {
        this.updateMsaItemList = value;
    }

    /**
     * Gets the value of the updateOmimOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOmimOrderList }
     *     
     */
    public UpdateOmimOrderList getUpdateOmimOrderList() {
        return updateOmimOrderList;
    }

    /**
     * Sets the value of the updateOmimOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOmimOrderList }
     *     
     */
    public void setUpdateOmimOrderList(UpdateOmimOrderList value) {
        this.updateOmimOrderList = value;
    }

    /**
     * Gets the value of the updateCustomerAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCustomerAccountInfo }
     *     
     */
    public UpdateCustomerAccountInfo getUpdateCustomerAccountInfo() {
        return updateCustomerAccountInfo;
    }

    /**
     * Sets the value of the updateCustomerAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCustomerAccountInfo }
     *     
     */
    public void setUpdateCustomerAccountInfo(UpdateCustomerAccountInfo value) {
        this.updateCustomerAccountInfo = value;
    }

    /**
     * Gets the value of the updateMaintenanceDetailsInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMaintenanceDetailsInfoList }
     *     
     */
    public UpdateMaintenanceDetailsInfoList getUpdateMaintenanceDetailsInfoList() {
        return updateMaintenanceDetailsInfoList;
    }

    /**
     * Sets the value of the updateMaintenanceDetailsInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMaintenanceDetailsInfoList }
     *     
     */
    public void setUpdateMaintenanceDetailsInfoList(UpdateMaintenanceDetailsInfoList value) {
        this.updateMaintenanceDetailsInfoList = value;
    }

    /**
     * Gets the value of the oneClickReadinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneClickReadinessIndicator() {
        return oneClickReadinessIndicator;
    }

    /**
     * Sets the value of the oneClickReadinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneClickReadinessIndicator(String value) {
        this.oneClickReadinessIndicator = value;
    }

    /**
     * Gets the value of the transactionAddOnDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAddOnDetailsList }
     *     
     */
    public TransactionAddOnDetailsList getTransactionAddOnDetailsList() {
        return transactionAddOnDetailsList;
    }

    /**
     * Sets the value of the transactionAddOnDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAddOnDetailsList }
     *     
     */
    public void setTransactionAddOnDetailsList(TransactionAddOnDetailsList value) {
        this.transactionAddOnDetailsList = value;
    }

}
