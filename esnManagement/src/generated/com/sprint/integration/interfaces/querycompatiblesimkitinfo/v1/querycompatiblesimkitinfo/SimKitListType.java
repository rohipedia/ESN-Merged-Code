
package com.sprint.integration.interfaces.querycompatiblesimkitinfo.v1.querycompatiblesimkitinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimKitListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimKitListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simKitInfo" type="{http://integration.sprint.com/interfaces/queryCompatibleSimKitInfo/v1/queryCompatibleSimKitInfo.xsd}SimKitInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimKitListType", propOrder = {
    "simKitInfo"
})
public class SimKitListType {

    @XmlElement(required = true)
    protected List<SimKitInfoType> simKitInfo;

    /**
     * Gets the value of the simKitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simKitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimKitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimKitInfoType }
     * 
     * 
     */
    public List<SimKitInfoType> getSimKitInfo() {
        if (simKitInfo == null) {
            simKitInfo = new ArrayList<SimKitInfoType>();
        }
        return this.simKitInfo;
    }

}
