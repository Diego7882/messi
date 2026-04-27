package Ejercitacio4ejercicio3;

public class Libro extends Producto {

    private String autor;

    public Libro(int codigo, double precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    public double calcularPrecioFinal() {
        return getPrecio() + 100;
    }
}