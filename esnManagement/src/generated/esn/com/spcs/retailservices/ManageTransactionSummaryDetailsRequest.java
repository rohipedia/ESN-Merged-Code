
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageTransactionSummaryDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageTransactionSummaryDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insertTransSummaryInfo" type="{java:com.spcs.retailservices.domain}InsertTransSummaryInfo" minOccurs="0"/&gt;
 *         &lt;element name="dateSigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signatureCapturedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="base64Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageTransactionSummaryDetailsRequest", propOrder = {
    "transNo",
    "referenceId",
    "insertTransSummaryInfo",
    "dateSigned",
    "signatureCapturedInd",
    "applId",
    "base64Signature"
})
public class ManageTransactionSummaryDetailsRequest
    extends Request
{

    protected long transNo;
    protected String referenceId;
    protected InsertTransSummaryInfo insertTransSummaryInfo;
    protected String dateSigned;
    protected String signatureCapturedInd;
    @XmlElement(required = true)
    protected String applId;
    protected String base64Signature;

    /**
     * Gets the value of the transNo property.
     * 
     */
    public long getTransNo() {
        return transNo;
    }

    /**
     * Sets the value of the transNo property.
     * 
     */
    public void setTransNo(long value) {
        this.transNo = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the insertTransSummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InsertTransSummaryInfo }
     *     
     */
    public InsertTransSummaryInfo getInsertTransSummaryInfo() {
        return insertTransSummaryInfo;
    }

    /**
     * Sets the value of the insertTransSummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTransSummaryInfo }
     *     
     */
    public void setInsertTransSummaryInfo(InsertTransSummaryInfo value) {
        this.insertTransSummaryInfo = value;
    }

    /**
     * Gets the value of the dateSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSigned() {
        return dateSigned;
    }

    /**
     * Sets the value of the dateSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSigned(String value) {
        this.dateSigned = value;
    }

    /**
     * Gets the value of the signatureCapturedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureCapturedInd() {
        return signatureCapturedInd;
    }

    /**
     * Sets the value of the signatureCapturedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureCapturedInd(String value) {
        this.signatureCapturedInd = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplId(String value) {
        this.applId = value;
    }

    /**
     * Gets the value of the base64Signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Signature() {
        return base64Signature;
    }

    /**
     * Sets the value of the base64Signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Signature(String value) {
        this.base64Signature = value;
    }

}
