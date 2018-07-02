
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E911ConsentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E911ConsentList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E911ConsentInfo" type="{java:com.spcs.retailservices.domain}E911ConsentInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E911ConsentList", propOrder = {
    "e911ConsentInfo"
})
public class E911ConsentList {

    @XmlElement(name = "E911ConsentInfo", required = true)
    protected List<E911ConsentInfo> e911ConsentInfo;

    /**
     * Gets the value of the e911ConsentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e911ConsentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE911ConsentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E911ConsentInfo }
     * 
     * 
     */
    public List<E911ConsentInfo> getE911ConsentInfo() {
        if (e911ConsentInfo == null) {
            e911ConsentInfo = new ArrayList<E911ConsentInfo>();
        }
        return this.e911ConsentInfo;
    }

}
