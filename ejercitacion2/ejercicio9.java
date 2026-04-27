package ejericitacion2;
import java.util.*;
public class ejercicio9{
   public static void main(String[] args) throws InterruptedException {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       int numeros = 8;
       int[] n = new int[numeros];
       for (int i = 0; i < numeros; i++) {
           n[i] = random.nextInt(9) + 1;
       }
       System.out.print("memoriza los siguientes numeros: ");
       for (int i = 0; i < numeros; i++) {
           System.out.print(n[i] + " ");
       }
       Thread.sleep(2000);
      
       for (int i = 0; i < 30; i++) {
           System.out.println();
       }
       boolean correcto = true;
       for (int i = 0; i < numeros; i++) {
           System.out.print("ingresa el numero en la posicion " + (i + 1) + ": ");
           int intento = scanner.nextInt();
           if (intento != n[i]) {
               correcto = false;
           }
       }
       if (correcto) {
           System.out.println("ganaste, gg");
       } else {
           System.out.println("tenes alzheimer");
           System.out.print("los numeros eran: ");
           for (int i = 0; i < numeros; i++) {
               System.out.print(n[i] + " ");
           }
       }
       scanner.close();
   }
}

