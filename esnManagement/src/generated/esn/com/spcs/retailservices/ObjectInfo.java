
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ObjectOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectEditIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectDeleteIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectNewIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectInfo", propOrder = {
    "objectDescription",
    "objectIdentifier",
    "objectOpenIndicator",
    "objectEditIndicator",
    "objectDeleteIndicator",
    "objectNewIndicator"
})
public class ObjectInfo {

    @XmlElement(name = "ObjectDescription", required = true)
    protected String objectDescription;
    @XmlElement(name = "ObjectIdentifier")
    protected int objectIdentifier;
    @XmlElement(name = "ObjectOpenIndicator", required = true)
    protected String objectOpenIndicator;
    @XmlElement(name = "ObjectEditIndicator", required = true)
    protected String objectEditIndicator;
    @XmlElement(name = "ObjectDeleteIndicator", required = true)
    protected String objectDeleteIndicator;
    @XmlElement(name = "ObjectNewIndicator", required = true)
    protected String objectNewIndicator;

    /**
     * Gets the value of the objectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectDescription() {
        return objectDescription;
    }

    /**
     * Sets the value of the objectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectDescription(String value) {
        this.objectDescription = value;
    }

    /**
     * Gets the value of the objectIdentifier property.
     * 
     */
    public int getObjectIdentifier() {
        return objectIdentifier;
    }

    /**
     * Sets the value of the objectIdentifier property.
     * 
     */
    public void setObjectIdentifier(int value) {
        this.objectIdentifier = value;
    }

    /**
     * Gets the value of the objectOpenIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectOpenIndicator() {
        return objectOpenIndicator;
    }

    /**
     * Sets the value of the objectOpenIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectOpenIndicator(String value) {
        this.objectOpenIndicator = value;
    }

    /**
     * Gets the value of the objectEditIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectEditIndicator() {
        return objectEditIndicator;
    }

    /**
     * Sets the value of the objectEditIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectEditIndicator(String value) {
        this.objectEditIndicator = value;
    }

    /**
     * Gets the value of the objectDeleteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectDeleteIndicator() {
        return objectDeleteIndicator;
    }

    /**
     * Sets the value of the objectDeleteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectDeleteIndicator(String value) {
        this.objectDeleteIndicator = value;
    }

    /**
     * Gets the value of the objectNewIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNewIndicator() {
        return objectNewIndicator;
    }

    /**
     * Sets the value of the objectNewIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNewIndicator(String value) {
        this.objectNewIndicator = value;
    }

}
