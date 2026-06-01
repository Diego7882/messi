package ejercitacion7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class seleccion {

    ArrayList<jugador> jugadores;

    public seleccion() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(jugador j) {
        jugadores.add(j);
    }

    public void eliminarJugador(String nombre) {

        for (int i = 0; i < jugadores.size(); i++) {

            if (jugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
                jugadores.remove(i);
                System.out.println("Jugador eliminado");
                return;
            }
        }

        System.out.println("Jugador no encontrado");
    }

    public void buscarPorPosicion(String posicion) {

        System.out.println("Jugadores posicion " + posicion);

        for (jugador j : jugadores) {

            if (j.getPosicion().equalsIgnoreCase(posicion)) {
                System.out.println(j);
            }
        }
    }

    public void mostrarConvocados() {

        System.out.println("Convocados");

        for (jugador j : jugadores) {

            if (j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void mostrarNoConvocados() {

        System.out.println("No convocados");

        for (jugador j : jugadores) {

            if (!j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void contarPorSeleccion() {

        int argentina = 0;
        int francia = 0;

        for (jugador j : jugadores) {

            if (j.getNombre().equals("Lionel Messi")
                    || j.getNombre().equals("Paulo Dybala")
                    || j.getNombre().equals("Lautaro Martinez")
                    || j.getNombre().equals("Julian Alvarez")
                    || j.getNombre().equals("Rodrigo De Paul")
                    || j.getNombre().equals("Enzo Fernandez")
                    || j.getNombre().equals("Alexis Mac Allister")
                    || j.getNombre().equals("Cristian Romero")
                    || j.getNombre().equals("Nicolas Otamendi")
                    || j.getNombre().equals("Nahuel Molina")
                    || j.getNombre().equals("Emiliano Martinez")) {

                argentina++;

            } else {
                francia++;
            }
        }

        System.out.println("Argentina: " + argentina);
        System.out.println("Francia: " + francia);
    }

    public void jugadorMasJoven() {

        jugador joven = jugadores.get(0);

        for (jugador j : jugadores) {

            if (j.getEdad() < joven.getEdad()) {
                joven = j;
            }
        }

        System.out.println("Jugador mas joven");
        System.out.println(joven);
    }

    public void jugadorMasVeterano() {

        jugador veterano = jugadores.get(0);

        for (jugador j : jugadores) {

            if (j.getEdad() > veterano.getEdad()) {
                veterano = j;
            }
        }

        System.out.println("Jugador mas veterano");
        System.out.println(veterano);
    }

    public void buscarPorEquipo(String equipo) {

        System.out.println("Jugadores del equipo " + equipo);

        for (jugador j : jugadores) {

            if (j.getEquipo().equalsIgnoreCase(equipo)) {
                System.out.println(j);
            }
        }
    }

    public void ordenarPorEdad() {

        Collections.sort(jugadores,
                Comparator.comparingInt(jugador::getEdad));

        System.out.println("Ordenados por edad");

        for (jugador j : jugadores) {
            System.out.println(j);
        }
    }

    public void contarPorPosicion() {

        int arqueros = 0;
        int defensores = 0;
        int mediocampistas = 0;
        int delanteros = 0;

        for (jugador j : jugadores) {

            if (j.getPosicion().equalsIgnoreCase("Arquero")) {
                arqueros++;
            }

            if (j.getPosicion().equalsIgnoreCase("Defensor")) {
                defensores++;
            }

            if (j.getPosicion().equalsIgnoreCase("Mediocampista")) {
                mediocampistas++;
            }

            if (j.getPosicion().equalsIgnoreCase("Delantero")) {
                delanteros++;
            }
        }

        System.out.println("Arqueros: " + arqueros);
        System.out.println("Defensores: " + defensores);
        System.out.println("Mediocampistas: " + mediocampistas);
        System.out.println("Delanteros: " + delanteros);
    }

    public void estaConvocado(String nombre) {

        for (jugador j : jugadores) {

            if (j.getNombre().equalsIgnoreCase(nombre)) {

                if (j.isConvocado()) {
                    System.out.println(nombre + " esta convocado");
                } else {
                    System.out.println(nombre + " no esta convocado");
                }

                return;
            }
        }

        System.out.println("Jugador no encontrado");
    }

    public void promedioEdad() {

        int suma = 0;

        for (jugador j : jugadores) {
            suma += j.getEdad();
        }

        double promedio = (double) suma / jugadores.size();

        System.out.println("Promedio edad: " + promedio);
    }
}