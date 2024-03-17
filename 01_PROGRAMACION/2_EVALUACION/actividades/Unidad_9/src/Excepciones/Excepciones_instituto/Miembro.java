package Excepciones.Excepciones_instituto;

import java.util.ArrayList;
import java.util.Scanner;


public class Miembro {


    public static void main(String[] args) {

        int c = 1, opcion = 0; //Contador y registro de opcion

        //Objeto lector
        Scanner scan = new Scanner(System.in);

        //Creamos un arraylist de miembros
        ArrayList<Miembro> emp = new ArrayList<Miembro>();

        //Bucle de menú
        do {
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    //dar de alta a un miembro emp.add(Operaciones.recogerDatosEmpleado(c));
                    c++;
                    break;
                case 2:
                    //dar de baja a un miembro
                    break;
                case 3:
                    //listar todos los miembros
                    break;
            }
        } while (opcion != 4);
    }

        private static void menu() {
            //Encabezado
            System.out.println("--------------------");
            System.out.println("Menú de Miembros");
            System.out.println("--------------------");

            System.out.println("Seleccione lo que desea realizar:");
            System.out.println("1: Dar de alta a un Miembro");
            System.out.println("2: Dar de baja a un Miembro ");
            System.out.println("3: Consultar la lista de Miembros");
            System.out.println("4: Salir de la aplicación");
        }

        private static void listarMiembros(ArrayList<Miembro> emp) {
            //Listamos Los Miembros
            System.out.println("----------------------");
            System.out.println("Listado de Miembros");
            System.out.println("----------------------");
            for (int i = 0; i < emp.size(); i++) {
                System.out.println("Nombre Miembro " );//+ (i + 1) + ": " + emp.get(i).getNombre());
                System.out.println("DNI: ");// + emp.get(i).getDni());
                System.out.println("Edad: ");// + emp.get(i).getEdad());
                System.out.println("Salario: ");// + emp.get(i).getSalario());
                System.out.println("-----------------------------------");
            }
    }
}
