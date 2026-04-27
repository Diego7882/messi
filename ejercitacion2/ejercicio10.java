package ejericitacion2;
import java.util.*;
public class ejercicio10 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String[] palabras = {"cuello", "tripichio", "romania", "auzmendi"};
       int indice = 0;
       String palabra = palabras[indice];
       char[] progreso = new char[palabra.length()];
  
       for (int i = 0; i < progreso.length; i++) {
           progreso[i] = '_';
       }
 
       progreso[0] = palabra.charAt(0);
       System.out.println("adivina la palabra: ");
       boolean completo = false;
       while (!completo) {
      
           for (int i = 0; i < progreso.length; i++) {
               System.out.print(progreso[i] + " ");
           }
           System.out.println();
           System.out.print("ingresa una letra ");
           char letra = teclado.next().toLowerCase().charAt(0);
           boolean acierto = false;
           for (int i = 0; i < palabra.length(); i++) {
               if (palabra.charAt(i) == letra) {
                   progreso[i] = letra;
                   acierto = true;
               }
           }
           if (acierto) {
               System.out.println("correcto");
           } else {
               System.out.println("icorrecto");
           }
           completo = true;
           for (int i = 0; i < progreso.length; i++) {
               if (progreso[i] == '_') {
                   completo = false;
               }
           }
       }
       System.out.println("ganaste, la palabra era: " + palabra);
       teclado.close();
   }
}


