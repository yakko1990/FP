import java.util.Scanner;

public class Bol2_Ejer8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n;
    int v1 = -2147483648;
    int v;
    int contador = 0;

    /*
     * Utilizamos el bucle "do-while" para que se cumpla la condición de números de
     * entrada solo positivos
     */

    do {
      System.out.println("¿Cuántos números desea introducir?");
      n = sc.nextInt();
      if (n <= 0) {
        System.out.println("No se permite los números menores que 1");
      }
    } while (n <= 0);

    /*
     * La variable "n" en principio es para fijar el número de vueltas, que junto al
     * contador se encargara de que se cumpla la condición y terminar el bucle
     */

    while (contador != n) {

      System.out.println("Introducir Número");
      v = sc.nextInt();
      /*
       * Se introdujo la variable "v1" con el valor más bajo que nos permite nuestro
       * tipo de dato en este caso (int), se le da este valor para que el primer valor
       * introducido en el programa se conserve y se almacene como el nuevo valor de
       * "v1" y poder seguir haciendo las comparaciones con los siguiente nuevos
       * valores que introduzcamos, siempre almacenando el valor mayor de las
       * comparaciones en "v1" hasta que se cumpla el bucle e imprimamos al número
       * mayor
       */
      if (v > v1) {

        v1 = v + 0;

      } else {

        if (v1 > v) {

          v1 = v1 + 0;

        } else {

          v1 = v1 + 0;

        }

      }

      contador++;

    }

    System.out.println("El número mayor es " + v1 + "\n");
    System.out.println("Número de vueltas " + contador);

  }
}
