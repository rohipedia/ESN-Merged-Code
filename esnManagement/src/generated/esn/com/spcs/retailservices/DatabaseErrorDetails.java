
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseErrorDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseErrorDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SqlCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SqlDbCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SqlErrText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SqlNrows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SqlReturnData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseErrorDetails", propOrder = {
    "sqlCode",
    "sqlDbCode",
    "sqlErrText",
    "sqlNrows",
    "sqlReturnData"
})
public class DatabaseErrorDetails {

    @XmlElement(name = "SqlCode")
    protected int sqlCode;
    @XmlElement(name = "SqlDbCode")
    protected int sqlDbCode;
    @XmlElement(name = "SqlErrText", required = true, nillable = true)
    protected String sqlErrText;
    @XmlElement(name = "SqlNrows")
    protected int sqlNrows;
    @XmlElement(name = "SqlReturnData", required = true, nillable = true)
    protected String sqlReturnData;

    /**
     * Gets the value of the sqlCode property.
     * 
     */
    public int getSqlCode() {
        return sqlCode;
    }

    /**
     * Sets the value of the sqlCode property.
     * 
     */
    public void setSqlCode(int value) {
        this.sqlCode = value;
    }

    /**
     * Gets the value of the sqlDbCode property.
     * 
     */
    public int getSqlDbCode() {
        return sqlDbCode;
    }

    /**
     * Sets the value of the sqlDbCode property.
     * 
     */
    public void setSqlDbCode(int value) {
        this.sqlDbCode = value;
    }

    /**
     * Gets the value of the sqlErrText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlErrText() {
        return sqlErrText;
    }

    /**
     * Sets the value of the sqlErrText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlErrText(String value) {
        this.sqlErrText = value;
    }

    /**
     * Gets the value of the sqlNrows property.
     * 
     */
    public int getSqlNrows() {
        return sqlNrows;
    }

    /**
     * Sets the value of the sqlNrows property.
     * 
     */
    public void setSqlNrows(int value) {
        this.sqlNrows = value;
    }

    /**
     * Gets the value of the sqlReturnData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlReturnData() {
        return sqlReturnData;
    }

    /**
     * Sets the value of the sqlReturnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlReturnData(String value) {
        this.sqlReturnData = value;
    }

}
