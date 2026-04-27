package ejericitacion2;
import java.util.*;
public class ejercicio6 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
     
      int numerosec = random.nextInt(100) + 1;
      int inte = 0;
      System.out.println("adivina el numero entre (1 y 100):");
      while (inte!= numerosec) {
          System.out.print("ingresa tu numero: ");
          inte = scanner.nextInt();
          if (inte < numerosec) {
              System.out.println("El numero es mayor");
          } else if (inte > numerosec) {
              System.out.println("El numero es menor");
          } else {
              System.out.println("bien ahi, adivinaste el numero,gg ");
          }
      }
      scanner.close();
  }
}
