
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcTaxSkuInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcTaxSkuInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalcTaxSkuInfo" type="{java:com.spcs.retailservices.domain}CalcTaxSkuInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcTaxSkuInfoList", propOrder = {
    "calcTaxSkuInfo"
})
public class CalcTaxSkuInfoList {

    @XmlElement(name = "CalcTaxSkuInfo", required = true)
    protected List<CalcTaxSkuInfo> calcTaxSkuInfo;

    /**
     * Gets the value of the calcTaxSkuInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calcTaxSkuInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalcTaxSkuInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalcTaxSkuInfo }
     * 
     * 
     */
    public List<CalcTaxSkuInfo> getCalcTaxSkuInfo() {
        if (calcTaxSkuInfo == null) {
            calcTaxSkuInfo = new ArrayList<CalcTaxSkuInfo>();
        }
        return this.calcTaxSkuInfo;
    }

}
