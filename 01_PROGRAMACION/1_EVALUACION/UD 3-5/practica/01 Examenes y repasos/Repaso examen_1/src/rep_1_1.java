import java.util.Scanner;

/*1: Pedir 5 números, y mostrar al final si se ha introducido alguno negativo.
        (Pseudocódigo y en Java)
        */
public class rep_1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       int num ;
       int cont = 0;
       int contNegative = 0;

        while (cont<5){
            cont++;
            System.out.println("dime un número");
            num = sc.nextInt();
            if (num < 0){
                contNegative++;
            }
        }
        System.out.println("se han introducido "+ contNegative+ " números negativos");
    }
}

