package Excepciones;

//Construye un programa que pida al usuario una cadena de texto.
// acto seguido, solicitra la posición de un carácter de la cadena
// de texto e imprimelo. Controla las posibles excepciones inválidas
// de la cadena.

import java.util.Scanner;

public class Caracter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Por favor, introduce una cadena de texto: ");
            String texto = sc.nextLine();

            System.out.print("Introduce la posición del carácter que deseas obtener: ");
            int posicion = Integer.parseInt(sc.nextLine());

            if (posicion < 0 || posicion > texto.length()){
                throw new Exception("la posición ingresada es mayor que la longitud el texto, o has introducido un numero negativo");
            }

            char caracter = texto.charAt(posicion);
            System.out.printf("El carácter en la posición " + posicion + " es: " + caracter + "\n");

        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número entero como posición");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Fin del programa");
        }
    }
}







