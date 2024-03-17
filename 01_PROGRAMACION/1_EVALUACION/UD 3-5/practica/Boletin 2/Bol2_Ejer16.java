import java.util.Scanner;
    public class Bol2_Ejer16 {
            public static void main (String args[]) {
                       Scanner sc = new Scanner(System.in);


                int n;
                int suma=0;
               char seguir;
               
               
               

               do {
                System.out.println("Introduce un números entre 1 y 50");
                n=sc.nextInt();

                while (n<1 | n>50) {

                    System.out.println("Error, introduce un número entre 1 y 50");
                    n=sc.nextInt();
                }


                for (int n2=1; n2<=100; n2++) {

                    if (n2%n==0 || n%n2==0) {

                        System.out.println("Los multiplos de "+n+ " son: "+n2);
                        suma=suma+n2;
                        

                    }
                    
                }
                System.out.println("la suma es: "+suma);
                
                System.out.println("Desea probar otro número (S/N)");
                seguir=sc.next().charAt(0); //Preguntar como funciona

           } while (seguir== 'S' || seguir=='s');
















    }
}



