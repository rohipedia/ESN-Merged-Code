
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTendersInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionTendersInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tenderIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tenderAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="webOrderCardTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="qpayTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="btaInfo" type="{java:com.spcs.retailservices.domain}BtaInfo" minOccurs="0"/&gt;
 *         &lt;element name="checkInfo" type="{java:com.spcs.retailservices.domain}CheckInfo" minOccurs="0"/&gt;
 *         &lt;element name="giftCardInfo" type="{java:com.spcs.retailservices.domain}GiftCardInfo" minOccurs="0"/&gt;
 *         &lt;element name="precashInfo" type="{java:com.spcs.retailservices.domain}PrecashInfo" minOccurs="0"/&gt;
 *         &lt;element name="creditCardInfo" type="{java:com.spcs.retailservices.domain}CreditCardInfo" minOccurs="0"/&gt;
 *         &lt;element name="signatureInfo" type="{java:com.spcs.retailservices.domain}SignatureInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTendersInfo", propOrder = {
    "tenderIdentifier",
    "tenderAmount",
    "webOrderCardTypeCode",
    "contractIdentifier",
    "qpayTransactionIdentifier",
    "btaInfo",
    "checkInfo",
    "giftCardInfo",
    "precashInfo",
    "creditCardInfo",
    "signatureInfo"
})
public class TransactionTendersInfo {

    protected long tenderIdentifier;
    protected double tenderAmount;
    protected String webOrderCardTypeCode;
    protected Integer contractIdentifier;
    protected String qpayTransactionIdentifier;
    protected BtaInfo btaInfo;
    protected CheckInfo checkInfo;
    protected GiftCardInfo giftCardInfo;
    protected PrecashInfo precashInfo;
    protected CreditCardInfo creditCardInfo;
    protected SignatureInfo signatureInfo;

    /**
     * Gets the value of the tenderIdentifier property.
     * 
     */
    public long getTenderIdentifier() {
        return tenderIdentifier;
    }

    /**
     * Sets the value of the tenderIdentifier property.
     * 
     */
    public void setTenderIdentifier(long value) {
        this.tenderIdentifier = value;
    }

    /**
     * Gets the value of the tenderAmount property.
     * 
     */
    public double getTenderAmount() {
        return tenderAmount;
    }

    /**
     * Sets the value of the tenderAmount property.
     * 
     */
    public void setTenderAmount(double value) {
        this.tenderAmount = value;
    }

    /**
     * Gets the value of the webOrderCardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebOrderCardTypeCode() {
        return webOrderCardTypeCode;
    }

    /**
     * Sets the value of the webOrderCardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebOrderCardTypeCode(String value) {
        this.webOrderCardTypeCode = value;
    }

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractIdentifier(Integer value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the qpayTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQpayTransactionIdentifier() {
        return qpayTransactionIdentifier;
    }

    /**
     * Sets the value of the qpayTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQpayTransactionIdentifier(String value) {
        this.qpayTransactionIdentifier = value;
    }

    /**
     * Gets the value of the btaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BtaInfo }
     *     
     */
    public BtaInfo getBtaInfo() {
        return btaInfo;
    }

    /**
     * Sets the value of the btaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BtaInfo }
     *     
     */
    public void setBtaInfo(BtaInfo value) {
        this.btaInfo = value;
    }

    /**
     * Gets the value of the checkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getCheckInfo() {
        return checkInfo;
    }

    /**
     * Sets the value of the checkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setCheckInfo(CheckInfo value) {
        this.checkInfo = value;
    }

    /**
     * Gets the value of the giftCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardInfo }
     *     
     */
    public GiftCardInfo getGiftCardInfo() {
        return giftCardInfo;
    }

    /**
     * Sets the value of the giftCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardInfo }
     *     
     */
    public void setGiftCardInfo(GiftCardInfo value) {
        this.giftCardInfo = value;
    }

    /**
     * Gets the value of the precashInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrecashInfo }
     *     
     */
    public PrecashInfo getPrecashInfo() {
        return precashInfo;
    }

    /**
     * Sets the value of the precashInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecashInfo }
     *     
     */
    public void setPrecashInfo(PrecashInfo value) {
        this.precashInfo = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfo }
     *     
     */
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfo }
     *     
     */
    public void setCreditCardInfo(CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the signatureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureInfo }
     *     
     */
    public SignatureInfo getSignatureInfo() {
        return signatureInfo;
    }

    /**
     * Sets the value of the signatureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureInfo }
     *     
     */
    public void setSignatureInfo(SignatureInfo value) {
        this.signatureInfo = value;
    }

}
