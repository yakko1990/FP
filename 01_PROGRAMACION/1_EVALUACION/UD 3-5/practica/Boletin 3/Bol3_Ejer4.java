import java.util.Scanner;

public class Bol3_Ejer4 {

    /**
     * Progresion geometrica de los valores
     * 
     * @param x primer valor
     * @param n segundo valor
     * @return resultado de la suma de cada una de las potencias recorridas en el
     *         bluce
     */

    static double progresion(double x, double n) {

        double resultado = 0;

        if (n < 0) {

            for (double p = 0; p >= n; p--) {
               // System.out.println((Bol3_Ejer3.potencia(x, p)));
                resultado = resultado + Bol3_Ejer3.potencia(x, p);
            }
        } else {

            if (n > 0) {
                for (double p = 0; p <= n; p++) {
               //     System.out.println((Bol3_Ejer3.potencia(x, p)));
                    resultado = resultado + Bol3_Ejer3.potencia(x, p);
                }
            } else {
                resultado = resultado + Bol3_Ejer3.potencia(x, n);
            }

        }

        return resultado;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n, x;

        System.out.println("Progresion geometrica");
        System.out.println("Introduce dos número");
        x = sc.nextDouble();
        n = sc.nextDouble();
        System.out.println("");
        System.out.println("\nResultado total: " + progresion(x, n));

    }

}
