package MasEjercicios.m_Legislador;

/**
 *
 * @author nccasares
 */
public abstract class Legislador extends Persona{

    protected String provinciaQueRepresenta, camara;
    protected boolean nacional;
    protected int anhosDeResidencia;

    public Legislador(String nombre, String apellido, String dni, int edad, String provinciaQueRepresenta, String camara, boolean nacional, int anhosDeResidencia) {
        super(nombre, apellido, dni, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.camara = camara;
        this.nacional = nacional;
        this.anhosDeResidencia = anhosDeResidencia;
    }

    public void setProvincia(String dato) {
        provinciaQueRepresenta = dato;
    }

    public void setCamara(String dato) {
        camara = dato;
    }

    public void setNacional(boolean dato) {
        nacional = dato;
    }

    public void setAnhosResidencia(int dato) {
        anhosDeResidencia = dato;
    }

    public String getProvincia() {
        return provinciaQueRepresenta;
    }

    public String getNacional() {
        if (nacional == true) {
            return "Si";
        } else {
            return "No";
        }
    }

    abstract public String getCamaraEnQueTrabaja();

    @Override
    public String toString() {
        return getPersonaInfo().concat("\nProvincia que representa: ").concat(provinciaQueRepresenta).concat("\n¿Es de nacionalidad española?: ").concat(getNacional())
                .concat("\nCámara en que trabaja: ").concat(getCamaraEnQueTrabaja()).concat("\n");
    }
}
