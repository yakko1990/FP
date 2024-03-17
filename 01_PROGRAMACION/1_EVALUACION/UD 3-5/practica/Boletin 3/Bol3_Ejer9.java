import java.util.Scanner;

public class Bol3_Ejer9 {

    /**
     * Quiniela aleatoria, saca "1", "2" o "X" dependiendo del resultado
     * 
     * @return "1" si equipo1 es mayor, "2" si equipo2 es mayor, y "X" si equipo1 y
     *         equipo2 tienen el mismo valor
     */

    static char quiniela() {

        int equipo1 = 0;
        int equipo2 = 0;
        char resultado = 0;

        double random;

        random = (Math.random() * 100 + 0);
        equipo1 = (int) random;

        random = (Math.random() * 100 + 0);
        equipo2 = (int) random;

        if (equipo1 > equipo2) {
            resultado = '1';
            return resultado;

        } else {

            if (equipo1 < equipo2) {

                resultado = '2';
                return resultado;
            } else {

                resultado = 'X';
                return resultado;

            }
        }

    }

    /**
     * Comprobar la probabilidad de sacar "1", "2", o "X" dependiendo del numero
     * aleatorio
     * 
     * @return "1", si el numero está entre 1 y 60, "X" si está entre 61 y 85", y
     *         "2" si está entre 86 y 100
     */

    static char quinielaponderada() {

        int numero = 0;
        double random;
        char resultado;

        random = (Math.random() * 100 + 1);
        numero = (int) random;

     //   System.out.println("Número: " + numero);

        if (numero >= 1 && numero <= 60) {

            resultado = '1';
            return resultado;
        } else {
            if ( numero <= 85) {
                resultado = 'X';
                return resultado;

            } else {
                resultado = '2';
                return resultado;
            }

        }

    }

    public static void main(String args[]) {

        // a

        System.out.println(" Quiniela Aleatoria");
        for (int partidos = 1; partidos <= 14; partidos++) {

            System.out.printf("\n Partido %2d - Resultado: %1c \n", partidos, quiniela());

        }

        System.out.println("");

        // B

        System.out.println("Quiniela Ponderada");
        System.out.println(quinielaponderada());

    }

}
