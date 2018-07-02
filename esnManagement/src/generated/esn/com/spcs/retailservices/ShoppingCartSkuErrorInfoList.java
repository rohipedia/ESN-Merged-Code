
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingCartSkuErrorInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCartSkuErrorInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShoppingCartSkuErrorInfo" type="{java:com.spcs.retailservices.domain}ShoppingCartSkuErrorInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCartSkuErrorInfoList", propOrder = {
    "shoppingCartSkuErrorInfo"
})
public class ShoppingCartSkuErrorInfoList {

    @XmlElement(name = "ShoppingCartSkuErrorInfo", required = true)
    protected List<ShoppingCartSkuErrorInfo> shoppingCartSkuErrorInfo;

    /**
     * Gets the value of the shoppingCartSkuErrorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingCartSkuErrorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingCartSkuErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShoppingCartSkuErrorInfo }
     * 
     * 
     */
    public List<ShoppingCartSkuErrorInfo> getShoppingCartSkuErrorInfo() {
        if (shoppingCartSkuErrorInfo == null) {
            shoppingCartSkuErrorInfo = new ArrayList<ShoppingCartSkuErrorInfo>();
        }
        return this.shoppingCartSkuErrorInfo;
    }

}
