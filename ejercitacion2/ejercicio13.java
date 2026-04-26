package ejericitacion2;

public class ejercicio13 {
    public static void main(String[] args) {

        String[] nombres = {"Alexis", "Luciano", "Nicolás", "Leandro"};
        double[] notas = {9, 4, 8, 10};

        for (int i = 0; i < 4; i++) {
        	if (notas[i] >= 6) {
                System.out.println(nombres[i] + " Aprobado");
            } else {
                System.out.println(nombres[i] + " Reprobado");
            }
        }
    }
}