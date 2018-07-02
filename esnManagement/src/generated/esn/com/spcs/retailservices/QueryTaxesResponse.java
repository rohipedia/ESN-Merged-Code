
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTaxesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTaxesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{java:com.spcs.retailservices.domain}Header"/&gt;
 *         &lt;element name="DatabaseErrorDetails" type="{java:com.spcs.retailservices.domain}DatabaseErrorDetails"/&gt;
 *         &lt;element name="Messages" type="{java:com.spcs.retailservices.domain}MessageInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxDetails" type="{java:com.spcs.retailservices.domain}TaxDetails"/&gt;
 *         &lt;element name="UseTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="GrossReceiptAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CityGrossReceiptAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTaxesResponse", propOrder = {
    "header",
    "databaseErrorDetails",
    "messages",
    "taxDetails",
    "useTaxAmount",
    "grossReceiptAmount",
    "cityGrossReceiptAmount"
})
public class QueryTaxesResponse {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected Header header;
    @XmlElement(name = "DatabaseErrorDetails", required = true, nillable = true)
    protected DatabaseErrorDetails databaseErrorDetails;
    @XmlElement(name = "Messages", nillable = true)
    protected List<MessageInfo> messages;
    @XmlElement(name = "TaxDetails", required = true, nillable = true)
    protected TaxDetails taxDetails;
    @XmlElement(name = "UseTaxAmount")
    protected double useTaxAmount;
    @XmlElement(name = "GrossReceiptAmount")
    protected double grossReceiptAmount;
    @XmlElement(name = "CityGrossReceiptAmount")
    protected double cityGrossReceiptAmount;

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
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageInfo }
     * 
     * 
     */
    public List<MessageInfo> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessageInfo>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetails }
     *     
     */
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetails }
     *     
     */
    public void setTaxDetails(TaxDetails value) {
        this.taxDetails = value;
    }

    /**
     * Gets the value of the useTaxAmount property.
     * 
     */
    public double getUseTaxAmount() {
        return useTaxAmount;
    }

    /**
     * Sets the value of the useTaxAmount property.
     * 
     */
    public void setUseTaxAmount(double value) {
        this.useTaxAmount = value;
    }

    /**
     * Gets the value of the grossReceiptAmount property.
     * 
     */
    public double getGrossReceiptAmount() {
        return grossReceiptAmount;
    }

    /**
     * Sets the value of the grossReceiptAmount property.
     * 
     */
    public void setGrossReceiptAmount(double value) {
        this.grossReceiptAmount = value;
    }

    /**
     * Gets the value of the cityGrossReceiptAmount property.
     * 
     */
    public double getCityGrossReceiptAmount() {
        return cityGrossReceiptAmount;
    }

    /**
     * Sets the value of the cityGrossReceiptAmount property.
     * 
     */
    public void setCityGrossReceiptAmount(double value) {
        this.cityGrossReceiptAmount = value;
    }

}
