
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BopuisTenderStatusInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BopuisTenderStatusInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bopuisTenderStatusInfo" type="{java:com.spcs.retailservices.domain}BopuisTenderStatusInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BopuisTenderStatusInfoList", propOrder = {
    "bopuisTenderStatusInfo"
})
public class BopuisTenderStatusInfoList {

    @XmlElement(required = true)
    protected List<BopuisTenderStatusInfo> bopuisTenderStatusInfo;

    /**
     * Gets the value of the bopuisTenderStatusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bopuisTenderStatusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBopuisTenderStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BopuisTenderStatusInfo }
     * 
     * 
     */
    public List<BopuisTenderStatusInfo> getBopuisTenderStatusInfo() {
        if (bopuisTenderStatusInfo == null) {
            bopuisTenderStatusInfo = new ArrayList<BopuisTenderStatusInfo>();
        }
        return this.bopuisTenderStatusInfo;
    }

}
