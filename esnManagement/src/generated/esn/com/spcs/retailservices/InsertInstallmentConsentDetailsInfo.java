
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsertInstallmentConsentDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertInstallmentConsentDetailsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmplBaId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustBaId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SalesRepId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocBaId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AcceptanceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LoanDetailsList" type="{java:com.spcs.retailservices.domain}LoanDetailsList"/&gt;
 *         &lt;element name="DateSigned" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SignatureCapturedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertInstallmentConsentDetailsInfo", propOrder = {
    "emplBaId",
    "custBaId",
    "salesRepId",
    "locBaId",
    "acceptanceFlag",
    "loanDetailsList",
    "dateSigned",
    "signatureCapturedInd"
})
public class InsertInstallmentConsentDetailsInfo {

    @XmlElement(name = "EmplBaId", required = true)
    protected String emplBaId;
    @XmlElement(name = "CustBaId", required = true)
    protected String custBaId;
    @XmlElement(name = "SalesRepId", required = true)
    protected String salesRepId;
    @XmlElement(name = "LocBaId", required = true)
    protected String locBaId;
    @XmlElement(name = "AcceptanceFlag", required = true)
    protected String acceptanceFlag;
    @XmlElement(name = "LoanDetailsList", required = true)
    protected LoanDetailsList loanDetailsList;
    @XmlElement(name = "DateSigned", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSigned;
    @XmlElement(name = "SignatureCapturedInd")
    protected String signatureCapturedInd;

    /**
     * Gets the value of the emplBaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplBaId() {
        return emplBaId;
    }

    /**
     * Sets the value of the emplBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplBaId(String value) {
        this.emplBaId = value;
    }

    /**
     * Gets the value of the custBaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustBaId() {
        return custBaId;
    }

    /**
     * Sets the value of the custBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustBaId(String value) {
        this.custBaId = value;
    }

    /**
     * Gets the value of the salesRepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepId() {
        return salesRepId;
    }

    /**
     * Sets the value of the salesRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepId(String value) {
        this.salesRepId = value;
    }

    /**
     * Gets the value of the locBaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocBaId() {
        return locBaId;
    }

    /**
     * Sets the value of the locBaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocBaId(String value) {
        this.locBaId = value;
    }

    /**
     * Gets the value of the acceptanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceFlag() {
        return acceptanceFlag;
    }

    /**
     * Sets the value of the acceptanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceFlag(String value) {
        this.acceptanceFlag = value;
    }

    /**
     * Gets the value of the loanDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link LoanDetailsList }
     *     
     */
    public LoanDetailsList getLoanDetailsList() {
        return loanDetailsList;
    }

    /**
     * Sets the value of the loanDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanDetailsList }
     *     
     */
    public void setLoanDetailsList(LoanDetailsList value) {
        this.loanDetailsList = value;
    }

    /**
     * Gets the value of the dateSigned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSigned() {
        return dateSigned;
    }

    /**
     * Sets the value of the dateSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSigned(XMLGregorianCalendar value) {
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

}
