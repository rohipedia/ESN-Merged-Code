
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateProductSerialInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateProductSerialInformationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultSet" type="{java:com.spcs.retailservices.domain}ValidateProductSerialInformationResultSet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateProductSerialInformationResponse", propOrder = {
    "resultSet"
})
public class ValidateProductSerialInformationResponse
    extends Response
{

    @XmlElement(name = "ResultSet", required = true, nillable = true)
    protected ValidateProductSerialInformationResultSet resultSet;

    /**
     * Gets the value of the resultSet property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateProductSerialInformationResultSet }
     *     
     */
    public ValidateProductSerialInformationResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Sets the value of the resultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateProductSerialInformationResultSet }
     *     
     */
    public void setResultSet(ValidateProductSerialInformationResultSet value) {
        this.resultSet = value;
    }

}
