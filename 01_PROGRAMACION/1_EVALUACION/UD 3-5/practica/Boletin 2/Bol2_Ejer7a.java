import java.util.ArrayList;
import java.util.Scanner;

/**
 * Recordando
 */
public class Recordando {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int contador = 0;
        int numeroAgregar;
        int auxiliar = 0;

        do {

            System.out.println("Introduce 3 números");
            numeroAgregar = sc.nextInt();
            numeros.add(numeroAgregar);
            contador++;
        } while (contador < 3);

        for (int num : numeros) {
            if (auxiliar < num) {
                auxiliar = num;
            }

        }

        System.out.println("Numero mayor: "+auxiliar);

    }
}