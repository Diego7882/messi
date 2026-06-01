package ejercitacion7;

public class paciente {

    String nombre;
    String dni;
    int edad;
    double peso;
    boolean estaHospitalizado;

    public paciente(String nombre, String dni, int edad,
            double peso, boolean estaHospitalizado) {

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public void mostrar() {

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Hospitalizado: " + estaHospitalizado);
        System.out.println("-------------------");
    }
}