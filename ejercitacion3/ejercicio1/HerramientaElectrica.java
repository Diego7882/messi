package Ejercitacion3ejercicio1;

public class HerramientaElectrica extends Herramienta {
    private int voltaje;

    public HerramientaElectrica(int codigo, String marca, int voltaje) {
        super(codigo, marca);
        this.voltaje = voltaje;
    }
}