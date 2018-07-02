
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProfileAuthorizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProfileAuthorizationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreChannelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SecurityGroupInfoList" type="{java:com.spcs.retailservices.domain}SecurityGroupInfoList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProfileAuthorizationResponse", propOrder = {
    "storeChannelCode",
    "securityGroupInfoList"
})
public class QueryProfileAuthorizationResponse
    extends Response
{

    @XmlElement(name = "StoreChannelCode", required = true)
    protected String storeChannelCode;
    @XmlElement(name = "SecurityGroupInfoList", required = true)
    protected SecurityGroupInfoList securityGroupInfoList;

    /**
     * Gets the value of the storeChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreChannelCode() {
        return storeChannelCode;
    }

    /**
     * Sets the value of the storeChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreChannelCode(String value) {
        this.storeChannelCode = value;
    }

    /**
     * Gets the value of the securityGroupInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityGroupInfoList }
     *     
     */
    public SecurityGroupInfoList getSecurityGroupInfoList() {
        return securityGroupInfoList;
    }

    /**
     * Sets the value of the securityGroupInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityGroupInfoList }
     *     
     */
    public void setSecurityGroupInfoList(SecurityGroupInfoList value) {
        this.securityGroupInfoList = value;
    }

}
