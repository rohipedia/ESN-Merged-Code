
package esn.com.spcs.retailservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOrderFromRmsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOrderFromRmsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorInfo" type="{java:com.spcs.retailservices.domain}ErrorInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCartOrderInfo" type="{java:com.spcs.retailservices.domain}ShoppingCartOrderInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FinancingOfferInfo" type="{java:com.spcs.retailservices.domain}FinancingOfferInfo" minOccurs="0"/&gt;
 *         &lt;element name="PortinQuestionAnswerList" type="{java:com.spcs.retailservices.domain}PortinQuestionAnswerList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuybackItemsList" type="{java:com.spcs.retailservices.domain}BuybackItemsList" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "QueryOrderFromRmsResponse", propOrder = {
    "successIndicator",
    "orderStatus",
    "errorInfo",
    "shoppingCartOrderInfo",
    "financingOfferInfo",
    "portinQuestionAnswerList",
    "buybackItemsList",
    "buybackFundsList",
    "buybackFundsPayment",
    "tradeInItemsList"
})
public class QueryOrderFromRmsResponse
    extends Response
{

    @XmlElement(name = "SuccessIndicator")
    protected boolean successIndicator;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;
    @XmlElement(name = "ErrorInfo", nillable = true)
    protected List<ErrorInfo> errorInfo;
    @XmlElement(name = "ShoppingCartOrderInfo", nillable = true)
    protected List<ShoppingCartOrderInfo> shoppingCartOrderInfo;
    @XmlElement(name = "FinancingOfferInfo")
    protected FinancingOfferInfo financingOfferInfo;
    @XmlElement(name = "PortinQuestionAnswerList", nillable = true)
    protected List<PortinQuestionAnswerList> portinQuestionAnswerList;
    @XmlElement(name = "BuybackItemsList", nillable = true)
    protected List<BuybackItemsList> buybackItemsList;
    @XmlElementRef(name = "BuybackFundsList", namespace = "java:com.spcs.retailservices.domain", type = JAXBElement.class, required = false)
    protected JAXBElement<BuybackFundsList> buybackFundsList;
    @XmlElement(name = "BuybackFundsPayment")
    protected Double buybackFundsPayment;
    @XmlElement(name = "TradeInItemsList")
    protected TradeInItemsList tradeInItemsList;

    /**
     * Gets the value of the successIndicator property.
     * 
     */
    public boolean isSuccessIndicator() {
        return successIndicator;
    }

    /**
     * Sets the value of the successIndicator property.
     * 
     */
    public void setSuccessIndicator(boolean value) {
        this.successIndicator = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorInfo }
     * 
     * 
     */
    public List<ErrorInfo> getErrorInfo() {
        if (errorInfo == null) {
            errorInfo = new ArrayList<ErrorInfo>();
        }
        return this.errorInfo;
    }

    /**
     * Gets the value of the shoppingCartOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingCartOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingCartOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShoppingCartOrderInfo }
     * 
     * 
     */
    public List<ShoppingCartOrderInfo> getShoppingCartOrderInfo() {
        if (shoppingCartOrderInfo == null) {
            shoppingCartOrderInfo = new ArrayList<ShoppingCartOrderInfo>();
        }
        return this.shoppingCartOrderInfo;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portinQuestionAnswerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortinQuestionAnswerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortinQuestionAnswerList }
     * 
     * 
     */
    public List<PortinQuestionAnswerList> getPortinQuestionAnswerList() {
        if (portinQuestionAnswerList == null) {
            portinQuestionAnswerList = new ArrayList<PortinQuestionAnswerList>();
        }
        return this.portinQuestionAnswerList;
    }

    /**
     * Gets the value of the buybackItemsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buybackItemsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuybackItemsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuybackItemsList }
     * 
     * 
     */
    public List<BuybackItemsList> getBuybackItemsList() {
        if (buybackItemsList == null) {
            buybackItemsList = new ArrayList<BuybackItemsList>();
        }
        return this.buybackItemsList;
    }

    /**
     * Gets the value of the buybackFundsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuybackFundsList }{@code >}
     *     
     */
    public JAXBElement<BuybackFundsList> getBuybackFundsList() {
        return buybackFundsList;
    }

    /**
     * Sets the value of the buybackFundsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuybackFundsList }{@code >}
     *     
     */
    public void setBuybackFundsList(JAXBElement<BuybackFundsList> value) {
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
