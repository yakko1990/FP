package Excepciones.EmpleadosReparto;

public abstract class Empleado extends ExcEmpleados {
    private String nombre;
    private int edad;
    private double salario;
    public final double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) throws Exception {
        comprobarNombre(nombre);
        comprobarEdad(edad);
        comprobarSalario(salario);
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", edad= " + edad + ", salario= " + salario + ", ";
    }

    public abstract boolean plus();
}
