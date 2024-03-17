package MasEjercicios.g_Empleados;

import java.util.Date;

public class Tecnico extends Operario {
    private int seccion;

    public Tecnico(String nombre, double salario, Date fechaInc, String area, String nave, int seccion) {
        super(nombre, salario, fechaInc, area, nave);
        this.seccion = seccion;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String toString() {
        return super.toString()+"|| Sección: "+seccion;
    }
}
