package Ejercitacio4ejercicio3;

public abstract class Producto {

    protected int codigo;
    private double precio;

    public Producto(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double calcularPrecioFinal();
}