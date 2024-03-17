import java.util.Scanner;

/*
1: Pedir números indefinidamente. A medida que se piden números solo queremos
mostrar los que cumplan al menos uno de los siguientes requisitos:
• Requisito 1: Que sea par y que al multiplicarlo por 5 sea mayor que 25
• Requisito 2: Que sea impar y que al multiplicarlo por 3 sea menor que 10
Realizar este ejercicio en pseudocódigo y Java
 */
public class rep_2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println( "dime un numero");
            num= sc.nextInt();
            if (( num%2 == 0 ) && (num * 5 > 25)||(num%2 != 0 ) && (num * 3 <10)){
                System.out.println(num);
            }

        }
        while (true);
    }
}


