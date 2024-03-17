import java.util.ArrayList;
import java.util.Scanner;

/**
 * Recordando
 */
public class Recordando {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numeros, contador, numerosTotales, numeroAuxiliar;

        contador = 0;
        numeroAuxiliar = 0;

        System.out.println("Números totales");
        numerosTotales = sc.nextInt();

        do {

            System.out.println("Introduce número");
            numeros = sc.nextInt();
            listaNumeros.add(numeros);

            contador++;
        } while (contador < numerosTotales);

        for (int numeroMaximo : listaNumeros) {

            if (numeroAuxiliar < numeroMaximo) {
                numeroAuxiliar = numeroMaximo;
            }

        }

        System.out.println("Numero maximos: " + numeroAuxiliar);

    }
}