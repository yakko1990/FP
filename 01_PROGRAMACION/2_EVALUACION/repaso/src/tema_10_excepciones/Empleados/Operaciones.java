package tema_10_excepciones.Empleados;

import java.util.Scanner;

public class Operaciones {
    public static Empleado recogerDatosEmpleado(int c) {
        String nom = ""; //Nombre del empleado
        String dni = ""; //DNI del empleado
        String zona = ""; //DNI del empleado
        int edad = 0; //Edad del empleado
        double sueldoDiario, comision = 0; //Sueldo del empleado
        Scanner scan = new Scanner(System.in);
        //Pedimos el nombre
        System.out.println("Introduzca el nombre del empleado " + c + ": ");
        nom = Validar.nombre(scan.next());

        //Pedimos el dni
        System.out.println("Introduzca el DNI de " + nom + ": ");
        dni = Validar.dni(scan.next());

        //Pedimos la edad
        System.out.println("Introduzca la edad de " + nom + ": ");
        edad = Validar.edad(scan.nextInt());

        //Pedimos el sueldo
        System.out.println("Introduzca el sueldo diario de " + nom + ": ");
        sueldoDiario = Validar.sueldo(scan.nextInt());

        //Pedimos la comisión
        System.out.println("Introduzca la comisión de " + nom + ": ");
        comision = scan.nextInt();

        //Pedimos la zona
        System.out.println("Introduzca la zona de " + nom + ": ");
        zona = scan.next();

        System.out.println("¿Qué tipo de empleado es? Comercial:1, Repartidor:2");
        int tipo = scan.nextInt();

        Empleado e = null;
        if (tipo == 1)
            e = new Comercial(comision, nom, dni, edad, sueldoDiario);

        else
            e = new Repartidor(zona, nom, dni, edad, sueldoDiario);

        // FALTA PROBAR QUE AL SALARIO SE LE ASIGNAN LOS PLUSES CORRECTAMENTE
        e.plus();
        return e;
    }
}
