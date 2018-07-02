
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOrderInRmsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderInRmsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimetradeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssistedLoginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerInfo" type="{java:com.spcs.retailservices.domain}CustomerBasicInfo"/&gt;
 *         &lt;element name="ShoppingCartOrderLinesList" type="{java:com.spcs.retailservices.domain}ShoppingCartOrderLinesList" minOccurs="0"/&gt;
 *         &lt;element name="FinancingOfferInfo" type="{java:com.spcs.retailservices.domain}FinancingOfferInfo" minOccurs="0"/&gt;
 *         &lt;element name="PortinQuestionAnswerList" type="{java:com.spcs.retailservices.domain}PortinQuestionAnswerList" minOccurs="0"/&gt;
 *         &lt;element name="BuybackItemsList" type="{java:com.spcs.retailservices.domain}BuybackItemsList" minOccurs="0"/&gt;
 *         &lt;element name="BuybackFundsList" type="{java:com.spcs.retailservices.domain}BuybackFundsList" minOccurs="0"/&gt;
 *         &lt;element name="BuybackFundsPayment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TradeInItemsList" type="{java:com.spcs.retailservices.domain}TradeInItemsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderInRmsRequest", propOrder = {
    "timetradeIdentifier",
    "assistedLoginIdentifier",
    "storeName",
    "customerInfo",
    "shoppingCartOrderLinesList",
    "financingOfferInfo",
    "portinQuestionAnswerList",
    "buybackItemsList",
    "buybackFundsList",
    "buybackFundsPayment",
    "tradeInItemsList"
})
public class CreateOrderInRmsRequest
    extends Request
{

    @XmlElement(name = "TimetradeIdentifier")
    protected String timetradeIdentifier;
    @XmlElement(name = "AssistedLoginIdentifier")
    protected String assistedLoginIdentifier;
    @XmlElement(name = "StoreName", required = true)
    protected String storeName;
    @XmlElement(name = "CustomerInfo", required = true)
    protected CustomerBasicInfo customerInfo;
    @XmlElement(name = "ShoppingCartOrderLinesList")
    protected ShoppingCartOrderLinesList shoppingCartOrderLinesList;
    @XmlElement(name = "FinancingOfferInfo")
    protected FinancingOfferInfo financingOfferInfo;
    @XmlElement(name = "PortinQuestionAnswerList")
    protected PortinQuestionAnswerList portinQuestionAnswerList;
    @XmlElement(name = "BuybackItemsList")
    protected BuybackItemsList buybackItemsList;
    @XmlElement(name = "BuybackFundsList")
    protected BuybackFundsList buybackFundsList;
    @XmlElement(name = "BuybackFundsPayment")
    protected Double buybackFundsPayment;
    @XmlElement(name = "TradeInItemsList")
    protected TradeInItemsList tradeInItemsList;

    /**
     * Gets the value of the timetradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetradeIdentifier() {
        return timetradeIdentifier;
    }

    /**
     * Sets the value of the timetradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetradeIdentifier(String value) {
        this.timetradeIdentifier = value;
    }

    /**
     * Gets the value of the assistedLoginIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistedLoginIdentifier() {
        return assistedLoginIdentifier;
    }

    /**
     * Sets the value of the assistedLoginIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistedLoginIdentifier(String value) {
        this.assistedLoginIdentifier = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBasicInfo }
     *     
     */
    public CustomerBasicInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBasicInfo }
     *     
     */
    public void setCustomerInfo(CustomerBasicInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the shoppingCartOrderLinesList property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartOrderLinesList }
     *     
     */
    public ShoppingCartOrderLinesList getShoppingCartOrderLinesList() {
        return shoppingCartOrderLinesList;
    }

    /**
     * Sets the value of the shoppingCartOrderLinesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartOrderLinesList }
     *     
     */
    public void setShoppingCartOrderLinesList(ShoppingCartOrderLinesList value) {
        this.shoppingCartOrderLinesList = value;
    }

    /**
     * Gets the value of the financingOfferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingOfferInfo }
     *     
     */
    public FinancingOfferInfo getFinancingOfferInfo() {
        return financingOfferInfo;
    }

    /**
     * Sets the value of the financingOfferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingOfferInfo }
     *     
     */
    public void setFinancingOfferInfo(FinancingOfferInfo value) {
        this.financingOfferInfo = value;
    }

    /**
     * Gets the value of the portinQuestionAnswerList property.
     * 
     * @return
     *     possible object is
     *     {@link PortinQuestionAnswerList }
     *     
     */
    public PortinQuestionAnswerList getPortinQuestionAnswerList() {
        return portinQuestionAnswerList;
    }

    /**
     * Sets the value of the portinQuestionAnswerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortinQuestionAnswerList }
     *     
     */
    public void setPortinQuestionAnswerList(PortinQuestionAnswerList value) {
        this.portinQuestionAnswerList = value;
    }

    /**
     * Gets the value of the buybackItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link BuybackItemsList }
     *     
     */
    public BuybackItemsList getBuybackItemsList() {
        return buybackItemsList;
    }

    /**
     * Sets the value of the buybackItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuybackItemsList }
     *     
     */
    public void setBuybackItemsList(BuybackItemsList value) {
        this.buybackItemsList = value;
    }

    /**
     * Gets the value of the buybackFundsList property.
     * 
     * @return
     *     possible object is
     *     {@link BuybackFundsList }
     *     
     */
    public BuybackFundsList getBuybackFundsList() {
        return buybackFundsList;
    }

    /**
     * Sets the value of the buybackFundsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuybackFundsList }
     *     
     */
    public void setBuybackFundsList(BuybackFundsList value) {
        this.buybackFundsList = value;
    }

    /**
     * Gets the value of the buybackFundsPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuybackFundsPayment() {
        return buybackFundsPayment;
    }

    /**
     * Sets the value of the buybackFundsPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuybackFundsPayment(Double value) {
        this.buybackFundsPayment = value;
    }

    /**
     * Gets the value of the tradeInItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link TradeInItemsList }
     *     
     */
    public TradeInItemsList getTradeInItemsList() {
        return tradeInItemsList;
    }

    /**
     * Sets the value of the tradeInItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeInItemsList }
     *     
     */
    public void setTradeInItemsList(TradeInItemsList value) {
        this.tradeInItemsList = value;
    }

}
