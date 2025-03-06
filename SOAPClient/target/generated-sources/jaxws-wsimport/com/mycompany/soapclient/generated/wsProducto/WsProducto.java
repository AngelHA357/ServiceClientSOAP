
package com.mycompany.soapclient.generated.wsProducto;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "wsProducto", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsProducto {


    /**
     * 
     * @param producto
     */
    @WebMethod
    @RequestWrapper(localName = "agregarProducto", targetNamespace = "http://ws/", className = "com.mycompany.soapclient.generated.wsProducto.AgregarProducto")
    @ResponseWrapper(localName = "agregarProductoResponse", targetNamespace = "http://ws/", className = "com.mycompany.soapclient.generated.wsProducto.AgregarProductoResponse")
    public void agregarProducto(
        @WebParam(name = "producto", targetNamespace = "")
        Producto producto);

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.soapclient.generated.wsProducto.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProductos", targetNamespace = "http://ws/", className = "com.mycompany.soapclient.generated.wsProducto.ObtenerProductos")
    @ResponseWrapper(localName = "obtenerProductosResponse", targetNamespace = "http://ws/", className = "com.mycompany.soapclient.generated.wsProducto.ObtenerProductosResponse")
    public List<Producto> obtenerProductos();

}
