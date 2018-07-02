
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingModelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingModelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="financingModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="financingHCDetails" type="{java:com.spcs.retailservices.domain}FinancingHCDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingModelInfo", propOrder = {
    "financingModelCode",
    "financingHCDetails"
})
public class FinancingModelInfo {

    @XmlElement(required = true)
    protected String financingModelCode;
    protected List<FinancingHCDetails> financingHCDetails;

    /**
     * Gets the value of the financingModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancingModelCode() {
        return financingModelCode;
    }

    /**
     * Sets the value of the financingModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancingModelCode(String value) {
        this.financingModelCode = value;
    }

    /**
     * Gets the value of the financingHCDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financingHCDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancingHCDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingHCDetails }
     * 
     * 
     */
    public List<FinancingHCDetails> getFinancingHCDetails() {
        if (financingHCDetails == null) {
            financingHCDetails = new ArrayList<FinancingHCDetails>();
        }
        return this.financingHCDetails;
    }

}
