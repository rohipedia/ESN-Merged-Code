
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCalculateTaxesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCalculateTaxesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreIdentifierTimetrade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CalcTaxSkuInfoList" type="{java:com.spcs.retailservices.domain}CalcTaxSkuInfoList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCalculateTaxesRequest", propOrder = {
    "storeIdentifierTimetrade",
    "calcTaxSkuInfoList"
})
public class QueryCalculateTaxesRequest
    extends Request
{

    @XmlElement(name = "StoreIdentifierTimetrade", required = true)
    protected String storeIdentifierTimetrade;
    @XmlElement(name = "CalcTaxSkuInfoList", required = true)
    protected CalcTaxSkuInfoList calcTaxSkuInfoList;

    /**
     * Gets the value of the storeIdentifierTimetrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreIdentifierTimetrade() {
        return storeIdentifierTimetrade;
    }

    /**
     * Sets the value of the storeIdentifierTimetrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreIdentifierTimetrade(String value) {
        this.storeIdentifierTimetrade = value;
    }

    /**
     * Gets the value of the calcTaxSkuInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link CalcTaxSkuInfoList }
     *     
     */
    public CalcTaxSkuInfoList getCalcTaxSkuInfoList() {
        return calcTaxSkuInfoList;
    }

    /**
     * Sets the value of the calcTaxSkuInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcTaxSkuInfoList }
     *     
     */
    public void setCalcTaxSkuInfoList(CalcTaxSkuInfoList value) {
        this.calcTaxSkuInfoList = value;
    }

}
