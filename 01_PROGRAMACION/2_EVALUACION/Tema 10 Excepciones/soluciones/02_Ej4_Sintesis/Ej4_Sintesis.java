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
public class Ej4_Sintesis {

    public static void main(String[] args) {
        try {
            try {
                imprimirCaracter();
            } catch (E4_PosicionIncorrecta ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException ex) {
                throw new E4_ArgumentoIncorrecto("ERROR AL INTRODUCIR DATOS: TIPO DE DATO INCORRECTO");
            }
        } catch (E4_ArgumentoIncorrecto ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void imprimirCaracter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        String cad = sc.nextLine();
        System.out.println("Introduzca una posición:");
        int pos = sc.nextInt();
        if (pos < 0 || pos > cad.length()-1) {
            throw new E4_PosicionIncorrecta("ERROR POSICIÓN INCORRECTA " + pos + " en la cadena: " + cad);
        }
        System.out.println("El carácter seleccionado es: " + cad.charAt(pos));
    }

}
