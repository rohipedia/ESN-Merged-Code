
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingOfferInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingOfferInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hcApplId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="financingOfferId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="financingOfferRank" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="financingOfferItemInfoList" type="{java:com.spcs.retailservices.domain}FinancingOfferItemInfoList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingOfferInfo", propOrder = {
    "hcApplId",
    "financingOfferId",
    "financingOfferRank",
    "financingOfferItemInfoList"
})
public class FinancingOfferInfo {

    @XmlElement(required = true)
    protected String hcApplId;
    @XmlElement(required = true)
    protected String financingOfferId;
    protected int financingOfferRank;
    protected FinancingOfferItemInfoList financingOfferItemInfoList;

    /**
     * Gets the value of the hcApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcApplId() {
        return hcApplId;
    }

    /**
     * Sets the value of the hcApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcApplId(String value) {
        this.hcApplId = value;
    }

    /**
     * Gets the value of the financingOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancingOfferId() {
        return financingOfferId;
    }

    /**
     * Sets the value of the financingOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancingOfferId(String value) {
        this.financingOfferId = value;
    }

    /**
     * Gets the value of the financingOfferRank property.
     * 
     */
    public int getFinancingOfferRank() {
        return financingOfferRank;
    }

    /**
     * Sets the value of the financingOfferRank property.
     * 
     */
    public void setFinancingOfferRank(int value) {
        this.financingOfferRank = value;
    }

    /**
     * Gets the value of the financingOfferItemInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingOfferItemInfoList }
     *     
     */
    public FinancingOfferItemInfoList getFinancingOfferItemInfoList() {
        return financingOfferItemInfoList;
    }

    /**
     * Sets the value of the financingOfferItemInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingOfferItemInfoList }
     *     
     */
    public void setFinancingOfferItemInfoList(FinancingOfferItemInfoList value) {
        this.financingOfferItemInfoList = value;
    }

}
