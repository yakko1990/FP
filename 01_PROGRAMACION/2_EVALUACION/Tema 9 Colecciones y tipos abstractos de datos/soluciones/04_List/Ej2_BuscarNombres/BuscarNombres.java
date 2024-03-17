package ArrayList.Ej2_BuscarNombres;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Implementa un método que cree una lista de cadenas de texto.
 * A continuación,implementa un método que cargue la lista con nombres.
 * Deberá existir otro método que visualice el contenido de la lista, con el índice de cada posición.
 * Implementar un método que busque un nombre y devuelva su posición.
 * Por último, desarrollar un método para eliminar un nombre de la lista.
 *
 * @author nccasares
 */

public class BuscarNombres {
    private ArrayList<String> nombres = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void cargarArrayList() {
        System.out.println("Introduzca nombres que desea almacenar en la lista (* para salir):");
        sc = new Scanner(System.in);
        String cadena = "";
        while (!cadena.equals("*")) {
            cadena = sc.nextLine();
            if (!cadena.equals("*")) {
                nombres.add(cadena);
                System.out.println("Nombre almacenado en la posición " + nombres.indexOf(cadena));
            }
        }
    }

    public void mostrarArrayList() {
        System.out.println("LISTADO");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("En la posición " + i + " está el valor " + nombres.get(i));
        }
    }

    public int buscarNombre() {
        sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre que desea buscar:");
        String buscar = sc.nextLine();
        return nombres.indexOf(buscar);
    }

    public void eliminarNombre() {
        nombres.remove(buscarNombre());
    }

    public static void main(String[] args) {
        BuscarNombres ej3 = new BuscarNombres();
        System.out.println("CARGA DEL LISTADO");
        ej3.cargarArrayList();
        System.out.println("LISTADO DE NOMBRES:");
        ej3.mostrarArrayList();
        System.out.println("BÚSQUEDA POR NOMBRE:");
        ej3.buscarNombre();
        System.out.println("ELIMINAR NOMBRE:");
        ej3.eliminarNombre();
        ej3.mostrarArrayList();
    }
}
