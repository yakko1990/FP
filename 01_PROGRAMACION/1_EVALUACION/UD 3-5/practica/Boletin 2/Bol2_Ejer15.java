import java.util.Scanner;

public class Bol2_Ejer15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int n1 = 0;
        int n2 = 0;
        int contador = 0;
        int intentos = 0;
        int opcion = 0;
        int b = 6;

        do  {

           System.out.println("Jugador 1 introduce un número entre 1 y 100");
            n1 = sc.nextInt();

            // Condición para que introduzca un número entre 1 y 100
            while (n1 < 1 | n1 > 100) {
                System.out.println("Error, escribe un número entre 1 y 100");
                n1 = sc.nextInt();
            }

            if (n1 >= 1 | n1 <= 100) {

                // Comando para borrar la pantalla
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Bucle y condiciones para efectuar el número de intentos
                for (int v = 1; v != b; v++) {

                    System.out.println("Jugador 2, intenta adivinar el valor introducido anteriormente");
                    n2 = sc.nextInt();


                    if (n2 < n1) {
                        System.out.println("El número a acertar es mayor");
                    } else {

                        if (n2 > n1) {
                            System.out.println("El número a acertar es menor");

                        } else {

                            System.out.println("Has acertado el número");
                            break;
                        }

                    }
                    // Condición para sumar una vuelta más o no al número de intentos
                    if (n2 < 0 | n2 > 100) {
                        contador = contador + 0;
                        b = b + 1;

                    } else {

                        contador++;
                    }

                    intentos = 5 - contador;
                    System.out.println("Te quedan " + intentos + " intentos");
                }

            }

            System.out.println("a. Introduce cualquier número para jugar otra partida");
            System.out.println("b. Introduce 1 para terminar el juego");
            opcion = sc.nextInt();

        }while(opcion != 1);

        System.out.println("Fin del programa");

    }
}
