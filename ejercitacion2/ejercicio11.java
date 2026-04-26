package ejericitacion2;
import java.util.*;
public class ejercicio11 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int[] numeros = new int[5];
       for (int i = 0; i < 5; i++) {
           System.out.print("ingresa un numero: ");
           numeros[i] = teclado.nextInt();
       }
       System.out.println("los numeros en el orden inverso:");
       for (int i = 4; i >= 0; i--) {
           System.out.println(numeros[i]);
       }
   }
}

