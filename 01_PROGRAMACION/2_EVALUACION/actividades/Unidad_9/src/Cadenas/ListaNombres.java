package Cadenas;
//Implementa un método que cree una lista de cadenas de texto.
// A continuación, implementa un método que cargue la lista con
// nombres.Deberá existir otro método que visualice el contenido
// de la lista, con el indice de cada pposición. Implementar un
// método que busque un nombre y devuelva su posición. Por último,
// desarrollar un método para eliminar un nombre de la lista.

import java.util.ArrayList;
import java.util.List;

public class ListaNombres {

    private List<String> listaNombres;

    public ListaNombres() {
        this.listaNombres = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        this.listaNombres.add(nombre);
    }

    public void visualizarLista() {
        for (int i = 0; i < this.listaNombres.size(); i++) {
            System.out.println("Nombre en posición " + i + ": " + this.listaNombres.get(i));
        }
    }

    public int buscarNombre(String nombre) {
        return this.listaNombres.indexOf(nombre);
    }

    public void eliminarNombre(String nombre) {
        this.listaNombres.remove(nombre);
    }

    public static void main(String[] args) {
        ListaNombres lista = new ListaNombres();
        lista.agregarNombre("Juan");
        lista.agregarNombre("María");
        lista.agregarNombre("Pedro");

        lista.visualizarLista();

        System.out.println("Posición de 'María': " + lista.buscarNombre("María"));

        lista.eliminarNombre("Pedro");
        lista.visualizarLista();
    }
}
