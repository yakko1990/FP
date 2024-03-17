/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3_Sintesis;

/**
 *
 * @author nccasares
 */
import java.util.Scanner;

public class E3_Sintesis {

    public static void pedirAnho() throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el año:");
        int a = sc.nextInt();
        if (a < 0) {
            throw new IllegalArgumentException("***El año no puede ser negativo");
        }
    }

    public static void main(String[] args) {
        try {
            pedirAnho();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
