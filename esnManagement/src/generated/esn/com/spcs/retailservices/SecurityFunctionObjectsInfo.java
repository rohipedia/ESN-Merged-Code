
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityFunctionObjectsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityFunctionObjectsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FunctionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FunctionIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ObjectList" type="{java:com.spcs.retailservices.domain}ObjectList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityFunctionObjectsInfo", propOrder = {
    "functionDescription",
    "functionIdentifier",
    "objectList"
})
public class SecurityFunctionObjectsInfo {

    @XmlElement(name = "FunctionDescription", required = true)
    protected String functionDescription;
    @XmlElement(name = "FunctionIdentifier")
    protected int functionIdentifier;
    @XmlElement(name = "ObjectList")
    protected ObjectList objectList;

    /**
     * Gets the value of the functionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionDescription() {
        return functionDescription;
    }

    /**
     * Sets the value of the functionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionDescription(String value) {
        this.functionDescription = value;
    }

    /**
     * Gets the value of the functionIdentifier property.
     * 
     */
    public int getFunctionIdentifier() {
        return functionIdentifier;
    }

    /**
     * Sets the value of the functionIdentifier property.
     * 
     */
    public void setFunctionIdentifier(int value) {
        this.functionIdentifier = value;
    }

    /**
     * Gets the value of the objectList property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectList }
     *     
     */
    public ObjectList getObjectList() {
        return objectList;
    }

    /**
     * Sets the value of the objectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectList }
     *     
     */
    public void setObjectList(ObjectList value) {
        this.objectList = value;
    }

}
