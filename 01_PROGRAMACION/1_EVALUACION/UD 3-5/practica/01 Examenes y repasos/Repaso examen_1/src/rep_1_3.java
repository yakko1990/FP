import java.sql.Array;
import java.util.Scanner;

/*
3: Leer 5 números y mostrarlos en orden inverso al introducido.

 */
public class rep_1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  ;
        int[] numeros = new int[5];

        for(int i = 0; i<=4; i++){
            System.out.println( "dime un número ");
            num = sc.nextInt();
            numeros[i]=num;
        }
        for(int i = 4; i>=0; i--){
            System.out.println(numeros[i]);

        }

        }

    }


