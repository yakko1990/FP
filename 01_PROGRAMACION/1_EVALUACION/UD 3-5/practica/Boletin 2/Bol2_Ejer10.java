import java.util.Scanner;

public class Bol2_Ejer10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Utilizando do-while
        // El acumulador es igual a (acumulador=acumulador + número de vueltas) o
        // dependiendo de la condición junto con el contador

        /*
         * int n = 0; int suma = 0;
         * 
         * do {
         * 
         * n++; // System.out.println("contador"+contador); suma = suma + n; //
         * System.out.println("suma"+suma);
         * 
         * } while (suma < 10000);
         * 
         * System.out.println("Número que cumple la condición: " + n);
         * System.out.println("Resultado de la suma de los "+n+" números es "+suma );
         */

        // Utilizando for

        int n = 0;
        for (int s = 0; s <= 10000; s = s + n) {
            n++;
        }
        System.out.println("Número para el que se cumple la suma: " + n);
    }
}
