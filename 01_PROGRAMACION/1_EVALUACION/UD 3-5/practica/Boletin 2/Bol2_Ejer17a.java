import java.util.Scanner;
    public class Bol2_Ejer17a {
            public static void main (String args[]) {
                       Scanner sc = new Scanner(System.in);


                float valorinicial;
                float resultado;
                float resultado_1;
                float resultado_2;
                float num1;
                float num2;
                
                       System.out.println("Introduce un número para hacer su factorial");
                       valorinicial = sc.nextLong();

                       while (valorinicial<0) {
                        System.out.println("Introduce un número positivo");
                        valorinicial = sc.nextLong();
            
                    }
                    
                    //Apartado a
                    resultado=1;
                    for (float num=valorinicial; num!=0; num--) {
                       
                        resultado=resultado*num;
                        
                    }
                    System.out.println("resultado(a) "+resultado);

                    //Apartado b
                    resultado_1=1;
                    num1=valorinicial;
                    while (num1!=0){
                        
                        resultado_1=resultado_1*num1;  
                        num1--;
                    }
                    System.out.println("resultado(b) "+resultado_1);

                    //Apartado c
                    resultado_2=1;
                    num2=valorinicial;
                    do {
                        if (num2==0) {
                            num2=1;
                        }
                        resultado_2=resultado_2*num2;
                        num2--;
                        
                    }while (num2!=0);
                    System.out.println("resultado(c) "+resultado_2);

    }
}



