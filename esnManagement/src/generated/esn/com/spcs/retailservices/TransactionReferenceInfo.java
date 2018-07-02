
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReferenceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionReferenceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="financingModelInfo" type="{java:com.spcs.retailservices.domain}FinancingModelInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReferenceInfo", propOrder = {
    "financingModelInfo"
})
public class TransactionReferenceInfo {

    protected FinancingModelInfo financingModelInfo;

    /**
     * Gets the value of the financingModelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingModelInfo }
     *     
     */
    public FinancingModelInfo getFinancingModelInfo() {
        return financingModelInfo;
    }

    /**
     * Sets the value of the financingModelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingModelInfo }
     *     
     */
    public void setFinancingModelInfo(FinancingModelInfo value) {
        this.financingModelInfo = value;
    }

}
