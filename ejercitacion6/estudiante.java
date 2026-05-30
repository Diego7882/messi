package ejercitacion6;
public class estudiante {
   private String nombre;
   private String dni;
   private double promedio;
   public estudiante(String n, String d, double p) {
       nombre = n;
       dni = d;
       promedio = p;
   }
   public String getNombre() {
       return nombre;
   }
   public double getPromedio() {
       return promedio;
   }
   public void mostrarFicha() {
       System.out.println("Nombre: " + nombre);
       System.out.println("DNI: " + dni);
       System.out.println("Promedio: " + promedio);
       System.out.println();
   }
}
