
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuybackAnswerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuybackAnswerList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buybackAnswerInfo" type="{java:com.spcs.retailservices.domain}BuybackAnswerInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuybackAnswerList", propOrder = {
    "buybackAnswerInfo"
})
public class BuybackAnswerList {

    protected List<BuybackAnswerInfo> buybackAnswerInfo;

    /**
     * Gets the value of the buybackAnswerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buybackAnswerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuybackAnswerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuybackAnswerInfo }
     * 
     * 
     */
    public List<BuybackAnswerInfo> getBuybackAnswerInfo() {
        if (buybackAnswerInfo == null) {
            buybackAnswerInfo = new ArrayList<BuybackAnswerInfo>();
        }
        return this.buybackAnswerInfo;
    }

}
