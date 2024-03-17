import java.util.Scanner;
/*
2: Pedir números e indicar si es múltiplo de 3. El programa finaliza con -1
        (Pseudocódigo, ordinograma y en Java)

 */
public class rep_1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =0 ;

        while ( num!=-1){
            System.out.println( "dime un número ");
            num = sc.nextInt();
            if( num%3 == 0 ){
                System.out.println( "el número "+ num + " es multiplo de tres");
            }
        }
    }
}

