
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageConsentDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageConsentDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="ContractList" type="{java:com.spcs.retailservices.domain}ContractList" minOccurs="0"/&gt;
 *         &lt;element name="E911ConsentList" type="{java:com.spcs.retailservices.domain}E911ConsentList" minOccurs="0"/&gt;
 *         &lt;element name="ConsentNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageConsentDetailsResponse", propOrder = {
    "successIndicator",
    "errorInfo",
    "contractList",
    "e911ConsentList",
    "consentNo"
})
public class ManageConsentDetailsResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElement(name = "ErrorInfo")
    protected ErrorInfo errorInfo;
    @XmlElement(name = "ContractList")
    protected ContractList contractList;
    @XmlElement(name = "E911ConsentList")
    protected E911ConsentList e911ConsentList;
    @XmlElement(name = "ConsentNo")
    protected Integer consentNo;

    /**
     * Gets the value of the successIndicator property.
     * 
     */
    public boolean isSuccessIndicator() {
        return successIndicator;
    }

    /**
     * Sets the value of the successIndicator property.
     * 
     */
    public void setSuccessIndicator(boolean value) {
        this.successIndicator = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInfo }
     *     
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInfo }
     *     
     */
    public void setErrorInfo(ErrorInfo value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the contractList property.
     * 
     * @return
     *     possible object is
     *     {@link ContractList }
     *     
     */
    public ContractList getContractList() {
        return contractList;
    }

    /**
     * Sets the value of the contractList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractList }
     *     
     */
    public void setContractList(ContractList value) {
        this.contractList = value;
    }

    /**
     * Gets the value of the e911ConsentList property.
     * 
     * @return
     *     possible object is
     *     {@link E911ConsentList }
     *     
     */
    public E911ConsentList getE911ConsentList() {
        return e911ConsentList;
    }

    /**
     * Sets the value of the e911ConsentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link E911ConsentList }
     *     
     */
    public void setE911ConsentList(E911ConsentList value) {
        this.e911ConsentList = value;
    }

    /**
     * Gets the value of the consentNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsentNo() {
        return consentNo;
    }

    /**
     * Sets the value of the consentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsentNo(Integer value) {
        this.consentNo = value;
    }

}
