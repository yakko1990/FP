import java.util.Scanner;

public class Bol2_Ejer9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declaracion
        // Para hacer el swapping son necesarias tres variables.
        /*
         * Una variable servirá para alamacenar el valor temporal de cualquiera de
         * nuestras variables en este caso c=a se mantendrá a la espera con el velor de
         * a almacenado, cuando llegue el momento de hacer el intercambio entre a y b,
         * nuestra b será igual c (b=c) que en este caso tiene el valor de "a" y nuestra
         * "a" por tanto tendrá el valor de b (a=b) y se habrán intercambiado los
         * valores de las variables sin problemas
         */

        int a;
        int b;
        int c;

        System.out.println("Introduce un número");
        a = sc.nextInt();
        System.out.println("Introduce otro número");
        b = sc.nextInt();

        System.out.println("Valores de a y b introducidos " + a + " y " + b);

        // primer intento
        /*
         * a=b; b=a;
         */

        /*
         * Si utilizamos dos variables como el primer intento nuestra variable "a"
         * intercambiará valor con nuestra variable "b", pero al pasar a la siguiente
         * linea donde "b=a" el valor almacenado de "a" será el intercambiado por "b"
         * anteriormente es decir se repetirá el valor
         */

        c = a;
        a = b;
        b = c;
        System.out.println("Valores de a y b intercambiados " + a + " y " + b);

    }
}
