package ejericitacion2;
public class ejercicio12 {
   public static void main(String[] args) {
       int[] numeros = {9, 40, 80, 10, 4, 6, 47, 22};
       int mayor = numeros[0];
       int menor = numeros[0];
       for (int i = 0; i < 8; i++) {
           if (numeros[i] > mayor) {
               mayor = numeros[i];
           }
           if (numeros[i] < menor) {
               menor = numeros[i];
           }
       }
       System.out.println("El numero mayor es: " + mayor);
       System.out.println("El numero menor es: " + menor);
   }
}
