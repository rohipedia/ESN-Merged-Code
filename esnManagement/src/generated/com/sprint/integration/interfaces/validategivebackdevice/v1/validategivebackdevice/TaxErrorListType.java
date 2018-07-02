
package com.sprint.integration.interfaces.validategivebackdevice.v1.validategivebackdevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxErrorListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxErrorListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxErrorInfo" type="{http://integration.sprint.com/interfaces/validateGiveBackDevice/v1/validateGiveBackDevice.xsd}TaxErrorInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxErrorListType", propOrder = {
    "taxErrorInfo"
})
public class TaxErrorListType {

    @XmlElement(required = true)
    protected List<TaxErrorInfoType> taxErrorInfo;

    /**
     * Gets the value of the taxErrorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxErrorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxErrorInfoType }
     * 
     * 
     */
    public List<TaxErrorInfoType> getTaxErrorInfo() {
        if (taxErrorInfo == null) {
            taxErrorInfo = new ArrayList<TaxErrorInfoType>();
        }
        return this.taxErrorInfo;
    }

}
