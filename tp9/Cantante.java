package ejercitacion9;
public class Cantante implements Contratable {

    private String nombre;
    private String generoMusical;
    private int cachet;
    private int cantidadCanciones;
    private String manager;
    private String escenario;

    public Cantante(String nombre, String generoMusical, int cachet,
                    int cantidadCanciones, String manager) {

        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.cachet = cachet;
        this.cantidadCanciones = cantidadCanciones;
        this.manager = manager;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public int getCachet() {
        return cachet;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public String getManager() {
        return manager;
    }

    public String getEscenario() {
        return escenario;
    }

    @Override
    public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {

        if (impuestos < 0 || impuestos > 100) {
            throw new IllegalArgumentException(
                    "El porcentaje de impuestos debe estar entre 0 y 100."
            );
        }

        double honorariosFinales = cachet - (cachet * impuestos / 100);

        System.out.println("Honorarios de " + nombre + ": $" + honorariosFinales);
    }

    @Override
    public void asignarEscenario(String nombreEscenario) throws NullPointerException {

        if (nombreEscenario == null) {
            throw new NullPointerException("El escenario no puede ser nulo.");
        }

        escenario = nombreEscenario;

        System.out.println(
                nombre + " fue asignado al escenario: " + escenario
        );
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + generoMusical);
        System.out.println("Cachet: $" + cachet);
        System.out.println("Canciones: " + cantidadCanciones);
        System.out.println("Manager: " + manager);
        System.out.println("Escenario: " + escenario);
    }
}