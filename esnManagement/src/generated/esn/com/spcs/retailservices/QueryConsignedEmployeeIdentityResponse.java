
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryConsignedEmployeeIdentityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryConsignedEmployeeIdentityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{java:com.spcs.retailservices.domain}Header"/&gt;
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatabaseErrorDetails" type="{java:com.spcs.retailservices.domain}DatabaseErrorDetails"/&gt;
 *         &lt;element name="ConsignedEmployeeIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConsignedEmployeeIdentityResponse", propOrder = {
    "header",
    "returnValue",
    "databaseErrorDetails",
    "consignedEmployeeIdentifier"
})
public class QueryConsignedEmployeeIdentityResponse {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected Header header;
    @XmlElement(name = "ReturnValue", required = true, nillable = true)
    protected String returnValue;
    @XmlElement(name = "DatabaseErrorDetails", required = true, nillable = true)
    protected DatabaseErrorDetails databaseErrorDetails;
    @XmlElement(name = "ConsignedEmployeeIdentifier")
    protected int consignedEmployeeIdentifier;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnValue(String value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the databaseErrorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseErrorDetails }
     *     
     */
    public DatabaseErrorDetails getDatabaseErrorDetails() {
        return databaseErrorDetails;
    }

    /**
     * Sets the value of the databaseErrorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseErrorDetails }
     *     
     */
    public void setDatabaseErrorDetails(DatabaseErrorDetails value) {
        this.databaseErrorDetails = value;
    }

    /**
     * Gets the value of the consignedEmployeeIdentifier property.
     * 
     */
    public int getConsignedEmployeeIdentifier() {
        return consignedEmployeeIdentifier;
    }

    /**
     * Sets the value of the consignedEmployeeIdentifier property.
     * 
     */
    public void setConsignedEmployeeIdentifier(int value) {
        this.consignedEmployeeIdentifier = value;
    }

}
