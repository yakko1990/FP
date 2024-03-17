import java.util.Scanner;

public class Bol2_Ejer11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Los números del 1 al 50.

        for (int a = 1; a < 51; a++) {
            System.out.println("Número: " + a);
        }

        System.out.println("\n");

        // En orden inversa del 50 al 1

        for (int b = 50; b > 0; b = b - 1) {
            System.out.println("Número: " + b);

        }

        System.out.println("\n");

        // Los números pares menores que 20 por orden creciente (2, 4, 6, 8, ... 16, 18)

        for (int c = 2; c < 20; c = c + 2) {

            System.out.println("Pares: " + c);
        }

        System.out.println("\n");

        // Los números impares entre lo 90 y el 130 por orden creciente

        for (int d = 91; d < 130; d = d + 2) {

            System.out.println("Impares: " + d);
        }

        System.out.println("\n");

        // Los múltiplos de 5 entre el 70 y el 25 por orden decreciente (70, 65, ...
        // 30,25).

        for (int e = 70; e > 20; e = e - 5) {

            System.out.println("Multiplos de 5: " + e);
        }
    }
}
