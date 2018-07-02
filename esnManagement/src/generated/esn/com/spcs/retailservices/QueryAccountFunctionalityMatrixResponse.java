
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAccountFunctionalityMatrixResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAccountFunctionalityMatrixResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountFunctionalityMatrixList" type="{java:com.spcs.retailservices.domain}AccountFunctionalityMatrixList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAccountFunctionalityMatrixResponse", propOrder = {
    "accountFunctionalityMatrixList"
})
public class QueryAccountFunctionalityMatrixResponse
    extends Response
{

    @XmlElement(required = true)
    protected AccountFunctionalityMatrixList accountFunctionalityMatrixList;

    /**
     * Gets the value of the accountFunctionalityMatrixList property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFunctionalityMatrixList }
     *     
     */
    public AccountFunctionalityMatrixList getAccountFunctionalityMatrixList() {
        return accountFunctionalityMatrixList;
    }

    /**
     * Sets the value of the accountFunctionalityMatrixList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFunctionalityMatrixList }
     *     
     */
    public void setAccountFunctionalityMatrixList(AccountFunctionalityMatrixList value) {
        this.accountFunctionalityMatrixList = value;
    }

}
