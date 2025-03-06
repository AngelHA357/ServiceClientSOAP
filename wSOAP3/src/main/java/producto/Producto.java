/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JoseH
 */
public class Producto implements Serializable{
    private static final long serialVersionUID = 1L;

    public static List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto("Esponja", "Limpieza"),
            new Producto("Tomate", "Frutas y Verduras"),
            new Producto("Pepsi", "Refrescos"))
    );
    public String nombre, categoria;

    public Producto() {
        super();
    }

    public Producto(String nombre, String categoria) {
        super();
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public static List<Producto> obtenerProductos() {
        return productos;
    }
}
