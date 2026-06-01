package ejercitacion7;

public class libro {

    String titulo;
    String isbn;
    int cantidadPaginas;

    public libro(String titulo, String isbn, int cantidadPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantidadPaginas = cantidadPaginas;
    }

    public void mostrar() {

        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + cantidadPaginas);
        System.out.println("-------------------");
    }
}