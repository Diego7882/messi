package ejercitacion7;

public class producto {

    String nombre;
    String codigo;
    double precio;

    public producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio: $" + precio);
        System.out.println("-------------------");
    }
}