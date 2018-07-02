
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PunchData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PunchData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PunchStatus" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="PunchTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="PunchIndicator" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="ClientDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *         &lt;element name="UserNotes" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PunchData", propOrder = {
    "punchStatus",
    "punchTimeStamp",
    "punchIndicator",
    "clientDateTime",
    "userNotes"
})
public class PunchData {

    @XmlElement(name = "PunchStatus", required = true, nillable = true)
    protected String punchStatus;
    @XmlElement(name = "PunchTimeStamp", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar punchTimeStamp;
    @XmlElement(name = "PunchIndicator", required = true, nillable = true)
    protected String punchIndicator;
    @XmlElement(name = "ClientDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientDateTime;
    @XmlElement(name = "UserNotes", required = true, nillable = true)
    protected String userNotes;

    /**
     * Gets the value of the punchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunchStatus() {
        return punchStatus;
    }

    /**
     * Sets the value of the punchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunchStatus(String value) {
        this.punchStatus = value;
    }

    /**
     * Gets the value of the punchTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPunchTimeStamp() {
        return punchTimeStamp;
    }

    /**
     * Sets the value of the punchTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPunchTimeStamp(XMLGregorianCalendar value) {
        this.punchTimeStamp = value;
    }

    /**
     * Gets the value of the punchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunchIndicator() {
        return punchIndicator;
    }

    /**
     * Sets the value of the punchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunchIndicator(String value) {
        this.punchIndicator = value;
    }

    /**
     * Gets the value of the clientDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientDateTime() {
        return clientDateTime;
    }

    /**
     * Sets the value of the clientDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientDateTime(XMLGregorianCalendar value) {
        this.clientDateTime = value;
    }

    /**
     * Gets the value of the userNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNotes() {
        return userNotes;
    }

    /**
     * Sets the value of the userNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNotes(String value) {
        this.userNotes = value;
    }

}
