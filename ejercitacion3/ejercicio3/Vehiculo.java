package Ejercitacion3ejercicio3;

public class Vehiculo {

    protected String patente;
    protected String modelo;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public static void main(String[] args) {

     
        Vendedor v1 = new Vendedor("Alexis");
        Vendedor v2 = new Vendedor("Leandro");
        Vendedor v3 = new Vendedor("Augusto");

       
        Vehiculo ve1 = new Auto("AD328GX", "Ford");
        Vehiculo ve2 = new Moto("MSN216L", "Ducati");
        Vehiculo ve3 = new Auto("BBC218C", "Toyota");
        Vehiculo ve4 = new Moto("CT672ML", "Honda");
        Vehiculo ve5 = new Auto("TC912LM", "McLaren");
        Vehiculo ve6 = new Moto("1308214", "Piaggio");
        Vehiculo ve7 = new Auto("0608221", "BMW");
        Vehiculo ve8 = new Moto("1812222", "Victory");
        Vehiculo ve9 = new Auto("DAT7615", "Audi");
        Vehiculo ve10 = new Moto("TID1821", "Tesla");

       
        System.out.println(v1.nombre + " tiene el vehiculo: " + ve1.modelo + " y su patente es: " + ve1.patente);
        System.out.println(v1.nombre + " tiene el vehiculo: " + ve2.modelo + " y su patente es: " + ve2.patente);
        System.out.println(v1.nombre + " tiene el vehiculo: " + ve3.modelo + " y su patente es: " + ve3.patente);
        System.out.println(v2.nombre + " tiene el vehiculo: " + ve4.modelo + " y su patente es: " + ve4.patente);
        System.out.println(v2.nombre + " tiene el vehiculo: " + ve5.modelo + " y su patente es: " + ve5.patente);
        System.out.println(v2.nombre + " tiene el vehiculo: " + ve6.modelo + " y su patente es: " + ve6.patente);
        System.out.println(v3.nombre + " tiene el vehiculo: " + ve7.modelo + " y su patente es: " + ve7.patente);
        System.out.println(v3.nombre + " tiene el vehiculo: " + ve8.modelo + " y su patente es: " + ve8.patente);
        System.out.println(v3.nombre + " tiene el vehiculo: " + ve9.modelo + " y su patente es: " + ve9.patente);
        System.out.println(v3.nombre + " tiene el vehiculo: " + ve10.modelo + " y su patente es: " + ve10.patente);
    }
}