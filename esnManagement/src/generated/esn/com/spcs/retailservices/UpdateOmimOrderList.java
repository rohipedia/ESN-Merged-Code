
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateOmimOrderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOmimOrderList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateOmimOrderInfo" type="{java:com.spcs.retailservices.domain}UpdateOmimOrderInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOmimOrderList", propOrder = {
    "updateOmimOrderInfo"
})
public class UpdateOmimOrderList {

    @XmlElement(required = true)
    protected List<UpdateOmimOrderInfo> updateOmimOrderInfo;

    /**
     * Gets the value of the updateOmimOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateOmimOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateOmimOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateOmimOrderInfo }
     * 
     * 
     */
    public List<UpdateOmimOrderInfo> getUpdateOmimOrderInfo() {
        if (updateOmimOrderInfo == null) {
            updateOmimOrderInfo = new ArrayList<UpdateOmimOrderInfo>();
        }
        return this.updateOmimOrderInfo;
    }

}
