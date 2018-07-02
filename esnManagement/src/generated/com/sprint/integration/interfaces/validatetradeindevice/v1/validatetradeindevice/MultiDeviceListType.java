
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiDeviceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiDeviceListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeInDeviceInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}MultiDeviceInfoType" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDeviceListType", propOrder = {
    "tradeInDeviceInfo"
})
public class MultiDeviceListType {

    @XmlElement(required = true)
    protected List<MultiDeviceInfoType> tradeInDeviceInfo;

    /**
     * Gets the value of the tradeInDeviceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeInDeviceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeInDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiDeviceInfoType }
     * 
     * 
     */
    public List<MultiDeviceInfoType> getTradeInDeviceInfo() {
        if (tradeInDeviceInfo == null) {
            tradeInDeviceInfo = new ArrayList<MultiDeviceInfoType>();
        }
        return this.tradeInDeviceInfo;
    }

}
