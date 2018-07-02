
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuybackFundsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuybackFundsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuybackFundsInfo" type="{java:com.spcs.retailservices.domain}BuybackFundsInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuybackFundsList", propOrder = {
    "buybackFundsInfo"
})
public class BuybackFundsList {

    @XmlElement(name = "BuybackFundsInfo", required = true)
    protected List<BuybackFundsInfo> buybackFundsInfo;

    /**
     * Gets the value of the buybackFundsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buybackFundsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuybackFundsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuybackFundsInfo }
     * 
     * 
     */
    public List<BuybackFundsInfo> getBuybackFundsInfo() {
        if (buybackFundsInfo == null) {
            buybackFundsInfo = new ArrayList<BuybackFundsInfo>();
        }
        return this.buybackFundsInfo;
    }

}
