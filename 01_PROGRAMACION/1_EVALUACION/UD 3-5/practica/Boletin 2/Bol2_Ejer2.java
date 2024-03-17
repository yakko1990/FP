/*Realizar un programa que pida dos números enteros al usuario y muestre el mayor de los dos o un mensaje de igualdad en caso de que sean iguales. También debe indicar si son múltiplos o no.*/


import java.util.Scanner;
    public class Bol2_Ejer2 {
            public static void main (String args[]) {
                       Scanner sc = new Scanner(System.in);

        //Variables

            int num1;
            int num2;


        //Codigo

            //Comprobacion de cual es mayor
            System.out.println("Introduce un número");
            num1=sc.nextInt();

            System.out.println("Introduce otro número");
            num2=sc.nextInt();

  
            if (num1>num2) {
            System.out.println("El número mayor es " +num1);
            } else {

            if (num1<num2) {
            System.out.println("El número mayor es " +num2);
            } else {
           
            System.out.println("tienen el mismo valor");
            

            }

            }

           // Comprobacion de si son multiplos
            if (num1%num2==0 || num2%num1==0) {

            System.out.println("Son multiplos");
            } else {
            System.out.println ("No son multiplos");
            }

            
    }
}



