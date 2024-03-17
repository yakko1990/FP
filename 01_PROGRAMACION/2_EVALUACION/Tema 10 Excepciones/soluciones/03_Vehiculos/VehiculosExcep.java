/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiculosExcep {

    /**
     * Implementa un programa que almacene 5 vehiculos en una lista.
     * De cada vehiculo se almacenara color, modelo, matricula y año de fabricacion
     * Cada vez que recoja una matricula, deberá verificar que tenga el formato adecuado (longitud=7 y 3 letras al final)
     * En caso de que la matricula no cumpla alguna de las 2 condiciones, se lanzara una excepcion.
     * En caso de que el color no sea valido (rojo azul blanco gris o negro) tambien se lanzara una excepcion que sera capturada en el programa principal.
     * Las comprobaciones no deberán ser realizadas en el programa principal.
     * Las excepciones deberan ser personalizadas y se empleara para ello una unica clase en la que, en función del codigo de error que reciba, se generara un mensaje de error u otro.
     */
    public static void main(String[] args) {
        int c = 1; //Contador
        String m, mod, col = "";
        int anho;

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        //Creamos el objeto lector
        Scanner scan = new Scanner(System.in);


        System.out.println("--------------------------------");
        System.out.println("Almacenamos cinco Vehiculos");
        System.out.println("--------------------------------");

        //Bucle de insercion de vehiculos
        do {
            try {
                System.out.println("Introduzca modelo " + c + ": ");
                mod = scan.next();
                System.out.println("Introduzca color " + c + ": ");
                col = scan.next();
                System.out.println("Introduzca matrícula " + c + ": ");
                m = scan.next();
                System.out.println("Introduzca anho de fabricacion " + c + ": ");
                anho = scan.nextInt();
                //Agregamos un objeto matricula al array
                vehiculos.add(new Vehiculo(col, mod, m, anho));
                c++;
            } catch (ExVehiculo e) {
                //Devolvemos el mensaje de error que corresponda
                System.out.println(e.getMessage());
            }

        } while (c != 5);

        //Listamos nuestros vehiculos
        System.out.println("----------------------");
        System.out.println("Vehiculos");
        System.out.println("----------------------");
        for (int i = 0; i < vehiculos.size(); i++)
            System.out.println("Vehiculo " + (i + 1) + ": " + vehiculos.get(i).toString());
        System.out.println("----------------------");
    }
}
