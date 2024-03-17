package MasEjercicios.g_Empleados;

import java.util.Date;

public class Operario extends Empleado {
    private String area;
    private String nave;

    public Operario(String nombre, double salario, Date fechaInc, String area, String nave) {
        super(nombre, salario, fechaInc);
        this.area = area;
        this.nave = nave;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNave() {
        return nave;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    public String toString() {
        return super.toString() + "|| Área: " + area + ", Nave: " + nave;
    }
}
