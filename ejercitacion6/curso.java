package ejercitacion6;
import java.util.ArrayList;
public class curso {
   private String nombre;
   private ArrayList<estudiante> alumnos;
    public curso(String n) {
       nombre = n;
       alumnos = new ArrayList<>();
   }
   public void inscribir(estudiante e) {
       alumnos.add(e);
   }
 
   public void darDeBaja(int i) {
       alumnos.remove(i);
   }
  
   public void listarAlumnos() {
       for (estudiante e : alumnos) {
           e.mostrarFicha();
       }
   }
  
   public int cantidadAlumnos() {
       return alumnos.size();
   }
}
