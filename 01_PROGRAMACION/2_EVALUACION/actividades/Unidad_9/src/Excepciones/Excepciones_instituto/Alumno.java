package Excepciones.Excepciones_instituto;

import java.time.LocalTime;
import java.util.Date;

public class Alumno extends Persona implements Bonificacion{

    private String ciclo;
    private double mediaNotas;
    private double importeMatricula;

    public Alumno(String dni, String nombre, int edad, String direccion, Date fechaIncorporacion, String ciclo, double mediaNotas, double importeMatricula) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.ciclo = ciclo;
        this.mediaNotas = mediaNotas;
        this.importeMatricula = importeMatricula;
    }

    public Alumno() {
        this.ciclo="ciclo";
        this.mediaNotas= 0;
        this.importeMatricula=0;

    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }

    @Override
    public String toString() {
        String dni = this.getDni();
        String nombre = this.getNombre();
        int edad = this.getEdad();
        String direccion = this.getDireccion();
        Date fechaIncorporacion = this.getFechaIncorporacion();
        return "Alumno{" +
                "ciclo='" + ciclo + '\'' +
                ", mediaNotas=" + mediaNotas +
                ", importeMatricula=" + importeMatricula +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", fechaIncorporacion='" + fechaIncorporacion + '\'' +
                '}';
    }

    @Override
    public double aplicarBonificacion(double importe) {

        Date fechaActual = new Date();
            //mas de dos años un 10% menos

        return 0;
    }
}
