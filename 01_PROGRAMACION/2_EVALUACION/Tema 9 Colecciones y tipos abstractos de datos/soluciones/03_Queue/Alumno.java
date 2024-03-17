/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
package Sintesis.Ej5;

/**
 *
 * @author nuria
 */
public class Alumno {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nacionalidad=" + nacionalidad + '}';
    }
}
