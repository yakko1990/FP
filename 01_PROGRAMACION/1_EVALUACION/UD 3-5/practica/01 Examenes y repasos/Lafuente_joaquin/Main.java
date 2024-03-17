import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int totalDiasVálidos = 0;
        int dia = 0;

        do {
            System.out.println(" Dime un día: ");
            dia = sc.nextInt();
            if ((dia > 0) && (dia < 32)) {
                totalDiasVálidos++;
               // System.out.println(dia);
            }else {
                if (dia!=-1) {
                    System.out.println(" Error: día inválido ");
                }
            }
        } while (dia !=-1);
        System.out.println("Se han introducido un total de "+ (totalDiasVálidos) + " días");

    }
}