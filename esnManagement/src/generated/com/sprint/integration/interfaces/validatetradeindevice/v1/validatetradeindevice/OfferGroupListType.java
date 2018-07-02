
package com.sprint.integration.interfaces.validatetradeindevice.v1.validatetradeindevice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferGroupListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGroupListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offerGroupInfo" type="{http://integration.sprint.com/interfaces/validateTradeInDevice/v1/validateTradeInDevice.xsd}OfferGroupInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGroupListType", propOrder = {
    "offerGroupInfo"
})
public class OfferGroupListType {

    @XmlElement(required = true)
    protected List<OfferGroupInfoType> offerGroupInfo;

    /**
     * Gets the value of the offerGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferGroupInfoType }
     * 
     * 
     */
    public List<OfferGroupInfoType> getOfferGroupInfo() {
        if (offerGroupInfo == null) {
            offerGroupInfo = new ArrayList<OfferGroupInfoType>();
        }
        return this.offerGroupInfo;
    }

}
