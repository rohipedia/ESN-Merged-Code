
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransactionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="updateTransactionDateTimeInfo" type="{java:com.spcs.retailservices.domain}UpdateTransactionDateTimeInfo"/&gt;
 *         &lt;element name="updateTransactionRegisterInfo" type="{java:com.spcs.retailservices.domain}UpdateTransactionRegisterInfo"/&gt;
 *         &lt;element name="updateTransactionServicesStatusList" type="{java:com.spcs.retailservices.domain}UpdateTransactionServicesStatusList"/&gt;
 *         &lt;element name="updateAccessoryLoanDetailsList" type="{java:com.spcs.retailservices.domain}UpdateAccessoryLoanDetailsList" minOccurs="0"/&gt;
 *         &lt;element name="updateFastOrderIdInfo" type="{java:com.spcs.retailservices.domain}UpdateFastOrderIdInfo" minOccurs="0"/&gt;
 *         &lt;element name="updateRecycleItemList" type="{java:com.spcs.retailservices.domain}UpdateRecycleItemList" minOccurs="0"/&gt;
 *         &lt;element name="updateBogoList" type="{java:com.spcs.retailservices.domain}UpdateBogoList" minOccurs="0"/&gt;
 *         &lt;element name="updateOmimOrderList" type="{java:com.spcs.retailservices.domain}UpdateOmimOrderList" minOccurs="0"/&gt;
 *         &lt;element name="updateMaintenanceDetailsInfoList" type="{java:com.spcs.retailservices.domain}UpdateMaintenanceDetailsInfoList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionData", propOrder = {
    "transactionNumber",
    "updateTransactionDateTimeInfo",
    "updateTransactionRegisterInfo",
    "updateTransactionServicesStatusList",
    "updateAccessoryLoanDetailsList",
    "updateFastOrderIdInfo",
    "updateRecycleItemList",
    "updateBogoList",
    "updateOmimOrderList",
    "updateMaintenanceDetailsInfoList"
})
public class UpdateTransactionData {

    protected long transactionNumber;
    @XmlElement(required = true)
    protected UpdateTransactionDateTimeInfo updateTransactionDateTimeInfo;
    @XmlElement(required = true)
    protected UpdateTransactionRegisterInfo updateTransactionRegisterInfo;
    @XmlElement(required = true)
    protected UpdateTransactionServicesStatusList updateTransactionServicesStatusList;
    protected UpdateAccessoryLoanDetailsList updateAccessoryLoanDetailsList;
    protected UpdateFastOrderIdInfo updateFastOrderIdInfo;
    protected UpdateRecycleItemList updateRecycleItemList;
    protected UpdateBogoList updateBogoList;
    protected UpdateOmimOrderList updateOmimOrderList;
    protected UpdateMaintenanceDetailsInfoList updateMaintenanceDetailsInfoList;

    /**
     * Gets the value of the transactionNumber property.
     * 
     */
    public long getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     */
    public void setTransactionNumber(long value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the updateTransactionDateTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransactionDateTimeInfo }
     *     
     */
    public UpdateTransactionDateTimeInfo getUpdateTransactionDateTimeInfo() {
        return updateTransactionDateTimeInfo;
    }

    /**
     * Sets the value of the updateTransactionDateTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransactionDateTimeInfo }
     *     
     */
    public void setUpdateTransactionDateTimeInfo(UpdateTransactionDateTimeInfo value) {
        this.updateTransactionDateTimeInfo = value;
    }

    /**
     * Gets the value of the updateTransactionRegisterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransactionRegisterInfo }
     *     
     */
    public UpdateTransactionRegisterInfo getUpdateTransactionRegisterInfo() {
        return updateTransactionRegisterInfo;
    }

    /**
     * Sets the value of the updateTransactionRegisterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransactionRegisterInfo }
     *     
     */
    public void setUpdateTransactionRegisterInfo(UpdateTransactionRegisterInfo value) {
        this.updateTransactionRegisterInfo = value;
    }

    /**
     * Gets the value of the updateTransactionServicesStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransactionServicesStatusList }
     *     
     */
    public UpdateTransactionServicesStatusList getUpdateTransactionServicesStatusList() {
        return updateTransactionServicesStatusList;
    }

    /**
     * Sets the value of the updateTransactionServicesStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransactionServicesStatusList }
     *     
     */
    public void setUpdateTransactionServicesStatusList(UpdateTransactionServicesStatusList value) {
        this.updateTransactionServicesStatusList = value;
    }

    /**
     * Gets the value of the updateAccessoryLoanDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAccessoryLoanDetailsList }
     *     
     */
    public UpdateAccessoryLoanDetailsList getUpdateAccessoryLoanDetailsList() {
        return updateAccessoryLoanDetailsList;
    }

    /**
     * Sets the value of the updateAccessoryLoanDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAccessoryLoanDetailsList }
     *     
     */
    public void setUpdateAccessoryLoanDetailsList(UpdateAccessoryLoanDetailsList value) {
        this.updateAccessoryLoanDetailsList = value;
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

}
