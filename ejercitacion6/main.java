package ejercitacion6;
public class main{
   public static void main(String[] args) {
     
       curso c = new curso("5°2°");
     
       estudiante e1 = new estudiante("Leandro", "123", 10);
       estudiante e2 = new estudiante("Johan", "456", 4.5);
       estudiante e3 = new estudiante("Leo", "789", 6.7);
      
       c.inscribir(e1);
       c.inscribir(e2);
       c.inscribir(e3);
      
       System.out.println("Cantidad de alumnos: " + c.cantidadAlumnos());
       c.darDeBaja(1);
       System.out.println("se dio de baja un estudiante");
       System.out.println("2 alumnos restantes");
       c.listarAlumnos();
   }
}

