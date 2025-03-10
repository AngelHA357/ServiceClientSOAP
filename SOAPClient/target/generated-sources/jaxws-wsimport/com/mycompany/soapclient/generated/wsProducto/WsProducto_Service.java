
package com.mycompany.soapclient.generated.wsProducto;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "wsProducto", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/wSOAP3/wsProducto?wsdl")
public class WsProducto_Service
    extends Service
{

    private static final URL WSPRODUCTO_WSDL_LOCATION;
    private static final WebServiceException WSPRODUCTO_EXCEPTION;
    private static final QName WSPRODUCTO_QNAME = new QName("http://ws/", "wsProducto");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wSOAP3/wsProducto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPRODUCTO_WSDL_LOCATION = url;
        WSPRODUCTO_EXCEPTION = e;
    }

    public WsProducto_Service() {
        super(__getWsdlLocation(), WSPRODUCTO_QNAME);
    }

    public WsProducto_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPRODUCTO_QNAME, features);
    }

    public WsProducto_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPRODUCTO_QNAME);
    }

    public WsProducto_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPRODUCTO_QNAME, features);
    }

    public WsProducto_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsProducto_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsProducto
     */
    @WebEndpoint(name = "wsProductoPort")
    public WsProducto getWsProductoPort() {
        return super.getPort(new QName("http://ws/", "wsProductoPort"), WsProducto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsProducto
     */
    @WebEndpoint(name = "wsProductoPort")
    public WsProducto getWsProductoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "wsProductoPort"), WsProducto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPRODUCTO_EXCEPTION!= null) {
            throw WSPRODUCTO_EXCEPTION;
        }
        return WSPRODUCTO_WSDL_LOCATION;
    }

}
