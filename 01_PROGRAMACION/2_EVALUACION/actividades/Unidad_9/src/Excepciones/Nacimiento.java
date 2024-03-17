package Excepciones;


import java.util.Scanner;

public class Nacimiento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Introduce tu año de nacimiento");
            int año = sc.nextInt();

            if(año < 0){
                throw new Exception("la fecha no puede ser un número negativo");
            }
            else {
                System.out.println("tu año de nacimiento es: " + año );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Fin del programa");
        }


    }
}
