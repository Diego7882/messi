package ejericitacion2;
import java.util.*;
public class ejercicio8 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String palabra = "muniain";
       System.out.println("adivina la palabra letra x letra");
       for (int i = 0; i < palabra.length(); i++) {
           System.out.print("ingresa una letra: ");
           char letra = teclado.next().charAt(0);
           boolean encontrado = false;
           for (int j = 0; j < palabra.length(); j++) {
               if (letra == palabra.charAt(j)) {
                   encontrado = true;
               }
           }
           if (encontrado) {
               System.out.println("correcto");
           } else {
               System.out.println("incorrecto");
           }
       }
       System.out.println("fin del juego, gg");
   }
}

