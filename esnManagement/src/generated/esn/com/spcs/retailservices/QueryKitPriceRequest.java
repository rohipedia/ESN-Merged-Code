
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryKitPriceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryKitPriceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kitidentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RegionalRetailPriceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryKitPriceRequest", propOrder = {
    "kitidentifier",
    "regionalRetailPriceIdentifier"
})
public class QueryKitPriceRequest
    extends Request
{

    @XmlElement(name = "Kitidentifier")
    protected int kitidentifier;
    @XmlElement(name = "RegionalRetailPriceIdentifier")
    protected int regionalRetailPriceIdentifier;

    /**
     * Gets the value of the kitidentifier property.
     * 
     */
    public int getKitidentifier() {
        return kitidentifier;
    }

    /**
     * Sets the value of the kitidentifier property.
     * 
     */
    public void setKitidentifier(int value) {
        this.kitidentifier = value;
    }

    /**
     * Gets the value of the regionalRetailPriceIdentifier property.
     * 
     */
    public int getRegionalRetailPriceIdentifier() {
        return regionalRetailPriceIdentifier;
    }

    /**
     * Sets the value of the regionalRetailPriceIdentifier property.
     * 
     */
    public void setRegionalRetailPriceIdentifier(int value) {
        this.regionalRetailPriceIdentifier = value;
    }

}
