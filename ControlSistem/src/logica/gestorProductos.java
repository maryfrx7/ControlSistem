/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;

public class gestorProductos {
    private static final List<Producto> productos = new ArrayList<>();

    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static boolean eliminarProductoPorId(String id) {
        return productos.removeIf(p -> p.getId().equals(id));
    }

    public static Producto buscarPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public static List<Producto> obtenerTodos() {
        return productos;
    }
}
