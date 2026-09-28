package ejercitacion9;
public class Festival {

    public void realizarSoundcheck(Cantante cantante)
            throws EspectaculoCortoException {

        if (cantante.getCantidadCanciones() < 5) {

            throw new EspectaculoCortoException(
                    "El cantante " + cantante.getNombre()
                            + " tiene menos de 5 canciones programadas."
            );
        }

        System.out.println(
                "Soundcheck aprobado para " + cantante.getNombre()
        );
    }
}