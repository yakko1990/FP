/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintesis.Ej5;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class Ej5_Sintesis {

    private PriorityQueue<Alumno> alumnos = new PriorityQueue<>(Comparator.comparing(Alumno::getApellido1).thenComparing(Alumno::getApellido2).thenComparing(Alumno::getNombre));
    private Scanner sc = new Scanner(System.in);

    public void recogerDatos() {
        System.out.println("¿Cuántos alumnos desea almacenar?");
        int numAlumnos = sc.nextInt();
        sc = new Scanner(System.in);

        for (int i = 0; i < numAlumnos; i++) {
            Alumno al = new Alumno();
            System.out.println("Introduzca nombre:");
            al.setNombre(sc.nextLine());
            System.out.println("Introduzca apellido 1:");
            al.setApellido1(sc.nextLine());
            System.out.println("Introduzca apellido 2:");
            al.setApellido2(sc.nextLine());
            System.out.println("Introduzca nacionalidad:");
            al.setNacionalidad(sc.nextLine());
            alumnos.add(al);
        }
    }
    
    public void mostrarDatos(){
        for (Alumno al: alumnos) {
            System.out.println(al.toString());
        }
    }
    
    public static void main(String[] args) {
        Ej5_Sintesis obj = new Ej5_Sintesis();
        obj.recogerDatos();
        obj.mostrarDatos();
    }
}
