
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streetName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apartmentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zipPlusFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaryPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryPhoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryPhoneBestTimeToCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneBestTimeToCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dialedNumberIdentificationServiceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shippingVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingFeeWaived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingFeeWaivedReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shippingFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shippingSubTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estimatedTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shippingTotalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tsrFraudDetected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useBillingAddressForShipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servicePurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfo", propOrder = {
    "salutation",
    "firstName",
    "lastName",
    "addressType",
    "streetName",
    "streetName2",
    "streetNumber",
    "apartmentType",
    "apartmentNumber",
    "city",
    "stateCode",
    "zipCode",
    "zipPlusFour",
    "phoneNumber",
    "primaryPhoneNumber",
    "primaryPhoneExtensionNumber",
    "primaryPhoneBestTimeToCall",
    "mobilePhoneNumber",
    "mobilePhoneExtensionNumber",
    "mobilePhoneBestTimeToCall",
    "emailAddress",
    "customerFax",
    "dialedNumberIdentificationServiceNumber",
    "shippingVendor",
    "shippingMethod",
    "shippingFeeWaived",
    "shippingFeeWaivedReason",
    "shippingFeeAmount",
    "shippingSubTotal",
    "estimatedTaxAmount",
    "shippingTotalAmount",
    "tsrFraudDetected",
    "useBillingAddressForShipping",
    "purchaseOrderNumber",
    "servicePurchaseOrderNumber",
    "cityName",
    "stateName"
})
public class AddressInfo {

    protected String salutation;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String addressType;
    @XmlElement(required = true)
    protected String streetName;
    protected String streetName2;
    protected String streetNumber;
    protected Integer apartmentType;
    protected String apartmentNumber;
    protected Integer city;
    protected Integer stateCode;
    @XmlElement(required = true)
    protected String zipCode;
    protected String zipPlusFour;
    @XmlElement(required = true)
    protected String phoneNumber;
    protected String primaryPhoneNumber;
    protected String primaryPhoneExtensionNumber;
    protected String primaryPhoneBestTimeToCall;
    protected String mobilePhoneNumber;
    protected String mobilePhoneExtensionNumber;
    protected String mobilePhoneBestTimeToCall;
    protected String emailAddress;
    protected String customerFax;
    protected Integer dialedNumberIdentificationServiceNumber;
    protected String shippingVendor;
    protected String shippingMethod;
    protected String shippingFeeWaived;
    protected Integer shippingFeeWaivedReason;
    protected Double shippingFeeAmount;
    protected Double shippingSubTotal;
    protected Double estimatedTaxAmount;
    protected Double shippingTotalAmount;
    protected String tsrFraudDetected;
    protected String useBillingAddressForShipping;
    protected String purchaseOrderNumber;
    protected String servicePurchaseOrderNumber;
    protected String cityName;
    protected String stateName;

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName2() {
        return streetName2;
    }

    /**
     * Sets the value of the streetName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName2(String value) {
        this.streetName2 = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the apartmentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApartmentType() {
        return apartmentType;
    }

    /**
     * Sets the value of the apartmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApartmentType(Integer value) {
        this.apartmentType = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCity(Integer value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateCode(Integer value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipPlusFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipPlusFour() {
        return zipPlusFour;
    }

    /**
     * Sets the value of the zipPlusFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipPlusFour(String value) {
        this.zipPlusFour = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the primaryPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * Sets the value of the primaryPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhoneNumber(String value) {
        this.primaryPhoneNumber = value;
    }

    /**
     * Gets the value of the primaryPhoneExtensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhoneExtensionNumber() {
        return primaryPhoneExtensionNumber;
    }

    /**
     * Sets the value of the primaryPhoneExtensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhoneExtensionNumber(String value) {
        this.primaryPhoneExtensionNumber = value;
    }

    /**
     * Gets the value of the primaryPhoneBestTimeToCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhoneBestTimeToCall() {
        return primaryPhoneBestTimeToCall;
    }

    /**
     * Sets the value of the primaryPhoneBestTimeToCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhoneBestTimeToCall(String value) {
        this.primaryPhoneBestTimeToCall = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the mobilePhoneExtensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneExtensionNumber() {
        return mobilePhoneExtensionNumber;
    }

    /**
     * Sets the value of the mobilePhoneExtensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneExtensionNumber(String value) {
        this.mobilePhoneExtensionNumber = value;
    }

    /**
     * Gets the value of the mobilePhoneBestTimeToCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneBestTimeToCall() {
        return mobilePhoneBestTimeToCall;
    }

    /**
     * Sets the value of the mobilePhoneBestTimeToCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneBestTimeToCall(String value) {
        this.mobilePhoneBestTimeToCall = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the customerFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFax() {
        return customerFax;
    }

    /**
     * Sets the value of the customerFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFax(String value) {
        this.customerFax = value;
    }

    /**
     * Gets the value of the dialedNumberIdentificationServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDialedNumberIdentificationServiceNumber() {
        return dialedNumberIdentificationServiceNumber;
    }

    /**
     * Sets the value of the dialedNumberIdentificationServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDialedNumberIdentificationServiceNumber(Integer value) {
        this.dialedNumberIdentificationServiceNumber = value;
    }

    /**
     * Gets the value of the shippingVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingVendor() {
        return shippingVendor;
    }

    /**
     * Sets the value of the shippingVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingVendor(String value) {
        this.shippingVendor = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the shippingFeeWaived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFeeWaived() {
        return shippingFeeWaived;
    }

    /**
     * Sets the value of the shippingFeeWaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFeeWaived(String value) {
        this.shippingFeeWaived = value;
    }

    /**
     * Gets the value of the shippingFeeWaivedReason property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingFeeWaivedReason() {
        return shippingFeeWaivedReason;
    }

    /**
     * Sets the value of the shippingFeeWaivedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingFeeWaivedReason(Integer value) {
        this.shippingFeeWaivedReason = value;
    }

    /**
     * Gets the value of the shippingFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingFeeAmount() {
        return shippingFeeAmount;
    }

    /**
     * Sets the value of the shippingFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingFeeAmount(Double value) {
        this.shippingFeeAmount = value;
    }

    /**
     * Gets the value of the shippingSubTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingSubTotal() {
        return shippingSubTotal;
    }

    /**
     * Sets the value of the shippingSubTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingSubTotal(Double value) {
        this.shippingSubTotal = value;
    }

    /**
     * Gets the value of the estimatedTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedTaxAmount() {
        return estimatedTaxAmount;
    }

    /**
     * Sets the value of the estimatedTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedTaxAmount(Double value) {
        this.estimatedTaxAmount = value;
    }

    /**
     * Gets the value of the shippingTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingTotalAmount() {
        return shippingTotalAmount;
    }

    /**
     * Sets the value of the shippingTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingTotalAmount(Double value) {
        this.shippingTotalAmount = value;
    }

    /**
     * Gets the value of the tsrFraudDetected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsrFraudDetected() {
        return tsrFraudDetected;
    }

    /**
     * Sets the value of the tsrFraudDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsrFraudDetected(String value) {
        this.tsrFraudDetected = value;
    }

    /**
     * Gets the value of the useBillingAddressForShipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseBillingAddressForShipping() {
        return useBillingAddressForShipping;
    }

    /**
     * Sets the value of the useBillingAddressForShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseBillingAddressForShipping(String value) {
        this.useBillingAddressForShipping = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the servicePurchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePurchaseOrderNumber() {
        return servicePurchaseOrderNumber;
    }

    /**
     * Sets the value of the servicePurchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePurchaseOrderNumber(String value) {
        this.servicePurchaseOrderNumber = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

}
