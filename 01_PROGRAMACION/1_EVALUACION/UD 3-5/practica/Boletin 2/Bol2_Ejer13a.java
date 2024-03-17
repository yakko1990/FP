import java.util.Scanner;

public class Bol2_Ejer13a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numeros, contador, contadorn;

        System.out.println("Introduce números y con cero terminas");

        contadorn=0;
        contador=0;
        
        do{
            System.out.println("Número; ");
            numeros=sc.nextInt();

            if(numeros<0) {

                contadorn=contadorn+1;
            }

            if(numeros!=0) {

                contador=contador+1;
            }



        }while(numeros!=0);

        System.out.println("Se intrododujerion "+contadorn+" numeros negativos de un total de "+contador);
        




    }
}