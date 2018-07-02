
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransactionDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateTransactionData" type="{java:com.spcs.retailservices.domain}UpdateTransactionData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionDataRequest", propOrder = {
    "updateTransactionData"
})
public class UpdateTransactionDataRequest
    extends Request
{

    @XmlElement(required = true)
    protected UpdateTransactionData updateTransactionData;

    /**
     * Gets the value of the updateTransactionData property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTransactionData }
     *     
     */
    public UpdateTransactionData getUpdateTransactionData() {
        return updateTransactionData;
    }

    /**
     * Sets the value of the updateTransactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTransactionData }
     *     
     */
    public void setUpdateTransactionData(UpdateTransactionData value) {
        this.updateTransactionData = value;
    }

}
