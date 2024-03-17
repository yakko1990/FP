import java.util.Scanner;

public class Bol2_Ejer14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // libra=1,12 euros
        // euros=0,89 libra
        int opcion;
        double l;
        double e;
        double libras;
        double euros;
        do {

            System.out.println("1. Convertir libras a euros");
            System.out.println("2. Convertir euros a libras");
            System.out.println("3. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

            case 1:

                do {
                    System.out.println("Introduce la cantidad de libras a convertir");
                    l = sc.nextDouble();
                    if (l < 1) {

                        System.out.println("Error, no se puede hacer la conversión con números menores que 1");
                    }

                    euros = l * 1.12;
                } while (l < 1);

                System.out.printf("La conversión es: %.2f euros\n\n", euros);
                break;

            case 2:

                do {
                    System.out.println("Introduce la cantidad de euros a convertir");
                    e = sc.nextDouble();
                    if (e < 1) {

                        System.out.println("Error, no se puede hacer la conversión con números menores que 1");
                    }

                    libras = e * 0.89;
                } while (e < 1);

                System.out.printf("La conversión es: %.2f libras \n\n", libras);

                break;

            case 3:

                System.out.println("Fin del programa");

                break;

            default:
                System.out.println("Opción no válida");

            }

        } while (opcion != 3);

    }

}
