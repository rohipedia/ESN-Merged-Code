
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aslChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="planChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deviceChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="newLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeInfo", propOrder = {
    "aslChangeInd",
    "planChangeInd",
    "deviceChangeInd",
    "newLineInd"
})
public class ChangeInfo {

    protected boolean aslChangeInd;
    protected boolean planChangeInd;
    protected boolean deviceChangeInd;
    protected boolean newLineInd;

    /**
     * Gets the value of the aslChangeInd property.
     * 
     */
    public boolean isAslChangeInd() {
        return aslChangeInd;
    }

    /**
     * Sets the value of the aslChangeInd property.
     * 
     */
    public void setAslChangeInd(boolean value) {
        this.aslChangeInd = value;
    }

    /**
     * Gets the value of the planChangeInd property.
     * 
     */
    public boolean isPlanChangeInd() {
        return planChangeInd;
    }

    /**
     * Sets the value of the planChangeInd property.
     * 
     */
    public void setPlanChangeInd(boolean value) {
        this.planChangeInd = value;
    }

    /**
     * Gets the value of the deviceChangeInd property.
     * 
     */
    public boolean isDeviceChangeInd() {
        return deviceChangeInd;
    }

    /**
     * Sets the value of the deviceChangeInd property.
     * 
     */
    public void setDeviceChangeInd(boolean value) {
        this.deviceChangeInd = value;
    }

    /**
     * Gets the value of the newLineInd property.
     * 
     */
    public boolean isNewLineInd() {
        return newLineInd;
    }

    /**
     * Sets the value of the newLineInd property.
     * 
     */
    public void setNewLineInd(boolean value) {
        this.newLineInd = value;
    }

}
