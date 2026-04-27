package Ejercitacion3ejercicio1;
public class Herramienta {

    protected int codigo;
    protected String marca;

    public Herramienta(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public static void main(String[] args) {
        Herramienta h1 = new HerramientaElectrica(1, "Lusqtoff", 10);
        Herramienta h2 = new HerramientaElectrica(2, "Sierra circular", 9);
        Herramienta h3 = new HerramientaManual(3, "Destornillador");
        Herramienta h4 = new HerramientaManual(4, "Alicate");
        Herramienta h5 = new HerramientaManual(5, "Martillo");

        System.out.println("el nombre de la herramienta es: " + h1.marca);
        System.out.println("el nombre de la herramienta es: " + h2.marca);
        System.out.println("el nombre de la herramienta es: " + h3.marca);
        System.out.println("el nombre de la herramienta es: " + h4.marca);
        System.out.println("el nombre de la herramienta es: " + h5.marca);
    }
}