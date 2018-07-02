
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractInfoEIB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractInfoEIB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanDetailInfo" type="{java:com.spcs.retailservices.domain}LoanDetailInfo"/&gt;
 *         &lt;element name="accountInfo" type="{java:com.spcs.retailservices.domain}AccountInfo"/&gt;
 *         &lt;element name="salesDetailInfo" type="{java:com.spcs.retailservices.domain}SalesDetailInfo"/&gt;
 *         &lt;element name="contractTemplateMappingInfo" type="{java:com.spcs.retailservices.domain}ContractTemplateMappingInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractInfoEIB", propOrder = {
    "loanDetailInfo",
    "accountInfo",
    "salesDetailInfo",
    "contractTemplateMappingInfo"
})
public class ContractInfoEIB {

    @XmlElement(required = true)
    protected LoanDetailInfo loanDetailInfo;
    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    @XmlElement(required = true)
    protected SalesDetailInfo salesDetailInfo;
    @XmlElement(required = true)
    protected ContractTemplateMappingInfo contractTemplateMappingInfo;

    /**
     * Gets the value of the loanDetailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoanDetailInfo }
     *     
     */
    public LoanDetailInfo getLoanDetailInfo() {
        return loanDetailInfo;
    }

    /**
     * Sets the value of the loanDetailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanDetailInfo }
     *     
     */
    public void setLoanDetailInfo(LoanDetailInfo value) {
        this.loanDetailInfo = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the salesDetailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesDetailInfo }
     *     
     */
    public SalesDetailInfo getSalesDetailInfo() {
        return salesDetailInfo;
    }

    /**
     * Sets the value of the salesDetailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesDetailInfo }
     *     
     */
    public void setSalesDetailInfo(SalesDetailInfo value) {
        this.salesDetailInfo = value;
    }

    /**
     * Gets the value of the contractTemplateMappingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTemplateMappingInfo }
     *     
     */
    public ContractTemplateMappingInfo getContractTemplateMappingInfo() {
        return contractTemplateMappingInfo;
    }

    /**
     * Sets the value of the contractTemplateMappingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTemplateMappingInfo }
     *     
     */
    public void setContractTemplateMappingInfo(ContractTemplateMappingInfo value) {
        this.contractTemplateMappingInfo = value;
    }

}
