
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseDeviceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseDeviceListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purchaseDeviceInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}PurchaseDeviceInfoType" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseDeviceListType", propOrder = {
    "purchaseDeviceInfo"
})
public class PurchaseDeviceListType {

    @XmlElement(required = true)
    protected List<PurchaseDeviceInfoType> purchaseDeviceInfo;

    /**
     * Gets the value of the purchaseDeviceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseDeviceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseDeviceInfoType }
     * 
     * 
     */
    public List<PurchaseDeviceInfoType> getPurchaseDeviceInfo() {
        if (purchaseDeviceInfo == null) {
            purchaseDeviceInfo = new ArrayList<PurchaseDeviceInfoType>();
        }
        return this.purchaseDeviceInfo;
    }

}
