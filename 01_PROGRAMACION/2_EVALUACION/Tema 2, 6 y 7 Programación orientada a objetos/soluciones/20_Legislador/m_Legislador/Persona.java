package MasEjercicios.m_Legislador;

/**
 *
 * @author nccasares
 */
public class Persona {
    protected String nombre, apellidos, dni;
    protected int edad;

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public void setNombre(String dato) {
        nombre = dato;
    }

    public void setApellidos(String dato) {
        apellidos = dato;
    }

    public void setDni(String dato) {
        dni = dato;
    }

    public void setEdad(int dato) {
        edad = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getPersonaInfo() {
        return "Nombre: ".concat(nombre).concat(" ").concat(apellidos).concat("\nEdad: ").concat(String.valueOf(this.edad)).concat("\nDNI: ").concat(dni);
    }
}
