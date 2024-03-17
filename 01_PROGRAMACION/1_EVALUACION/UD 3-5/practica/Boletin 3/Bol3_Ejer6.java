import java.util.Scanner;

public class Bol3_Ejer6 {

    /**
     * Comparar dos valores
     * 
     * @param numero1 valor 1
     * @param numero2 valor 2
     * @return 2 si numero1 es mayor, 0 si es menor, y 1 si es igual
     */

    static int compara(int numero1, int numero2) {

        if (numero1 > numero2) {
            return 2;
        } else {
            if (numero1 < numero2) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    /**
     * Comprobar si el valor cumple las condiciones
     * 
     * @param numero valor
     * @return el valor si logra cumplir las condiciones
     */

    static int datos() {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();

        while (numero < 1 || numero > 100) {
            System.out.println("Error, vuelve a introducir un número dentro del rango");
            numero = sc.nextInt();
        }
        return numero;
    }

    /**
     * Borra la pantalla
     */
    static void borrar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Adivina el valor introducido anteriormente");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int numero1 = 0;
        int numero2;
        int intentos = 0;
        int resultado;
        int contador = 0;
        int intentosrestantes;
        int opcion;
        double random;
        char seguir;

        do {

            System.out.println("1) 1 jugador");
            System.out.println("2) 2 jugadores");
            opcion = sc.nextInt();

            switch (opcion) {

            case 1:
                random = (Math.random() * 100 + 1);
                numero1 = (int) random;
                borrar();
                break;

            case 2:
                System.out.println("Introduce un número entre 1 y 100");
             //   numero = sc.nextInt();
                numero1 = datos();
                borrar();
                break;
            }

            for (int vueltas = 5; vueltas > intentos; vueltas--) {

                contador++;
                numero = sc.nextInt();
                numero2 = datos();
                resultado = compara(numero1, numero2);

                switch (resultado) {

                case 0:
                    System.out.println("El número a acerta es menor");
                    break;
                case 1:
                    System.out.println("Has acertado");
                    vueltas = 0;
                    break;
                case 2:
                    System.out.println("El número a acerta es mayor");
                    break;

                }

                if (vueltas != 0) {
                    intentosrestantes = 5 - contador;
                    System.out.println("Te quedan " + intentosrestantes + " intentos");
                    if (intentosrestantes == 0) {
                        System.out.println("El numero era: " + numero1);
                    }
                }
            }

            contador = 0;
            System.out.println("");
            System.out.println("Desea probar otro número (S/N)");
            seguir = sc.next().charAt(0);

        } while (seguir == 'S' || seguir == 's');
    }
}
