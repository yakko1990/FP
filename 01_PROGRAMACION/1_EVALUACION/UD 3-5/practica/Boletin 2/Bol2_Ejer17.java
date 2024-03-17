import java.util.Scanner;

public class Bol2_Ejer17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float i;
        float resta;
        float factorial;     
        float n0 = 0;
        float factorial_1;        
        float n1 = 0;
        float factorial_2;
       

        System.out.println("Introduce un número para hacer su factorial");
        i = sc.nextLong();

        while (i<0) {
            System.out.println("Introduce un número positivo");
            i = sc.nextLong();

        }
        

        if (i==0) {
            i=1;
        }
        // Apartado a

        factorial = i;

        for (float n = 1; n != i; n++) {

            resta = i - n;

            factorial = factorial * resta;

        }
        System.out.println("Factorial apartado (a): " + factorial);

        // Apartado b

        factorial_1 = i;

        do {

            n0++;

            resta = i - n0;
           if (resta == 0) {
               resta=1;
              
            }
           
            factorial_1 = factorial_1 * resta;

        } while (n0 != i);
        System.out.println("Factorial apartado (b): " + factorial_1);

        // Apartado c

        factorial_2 = i;

        while (n1 != i) {

            n1++;

            resta = i - n1;
            if (resta == 0) {
               resta=1;
            }

            factorial_2 = factorial_2 * resta;

        }

        System.out.println("Factorial apartado (c): " + factorial_2);

    }

}
