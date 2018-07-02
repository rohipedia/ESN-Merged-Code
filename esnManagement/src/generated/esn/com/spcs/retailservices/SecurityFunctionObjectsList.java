
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityFunctionObjectsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityFunctionObjectsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecurityFunctionObjectsInfo" type="{java:com.spcs.retailservices.domain}SecurityFunctionObjectsInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityFunctionObjectsList", propOrder = {
    "securityFunctionObjectsInfo"
})
public class SecurityFunctionObjectsList {

    @XmlElement(name = "SecurityFunctionObjectsInfo", required = true)
    protected List<SecurityFunctionObjectsInfo> securityFunctionObjectsInfo;

    /**
     * Gets the value of the securityFunctionObjectsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityFunctionObjectsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityFunctionObjectsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityFunctionObjectsInfo }
     * 
     * 
     */
    public List<SecurityFunctionObjectsInfo> getSecurityFunctionObjectsInfo() {
        if (securityFunctionObjectsInfo == null) {
            securityFunctionObjectsInfo = new ArrayList<SecurityFunctionObjectsInfo>();
        }
        return this.securityFunctionObjectsInfo;
    }

}
