
package esn.com.spcs.retailservices.domain;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java.com_spcs_retailservices_domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java.com_spcs_retailservices_domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryStoreByClientNameRequest }
     * 
     */
    public QueryStoreByClientNameRequest createQueryStoreByClientNameRequest() {
        return new QueryStoreByClientNameRequest();
    }

    /**
     * Create an instance of {@link QueryLastPunchDetailsRequest }
     * 
     */
    public QueryLastPunchDetailsRequest createQueryLastPunchDetailsRequest() {
        return new QueryLastPunchDetailsRequest();
    }

    /**
     * Create an instance of {@link CommitPunchDataRequest }
     * 
     */
    public CommitPunchDataRequest createCommitPunchDataRequest() {
        return new CommitPunchDataRequest();
    }

    /**
     * Create an instance of {@link PunchData }
     * 
     */
    public PunchData createPunchData() {
        return new PunchData();
    }

    /**
     * Create an instance of {@link QueryStoreByClientNameResponse }
     * 
     */
    public QueryStoreByClientNameResponse createQueryStoreByClientNameResponse() {
        return new QueryStoreByClientNameResponse();
    }

    /**
     * Create an instance of {@link QueryLastPunchDetailsResponse }
     * 
     */
    public QueryLastPunchDetailsResponse createQueryLastPunchDetailsResponse() {
        return new QueryLastPunchDetailsResponse();
    }

    /**
     * Create an instance of {@link CommitPunchDataResponse }
     * 
     */
    public CommitPunchDataResponse createCommitPunchDataResponse() {
        return new CommitPunchDataResponse();
    }

    /**
     * Create an instance of {@link ValidateUserRequest }
     * 
     */
    public ValidateUserRequest createValidateUserRequest() {
        return new ValidateUserRequest();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

}
