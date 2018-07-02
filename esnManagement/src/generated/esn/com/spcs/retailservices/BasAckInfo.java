
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasAckInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasAckInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newAslInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="aslAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deviceCoverageImpactInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deviceAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="basAckMdnList" type="{java:com.spcs.retailservices.domain}BasAckMdnList" minOccurs="0"/&gt;
 *         &lt;element name="newAiraveAtaServiceInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newAiraveAtaServiceAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="airaveDisclosureSigPadImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newFramilyPlanInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newFramilyPlanAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newLeaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newLeaseAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oneTimeChargesInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="oneTimeChargesAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deviceCoverageAssentInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leaseAssentInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherAssentInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newFdpInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newFdpAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="newAutoPayInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newAutoPayAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasAckInfo", propOrder = {
    "newAslInd",
    "aslAssentInd",
    "deviceCoverageImpactInd",
    "deviceAssentInd",
    "basAckMdnList",
    "newAiraveAtaServiceInd",
    "newAiraveAtaServiceAssentInd",
    "airaveDisclosureSigPadImage",
    "newFramilyPlanInd",
    "newFramilyPlanAssentInd",
    "newLeaseInd",
    "newLeaseAssentInd",
    "oneTimeChargesInd",
    "oneTimeChargesAssentInd",
    "deviceCoverageAssentInitials",
    "leaseAssentInitials",
    "otherAssentInitials",
    "newFdpInd",
    "newFdpAssentInd",
    "newAutoPayInd",
    "newAutoPayAssentInd"
})
public class BasAckInfo {

    protected boolean newAslInd;
    protected Boolean aslAssentInd;
    protected boolean deviceCoverageImpactInd;
    protected Boolean deviceAssentInd;
    protected BasAckMdnList basAckMdnList;
    protected boolean newAiraveAtaServiceInd;
    protected Boolean newAiraveAtaServiceAssentInd;
    protected String airaveDisclosureSigPadImage;
    protected Boolean newFramilyPlanInd;
    protected Boolean newFramilyPlanAssentInd;
    protected boolean newLeaseInd;
    protected Boolean newLeaseAssentInd;
    protected boolean oneTimeChargesInd;
    protected Boolean oneTimeChargesAssentInd;
    protected String deviceCoverageAssentInitials;
    protected String leaseAssentInitials;
    protected String otherAssentInitials;
    protected boolean newFdpInd;
    protected Boolean newFdpAssentInd;
    protected boolean newAutoPayInd;
    protected Boolean newAutoPayAssentInd;

    /**
     * Gets the value of the newAslInd property.
     * 
     */
    public boolean isNewAslInd() {
        return newAslInd;
    }

    /**
     * Sets the value of the newAslInd property.
     * 
     */
    public void setNewAslInd(boolean value) {
        this.newAslInd = value;
    }

    /**
     * Gets the value of the aslAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAslAssentInd() {
        return aslAssentInd;
    }

    /**
     * Sets the value of the aslAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAslAssentInd(Boolean value) {
        this.aslAssentInd = value;
    }

    /**
     * Gets the value of the deviceCoverageImpactInd property.
     * 
     */
    public boolean isDeviceCoverageImpactInd() {
        return deviceCoverageImpactInd;
    }

    /**
     * Sets the value of the deviceCoverageImpactInd property.
     * 
     */
    public void setDeviceCoverageImpactInd(boolean value) {
        this.deviceCoverageImpactInd = value;
    }

    /**
     * Gets the value of the deviceAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceAssentInd() {
        return deviceAssentInd;
    }

    /**
     * Sets the value of the deviceAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceAssentInd(Boolean value) {
        this.deviceAssentInd = value;
    }

    /**
     * Gets the value of the basAckMdnList property.
     * 
     * @return
     *     possible object is
     *     {@link BasAckMdnList }
     *     
     */
    public BasAckMdnList getBasAckMdnList() {
        return basAckMdnList;
    }

    /**
     * Sets the value of the basAckMdnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasAckMdnList }
     *     
     */
    public void setBasAckMdnList(BasAckMdnList value) {
        this.basAckMdnList = value;
    }

    /**
     * Gets the value of the newAiraveAtaServiceInd property.
     * 
     */
    public boolean isNewAiraveAtaServiceInd() {
        return newAiraveAtaServiceInd;
    }

    /**
     * Sets the value of the newAiraveAtaServiceInd property.
     * 
     */
    public void setNewAiraveAtaServiceInd(boolean value) {
        this.newAiraveAtaServiceInd = value;
    }

    /**
     * Gets the value of the newAiraveAtaServiceAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAiraveAtaServiceAssentInd() {
        return newAiraveAtaServiceAssentInd;
    }

    /**
     * Sets the value of the newAiraveAtaServiceAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAiraveAtaServiceAssentInd(Boolean value) {
        this.newAiraveAtaServiceAssentInd = value;
    }

    /**
     * Gets the value of the airaveDisclosureSigPadImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAiraveDisclosureSigPadImage() {
        return airaveDisclosureSigPadImage;
    }

    /**
     * Sets the value of the airaveDisclosureSigPadImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAiraveDisclosureSigPadImage(String value) {
        this.airaveDisclosureSigPadImage = value;
    }

    /**
     * Gets the value of the newFramilyPlanInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewFramilyPlanInd() {
        return newFramilyPlanInd;
    }

    /**
     * Sets the value of the newFramilyPlanInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewFramilyPlanInd(Boolean value) {
        this.newFramilyPlanInd = value;
    }

    /**
     * Gets the value of the newFramilyPlanAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewFramilyPlanAssentInd() {
        return newFramilyPlanAssentInd;
    }

    /**
     * Sets the value of the newFramilyPlanAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewFramilyPlanAssentInd(Boolean value) {
        this.newFramilyPlanAssentInd = value;
    }

    /**
     * Gets the value of the newLeaseInd property.
     * 
     */
    public boolean isNewLeaseInd() {
        return newLeaseInd;
    }

    /**
     * Sets the value of the newLeaseInd property.
     * 
     */
    public void setNewLeaseInd(boolean value) {
        this.newLeaseInd = value;
    }

    /**
     * Gets the value of the newLeaseAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewLeaseAssentInd() {
        return newLeaseAssentInd;
    }

    /**
     * Sets the value of the newLeaseAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewLeaseAssentInd(Boolean value) {
        this.newLeaseAssentInd = value;
    }

    /**
     * Gets the value of the oneTimeChargesInd property.
     * 
     */
    public boolean isOneTimeChargesInd() {
        return oneTimeChargesInd;
    }

    /**
     * Sets the value of the oneTimeChargesInd property.
     * 
     */
    public void setOneTimeChargesInd(boolean value) {
        this.oneTimeChargesInd = value;
    }

    /**
     * Gets the value of the oneTimeChargesAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneTimeChargesAssentInd() {
        return oneTimeChargesAssentInd;
    }

    /**
     * Sets the value of the oneTimeChargesAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneTimeChargesAssentInd(Boolean value) {
        this.oneTimeChargesAssentInd = value;
    }

    /**
     * Gets the value of the deviceCoverageAssentInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCoverageAssentInitials() {
        return deviceCoverageAssentInitials;
    }

    /**
     * Sets the value of the deviceCoverageAssentInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCoverageAssentInitials(String value) {
        this.deviceCoverageAssentInitials = value;
    }

    /**
     * Gets the value of the leaseAssentInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseAssentInitials() {
        return leaseAssentInitials;
    }

    /**
     * Sets the value of the leaseAssentInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseAssentInitials(String value) {
        this.leaseAssentInitials = value;
    }

    /**
     * Gets the value of the otherAssentInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAssentInitials() {
        return otherAssentInitials;
    }

    /**
     * Sets the value of the otherAssentInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAssentInitials(String value) {
        this.otherAssentInitials = value;
    }

    /**
     * Gets the value of the newFdpInd property.
     * 
     */
    public boolean isNewFdpInd() {
        return newFdpInd;
    }

    /**
     * Sets the value of the newFdpInd property.
     * 
     */
    public void setNewFdpInd(boolean value) {
        this.newFdpInd = value;
    }

    /**
     * Gets the value of the newFdpAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewFdpAssentInd() {
        return newFdpAssentInd;
    }

    /**
     * Sets the value of the newFdpAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewFdpAssentInd(Boolean value) {
        this.newFdpAssentInd = value;
    }

    /**
     * Gets the value of the newAutoPayInd property.
     * 
     */
    public boolean isNewAutoPayInd() {
        return newAutoPayInd;
    }

    /**
     * Sets the value of the newAutoPayInd property.
     * 
     */
    public void setNewAutoPayInd(boolean value) {
        this.newAutoPayInd = value;
    }

    /**
     * Gets the value of the newAutoPayAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAutoPayAssentInd() {
        return newAutoPayAssentInd;
    }

    /**
     * Sets the value of the newAutoPayAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAutoPayAssentInd(Boolean value) {
        this.newAutoPayAssentInd = value;
    }

}
