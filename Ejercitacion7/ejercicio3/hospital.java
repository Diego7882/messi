package ejercitacion7;

import java.util.ArrayList;

public class hospital {

    ArrayList<paciente> pacientes;

    public hospital() {
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(paciente p) {
        pacientes.add(p);
    }

    public void listarPacientes() {

        for (paciente p : pacientes) {
            p.mostrar();
        }
    }

    public void cantidadPacientes() {
        System.out.println("Cantidad de pacientes: "
                + pacientes.size());
    }
}