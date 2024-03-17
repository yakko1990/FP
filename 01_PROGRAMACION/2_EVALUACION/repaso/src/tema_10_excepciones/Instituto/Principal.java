/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_10_excepciones.Instituto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author nuria
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ArrayList<Miembro> miembros = new ArrayList<>();
        ArrayList<Especialidad> esp = new ArrayList<>();
        esp.add(new Especialidad(0, "Informática"));
        esp.add(new Especialidad(1, "Sanidad"));

        //Bucle de menú
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int opcionAltas;
                    do {
                        menuAltas();
                        opcionAltas = sc.nextInt();
                        switch (opcionAltas) {
                            case 1:
                                miembros.add(Operaciones.altaAlumno());
                                break;
                            case 2:
                                miembros.add(Operaciones.altaProfesor(esp));
                                break;
                        }
                    } while (opcionAltas != 3);
                    break;
                case 2:
                    System.out.println("Introduzca el DNI del miembro a eliminar:");
                    sc = new Scanner(System.in);
                    String dniElim = sc.nextLine();
                    for (Miembro m : miembros) {
                        if (m.getDNI().equals(dniElim))
                            miembros.remove(m);
                    }
                    break;
                case 3:
                    menuConsultas();
                    Operaciones.consultas(sc.nextInt(), miembros);
                    break;
                case 4:
                    Operaciones.edadMediaProfesorado(miembros);
                    break;
                case 5:
                    Operaciones.notaMediaDAM(miembros);
                    break;
                case 6:
                    Operaciones.sueldoMedioProfesorado(miembros);
                    break;
            }
        } while (opcion != 7);
    }

    private static void menu() {
        //Encabezado
        System.out.println("--------------------");
        System.out.println("Menú de Instituto");
        System.out.println("--------------------");

        System.out.println("Seleccione lo que desea realizar:");
        System.out.println("1: Altas");
        System.out.println("2: Bajas");
        System.out.println("3: Listados de alumnos y profesores");
        System.out.println("4: Consulta 1: Edad media del profesorado");
        System.out.println("5: Consulta 2: Nota media del ciclo DAM");
        System.out.println("6: Consulta 3: Salario medio del profesorado");
        System.out.println("7: Salir");
    }

    private static void menuAltas() {
        //Encabezado
        System.out.println("--------------------");
        System.out.println("Menú de Altas");
        System.out.println("--------------------");

        System.out.println("¿Desea dar de alta un alumno o un profesor?");
        System.out.println("1: Alumno");
        System.out.println("2: Profesor");
        System.out.println("3: Salir");
    }

    private static void menuConsultas() {
        //Encabezado
        System.out.println("--------------------");
        System.out.println("Menú de Consultas");
        System.out.println("--------------------");

        System.out.println("¿Desea consultar alumnos o profesores?");
        System.out.println("1: Alumnos");
        System.out.println("2: Profesores");
    }

}
