
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OmimReturnReasonCodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmimReturnReasonCodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="omimReturnReasonCodeInfo" type="{java:com.spcs.retailservices.domain}OmimReturnReasonCodeInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmimReturnReasonCodeList", propOrder = {
    "omimReturnReasonCodeInfo"
})
public class OmimReturnReasonCodeList {

    @XmlElement(required = true)
    protected List<OmimReturnReasonCodeInfo> omimReturnReasonCodeInfo;

    /**
     * Gets the value of the omimReturnReasonCodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omimReturnReasonCodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmimReturnReasonCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmimReturnReasonCodeInfo }
     * 
     * 
     */
    public List<OmimReturnReasonCodeInfo> getOmimReturnReasonCodeInfo() {
        if (omimReturnReasonCodeInfo == null) {
            omimReturnReasonCodeInfo = new ArrayList<OmimReturnReasonCodeInfo>();
        }
        return this.omimReturnReasonCodeInfo;
    }

}
