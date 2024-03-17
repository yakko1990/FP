package Sintesis.Ej3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nccasares
 */
public class Ej3_Sintesis {

    Stack<String> pila = new Stack<>();

    public static void main(String[] args) {
        Ej3_Sintesis obj = new Ej3_Sintesis();
        obj.rellenarPila();
        obj.listarPila();
    }

    private void rellenarPila() {
        Scanner sn = new Scanner(System.in);
        String leido;
        System.out.println("Introduzca cadenas de caracteres (Pulse Enter para salir)");
        do {
            leido = sn.nextLine();
            if (!leido.equals("")) {
                pila.push(leido);
            }
        } while (!leido.equals(""));
    }

    private void listarPila() {
        int tamanho = pila.size();
        for (int i = 0; i <= tamanho - 1; i++) {
            System.out.println("Cadena " + (tamanho - 1 - i) + ": " + pila.pop());
        }
    }
}
