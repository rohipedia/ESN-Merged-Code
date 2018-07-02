
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrevReturnDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrevReturnDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prevReturnDetailInfo" type="{java:com.spcs.retailservices.domain}PrevReturnDetailInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrevReturnDetailList", propOrder = {
    "prevReturnDetailInfo"
})
public class PrevReturnDetailList {

    @XmlElement(required = true)
    protected List<PrevReturnDetailInfo> prevReturnDetailInfo;

    /**
     * Gets the value of the prevReturnDetailInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prevReturnDetailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrevReturnDetailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrevReturnDetailInfo }
     * 
     * 
     */
    public List<PrevReturnDetailInfo> getPrevReturnDetailInfo() {
        if (prevReturnDetailInfo == null) {
            prevReturnDetailInfo = new ArrayList<PrevReturnDetailInfo>();
        }
        return this.prevReturnDetailInfo;
    }

}
