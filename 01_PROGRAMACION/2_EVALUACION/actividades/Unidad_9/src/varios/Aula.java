package varios;

import java.util.HashMap;
import java.util.Scanner;

// Se desea desarrollar un programa que permita gestionar la información
// de los alumnos de unma clase. el programa comenzará pidiendo el número
// de alumnos a gestionar y  acto seguuido, pedirá los datos de los
// alumnos De cada alumno se almacenará apellido1, apellido2, nombre
// y nacionalidad en objetos de la clase alumno que también deberá
// desarrollar. No es relevante de que alumno  se introduzcan antes
// los datos , pero si que queden almacenados en el orden establecido
// por apellido1 apellido2 y nombre. Una vez recogidos los datos de
// todos los alumnos, el programa mostrará un resumen ordenado de los
// datos recogidos. Implementa el programa indicado seleccionando la
// colección que mas se ajuste a lo requerido.
//
public class Aula {

    HashMap<Integer, Alumno> alumnos = new HashMap<>();

    private int idSiguiente = 0;
    public void insertarContacto (Alumno a) {
        if (!alumnos.containsValue(a)) {
            alumnos.put(idSiguiente, a);
            idSiguiente++;
        } else
            System.out.println("El contacto ya existe");
    }



    public void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número de alumnos que desea gestionar? ");
        String numAlumnos = sc.next();
        System.out.println("Escribe su primer apellido ");
        String a1 = sc.next();
        System.out.println("Escribe su segundo apellido ");
        String a2 = sc.next();
        System.out.println("Escribe su nombre ");
        String nome = sc.next();
        System.out.println("Escribe su nacionalidad ");
        String nac = sc.next();



    }

}
class Alumno{

    private String apellido1;
    private String apellido2;
    private String nombre;
    private String nacionalidad;

    public Alumno(String apellido1, String apellido2, String nombre, String nacionalidad) {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}