package MasEjercicios.g_Empleados;

import java.util.Date;

public class Empleado {
    private String nombre;
    private double salario;
    private Date fechaInc;

    public Empleado(String nombre, double salario, Date fechaInc) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInc = fechaInc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaInc() {
        return fechaInc;
    }

    public void setFechaInc(Date fechaInc) {
        this.fechaInc = fechaInc;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario + ", Fecha Incorporación: " + fechaInc;
    }
}
