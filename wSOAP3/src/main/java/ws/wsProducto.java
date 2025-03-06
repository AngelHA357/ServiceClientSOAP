/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;
import producto.Producto;

/**
 *
 * @author JoseH
 */
@WebService(serviceName = "wsProducto")
public class wsProducto {
    @WebMethod(operationName = "obtenerProductos")
    public List<Producto> obtenerProductos() {
        return Producto.obtenerProductos();
    }
    
    @WebMethod(operationName = "agregarProducto")
    public void addProducto(@WebParam(name = "producto") Producto producto) {
        Producto.obtenerProductos().add(producto);
    }
}
