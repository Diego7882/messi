package ejercitacion7;

public class jugador {

    private String nombre;
    private String posicion;
    private int edad;
    private String equipo;
    private boolean convocado;

    public jugador(String nombre, String posicion,
            int edad, String equipo, boolean convocado) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
        this.convocado = convocado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public boolean isConvocado() {
        return convocado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setConvocado(boolean convocado) {
        this.convocado = convocado;
    }

    
     
    @Override public String toString() {

        return "Nombre: " + nombre +
                "\nPosicion: " + posicion +
                "\nEdad: " + edad +
                "\nEquipo: " + equipo +
                "\nConvocado: " + convocado +
                "\n-------------------";
    }
}