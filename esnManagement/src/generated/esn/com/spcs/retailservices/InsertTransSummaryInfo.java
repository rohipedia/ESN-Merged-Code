
package esn.com.spcs.retailservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTransSummaryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTransSummaryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insertTransSummaryDetailsInfo" type="{java:com.spcs.retailservices.domain}InsertTransSummaryDetailsInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTransSummaryInfo", propOrder = {
    "insertTransSummaryDetailsInfo"
})
public class InsertTransSummaryInfo {

    @XmlElement(required = true)
    protected InsertTransSummaryDetailsInfo insertTransSummaryDetailsInfo;

    /**
     * Gets the value of the insertTransSummaryDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InsertTransSummaryDetailsInfo }
     *     
     */
    public InsertTransSummaryDetailsInfo getInsertTransSummaryDetailsInfo() {
        return insertTransSummaryDetailsInfo;
    }

    /**
     * Sets the value of the insertTransSummaryDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertTransSummaryDetailsInfo }
     *     
     */
    public void setInsertTransSummaryDetailsInfo(InsertTransSummaryDetailsInfo value) {
        this.insertTransSummaryDetailsInfo = value;
    }

}
