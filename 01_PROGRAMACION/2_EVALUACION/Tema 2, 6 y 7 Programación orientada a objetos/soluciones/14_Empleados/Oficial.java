package MasEjercicios.g_Empleados;

import java.util.Date;

public class Oficial extends Operario {
    private String lineaFab;

    public Oficial(String nombre, double salario, Date fechaInc, String area, String nave, String lineaFab) {
        super(nombre, salario, fechaInc, area, nave);
        this.lineaFab = lineaFab;
    }

    public String getLineaFab() {
        return lineaFab;
    }

    public void setLineaFab(String lineaFab) {
        this.lineaFab = lineaFab;
    }

    public String toString() {
        return super.toString() + "|| Linea Fabricación: " + lineaFab;
    }
}
