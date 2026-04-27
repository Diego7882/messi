package ejercitacion4;

import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {

        Socio s1 = new Socio(1, "Diego");
        Socio s2 = new Socio(2, "Lucas");
        Socio s3 = new Socio(3, "Santiago");
        Socio s4 = new Socio(4, "Lisandro");
        Socio s5 = new Socio(5, "Junior");

 
        Reserva r1 = new Reserva("21/04/2026", "Futbol");
        Reserva r2 = new Reserva("22/04/2026", "Futbol");
        Reserva r3 = new Reserva("23/04/2026", "Futbol");
        Reserva r4 = new Reserva("24/04/2026", "Futbol");
        Reserva r5 = new Reserva("25/04/2026", "Futbol");


        s1.agregarReserva(r1);
        s2.agregarReserva(r2);
        s3.agregarReserva(r3);
        s4.agregarReserva(r4);
        s5.agregarReserva(r5);


        s1.mostrarReservas();
        s2.mostrarReservas();
        s3.mostrarReservas();
        s4.mostrarReservas();
        s5.mostrarReservas();
    }
}

class Socio {
    private int nroSocio;
    private String nombre;
    private ArrayList<Reserva> reservas;

    public Socio(int nroSocio, String nombre) {
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }

    public void mostrarReservas() {
        System.out.println("Socio: " + nombre + " (N° " + nroSocio + ")");
        for (Reserva r : reservas) {
            System.out.println(r);
        }
        System.out.println();
    }
}


class Reserva {
    private String fecha;
    private String tipoDeporte;

    public Reserva(String fecha, String tipoDeporte) {
        this.fecha = fecha;
        this.tipoDeporte = tipoDeporte;
    }

    public String toString() {
        return fecha + " - " + tipoDeporte;
    }
}

