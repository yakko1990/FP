import java.util.Scanner;

public class Bol2_Ejer13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int contador1 = 0;
        int contador2 = 0;
        int contadortotal;

        System.out.println("Introduce números y finaliza el programa con 0");

        do {

            n = sc.nextInt();

            if (n < 0) {
                contador1 = contador1 + 1;
            }

            contador2 = contador2 + 1;

        } while (n != 0);
        contadortotal = contador2 - 1;

        System.out.println("Cantidad de números negativos introducidos: " + contador1);
        System.out.println("Cantidad total de números introducidos: " + contadortotal);

    }
}
