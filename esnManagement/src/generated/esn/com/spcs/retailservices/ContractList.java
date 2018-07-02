
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractPtnSerialNoInfo" type="{java:com.spcs.retailservices.domain}ContractPtnSerialNoInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractList", propOrder = {
    "contractPtnSerialNoInfo"
})
public class ContractList {

    @XmlElement(name = "ContractPtnSerialNoInfo", required = true, nillable = true)
    protected List<ContractPtnSerialNoInfo> contractPtnSerialNoInfo;

    /**
     * Gets the value of the contractPtnSerialNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractPtnSerialNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractPtnSerialNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractPtnSerialNoInfo }
     * 
     * 
     */
    public List<ContractPtnSerialNoInfo> getContractPtnSerialNoInfo() {
        if (contractPtnSerialNoInfo == null) {
            contractPtnSerialNoInfo = new ArrayList<ContractPtnSerialNoInfo>();
        }
        return this.contractPtnSerialNoInfo;
    }

}
