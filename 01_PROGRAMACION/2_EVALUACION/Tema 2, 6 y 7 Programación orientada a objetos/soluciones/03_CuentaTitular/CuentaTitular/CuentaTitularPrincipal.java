package MasEjercicios.CuentaTitular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CuentaTitularPrincipal {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Titular t1 = new Titular("Maria Perez", LocalDate.parse("01/02/1985", dtf), 'M', "Teis", "11111111A");
        Titular t2 = new Titular("Pepe Rodriguez", LocalDate.parse("25/08/1976", dtf), 'H', "Alcabre", "22222222B");
        Titular t3 = new Titular("Ana Garcia", LocalDate.parse("10/05/1991", dtf), 'M', "Nigran", "33333333C");

        Cuenta c1 = new Cuenta(t1, 0);
        Cuenta c2 = new Cuenta(t2, 500);
        Cuenta c3 = new Cuenta(t3);

        c1.ingresar(300);
        c2.ingresar(200);
        c3.ingresar(50);

        System.out.println("ANTES DE RETIRADA:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.retirar(450);
        c2.retirar(100);
        c3.retirar(100);

        System.out.println("\nDESPUES DE RETIRADA:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
