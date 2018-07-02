
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientPropertiesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientPropertiesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configurationParameterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="configurationParameterValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientPropertiesInfo", propOrder = {
    "configurationParameterName",
    "configurationParameterValue",
    "codeDescription"
})
public class ClientPropertiesInfo {

    @XmlElement(required = true)
    protected String configurationParameterName;
    @XmlElement(required = true)
    protected String configurationParameterValue;
    @XmlElement(required = true)
    protected String codeDescription;

    /**
     * Gets the value of the configurationParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationParameterName() {
        return configurationParameterName;
    }

    /**
     * Sets the value of the configurationParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationParameterName(String value) {
        this.configurationParameterName = value;
    }

    /**
     * Gets the value of the configurationParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationParameterValue() {
        return configurationParameterValue;
    }

    /**
     * Sets the value of the configurationParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationParameterValue(String value) {
        this.configurationParameterValue = value;
    }

    /**
     * Gets the value of the codeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Sets the value of the codeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
    }

}
