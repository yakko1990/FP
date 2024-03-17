import java.util.Scanner;

public class Bol2_Ejer5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Variables (corregido)
        int opcion;
        double cuadrado;
        double c;
        double inverso;
        double i;
        double raiz;
        double r;
        int a1;
        int a2;
        int opeand;
        int o1;
        int o2;
        int opeor;

        // Código

        do {

            System.out.println("\nIntroduce el número correspondiente conforme a la operación "
                    + "que se desea realizar del siguiente menú de opciones\n");
            System.out.println(
                    "1) Cuadrado de un número real\n2) Inverso de un número\n3) Raíz cuadrada de un número\n4) Operación AND\n5) Operación OR\n6) Salir ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Introduce el número del que se quiere hacer el cuadrado");
                    c = sc.nextDouble();
                    cuadrado = c * c;
                    System.out.printf("El cuadrado de c es igual a " + "%.2f\n", cuadrado);
                    break;

                case 2:

                    System.out.println("Introduce el número del que se quiere hacer el inverso");
                    i = sc.nextDouble();

                    while (i == 0) {
                        System.out.println("Introduce un número diferente");
                        i = sc.nextDouble();
                        // i++;

                    }

                    inverso = 1 / i;
                    System.out.printf("El cuadrado de i es igual a " + "%.4f\n", inverso);
                    break;

                case 3:

                    System.out.println("Introduce el número del que se quiere hacer la raiz");
                    r = sc.nextDouble();

                    while (r < 0) {
                        System.out.println("Introduce un número diferente");
                        r = sc.nextDouble();

                    }
                    raiz = Math.sqrt(r);
                    System.out.printf("La raiz cuadrada de %.2f es %.3f\n", r, raiz);
                    break;

                case 4:

                    System.out.println("Introduce el primer número para la operación");
                    a1 = sc.nextInt();
                    System.out.println("Introduce el segundo número para la operación");
                    a2 = sc.nextInt();
                    opeand = a1 & a2;
                    System.out.printf("El resultado de la operación AND entre " + a1 + " y " + a2 + " es " + "%h\n",
                            opeand);

                    break;

                case 5:

                    System.out.println("Introduce el primer número para la operación");
                    o1 = sc.nextInt();
                    System.out.println("Introduce el segundo número para la operación");
                    o2 = sc.nextInt();
                    opeor = o1 | o2;
                    System.out.printf("El resultado de la operación OR entre " + o1 + " y " + o2 + " es " + "%h\n",
                            opeor);

                    break;

                case 6:

                    System.out.println("Fin del programa");

                    break;

                default:
                    System.out.println("Opción no válida");

            }

        } while (opcion != 6);

    }
}
