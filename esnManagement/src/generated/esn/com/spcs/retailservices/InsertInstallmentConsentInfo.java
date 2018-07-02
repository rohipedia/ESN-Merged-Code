
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertInstallmentConsentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertInstallmentConsentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsertInstallmentConsentDetailsInfo" type="{java:com.spcs.retailservices.domain}InsertInstallmentConsentDetailsInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertInstallmentConsentInfo", propOrder = {
    "insertInstallmentConsentDetailsInfo"
})
public class InsertInstallmentConsentInfo {

    @XmlElement(name = "InsertInstallmentConsentDetailsInfo", required = true)
    protected List<InsertInstallmentConsentDetailsInfo> insertInstallmentConsentDetailsInfo;

    /**
     * Gets the value of the insertInstallmentConsentDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertInstallmentConsentDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertInstallmentConsentDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertInstallmentConsentDetailsInfo }
     * 
     * 
     */
    public List<InsertInstallmentConsentDetailsInfo> getInsertInstallmentConsentDetailsInfo() {
        if (insertInstallmentConsentDetailsInfo == null) {
            insertInstallmentConsentDetailsInfo = new ArrayList<InsertInstallmentConsentDetailsInfo>();
        }
        return this.insertInstallmentConsentDetailsInfo;
    }

}
