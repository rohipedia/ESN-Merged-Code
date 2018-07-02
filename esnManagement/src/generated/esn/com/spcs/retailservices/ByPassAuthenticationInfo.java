
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ByPassAuthenticationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByPassAuthenticationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authOrByPassCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="serverDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="storeLocationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="saleRepId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="authUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bypassCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByPassAuthenticationInfo", propOrder = {
    "authOrByPassCode",
    "serverDate",
    "storeLocationId",
    "saleRepId",
    "authUserId",
    "accountNumber",
    "bypassCode"
})
public class ByPassAuthenticationInfo {

    protected int authOrByPassCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serverDate;
    protected long storeLocationId;
    protected long saleRepId;
    protected Long authUserId;
    protected String accountNumber;
    protected int bypassCode;

    /**
     * Gets the value of the authOrByPassCode property.
     * 
     */
    public int getAuthOrByPassCode() {
        return authOrByPassCode;
    }

    /**
     * Sets the value of the authOrByPassCode property.
     * 
     */
    public void setAuthOrByPassCode(int value) {
        this.authOrByPassCode = value;
    }

    /**
     * Gets the value of the serverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServerDate() {
        return serverDate;
    }

    /**
     * Sets the value of the serverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServerDate(XMLGregorianCalendar value) {
        this.serverDate = value;
    }

    /**
     * Gets the value of the storeLocationId property.
     * 
     */
    public long getStoreLocationId() {
        return storeLocationId;
    }

    /**
     * Sets the value of the storeLocationId property.
     * 
     */
    public void setStoreLocationId(long value) {
        this.storeLocationId = value;
    }

    /**
     * Gets the value of the saleRepId property.
     * 
     */
    public long getSaleRepId() {
        return saleRepId;
    }

    /**
     * Sets the value of the saleRepId property.
     * 
     */
    public void setSaleRepId(long value) {
        this.saleRepId = value;
    }

    /**
     * Gets the value of the authUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthUserId() {
        return authUserId;
    }

    /**
     * Sets the value of the authUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthUserId(Long value) {
        this.authUserId = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the bypassCode property.
     * 
     */
    public int getBypassCode() {
        return bypassCode;
    }

    /**
     * Sets the value of the bypassCode property.
     * 
     */
    public void setBypassCode(int value) {
        this.bypassCode = value;
    }

}
