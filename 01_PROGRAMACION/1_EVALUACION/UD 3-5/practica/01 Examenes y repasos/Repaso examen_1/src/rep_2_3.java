import java.util.Scanner;

/*
3: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de
28, 30 y 31 días.
Realizar este ejercicio en diagrama de flujo y en código Java.
 */
public class rep_2_3 {

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


