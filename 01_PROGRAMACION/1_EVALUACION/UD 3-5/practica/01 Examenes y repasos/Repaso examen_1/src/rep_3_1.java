import java.util.Scanner;

/*
1. Se pedirán 2 números por teclado. Se pedirá que se imprima por pantalla todos
aquellos números que estén entre ambos. Esto se repetirá indefinidamente
hasta que los 2 números sean iguales, que en ese caso el programa finalizará.
 */
public class rep_3_1 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.printf("Dime un número");
        int num1 = sc.nextInt();
        System.out.printf("Dime otro número");
        int num2 = sc.nextInt();


            for (int i = num1 +1; i != num2 ; i++){
                System.out.println(i);
            }
    }
}


