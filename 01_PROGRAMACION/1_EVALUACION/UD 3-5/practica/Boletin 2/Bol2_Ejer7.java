import java.util.Scanner;

public class Bol2_Ejer7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("A continuación introduce tres números");
        System.out.println("Primer Número");
        n1 = sc.nextInt();
        System.out.println("Segundo Número");
        n2 = sc.nextInt();
        System.out.println("Tercer Número");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El número mayor es " + n1);
        } else {
            if (n2 > n1 && n2 > n3) {
                System.out.println("El número mayor es " + n2);
            } else {
                if (n3 > n1 && n3 > n2) {
                    System.out.println("El número mayor es " + n3);
                } else {
                    if (n1 == n2 && n1 > n3) {
                        System.out.println("Los números mayores son " + n1 + " y " + n2);
                    } else {
                        if (n1 == n3 && n1 > n2) {
                            System.out.println("Los números mayores son " + n1 + " y " + n3);
                        } else {
                            if (n2 == n3 && n2 > n1) {
                                System.out.println("Los números mayores son " + n2 + " y " + n3);
                            } else {
                                // if (n1==n2 && n1==n3 && n2==n3) {
                                System.out.println("Los tres números tienen el mismo valor " + n1);
                                // }
                            }
                        }
                    }
                }
            }

            System.out.println("Fin del programa");

        }

    }
}
