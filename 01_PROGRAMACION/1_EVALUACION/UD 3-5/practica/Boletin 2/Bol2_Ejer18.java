import java.util.Scanner;

public class Bol2_Ejer18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char i = '*';
        int numero;
        int n = 0;
        String e = "";

        System.out.println("¿Cuántos asteriscos deseas dibujar?");
        numero = sc.nextInt();
        System.out.println("\n");

        // Apartado a

        do {
            n++;
            System.out.print(i);

        } while (n < numero);

        System.out.println("\n");
        // System.out.println("Fin del programa");

        // Apartado b

        int c;
        do {
            System.out.println("Se dibuja en diagonal");
            System.out.println("1. De izquierda a derecha");
            System.out.println("2. De derecha a izquierda");
            System.out.println("3. Salir");

            c = sc.nextInt();

            switch (c) {

            case 1:

                n = 0;
                do {
                    n++;

                    System.out.printf("%" + n + "s\n", i);

                } while (n < numero);
                break;

            case 2:

                for (int v = numero; v > 0; v--) {

                    System.out.printf("%" + v + "s\n", i);

                }

                break;

            case 3:
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("Opción no valida");

            }

        } while (c != 3);

    }

    

}
