
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasAckMdnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasAckMdnInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deviceCoverageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etfAssentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tcAssentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sigPadImageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sigPadImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oneTimeChargesList" type="{java:com.spcs.retailservices.domain}OneTimeChargesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasAckMdnInfo", propOrder = {
    "mdn",
    "deviceCoverageCode",
    "contractInd",
    "contractName",
    "etfAssentCode",
    "tcAssentInd",
    "sigPadImageType",
    "sigPadImage",
    "oneTimeChargesList"
})
public class BasAckMdnInfo {

    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected String deviceCoverageCode;
    protected boolean contractInd;
    protected String contractName;
    protected String etfAssentCode;
    protected Boolean tcAssentInd;
    protected String sigPadImageType;
    protected String sigPadImage;
    protected OneTimeChargesList oneTimeChargesList;

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the deviceCoverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCoverageCode() {
        return deviceCoverageCode;
    }

    /**
     * Sets the value of the deviceCoverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCoverageCode(String value) {
        this.deviceCoverageCode = value;
    }

    /**
     * Gets the value of the contractInd property.
     * 
     */
    public boolean isContractInd() {
        return contractInd;
    }

    /**
     * Sets the value of the contractInd property.
     * 
     */
    public void setContractInd(boolean value) {
        this.contractInd = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the etfAssentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtfAssentCode() {
        return etfAssentCode;
    }

    /**
     * Sets the value of the etfAssentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtfAssentCode(String value) {
        this.etfAssentCode = value;
    }

    /**
     * Gets the value of the tcAssentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTcAssentInd() {
        return tcAssentInd;
    }

    /**
     * Sets the value of the tcAssentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTcAssentInd(Boolean value) {
        this.tcAssentInd = value;
    }

    /**
     * Gets the value of the sigPadImageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigPadImageType() {
        return sigPadImageType;
    }

    /**
     * Sets the value of the sigPadImageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigPadImageType(String value) {
        this.sigPadImageType = value;
    }

    /**
     * Gets the value of the sigPadImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigPadImage() {
        return sigPadImage;
    }

    /**
     * Sets the value of the sigPadImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigPadImage(String value) {
        this.sigPadImage = value;
    }

    /**
     * Gets the value of the oneTimeChargesList property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargesList }
     *     
     */
    public OneTimeChargesList getOneTimeChargesList() {
        return oneTimeChargesList;
    }

    /**
     * Sets the value of the oneTimeChargesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargesList }
     *     
     */
    public void setOneTimeChargesList(OneTimeChargesList value) {
        this.oneTimeChargesList = value;
    }

}
