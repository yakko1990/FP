package Sintesis.Ej3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


public class Ej3_sinString {
    Stack<Character> pila = new Stack<>();

    public static void main(String[] args) throws IOException {
        Ej3_sinString obj = new Ej3_sinString();
        obj.rellenarPila();
        obj.mostrarPila();
    }

    public void rellenarPila() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char leido;
        System.out.println("Introduzca cadenas de caracteres (Pulse Espacio + Enter para salir)");
        do {
            leido = (char) br.read();
            if (leido != 32 && leido != 10) {
                pila.push(leido);
            }
        } while (leido != 32);
    }

    public void mostrarPila() {
        int tamanho = pila.size();
        for (int i = 0; i <= tamanho - 1; i++) {
            System.out.println("Cadena " + (tamanho - 1 - i) + ": " + pila.pop());
        }
    }
}
