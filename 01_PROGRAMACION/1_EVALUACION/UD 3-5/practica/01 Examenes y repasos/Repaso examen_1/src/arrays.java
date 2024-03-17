import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        System.out.println(" escribe el número de episodio que quieras ver su duración");

        Scanner scaner = new Scanner(System.in);
        int numeroEpisodio = scaner.nextInt();
        int episodio =numeroEpisodio-1;

        int[] duracionEpisodioArray = new int[5];

        duracionEpisodioArray[0]= 5;
        duracionEpisodioArray[1]= 15;
        duracionEpisodioArray[2]= 25;
        duracionEpisodioArray[3]= 35;
        duracionEpisodioArray[4]= 45;


        if (episodio >= 0 && episodio < 5 ){
            int duracion = duracionEpisodioArray[episodio];
            System.out.println( "El episodio "+numeroEpisodio+" tiene un duración de "+duracion+" minutos");
        }else {
            System.out.println("La serie solo tiene 5 episodios");

        }




    }
}