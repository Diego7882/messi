package ejericitacion2;
import java.util.*;
public class ejercicio5 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("cuantos numeros desea ingresar: ");
       int n = teclado.nextInt();
       int[] numeros = new int[n];
       int contador = 0;
       for (int i = 0; i < n; i++) {
           System.out.print("ingrese un numero: ");
           numeros[i] = teclado.nextInt();
           if (numeros[i] % 2 == 0) {
               contador = contador + 1;
           }
       }
       System.out.println("la cantidad de numeros pares son: " + contador);
   }
}

