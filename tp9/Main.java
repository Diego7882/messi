package ejercitacion9;
public class Main {
    public static void Main(String[] args) {
        String[][] datosCantantes = {
                {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
                {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"},
                {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},
                {"Duki", "Trap", "500000", "14", null}
        };
        Festival festival = new Festival();
        for (int i = 0; i < datosCantantes.length; i++) {
            Cantante cantante = null;
            System.out.println("Procesando artista " + (i + 1));
            try {

                String nombre = datosCantantes[i][0];
                String genero = datosCantantes[i][1];
                int cachet = Integer.parseInt(datosCantantes[i][2]);
                int cantidadCanciones =
                        Integer.parseInt(datosCantantes[i][3]);

                String manager = datosCantantes[i][4];
                cantante = new Cantante(
                        nombre,
                        genero,
                        cachet,
                        cantidadCanciones,
                        manager
                );

                System.out.println("cantante creado correctamente.");
                try {

                    System.out.println(
                            "Manager: " + cantante.getManager().toUpperCase()
                    );

                } catch (NullPointerException e) {

                    System.out.println(
                            "Error: el manager de " +
                                    cantante.getNombre() +
                                    " es nulo."
                    );
                }
                try {
                    festival.realizarSoundcheck(cantante);

                } catch (EspectaculoCortoException e) {

                    System.out.println(
                            "Error en soundcheck: " + e.getMessage()
                    );
                }
                try {

                    cantante.asignarEscenario("Escenario Principal");

                } catch (NullPointerException e) {

                    System.out.println(
                            "Error al asignar escenario: " +
                                    e.getMessage()
                    );
                }
                try {

                    cantante.liquidarHonorarios(21);

                } catch (IllegalArgumentException e) {

                    System.out.println(
                            "Error en impuestos: " + e.getMessage()
                    );
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Error numerico en los datos del cantante."
                );

            } catch (Exception e) {

                System.out.println(
                        "Error general: " + e.getMessage()
                );

            } finally {

                System.out.println(
                        "Finalizo el procesamiento del artista."
                );
            }
        }
        System.out.println("Festival procesado completamente.");

    }
}
