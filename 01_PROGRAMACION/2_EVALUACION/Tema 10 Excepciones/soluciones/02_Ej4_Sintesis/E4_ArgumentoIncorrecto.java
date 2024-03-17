package Ej4_Sintesis;

import java.util.InputMismatchException;

public class E4_ArgumentoIncorrecto extends InputMismatchException {
    public E4_ArgumentoIncorrecto(String s) {
        super(s);
        //System.out.println("***SE HA INTRODUCIDO UN FORMATO DE DATO INCORRECTO");
    }
}
