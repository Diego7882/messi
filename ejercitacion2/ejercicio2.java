package ejericitacion2;
import java.util.*;
public class ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	System.out.print("cuantos numeros desea ingresar: ");
	int n = teclado.nextInt();
	int[] numero = new int[n];
	for (int i = 0; i < n; i++) {
		System.out.print("ingrese un numero: ");
		numero[i] = teclado.nextInt();
		}
	int max = numero[0];
	for (int i = 1; i < numero.length; i++) {
		if (numero[i] > max) {
			max = numero[i];
			}
		}
	System.out.println("el numero maximo es: " + max);
	}
	}

