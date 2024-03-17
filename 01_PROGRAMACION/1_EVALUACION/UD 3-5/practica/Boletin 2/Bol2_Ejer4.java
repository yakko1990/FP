import java.util.Scanner;

public class Bol2_Ejer4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        int opcion;
        double c, k, f;
        // Código (Corregido)

        do {

            System.out.println("Introduce la temperatura en Celsius");
            c = sc.nextDouble();

            System.out.println("Elige 1 para convertir a Farenheit o 2 para Kelvin");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    f = 1.8 * c + 32;
                    System.out.printf("La temperatura en Farenheit es %.2f\n", f);
                    break;
                case 2:
                    k = c + 273;
                    System.out.printf("La temperatura en Kelvin es %.2f\n", k);
                    break;
                default:
                    System.out.println("opción no válida");

                    break;
            }

        } while (opcion != 3);

        System.out.println("Fin del programa");

    }
}
