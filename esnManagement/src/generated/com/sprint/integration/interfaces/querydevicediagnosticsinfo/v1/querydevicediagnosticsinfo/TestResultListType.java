
package com.sprint.integration.interfaces.querydevicediagnosticsinfo.v1.querydevicediagnosticsinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestResultListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="testResultInfo" type="{http://integration.sprint.com/interfaces/queryDeviceDiagnosticsInfo/v1/queryDeviceDiagnosticsInfo.xsd}TestResultInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestResultListType", propOrder = {
    "testResultInfo"
})
public class TestResultListType {

    @XmlElement(required = true)
    protected List<TestResultInfoType> testResultInfo;

    /**
     * Gets the value of the testResultInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResultInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResultInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestResultInfoType }
     * 
     * 
     */
    public List<TestResultInfoType> getTestResultInfo() {
        if (testResultInfo == null) {
            testResultInfo = new ArrayList<TestResultInfoType>();
        }
        return this.testResultInfo;
    }

}
