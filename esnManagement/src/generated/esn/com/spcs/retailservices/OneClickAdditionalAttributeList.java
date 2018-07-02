
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OneClickAdditionalAttributeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneClickAdditionalAttributeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oneClickAdditionalAttributeInfo" type="{java:com.spcs.retailservices.domain}OneClickAdditionalAttributeInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneClickAdditionalAttributeList", propOrder = {
    "oneClickAdditionalAttributeInfo"
})
public class OneClickAdditionalAttributeList {

    @XmlElement(required = true)
    protected List<OneClickAdditionalAttributeInfo> oneClickAdditionalAttributeInfo;

    /**
     * Gets the value of the oneClickAdditionalAttributeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneClickAdditionalAttributeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneClickAdditionalAttributeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OneClickAdditionalAttributeInfo }
     * 
     * 
     */
    public List<OneClickAdditionalAttributeInfo> getOneClickAdditionalAttributeInfo() {
        if (oneClickAdditionalAttributeInfo == null) {
            oneClickAdditionalAttributeInfo = new ArrayList<OneClickAdditionalAttributeInfo>();
        }
        return this.oneClickAdditionalAttributeInfo;
    }

}
