package MasEjercicios.CuentaTitular;

import MasEjercicios.Persona;

/*
 * Clase Titular:
 * Atributos: nombre, fecha de nacimiento, DNI, sexo y direccion.
 * Asignar valores por defecto a todos los atributos según su tipo.
 * Sexo será hombre por defecto, se deberá usar una constante para ello.
 * Constructores:
 * Uno por defecto.
 * Uno que reciba nombre, fecha de nacimiento y sexo, resto por defecto.
 * Otro con todos los atributos como parámetro.
 * Métodos:
 * boolean esMayorDeEdad()
  * void comprobarSexo(char sexo): comprueba que el sexo introducido sea correcto.
  Si es incorrecto, asignará H.
 * toString()
 *
 * */
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Titular {

    final static char SEXO = 'H';
    private String nombre;
    private LocalDate fechaNacimiento;
    private String DNI;
    private char sexo;
    private String direccion;

    public Titular() {
        this("", LocalDate.of(1900, Month.JANUARY, 01), SEXO);
    }

    public Titular(String nombre, LocalDate fechaNacimiento, char sexo) {
        this(nombre, fechaNacimiento, sexo, "", "");
    }

    public Titular(String nombre, LocalDate fechaNacimiento, char sexo, String direccion, String DNI) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.DNI = DNI;
        comprobarSexo();
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private void comprobarSexo() {
        if (sexo != SEXO && sexo != 'M') {
            this.sexo = SEXO;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String sexo;
        if (this.sexo == SEXO) {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Datos personales:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Fecha de nacimiento: " + fechaNacimiento.format(formatter) + "\n"
                + "DNI: " + DNI + "\n"
                + "Direccion: " + direccion + "\n";
    }
}

class Principal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Introduce la fecha de nacimiento (Formato dd/MM/yyyy)");
        LocalDate fechaNac = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy") );

        sc = new Scanner(System.in);
        System.out.println("Introduce el sexo");
        char sexo = sc.nextLine().charAt(0);

        sc = new Scanner(System.in);
        System.out.println("Introduce la dirección");
        String dir = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Introduce el DNI");
        String dni = sc.nextLine();

        Titular t = new Titular(nombre, fechaNac, sexo, dir, dni);

        System.out.println("** Datos:");
        MuestraMayorDeEdad(t);
        System.out.println(t.toString());
    }

    public static void MuestraMayorDeEdad(Titular t) {

        if (t.esMayorDeEdad()) {
            System.out.println("La persona titular es mayor de edad");
        } else {
            System.out.println("La persona titular no es mayor de edad");
        }
    }
}
