package Excepciones.Excepciones_instituto;

import java.time.LocalTime;
import java.util.Date;

public class Profesor extends Persona implements Bonificacion{
    String tipoJornada;
    double Salario;
    String especialidadImpartida;

    public Profesor(String dni, String nombre, int edad, String direccion, Date fechaIncorporacion, String tipoJornada, double salario, String especialidadImpartida) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.tipoJornada = tipoJornada;
        this.Salario = salario;
        this.especialidadImpartida = especialidadImpartida;
    }

    public Profesor() {
        this.tipoJornada = "parcial/completa";
        this.Salario = 0;
        this.especialidadImpartida = "especialidadImpartida";
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public String getEspecialidadImpartida() {
        return especialidadImpartida;
    }

    public void setEspecialidadImpartida(String especialidadImpartida) {
        this.especialidadImpartida = especialidadImpartida;
    }

    @Override
    public String toString() {
        String dni = this.getDni();
        String nombre = this.getNombre();
        int edad = this.getEdad();
        String direccion = this.getDireccion();
        Date fechaIncorporacion = this.getFechaIncorporacion();
        return "Profesor{" +
                "tipoJornada='" + tipoJornada + '\'' +
                ", Salario=" + Salario +
                ", especialidadImpartida='" + especialidadImpartida + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", fechaIncorporacion='" + fechaIncorporacion + '\'' +
                '}';
    }

    @Override
    public double aplicarBonificacion(double importe) {

        //mas de 3 años +15%
        return 0;
    }
}
