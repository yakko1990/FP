import java.util.Scanner;

public class Bol3_Ejer3 {

    /**
     * Potencia de los valores
     * 
     * @param base      primer valor
     * @param exponente segundo valor
     * @return resultado, que es el valor de la potencia se se cumplen las
     *         condiciones
     */

    static double potencia(double base, double exponente) {

        double contador = 0;
        double resultado = 1;

        if (exponente < 0) {
            exponente = -1 * exponente;
            base = 1 / base;
        }
        if (exponente == 0) {
            contador = -1;
            base = 1;
        }

        do {
            contador++;
            resultado = resultado * base;
        } while (contador != exponente);

        return resultado;

    }

    /**
     * Muestra cada una de las potencias de un número
     * 
     * @param base      primer valor
     * @param exponente segundo valor
     */

    static void potencia2(double base, double exponente) {

        if (exponente < 0) {
            for (double n = 0; n >= exponente; n--) {
                System.out.println(
                        "Potencia de " + base + " elevado a " + n + " es: " + Bol3_Ejer3.potencia(base, exponente));
            }
        } else {

            if (exponente > 0) {
                for (double n = 0; n <= exponente; n++) {
                    System.out.println(
                            "Potencia de " + base + " elevado a " + n + " es: " + Bol3_Ejer3.potencia(base, n));
                }
            } else {

                System.out.println("Potencia de " + base + " elevado a " + exponente + " es: "
                        + Bol3_Ejer3.potencia(base, exponente));
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // a
        System.out.println("Introduce base y exponente");
        double base;
        double exponente;
        base = sc.nextDouble();
        exponente = sc.nextDouble();

        System.out.println(potencia(base, exponente));

        // b
        System.out.println("");

        potencia2(base, exponente);

    }

}
