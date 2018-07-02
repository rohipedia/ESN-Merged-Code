
package com.sprint.integration.interfaces.querydevicecataloginfo.v1.querydevicecataloginfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalPropertyInfo" type="{http://integration.sprint.com/interfaces/queryDeviceCatalogInfo/v1/queryDeviceCatalogInfo.xsd}PropertyInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyListType", propOrder = {
    "additionalPropertyInfo"
})
public class PropertyListType {

    @XmlElement(required = true)
    protected List<PropertyInfoType> additionalPropertyInfo;

    /**
     * Gets the value of the additionalPropertyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPropertyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPropertyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyInfoType }
     * 
     * 
     */
    public List<PropertyInfoType> getAdditionalPropertyInfo() {
        if (additionalPropertyInfo == null) {
            additionalPropertyInfo = new ArrayList<PropertyInfoType>();
        }
        return this.additionalPropertyInfo;
    }

}
