package MasEjercicios.m_Legislador;

/**
 *
 * @author nccasares
 */
public class Diputado extends Legislador {

    public Diputado(String nombre, String apellido, String dni, int edad, String provinciaQueRepresenta, String camara, boolean nacional, int anhosDeResidencia) {
        super(nombre, apellido, dni, edad, provinciaQueRepresenta, camara, nacional, anhosDeResidencia);
    }

    public String getCamaraEnQueTrabaja() {
        // IMPLEMENTACIÓN ESPECÍFICA [...]
        return camara;
    }
}
