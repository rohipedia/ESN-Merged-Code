
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallBillInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallBillInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentInstallBillLoanSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallBillInfo", propOrder = {
    "equipmentInstallBillLoanSequenceNumber"
})
public class InstallBillInfo {

    protected Integer equipmentInstallBillLoanSequenceNumber;

    /**
     * Gets the value of the equipmentInstallBillLoanSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEquipmentInstallBillLoanSequenceNumber() {
        return equipmentInstallBillLoanSequenceNumber;
    }

    /**
     * Sets the value of the equipmentInstallBillLoanSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEquipmentInstallBillLoanSequenceNumber(Integer value) {
        this.equipmentInstallBillLoanSequenceNumber = value;
    }

}
