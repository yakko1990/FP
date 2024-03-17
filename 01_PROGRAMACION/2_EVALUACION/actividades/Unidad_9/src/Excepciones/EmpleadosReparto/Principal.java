package Excepciones.EmpleadosReparto;

import java.util.ArrayList;
import java.util.Scanner;

//Partiendo del ejercicio de EmpleadosReparto, se deberán realizar las siguientes modificaciones:
//
//** Elaborar un menú donde existan 2 opciones: Agregar empleados a la lista y mostrar los empleados ya existentes.
//** Los datos de los empleados a incluir en la lista deberán ser recogidos por teclado.
//
//** Se deberá comprobar la validez de los nombres introducidos, de tal forma que solo contenga letras de la A a la Z
// (mayúsculas o minúsculas), y con una longitud máximas de 20 caracteres.
//
//** Se deberá comprobar también la validez del dni, para que coincida con el formato esperado.
//
//** Con respecto a la edad, deberá estar formada únicamente por números y, como máximo 3 dígitos.
//
//** Por último, cuando se recoja el sueldo, se deberá comprobar que únicamente se trate de 5 cifras numéricas.
//
//** En caso de que alguno de los requisitos de los puntos anteriores no se cumpla, lanzaremos una excepción y
// volveremos a pedir el valor.
//
//** Las excepciones deberán ser personalizadas y se empleará para ello una única clase en la que, en función
// del código de error que reciba, se generará un mensaje de error u otro.


public class Principal extends ExcEmpleados {
    static Scanner sc = new Scanner(System.in);

    private static Empleado agregarEmpleadoComercial( double comision, String nombre, int edad, double salario ) throws Exception {
        Empleado empleado = new Comercial(comision, nombre, edad, salario);
        return empleado;
    }
    private static Empleado agregarEmpleadoRepartidor( String zona, String nombre, int edad, double salario ) throws Exception {

        Empleado empleado = new Repartidor(zona, nombre, edad, salario);
        return empleado;
    }
    private static void mostrarEmpleados(ArrayList<Empleado> listaEmpleados){
        for (Empleado empleado :listaEmpleados){
            System.out.println(empleado);
        }
    }
    public static void main(String[] args) throws Exception {



         ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Comercial c1 = new Comercial(300, "Francisco", 37, 1000);
        Repartidor r1 = new Repartidor("3", "María", 26, 900);

        listaEmpleados.add(c1);
        listaEmpleados.add(r1);

    int opcion =0;


    while (opcion != 3){
        System.out.println("\nQue quieres hacer? \n1_ Agregar empleados \n2_ Mostrar la lista de empleados \n3_ Salir.");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:

                try{
                    System.out.println("Has elegido insertar un nuevo empleado");
                    System.out.println("\nQue función realiza el empleado? \nR_ Repartidor \nC_ Comercial");
                    String opcionTipoEmlpeado;
                    opcionTipoEmlpeado = sc.next();
                    sc.nextLine();

                    if (opcionTipoEmlpeado.equalsIgnoreCase("R")){
                        System.out.println("En que zonza realiza el reparto?");
                        String zona = sc.next();
                        System.out.println("Cual es el nombre del repartidor:");
                        String nombre = sc.next();
                        System.out.println("Que edad tiene?");
                        int edad = sc.nextInt();
                        System.out.println("Cual es su salario?");
                        double salario = sc.nextDouble();
                        Empleado empleadoTemporal = agregarEmpleadoRepartidor(zona, nombre, edad, salario);
                        listaEmpleados.add (empleadoTemporal);
                    }

                    if  (opcionTipoEmlpeado.equalsIgnoreCase("C")) {
                        System.out.println("Que comision recibe?");
                        double comision = sc.nextDouble();
                        System.out.println("Cual es el nombre del Comercial:");
                        String nombre = sc.next();
                        System.out.println("Que edad tiene?");
                        int edad = sc.nextInt();
                        System.out.println("Cual es su salario?");
                        double salario = sc.nextDouble();

                        Empleado empleadoTemporal = agregarEmpleadoComercial(comision, nombre, edad, salario);
                        listaEmpleados.add(empleadoTemporal);
                    }

                    else{
                        System.out.println("Debes de indicar si es Comercial introduciendo una C\n o si es repartidor introduciendo una R");
                    }

                } catch (ExcEmpleados e) {
                    throw new RuntimeException(e);
                }
                break;

            case 2:
                System.out.println("Has elegido ver la lista de empleados: \n");
                mostrarEmpleados(listaEmpleados);

                break;

        }
    }
    }
}
