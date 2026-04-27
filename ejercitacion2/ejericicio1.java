package ejericitacion2;
import java.util.*;
public class ejericicio1 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("cantidad de numeros que desea ingresar: ");
       int n = teclado.nextInt();
       int[] numeros = new int[n];
       int suma = 0;
       for (int i = 0; i < n; i++) {
           System.out.print("ingrese un numero: ");
           numeros[i] = teclado.nextInt();
       }
       for (int i = 0; i < n; i++) {
           suma = suma + numeros[i];
       }
       System.out.println("Suma: " + suma);
   }
}

