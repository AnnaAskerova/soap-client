
package com.example.service.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.service.service package. 
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

    private final static QName _GetPatch_QNAME = new QName("http://service.service.example.com/", "getPatch");
    private final static QName _GetPatchResponse_QNAME = new QName("http://service.service.example.com/", "getPatchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.service.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPatchResponse }
     * 
     */
    public GetPatchResponse createGetPatchResponse() {
        return new GetPatchResponse();
    }

    /**
     * Create an instance of {@link GetPatch }
     * 
     */
    public GetPatch createGetPatch() {
        return new GetPatch();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link GetPatchResponse.Return }
     * 
     */
    public GetPatchResponse.Return createGetPatchResponseReturn() {
        return new GetPatchResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.service.example.com/", name = "getPatch")
    public JAXBElement<GetPatch> createGetPatch(GetPatch value) {
        return new JAXBElement<GetPatch>(_GetPatch_QNAME, GetPatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.service.example.com/", name = "getPatchResponse")
    public JAXBElement<Object> createGetPatchResponse(Object value) {
        return new JAXBElement<Object>(_GetPatchResponse_QNAME, Object.class, null, value);
    }

}
