package varios; // Almacena en un Hashmap los códigos postales
 // de las provincias Gallegas.
 // a. Muestra por pantalla los datos introducidos
 // b. Pide un código postal y muestra la provincia asociada si existe sino avisa al usuario
 // c. Elimina las provincias de Lugo y Ponrevedra
 // d. Muestra por pantalla los datos.

import java.util.*;


public class Provincias {
    public static void main(String[] args) {


        System.out.println( provincias.values());
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el código de la provincia?");
        String cp = sc.nextLine();

       // System.out.println(provincias(cp));

    }
       static HashMap<Integer, String> provincias = new HashMap();

        private static void inserciones(){
            provincias.put(36, "Pontevedra");
            provincias.put(15, "A Coruña");
            provincias.put(27, "Lugo");
            provincias.put(32, "Ourense");
        }





    }








