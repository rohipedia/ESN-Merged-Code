
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransSummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransSummaryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transReferenceInfo" type="{java:com.spcs.retailservices.domain}TransReferenceInfo"/&gt;
 *         &lt;element name="basAckInfo" type="{java:com.spcs.retailservices.domain}BasAckInfo"/&gt;
 *         &lt;element name="channelInfo" type="{java:com.spcs.retailservices.domain}ChannelInfo"/&gt;
 *         &lt;element name="changeInfo" type="{java:com.spcs.retailservices.domain}ChangeInfo"/&gt;
 *         &lt;element name="impactedMdnInfoList" type="{java:com.spcs.retailservices.domain}ImpactedMdnInfoList"/&gt;
 *         &lt;element name="accountLevelInfo" type="{java:com.spcs.retailservices.domain}AccountLevelInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransSummaryInfo", propOrder = {
    "transReferenceInfo",
    "basAckInfo",
    "channelInfo",
    "changeInfo",
    "impactedMdnInfoList",
    "accountLevelInfo"
})
public class TransSummaryInfo {

    @XmlElement(required = true)
    protected TransReferenceInfo transReferenceInfo;
    @XmlElement(required = true)
    protected BasAckInfo basAckInfo;
    @XmlElement(required = true)
    protected ChannelInfo channelInfo;
    @XmlElement(required = true)
    protected ChangeInfo changeInfo;
    @XmlElement(required = true)
    protected ImpactedMdnInfoList impactedMdnInfoList;
    @XmlElement(required = true)
    protected AccountLevelInfo accountLevelInfo;

    /**
     * Gets the value of the transReferenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransReferenceInfo }
     *     
     */
    public TransReferenceInfo getTransReferenceInfo() {
        return transReferenceInfo;
    }

    /**
     * Sets the value of the transReferenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransReferenceInfo }
     *     
     */
    public void setTransReferenceInfo(TransReferenceInfo value) {
        this.transReferenceInfo = value;
    }

    /**
     * Gets the value of the basAckInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasAckInfo }
     *     
     */
    public BasAckInfo getBasAckInfo() {
        return basAckInfo;
    }

    /**
     * Sets the value of the basAckInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasAckInfo }
     *     
     */
    public void setBasAckInfo(BasAckInfo value) {
        this.basAckInfo = value;
    }

    /**
     * Gets the value of the channelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelInfo }
     *     
     */
    public ChannelInfo getChannelInfo() {
        return channelInfo;
    }

    /**
     * Sets the value of the channelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelInfo }
     *     
     */
    public void setChannelInfo(ChannelInfo value) {
        this.channelInfo = value;
    }

    /**
     * Gets the value of the changeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeInfo }
     *     
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    /**
     * Sets the value of the changeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeInfo }
     *     
     */
    public void setChangeInfo(ChangeInfo value) {
        this.changeInfo = value;
    }

    /**
     * Gets the value of the impactedMdnInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ImpactedMdnInfoList }
     *     
     */
    public ImpactedMdnInfoList getImpactedMdnInfoList() {
        return impactedMdnInfoList;
    }

    /**
     * Sets the value of the impactedMdnInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpactedMdnInfoList }
     *     
     */
    public void setImpactedMdnInfoList(ImpactedMdnInfoList value) {
        this.impactedMdnInfoList = value;
    }

    /**
     * Gets the value of the accountLevelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLevelInfo }
     *     
     */
    public AccountLevelInfo getAccountLevelInfo() {
        return accountLevelInfo;
    }

    /**
     * Sets the value of the accountLevelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLevelInfo }
     *     
     */
    public void setAccountLevelInfo(AccountLevelInfo value) {
        this.accountLevelInfo = value;
    }

}
