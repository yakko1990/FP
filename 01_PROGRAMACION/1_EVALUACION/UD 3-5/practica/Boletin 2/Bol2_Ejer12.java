import java.util.Scanner;

public class Bol2_Ejer12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
         * Programa que dé el resultado de la suma de números pares por una parte e
         * impares por otro entre 0 y N (N lo decide el usuario). Debe áealózaáse ton un
         * únóto butle.
         */

        int n;

        int sumapar = 0;
        int sumaimpar = 0;
        int contadorimpar;

        System.out.println("Introduce un número");
        n = sc.nextInt();

        // Apartado a
        if (n < 1) {

            do {
                System.out.println("Número no válido");
                n = sc.nextInt();
            } while (n < 1);

        }

        for (int c = 0; c < n; c = c + 2) {

            sumapar = sumapar + c;

        }
        System.out.println("suma de pares (a) " + sumapar);

        // Apartado b

        for (int c = 1; c <= n; c = c + 2) {

            sumaimpar = sumaimpar + c;

        }
        System.out.println("suma de impares (b) " + sumaimpar);

        // Apartado c
        sumapar = 0;
        sumaimpar = 0;
        contadorimpar = 0;

        for (int c = 0; c < n; c = c + 2) {

            sumapar = sumapar + c; // acumulador pares

            contadorimpar = c + 1; // contador impares

            sumaimpar = sumaimpar + contadorimpar; // acumulador impares

        }

        System.out.println("suma de pares " + sumapar);
        System.out.println("suma de impares " + sumaimpar);

    }
}
