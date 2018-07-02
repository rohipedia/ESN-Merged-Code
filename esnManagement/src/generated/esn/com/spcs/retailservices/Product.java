
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CompanyHierarchyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "productIdentifier",
    "storeIdentifier",
    "companyHierarchyIdentifier"
})
public class Product {

    @XmlElement(name = "ProductIdentifier")
    protected int productIdentifier;
    @XmlElement(name = "StoreIdentifier")
    protected int storeIdentifier;
    @XmlElement(name = "CompanyHierarchyIdentifier", required = true, nillable = true)
    protected String companyHierarchyIdentifier;

    /**
     * Gets the value of the productIdentifier property.
     * 
     */
    public int getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     */
    public void setProductIdentifier(int value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the storeIdentifier property.
     * 
     */
    public int getStoreIdentifier() {
        return storeIdentifier;
    }

    /**
     * Sets the value of the storeIdentifier property.
     * 
     */
    public void setStoreIdentifier(int value) {
        this.storeIdentifier = value;
    }

    /**
     * Gets the value of the companyHierarchyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyHierarchyIdentifier() {
        return companyHierarchyIdentifier;
    }

    /**
     * Sets the value of the companyHierarchyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyHierarchyIdentifier(String value) {
        this.companyHierarchyIdentifier = value;
    }

}
