package ejericitacion2;
import java.util.*;
public class ejercicio7 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
     
      System.out.println("1: Piedra");
      System.out.println("2: Papel");
      System.out.println("3: Tijera");
      System.out.print("elige una de las opciones: ");
      int us = scanner.nextInt();
      int compu = random.nextInt(3) + 1;
      System.out.println("La pc eleigio: " + compu);
      if (us == compu) {
          System.out.println("Empate");
      } else if (
          (us == 1 && compu == 3) ||
          (us == 2 && compu == 1) ||
          (us == 3 && compu == 2)
      ) {
          System.out.println("ganaste");
      } else if (us >= 1 && us <= 3) {
          System.out.println("perdiste");
      } else {
          System.out.println("opcion invalida");
      }
      scanner.close();
  }
}
