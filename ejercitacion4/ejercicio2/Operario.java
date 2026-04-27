package Ejercitacion4;

public class Operario extends Empleado {

    private double valorHoraExtra;

    public Operario(int legajo, double sueldoBase, double valorHoraExtra) {
        super(legajo, sueldoBase);
        this.valorHoraExtra = valorHoraExtra;
    }
}