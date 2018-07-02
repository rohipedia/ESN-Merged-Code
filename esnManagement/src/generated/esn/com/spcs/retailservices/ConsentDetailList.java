
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aslConsentInfo" type="{java:com.spcs.retailservices.domain}AslConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="equipmentConsentInfoList" type="{java:com.spcs.retailservices.domain}EquipmentConsentInfoList" minOccurs="0"/&gt;
 *         &lt;element name="oneTimeChargeConsentInfoList" type="{java:com.spcs.retailservices.domain}OneTimeChargeConsentInfoList" minOccurs="0"/&gt;
 *         &lt;element name="leaseConsentInfo" type="{java:com.spcs.retailservices.domain}LeaseConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="discountConsentInfo" type="{java:com.spcs.retailservices.domain}DiscountConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="framilyConsentInfo" type="{java:com.spcs.retailservices.domain}FramilyConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="autoPayConsentInfo" type="{java:com.spcs.retailservices.domain}AutoPayConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="walletConsentInfo" type="{java:com.spcs.retailservices.domain}WalletConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="futureDatedPaymentConsentInfo" type="{java:com.spcs.retailservices.domain}FutureDatedPaymentConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="agreementConsentInfoList" type="{java:com.spcs.retailservices.domain}AgreementConsentInfoList" minOccurs="0"/&gt;
 *         &lt;element name="CreditAccountConsentInfo" type="{java:com.spcs.retailservices.domain}CreditAccountConsentInfo" minOccurs="0"/&gt;
 *         &lt;element name="HcAgreementInfo" type="{java:com.spcs.retailservices.domain}HcAgreementInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentDetailList", propOrder = {
    "aslConsentInfo",
    "equipmentConsentInfoList",
    "oneTimeChargeConsentInfoList",
    "leaseConsentInfo",
    "discountConsentInfo",
    "framilyConsentInfo",
    "autoPayConsentInfo",
    "walletConsentInfo",
    "futureDatedPaymentConsentInfo",
    "agreementConsentInfoList",
    "creditAccountConsentInfo",
    "hcAgreementInfo"
})
public class ConsentDetailList {

    protected AslConsentInfo aslConsentInfo;
    protected EquipmentConsentInfoList equipmentConsentInfoList;
    protected OneTimeChargeConsentInfoList oneTimeChargeConsentInfoList;
    protected LeaseConsentInfo leaseConsentInfo;
    protected DiscountConsentInfo discountConsentInfo;
    protected FramilyConsentInfo framilyConsentInfo;
    protected AutoPayConsentInfo autoPayConsentInfo;
    protected WalletConsentInfo walletConsentInfo;
    protected FutureDatedPaymentConsentInfo futureDatedPaymentConsentInfo;
    protected AgreementConsentInfoList agreementConsentInfoList;
    @XmlElement(name = "CreditAccountConsentInfo")
    protected CreditAccountConsentInfo creditAccountConsentInfo;
    @XmlElement(name = "HcAgreementInfo")
    protected HcAgreementInfo hcAgreementInfo;

    /**
     * Gets the value of the aslConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AslConsentInfo }
     *     
     */
    public AslConsentInfo getAslConsentInfo() {
        return aslConsentInfo;
    }

    /**
     * Sets the value of the aslConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AslConsentInfo }
     *     
     */
    public void setAslConsentInfo(AslConsentInfo value) {
        this.aslConsentInfo = value;
    }

    /**
     * Gets the value of the equipmentConsentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentConsentInfoList }
     *     
     */
    public EquipmentConsentInfoList getEquipmentConsentInfoList() {
        return equipmentConsentInfoList;
    }

    /**
     * Sets the value of the equipmentConsentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentConsentInfoList }
     *     
     */
    public void setEquipmentConsentInfoList(EquipmentConsentInfoList value) {
        this.equipmentConsentInfoList = value;
    }

    /**
     * Gets the value of the oneTimeChargeConsentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeConsentInfoList }
     *     
     */
    public OneTimeChargeConsentInfoList getOneTimeChargeConsentInfoList() {
        return oneTimeChargeConsentInfoList;
    }

    /**
     * Sets the value of the oneTimeChargeConsentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeConsentInfoList }
     *     
     */
    public void setOneTimeChargeConsentInfoList(OneTimeChargeConsentInfoList value) {
        this.oneTimeChargeConsentInfoList = value;
    }

    /**
     * Gets the value of the leaseConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseConsentInfo }
     *     
     */
    public LeaseConsentInfo getLeaseConsentInfo() {
        return leaseConsentInfo;
    }

    /**
     * Sets the value of the leaseConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseConsentInfo }
     *     
     */
    public void setLeaseConsentInfo(LeaseConsentInfo value) {
        this.leaseConsentInfo = value;
    }

    /**
     * Gets the value of the discountConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountConsentInfo }
     *     
     */
    public DiscountConsentInfo getDiscountConsentInfo() {
        return discountConsentInfo;
    }

    /**
     * Sets the value of the discountConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountConsentInfo }
     *     
     */
    public void setDiscountConsentInfo(DiscountConsentInfo value) {
        this.discountConsentInfo = value;
    }

    /**
     * Gets the value of the framilyConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FramilyConsentInfo }
     *     
     */
    public FramilyConsentInfo getFramilyConsentInfo() {
        return framilyConsentInfo;
    }

    /**
     * Sets the value of the framilyConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FramilyConsentInfo }
     *     
     */
    public void setFramilyConsentInfo(FramilyConsentInfo value) {
        this.framilyConsentInfo = value;
    }

    /**
     * Gets the value of the autoPayConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPayConsentInfo }
     *     
     */
    public AutoPayConsentInfo getAutoPayConsentInfo() {
        return autoPayConsentInfo;
    }

    /**
     * Sets the value of the autoPayConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPayConsentInfo }
     *     
     */
    public void setAutoPayConsentInfo(AutoPayConsentInfo value) {
        this.autoPayConsentInfo = value;
    }

    /**
     * Gets the value of the walletConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WalletConsentInfo }
     *     
     */
    public WalletConsentInfo getWalletConsentInfo() {
        return walletConsentInfo;
    }

    /**
     * Sets the value of the walletConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletConsentInfo }
     *     
     */
    public void setWalletConsentInfo(WalletConsentInfo value) {
        this.walletConsentInfo = value;
    }

    /**
     * Gets the value of the futureDatedPaymentConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FutureDatedPaymentConsentInfo }
     *     
     */
    public FutureDatedPaymentConsentInfo getFutureDatedPaymentConsentInfo() {
        return futureDatedPaymentConsentInfo;
    }

    /**
     * Sets the value of the futureDatedPaymentConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureDatedPaymentConsentInfo }
     *     
     */
    public void setFutureDatedPaymentConsentInfo(FutureDatedPaymentConsentInfo value) {
        this.futureDatedPaymentConsentInfo = value;
    }

    /**
     * Gets the value of the agreementConsentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementConsentInfoList }
     *     
     */
    public AgreementConsentInfoList getAgreementConsentInfoList() {
        return agreementConsentInfoList;
    }

    /**
     * Sets the value of the agreementConsentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementConsentInfoList }
     *     
     */
    public void setAgreementConsentInfoList(AgreementConsentInfoList value) {
        this.agreementConsentInfoList = value;
    }

    /**
     * Gets the value of the creditAccountConsentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAccountConsentInfo }
     *     
     */
    public CreditAccountConsentInfo getCreditAccountConsentInfo() {
        return creditAccountConsentInfo;
    }

    /**
     * Sets the value of the creditAccountConsentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAccountConsentInfo }
     *     
     */
    public void setCreditAccountConsentInfo(CreditAccountConsentInfo value) {
        this.creditAccountConsentInfo = value;
    }

    /**
     * Gets the value of the hcAgreementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HcAgreementInfo }
     *     
     */
    public HcAgreementInfo getHcAgreementInfo() {
        return hcAgreementInfo;
    }

    /**
     * Sets the value of the hcAgreementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HcAgreementInfo }
     *     
     */
    public void setHcAgreementInfo(HcAgreementInfo value) {
        this.hcAgreementInfo = value;
    }

}
