import java.util.Scanner;

//consiste en realizar un script que pida al usuario que introduzca números, cuando el usuario
// quiera dejar de insetar números deberá introducir el -999. el script hará un recuento de los
// numeros negativos que le hayamos introducido.


class RecuentoNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int requestedNum;
        int negativeCount = 0;

        do {  // usamos un do while, por que queremos que por lo menos haga la comprobación una vez
            System.out.println("Introduce un numero: ");
            System.out.println("Si desea finalizar el programa, introduzca -999");

            requestedNum = sc.nextInt();

            if (requestedNum != -999) {
                if (requestedNum > 0) {
                    System.out.println("El numero " + requestedNum + " es positivo");
                } else if (requestedNum < 0) {
                    negativeCount += 1;
                    System.out.println("El numero " + requestedNum + " es negativo. Almacenando...");
                } else {
                    System.out.println("Error. El numero introducido no puede ser 0");
                }
           System.out.println("-------------------------------");
            }
        }
        while (requestedNum != -999);

        if (negativeCount == 0){ // si no se han introducido números negativos
            System.out.println( "No hay números negativos");
        }else {
            System.out.println("Total de numeros negativos almacenados: " +negativeCount);
        }
        System.out.println("---FIN DEL PROGRAMA---");
    }
}