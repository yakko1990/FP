import java.util.Scanner;

public class Bol3_Ejer2 {

    /**
     * Identifica si el valor introducido corresponde a un año bisiesto
     * 
     * @param fecha valor introducido
     * @return true si es valor es un año bisiesto
     *  false si el valor no es un año bisiesto
     */


    static boolean bisiesto(int fecha) {

        if ((fecha % 4 == 0 && fecha % 100 != 0) || ( fecha % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fecha;
        do {
            System.out.println("Introduce una fecha");
            fecha = sc.nextInt();

            if (fecha != 0) {
                System.out.println(bisiesto(fecha));
            }

        } while (fecha != 0);

    }

}
