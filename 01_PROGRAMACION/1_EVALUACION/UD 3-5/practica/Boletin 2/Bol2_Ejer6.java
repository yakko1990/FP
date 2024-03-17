import java.util.Scanner;

public class Bol2_Ejer6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // apartado 1
        /*
         * int a1, a2, a3, a4, a5; int media;
         * 
         * System.out.println("Introduce 5 números de los cuales haremos su media");
         * a1=sc.nextInt(); a2=sc.nextInt(); a3=sc.nextInt(); a4=sc.nextInt();
         * a5=sc.nextInt(); media=(a1+a2+a3+a4+a5)/5;
         * 
         * System.out.println("La media de los números es "+media);
         */

        // apartado 2

        double suma = 0;
        int contador = 0;
        double contf;
        double media;

        System.out
        .println("Introduce los números que creas necesarios y cero para obtener su suma y media");

        for (double n = 1; n != 0; n = n + 0) {
            /**
             * Se inicializa "n" como 1 porque si ponemos "0" la condición se cumplira de
             * inmediato y saldra del bucle al ejecutarlo y este valor 1 no se añadirá a
             * nuestra suma ya que cuando el programa nos pide en el primer momento un
             * número, ese número que introduzcamos automaticamente reemplazará al n=1 con
             * el que se inicializó el bucle, por ejemplo si tecleamos 3 pasara a ser n=3
             */

            /**
             * Nuestra condición es distinto de cero, es decir, cuando tecleemos el cero se
             * cumplira la condición y saldremos del bucle
             */

            /*
             * Ponemos "n+0" porque es el valor que teclearemos es decir si ponemos "5" será
             * "5+0" y ese valor se alamacerá en el acumulador y al dar otra vuelta si por
             * ejemplo ponemos "10" será un ""10+0* y también se almacenará en el acumulador
             * y así sucesivamente hasta que queramos salir de nuestro bucle
             */

            
            n = sc.nextDouble();
            suma += n; // suma=suma+n -- acumulador - Siempre van dentro del bucle
            contador++; // contador=contador+1 - Siempre dentro del bucle
        }
        System.out.println("Resultado de la suma de los números introducidos " + suma);
        // System.out.println("Número de vueltas "+contador);
        contf = contador - 1;
        media = suma / contf;
        System.out.printf("La media de los números introducidos es %.2f\n", media);

    }
}
