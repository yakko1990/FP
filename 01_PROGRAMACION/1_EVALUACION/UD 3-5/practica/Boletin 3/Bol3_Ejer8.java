import java.util.Scanner;

public class Bol3_Ejer8 {

    /**
     * Hallar el factorial de un número
     * 
     * @param numero valor dado
     * @return resultado que es la multiplicacion de cada uno de los numeros
     *         recorridos en el bucle y que nos da el factorial
     */

    static double factorial(double numero) {
     //   Scanner sc = new Scanner(System.in);

        double resultado;

        // while (numero < 0) {
        //     System.out.println("Error, Introduce un número positivo");
        //     numero = sc.nextDouble();
        // }

        resultado = 1;
        for (double contador = numero; contador != 0; contador--) {
            resultado = resultado * contador;
        }
        return resultado;
    }

    /**
     * Halla el binomio de newton
     * 
     * @param m primer valor
     * @param n segundor valor
     * @return resultado, que es la division entre binomio1 y binomio2, el cual nos
     *         da el binomio de newton
     */

    static double binomionew(double m, double n) {
        Scanner sc = new Scanner(System.in);
        double binomio1;
        double binomio2;
        double resultado;

        binomio1 = factorial(m);

        binomio2 = factorial(n) * factorial(m - n);

        resultado = binomio1 / binomio2;
        return resultado;

    }

    static public void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double m, n;

        System.out.println("Introduce dos números");
        m = sc.nextDouble();

        while (m < 1) {

            System.out.println("Error, introduce otro número");
            m = sc.nextDouble();
        }

        n = sc.nextDouble();
        while (n < 1 || n > m) {

            System.out.println("Error, introduce otro número");
            n = sc.nextDouble();
        }

        System.out.println(binomionew(m, n));

    }

}
