
package com.example.generated.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.generated.ws package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Customer_QNAME = new QName("http://example.com/customer", "customer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.generated.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     * @return
     *     the new instance of {@link CustomerType }
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     * @return
     *     the new instance of {@link AddressType }
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/customer", name = "customer")
    public JAXBElement<CustomerType> createCustomer(CustomerType value) {
        return new JAXBElement<>(_Customer_QNAME, CustomerType.class, null, value);
    }

}
