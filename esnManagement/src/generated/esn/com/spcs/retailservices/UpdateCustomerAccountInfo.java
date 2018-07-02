
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCustomerAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerAccountInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billCycleEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstBillEstimate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalMrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="newCustomerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomerAccountInfo", propOrder = {
    "billCycleStartDate",
    "billCycleEndDate",
    "billDueDate",
    "firstBillEstimate",
    "totalMrc",
    "newCustomerIndicator"
})
public class UpdateCustomerAccountInfo {

    protected String billCycleStartDate;
    protected String billCycleEndDate;
    protected String billDueDate;
    protected Integer firstBillEstimate;
    protected Integer totalMrc;
    protected String newCustomerIndicator;

    /**
     * Gets the value of the billCycleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleStartDate() {
        return billCycleStartDate;
    }

    /**
     * Sets the value of the billCycleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleStartDate(String value) {
        this.billCycleStartDate = value;
    }

    /**
     * Gets the value of the billCycleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleEndDate() {
        return billCycleEndDate;
    }

    /**
     * Sets the value of the billCycleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleEndDate(String value) {
        this.billCycleEndDate = value;
    }

    /**
     * Gets the value of the billDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDueDate() {
        return billDueDate;
    }

    /**
     * Sets the value of the billDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDueDate(String value) {
        this.billDueDate = value;
    }

    /**
     * Gets the value of the firstBillEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstBillEstimate() {
        return firstBillEstimate;
    }

    /**
     * Sets the value of the firstBillEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstBillEstimate(Integer value) {
        this.firstBillEstimate = value;
    }

    /**
     * Gets the value of the totalMrc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMrc() {
        return totalMrc;
    }

    /**
     * Sets the value of the totalMrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMrc(Integer value) {
        this.totalMrc = value;
    }

    /**
     * Gets the value of the newCustomerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerIndicator() {
        return newCustomerIndicator;
    }

    /**
     * Sets the value of the newCustomerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerIndicator(String value) {
        this.newCustomerIndicator = value;
    }

}
