import java.util.Scanner;

public class Bol3_Ejer5 {

    /**
     * Comprueba si un número es primo
     * 
     * @param numero valor a comprobar
     * @return Si es primo retorna true y si no lo es false
     */

    static boolean primo(int numero) {

        int divisor = 0;
        int contador = 0;
        int resto;

        do {
            divisor++;
            resto = numero % divisor;

         //   contador = resto == 0 ? contador++ : contador;

            if (resto == 0) {
                contador = contador + 1;
            }
        } while (divisor != numero);

        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numero;
        boolean a;
        boolean b = true;

        System.out.println("Introduce un número");
        numero = sc.nextInt();
        System.out.println("Números primos anteriores a " + numero);
        System.out.println("--------------------");

        for (int c = 1; c < numero; c++) {
            // a = primo(c);
            if (primo(c)) {
                System.out.printf("%3d -", c);
            }
        }

        System.out.println("");

    }

}
