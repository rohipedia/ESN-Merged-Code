
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignRegisterAndFloatResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignRegisterAndFloatResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responsetxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="floatMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registerNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="floatNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sharedCashDrawerFloatNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignRegisterAndFloatResponse", propOrder = {
    "responsetxt",
    "floatMessage",
    "registerNo",
    "floatNo",
    "sharedCashDrawerFloatNumber"
})
public class AssignRegisterAndFloatResponse
    extends Response
{

    @XmlElement(required = true)
    protected String responsetxt;
    @XmlElement(required = true, nillable = true)
    protected String floatMessage;
    protected int registerNo;
    protected int floatNo;
    protected Integer sharedCashDrawerFloatNumber;

    /**
     * Gets the value of the responsetxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsetxt() {
        return responsetxt;
    }

    /**
     * Sets the value of the responsetxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsetxt(String value) {
        this.responsetxt = value;
    }

    /**
     * Gets the value of the floatMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatMessage() {
        return floatMessage;
    }

    /**
     * Sets the value of the floatMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatMessage(String value) {
        this.floatMessage = value;
    }

    /**
     * Gets the value of the registerNo property.
     * 
     */
    public int getRegisterNo() {
        return registerNo;
    }

    /**
     * Sets the value of the registerNo property.
     * 
     */
    public void setRegisterNo(int value) {
        this.registerNo = value;
    }

    /**
     * Gets the value of the floatNo property.
     * 
     */
    public int getFloatNo() {
        return floatNo;
    }

    /**
     * Sets the value of the floatNo property.
     * 
     */
    public void setFloatNo(int value) {
        this.floatNo = value;
    }

    /**
     * Gets the value of the sharedCashDrawerFloatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSharedCashDrawerFloatNumber() {
        return sharedCashDrawerFloatNumber;
    }

    /**
     * Sets the value of the sharedCashDrawerFloatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSharedCashDrawerFloatNumber(Integer value) {
        this.sharedCashDrawerFloatNumber = value;
    }

}
