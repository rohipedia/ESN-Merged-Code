
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OneTimeChargesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneTimeChargesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oneTimeChargesInfo" type="{java:com.spcs.retailservices.domain}OneTimeChargesInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneTimeChargesList", propOrder = {
    "oneTimeChargesInfo"
})
public class OneTimeChargesList {

    @XmlElement(required = true)
    protected List<OneTimeChargesInfo> oneTimeChargesInfo;

    /**
     * Gets the value of the oneTimeChargesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneTimeChargesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneTimeChargesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OneTimeChargesInfo }
     * 
     * 
     */
    public List<OneTimeChargesInfo> getOneTimeChargesInfo() {
        if (oneTimeChargesInfo == null) {
            oneTimeChargesInfo = new ArrayList<OneTimeChargesInfo>();
        }
        return this.oneTimeChargesInfo;
    }

}
