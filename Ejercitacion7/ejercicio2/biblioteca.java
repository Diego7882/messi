package ejercitacion7;

import java.util.ArrayList;

public class biblioteca {

    ArrayList<libro> libros;

    public biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(libro l) {
        libros.add(l);
    }

    public void listarLibros() {

        for (libro l : libros) {
            l.mostrar();
        }
    }

    public void cantidadLibros() {
        System.out.println("Cantidad de libros: " + libros.size());
    }
}