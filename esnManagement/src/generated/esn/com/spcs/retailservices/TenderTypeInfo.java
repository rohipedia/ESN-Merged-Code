
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenderTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tenderIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tenderCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tenderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signatureReq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowRefund" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowPayment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowOverTender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maxTenderAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="minTenderAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="openDrawer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="promptForAuthentication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prompForIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amtLmtPromptIdentification" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="autonotesIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blockTenderTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="businessDirectStoreTenderIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardTypeList" type="{java:com.spcs.retailservices.domain}CardTypeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderTypeInfo", propOrder = {
    "tenderIdentifier",
    "tenderCode",
    "tenderName",
    "signatureReq",
    "allowRefund",
    "allowPayment",
    "allowOverTender",
    "maxTenderAmount",
    "minTenderAmount",
    "openDrawer",
    "promptForAuthentication",
    "prompForIdentification",
    "amtLmtPromptIdentification",
    "autonotesIndicator",
    "blockTenderTypeIndicator",
    "businessDirectStoreTenderIndicator",
    "cardTypeList"
})
public class TenderTypeInfo {

    protected int tenderIdentifier;
    @XmlElement(required = true)
    protected String tenderCode;
    @XmlElement(required = true)
    protected String tenderName;
    @XmlElement(required = true)
    protected String signatureReq;
    @XmlElement(required = true)
    protected String allowRefund;
    @XmlElement(required = true)
    protected String allowPayment;
    @XmlElement(required = true)
    protected String allowOverTender;
    protected double maxTenderAmount;
    protected double minTenderAmount;
    @XmlElement(required = true)
    protected String openDrawer;
    @XmlElement(required = true)
    protected String promptForAuthentication;
    @XmlElement(required = true)
    protected String prompForIdentification;
    protected double amtLmtPromptIdentification;
    @XmlElement(required = true)
    protected String autonotesIndicator;
    @XmlElement(required = true)
    protected String blockTenderTypeIndicator;
    @XmlElement(required = true)
    protected String businessDirectStoreTenderIndicator;
    @XmlElement(required = true)
    protected CardTypeList cardTypeList;

    /**
     * Gets the value of the tenderIdentifier property.
     * 
     */
    public int getTenderIdentifier() {
        return tenderIdentifier;
    }

    /**
     * Sets the value of the tenderIdentifier property.
     * 
     */
    public void setTenderIdentifier(int value) {
        this.tenderIdentifier = value;
    }

    /**
     * Gets the value of the tenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderCode() {
        return tenderCode;
    }

    /**
     * Sets the value of the tenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderCode(String value) {
        this.tenderCode = value;
    }

    /**
     * Gets the value of the tenderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderName() {
        return tenderName;
    }

    /**
     * Sets the value of the tenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderName(String value) {
        this.tenderName = value;
    }

    /**
     * Gets the value of the signatureReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureReq() {
        return signatureReq;
    }

    /**
     * Sets the value of the signatureReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureReq(String value) {
        this.signatureReq = value;
    }

    /**
     * Gets the value of the allowRefund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowRefund() {
        return allowRefund;
    }

    /**
     * Sets the value of the allowRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowRefund(String value) {
        this.allowRefund = value;
    }

    /**
     * Gets the value of the allowPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowPayment() {
        return allowPayment;
    }

    /**
     * Sets the value of the allowPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowPayment(String value) {
        this.allowPayment = value;
    }

    /**
     * Gets the value of the allowOverTender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowOverTender() {
        return allowOverTender;
    }

    /**
     * Sets the value of the allowOverTender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowOverTender(String value) {
        this.allowOverTender = value;
    }

    /**
     * Gets the value of the maxTenderAmount property.
     * 
     */
    public double getMaxTenderAmount() {
        return maxTenderAmount;
    }

    /**
     * Sets the value of the maxTenderAmount property.
     * 
     */
    public void setMaxTenderAmount(double value) {
        this.maxTenderAmount = value;
    }

    /**
     * Gets the value of the minTenderAmount property.
     * 
     */
    public double getMinTenderAmount() {
        return minTenderAmount;
    }

    /**
     * Sets the value of the minTenderAmount property.
     * 
     */
    public void setMinTenderAmount(double value) {
        this.minTenderAmount = value;
    }

    /**
     * Gets the value of the openDrawer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDrawer() {
        return openDrawer;
    }

    /**
     * Sets the value of the openDrawer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDrawer(String value) {
        this.openDrawer = value;
    }

    /**
     * Gets the value of the promptForAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptForAuthentication() {
        return promptForAuthentication;
    }

    /**
     * Sets the value of the promptForAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptForAuthentication(String value) {
        this.promptForAuthentication = value;
    }

    /**
     * Gets the value of the prompForIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompForIdentification() {
        return prompForIdentification;
    }

    /**
     * Sets the value of the prompForIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompForIdentification(String value) {
        this.prompForIdentification = value;
    }

    /**
     * Gets the value of the amtLmtPromptIdentification property.
     * 
     */
    public double getAmtLmtPromptIdentification() {
        return amtLmtPromptIdentification;
    }

    /**
     * Sets the value of the amtLmtPromptIdentification property.
     * 
     */
    public void setAmtLmtPromptIdentification(double value) {
        this.amtLmtPromptIdentification = value;
    }

    /**
     * Gets the value of the autonotesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutonotesIndicator() {
        return autonotesIndicator;
    }

    /**
     * Sets the value of the autonotesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutonotesIndicator(String value) {
        this.autonotesIndicator = value;
    }

    /**
     * Gets the value of the blockTenderTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockTenderTypeIndicator() {
        return blockTenderTypeIndicator;
    }

    /**
     * Sets the value of the blockTenderTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockTenderTypeIndicator(String value) {
        this.blockTenderTypeIndicator = value;
    }

    /**
     * Gets the value of the businessDirectStoreTenderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDirectStoreTenderIndicator() {
        return businessDirectStoreTenderIndicator;
    }

    /**
     * Sets the value of the businessDirectStoreTenderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDirectStoreTenderIndicator(String value) {
        this.businessDirectStoreTenderIndicator = value;
    }

    /**
     * Gets the value of the cardTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeList }
     *     
     */
    public CardTypeList getCardTypeList() {
        return cardTypeList;
    }

    /**
     * Sets the value of the cardTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeList }
     *     
     */
    public void setCardTypeList(CardTypeList value) {
        this.cardTypeList = value;
    }

}
