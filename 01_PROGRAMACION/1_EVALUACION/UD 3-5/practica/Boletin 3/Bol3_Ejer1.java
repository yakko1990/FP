import java.util.Scanner;

public class Bol3_Ejer1 {

    /**
     * Imprime lineas en blanco
     * 
     * @param numero numero de lineas a imprimir
     */

    static void lineas(int numero) {
        for (int i = 0; i < numero; i++)
            System.out.printf("\n");
    }

    /**
     * Identifica numero par
     * 
     * @param numero valor a comprobar
     * @return true si es par false si es impar
     */
    static boolean par(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Identifica numero negativo o positivo
     * 
     * @param numero valor introducido
     */

    static char positivonegativo(int numero) { // char, no void
        char positvo = 'P';
        char negativo = 'N';

        return numero > 0 ? positvo : negativo;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        // a
        System.out.println("lineas en blanco");
        lineas(numero);
        // b
        System.out.println("¿Es par?");
        System.out.println(par(numero));
        // c
        System.out.println("¿Es positvo o negativo?");

        System.out.println(positivonegativo(numero));

    }

}
