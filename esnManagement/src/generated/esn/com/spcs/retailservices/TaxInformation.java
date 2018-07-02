
package esn.com.spcs.retailservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaxTotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UpgradeNowFeeTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="queryTaxesResponse" type="{java:com.spcs.retailservices.domain}QueryTaxesResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation", propOrder = {
    "lineItem",
    "taxTotalAmount",
    "upgradeNowFeeTax",
    "queryTaxesResponse"
})
public class TaxInformation {

    @XmlElement(name = "LineItem")
    protected int lineItem;
    @XmlElement(name = "TaxTotalAmount")
    protected double taxTotalAmount;
    @XmlElementRef(name = "UpgradeNowFeeTax", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> upgradeNowFeeTax;
    @XmlElement(required = true)
    protected QueryTaxesResponse queryTaxesResponse;

    /**
     * Gets the value of the lineItem property.
     * 
     */
    public int getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     */
    public void setLineItem(int value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the taxTotalAmount property.
     * 
     */
    public double getTaxTotalAmount() {
        return taxTotalAmount;
    }

    /**
     * Sets the value of the taxTotalAmount property.
     * 
     */
    public void setTaxTotalAmount(double value) {
        this.taxTotalAmount = value;
    }

    /**
     * Gets the value of the upgradeNowFeeTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUpgradeNowFeeTax() {
        return upgradeNowFeeTax;
    }

    /**
     * Sets the value of the upgradeNowFeeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUpgradeNowFeeTax(JAXBElement<Double> value) {
        this.upgradeNowFeeTax = value;
    }

    /**
     * Gets the value of the queryTaxesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTaxesResponse }
     *     
     */
    public QueryTaxesResponse getQueryTaxesResponse() {
        return queryTaxesResponse;
    }

    /**
     * Sets the value of the queryTaxesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTaxesResponse }
     *     
     */
    public void setQueryTaxesResponse(QueryTaxesResponse value) {
        this.queryTaxesResponse = value;
    }

}
