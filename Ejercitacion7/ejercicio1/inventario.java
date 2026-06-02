package ejercitacion7;

import java.util.ArrayList;

public class inventario {

    ArrayList<producto> productos;

    public inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(producto p) {
        productos.add(p);
    }

    public void listarProductos() {

        for (producto p : productos) {
            p.mostrar();
        }
    }

    public void cantidadProductos() {
        System.out.println("Cantidad de productos: " + productos.size());
    }
}