/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.soapclient;

import com.mycompany.soapclient.generated.NuevoWS;
import com.mycompany.soapclient.generated.NuevoWS_Service;
import com.mycompany.soapclient.generated.wsProducto.Producto;
import com.mycompany.soapclient.generated.wsProducto.WsProducto;
import com.mycompany.soapclient.generated.wsProducto.WsProducto_Service;
import java.util.List;

/**
 *
 * @author JoseH
 */
public class SOAPClient {

    public static void main(String[] args) {
        WsProducto_Service ws = new WsProducto_Service();
        WsProducto port = ws.getWsProductoPort();
        
        Producto p1 = new Producto();
        p1.setNombre("Esponja");
        p1.setCategoria("Higiene");
        port.agregarProducto(p1);
        
        List<Producto> productos = port.obtenerProductos();
        
        System.out.println("");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + " Categoría: " + producto.getCategoria());
        }
    }
}
