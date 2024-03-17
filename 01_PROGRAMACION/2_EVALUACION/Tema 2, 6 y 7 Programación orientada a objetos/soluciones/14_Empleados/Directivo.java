package MasEjercicios.g_Empleados;

import java.util.Date;

public class Directivo extends Empleado {
    private String cargo;
    private String departamento;

    public Directivo(String nombre, double salario, Date fechaInc, String cargo, String departamento) {
        super(nombre, salario, fechaInc);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + "|| Cargo: " + cargo + ", Departamento: " + departamento;
    }
}
