package MasEjercicios.m_Legislador;


/**
 *
 * @author nccasares
 */
public class Senador extends Legislador {

    public Senador(String nombre, String apellido, String cedula, int edad, String provinciaQueRepresenta, String camara, boolean nacional, int anhosDeResidencia) {
        super(nombre, apellido, cedula, edad, provinciaQueRepresenta, camara, nacional, anhosDeResidencia);
    }

    public String getCamaraEnQueTrabaja() {
        // IMPLEMENTACIÓN ESPECÍFICA [...]
        return camara;
    }
}
