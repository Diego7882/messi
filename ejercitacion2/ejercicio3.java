package ejericitacion2;
import java.util.*;
public class ejercicio3 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("cuantos numeros desea ingresar: ");
       int n = teclado.nextInt();
       int[] numeros = new int[n];
   
       for (int i = 0; i < n; i++) {
           System.out.print("ingrese un numero: ");
           numeros[i] = teclado.nextInt();
       }
  
       int minimo = numeros[0];
       for (int i = 1; i < n; i++) {
           if (numeros[i] < minimo) {
               minimo = numeros[i];
           }
       }
       System.out.println("el numero minimo es: " + minimo);
   }
}
