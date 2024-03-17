/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_10_excepciones.Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoExcep {

    public static void main(String[] args) {

        int c = 1, opcion = 0; //Contador y registro de opcion

        //Objeto lector
        Scanner scan = new Scanner(System.in);

        //Creamos un arraylist de empleados
        ArrayList<Empleado> emp = new ArrayList<Empleado>();

        //Bucle de menú
        do {
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    emp.add(Operaciones.recogerDatosEmpleado(c));
                    c++;
                    break;
                case 2:
                    listarEmpleados(emp);
                    break;
            }
        } while (opcion != 3);
    }

    private static void menu() {
        //Encabezado
        System.out.println("--------------------");
        System.out.println("Menú de tema_10_excepciones.Empleados");
        System.out.println("--------------------");

        System.out.println("Seleccione lo que desea realizar:");
        System.out.println("1: Anhadir empleado");
        System.out.println("2: Listar empleados existentes");
        System.out.println("3: Salir");
    }

    private static void listarEmpleados(ArrayList<Empleado> emp) {
        //Listamos de tema_10_excepciones.Empleados
        System.out.println("----------------------");
        System.out.println("tema_10_excepciones.Empleados comprobados");
        System.out.println("----------------------");
        for (int i = 0; i < emp.size(); i++) {
            System.out.println("Nombre Empleado " + (i + 1) + ": " + emp.get(i).getNombre());
            System.out.println("DNI: " + emp.get(i).getDni());
            System.out.println("Edad: " + emp.get(i).getEdad());
            System.out.println("Salario: " + emp.get(i).getSalario());
            System.out.println("-----------------------------------");
        }
    }
}