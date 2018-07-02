
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCardDetailsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCardDetailsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GiftCardDetailsInfo" type="{java:com.spcs.retailservices.domain}GiftCardDetailsInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCardDetailsList", propOrder = {
    "giftCardDetailsInfo"
})
public class GiftCardDetailsList {

    @XmlElement(name = "GiftCardDetailsInfo", required = true)
    protected List<GiftCardDetailsInfo> giftCardDetailsInfo;

    /**
     * Gets the value of the giftCardDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCardDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCardDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftCardDetailsInfo }
     * 
     * 
     */
    public List<GiftCardDetailsInfo> getGiftCardDetailsInfo() {
        if (giftCardDetailsInfo == null) {
            giftCardDetailsInfo = new ArrayList<GiftCardDetailsInfo>();
        }
        return this.giftCardDetailsInfo;
    }

}
