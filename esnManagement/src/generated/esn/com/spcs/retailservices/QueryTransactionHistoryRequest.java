
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryTransactionHistoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTransactionHistoryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{java:com.spcs.retailservices.domain}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="blockNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTransactionHistoryRequest", propOrder = {
    "ban",
    "blockNumber"
})
public class QueryTransactionHistoryRequest
    extends Request
{

    protected int ban;
    protected int blockNumber;

    /**
     * Gets the value of the ban property.
     * 
     */
    public int getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     * 
     */
    public void setBan(int value) {
        this.ban = value;
    }

    /**
     * Gets the value of the blockNumber property.
     * 
     */
    public int getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     */
    public void setBlockNumber(int value) {
        this.blockNumber = value;
    }

}
