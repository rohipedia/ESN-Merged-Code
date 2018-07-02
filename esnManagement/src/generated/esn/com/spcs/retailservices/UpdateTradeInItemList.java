
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTradeInItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTradeInItemList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateTradeInItemInfo" type="{java:com.spcs.retailservices.domain}UpdateTradeInItemInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTradeInItemList", propOrder = {
    "updateTradeInItemInfo"
})
public class UpdateTradeInItemList {

    @XmlElement(required = true)
    protected List<UpdateTradeInItemInfo> updateTradeInItemInfo;

    /**
     * Gets the value of the updateTradeInItemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateTradeInItemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateTradeInItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateTradeInItemInfo }
     * 
     * 
     */
    public List<UpdateTradeInItemInfo> getUpdateTradeInItemInfo() {
        if (updateTradeInItemInfo == null) {
            updateTradeInItemInfo = new ArrayList<UpdateTradeInItemInfo>();
        }
        return this.updateTradeInItemInfo;
    }

}
