
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractTemplateMappingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractTemplateMappingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="contractMappingAddress" type="{java:com.spcs.retailservices.domain}ContractMappingAddress" minOccurs="0"/&gt;
 *           &lt;element name="storeInfo" type="{java:com.spcs.retailservices.domain}StoreInformation" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTemplateMappingInfo", propOrder = {
    "contractMappingAddress",
    "storeInfo"
})
public class ContractTemplateMappingInfo {

    protected ContractMappingAddress contractMappingAddress;
    protected StoreInformation storeInfo;

    /**
     * Gets the value of the contractMappingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContractMappingAddress }
     *     
     */
    public ContractMappingAddress getContractMappingAddress() {
        return contractMappingAddress;
    }

    /**
     * Sets the value of the contractMappingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractMappingAddress }
     *     
     */
    public void setContractMappingAddress(ContractMappingAddress value) {
        this.contractMappingAddress = value;
    }

    /**
     * Gets the value of the storeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreInformation }
     *     
     */
    public StoreInformation getStoreInfo() {
        return storeInfo;
    }

    /**
     * Sets the value of the storeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreInformation }
     *     
     */
    public void setStoreInfo(StoreInformation value) {
        this.storeInfo = value;
    }

}
