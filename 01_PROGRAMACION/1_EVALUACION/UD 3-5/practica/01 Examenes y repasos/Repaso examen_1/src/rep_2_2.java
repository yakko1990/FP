import java.util.Scanner;

/*
2: Pedir un número N, y mostrar todos los números del 1 al N.
Realizar este ejercicio en pseudocódigo, diagrama y Java.
 */
public class rep_2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("dime un número ");
        num = sc.nextInt();
        if (num > 0){
            for ( int i=1; i<= num ; i++){
                System.out.println(i);
            }
        }else {
            for ( int i=1; i >= num ; i--){
                System.out.println(i);
        }}
    }
}


