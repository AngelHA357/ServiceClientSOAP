
package com.mycompany.soapclient.generated.wsProducto;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.soapclient.generated.wsProducto package. 
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

    private static final QName _AgregarProducto_QNAME = new QName("http://ws/", "agregarProducto");
    private static final QName _AgregarProductoResponse_QNAME = new QName("http://ws/", "agregarProductoResponse");
    private static final QName _ObtenerProductos_QNAME = new QName("http://ws/", "obtenerProductos");
    private static final QName _ObtenerProductosResponse_QNAME = new QName("http://ws/", "obtenerProductosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.soapclient.generated.wsProducto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarProducto }
     * 
     * @return
     *     the new instance of {@link AgregarProducto }
     */
    public AgregarProducto createAgregarProducto() {
        return new AgregarProducto();
    }

    /**
     * Create an instance of {@link AgregarProductoResponse }
     * 
     * @return
     *     the new instance of {@link AgregarProductoResponse }
     */
    public AgregarProductoResponse createAgregarProductoResponse() {
        return new AgregarProductoResponse();
    }

    /**
     * Create an instance of {@link ObtenerProductos }
     * 
     * @return
     *     the new instance of {@link ObtenerProductos }
     */
    public ObtenerProductos createObtenerProductos() {
        return new ObtenerProductos();
    }

    /**
     * Create an instance of {@link ObtenerProductosResponse }
     * 
     * @return
     *     the new instance of {@link ObtenerProductosResponse }
     */
    public ObtenerProductosResponse createObtenerProductosResponse() {
        return new ObtenerProductosResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     * @return
     *     the new instance of {@link Producto }
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "agregarProducto")
    public JAXBElement<AgregarProducto> createAgregarProducto(AgregarProducto value) {
        return new JAXBElement<>(_AgregarProducto_QNAME, AgregarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "agregarProductoResponse")
    public JAXBElement<AgregarProductoResponse> createAgregarProductoResponse(AgregarProductoResponse value) {
        return new JAXBElement<>(_AgregarProductoResponse_QNAME, AgregarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerProductos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerProductos")
    public JAXBElement<ObtenerProductos> createObtenerProductos(ObtenerProductos value) {
        return new JAXBElement<>(_ObtenerProductos_QNAME, ObtenerProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerProductosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerProductosResponse")
    public JAXBElement<ObtenerProductosResponse> createObtenerProductosResponse(ObtenerProductosResponse value) {
        return new JAXBElement<>(_ObtenerProductosResponse_QNAME, ObtenerProductosResponse.class, null, value);
    }

}
