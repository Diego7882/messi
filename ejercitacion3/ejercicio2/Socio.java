package Ejercitacion3ejercicio2;

public class Socio {

    protected String nombre;
    protected int nroSocio;

    public Socio(String nombre, int nroSocio) {
        this.nombre = nombre;
        this.nroSocio = nroSocio;
    }

    public static void main(String[] args) {

        Socio s1 = new Socio("Cuello", 1);
        Socio s2 = new Socio("Romagnoli", 2);
        Socio s3 = new Socio("Romaña", 3);

       
        Libro l1 = new Libro("Arteta Tactico");
        Libro l2 = new Libro("Leading");
        Libro l3 = new Libro("It");
        Libro l4 = new Libro("Padre rico, padre pobre");
        Libro l5 = new Libro("Los juegos del hambre");

        
        System.out.println("el socio N°" + s1.nroSocio + " Alexis " + s1.nombre + " tiene el libro de: " + l1.nombre);
        System.out.println("el socio N°" + s1.nroSocio + " Alexis " + s1.nombre + " tiene el libro de: " + l2.nombre);
        System.out.println("el socio N°" + s2.nroSocio + " Leandro " + s2.nombre + " tiene el libro de: " + l3.nombre);
        System.out.println("el socio N°" + s3.nroSocio + " Johan " + s3.nombre + " tiene el libro de: " + l4.nombre);
        System.out.println("el socio N°" + s3.nroSocio + " Johan " + s3.nombre + " tiene el libro de: " + l5.nombre);
    }
}