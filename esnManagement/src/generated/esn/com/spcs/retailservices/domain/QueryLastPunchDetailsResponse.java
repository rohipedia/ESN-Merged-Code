
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import esn.com.spcs.retailservices.Response;


/**
 * <p>Java class for QueryLastPunchDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryLastPunchDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="PunchData" type="{java:com.spcs.retailservices.domain.punchinout}PunchData" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLastPunchDetailsResponse", propOrder = {
    "returnValue",
    "punchData"
})
public class QueryLastPunchDetailsResponse
    extends Response
{

    @XmlElement(name = "ReturnValue")
    protected int returnValue;
    @XmlElement(name = "PunchData", required = true, nillable = true)
    protected PunchData punchData;

    /**
     * Gets the value of the returnValue property.
     * 
     */
    public int getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(int value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the punchData property.
     * 
     * @return
     *     possible object is
     *     {@link PunchData }
     *     
     */
    public PunchData getPunchData() {
        return punchData;
    }

    /**
     * Sets the value of the punchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchData }
     *     
     */
    public void setPunchData(PunchData value) {
        this.punchData = value;
    }

}
