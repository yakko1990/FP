/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4_Sintesis;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Ej4_Sintesis_sinExcepcionesPropias {

    public static void main(String[] args) {
        try {
            imprimirCaracter();
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("ERROR POSICIÓN INCORRECTA: " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("ERROR AL INTRODUCIR DATOS: TIPO DE DATO INCORRECTO");
            //ex.printStackTrace();
        }
    }

    public static void imprimirCaracter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        String cad = sc.nextLine();
        System.out.println("Introduzca una posición:");
        int pos = sc.nextInt();
        System.out.println("El carácter seleccionado es: " + cad.charAt(pos));
    }

}
