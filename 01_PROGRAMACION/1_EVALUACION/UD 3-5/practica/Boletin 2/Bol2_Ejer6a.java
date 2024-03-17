import java.util.Scanner;
    public class Bol2_Ejer6a {
            public static void main (String args[]) {
                Scanner sc = new Scanner(System.in);

                double acumulador, contador, numeros, media;

                System.out.println("Introduce los números que creas necesarios y cero para obtener su suma y media");

                    

                    acumulador=0;
                    contador=0;

                    do {
                        numeros=sc.nextDouble();
                        acumulador=acumulador+numeros;

                        if (numeros!=0) {

                            contador=contador+1;
                        }


                    }while(numeros!=0);
                        System.out.println("acumulador"+acumulador);
                        System.out.println("acumulador"+contador);
                    media=acumulador/contador;

                    System.out.println("media"+ media);


            
    }
}