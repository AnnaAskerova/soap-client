
package com.example.service.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UpdateServiceImplService", targetNamespace = "http://service.service.example.com/", wsdlLocation = "http://localhost:8080/getPatch?wsdl")
public class UpdateServiceImplService
    extends Service
{

    private final static URL UPDATESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException UPDATESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName UPDATESERVICEIMPLSERVICE_QNAME = new QName("http://service.service.example.com/", "UpdateServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/getPatch?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UPDATESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        UPDATESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UpdateServiceImplService() {
        super(__getWsdlLocation(), UPDATESERVICEIMPLSERVICE_QNAME);
    }

    public UpdateServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UPDATESERVICEIMPLSERVICE_QNAME, features);
    }

    public UpdateServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, UPDATESERVICEIMPLSERVICE_QNAME);
    }

    public UpdateServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UPDATESERVICEIMPLSERVICE_QNAME, features);
    }

    public UpdateServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpdateServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UpdateService
     */
    @WebEndpoint(name = "UpdateServiceImplPort")
    public UpdateService getUpdateServiceImplPort() {
        return super.getPort(new QName("http://service.service.example.com/", "UpdateServiceImplPort"), UpdateService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateService
     */
    @WebEndpoint(name = "UpdateServiceImplPort")
    public UpdateService getUpdateServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.service.example.com/", "UpdateServiceImplPort"), UpdateService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UPDATESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw UPDATESERVICEIMPLSERVICE_EXCEPTION;
        }
        return UPDATESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
