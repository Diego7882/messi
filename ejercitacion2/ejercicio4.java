package ejericitacion2;
import java.util.*;
public class ejercicio4 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("cuantos numeros desea ingresar: ");
       int n = teclado.nextInt();
       int[] numeros = new int[n];
       int suma = 0;
       for (int i = 0; i < n; i++) {
           System.out.print("ingrese un numero: ");
           numeros[i] = teclado.nextInt();
           suma = suma + numeros[i];
       }
       double promedio = (double) suma / n;
       System.out.println("el promedio es de: " + promedio);
   }
}

