
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryUserListForStoresStoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryUserListForStoresStoreInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyNm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LocBaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StoreChannelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserList" type="{java:com.spcs.retailservices.domain}UserList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryUserListForStoresStoreInfo", propOrder = {
    "companyNm",
    "locBaId",
    "storeChannelCode",
    "userList"
})
public class QueryUserListForStoresStoreInfo {

    @XmlElement(name = "CompanyNm", required = true)
    protected String companyNm;
    @XmlElement(name = "LocBaId")
    protected int locBaId;
    @XmlElement(name = "StoreChannelCode", required = true)
    protected String storeChannelCode;
    @XmlElement(name = "UserList")
    protected UserList userList;

    /**
     * Gets the value of the companyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNm() {
        return companyNm;
    }

    /**
     * Sets the value of the companyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNm(String value) {
        this.companyNm = value;
    }

    /**
     * Gets the value of the locBaId property.
     * 
     */
    public int getLocBaId() {
        return locBaId;
    }

    /**
     * Sets the value of the locBaId property.
     * 
     */
    public void setLocBaId(int value) {
        this.locBaId = value;
    }

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
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link UserList }
     *     
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserList }
     *     
     */
    public void setUserList(UserList value) {
        this.userList = value;
    }

}
