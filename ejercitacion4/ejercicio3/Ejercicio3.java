package Ejercitacio4ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {

        Libro libro = new Libro(1, 1000, "Borges");
        ArticuloPapeleria art = new ArticuloPapeleria(2, 500, "Papel");

        System.out.println("Precio final libro: " + libro.calcularPrecioFinal());
        System.out.println("Precio final articulo: " + art.calcularPrecioFinal());
    }
}