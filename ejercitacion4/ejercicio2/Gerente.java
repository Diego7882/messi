package Ejercitacion4;

public class Gerente extends Empleado {

    private double bonoResponsabilidad;

    public Gerente(int legajo, double sueldoBase, double bonoResponsabilidad) {
        super(legajo, sueldoBase);
        this.bonoResponsabilidad = bonoResponsabilidad;
    }

    public void mostrarDatos() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Bono: " + bonoResponsabilidad);
    }
}