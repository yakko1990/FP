package Conjuntos;

/*
 * Crea dos conjuntos ordenados de elementos Integer y realiza lo siguiente:
 * La suma, resta, multiplicación de sus elementos.
 * Crea un nuevo conjunto que contenga la unión de los 2 conjuntos iniciales.
 * Crea otro conjunto que contenga la diferencia de los 2 conjuntos iniciales (eliminar los elementos de c2 en c1).
* */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos2 {
    static TreeSet<Integer> ts1 = new TreeSet<>();
    static TreeSet<Integer> ts2 = new TreeSet<>();

    private static void rellenarConjuntos() {
        for (int i = 0; i < 10; i++) {
            ts1.add(i);
            ts2.add(i+5);
        }
    }

    public static void sumaConjuntos() {
        Iterator<Integer> it1 = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        System.out.println("----SUMA CONJUNTOS:");
        while (it1.hasNext()) {
            int v1 = it1.next();
            int v2 = it2.next();
            System.out.println(v1 + " + " + v2 + " = " + (v1+v2));
        }
    }

    public static void restaConjuntos() {
        Iterator<Integer> it1 = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        System.out.println("----RESTA CONJUNTOS:");
        while (it1.hasNext()) {
            int v1 = it1.next();
            int v2 = it2.next();
            System.out.println(v1 + " - " + v2 + " = " + (v1-v2));
        }
    }

    public static void multiplicacionConjuntos() {
        Iterator<Integer> it1 = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        System.out.println("----MULTIPLICACIÓN CONJUNTOS:");
        while (it1.hasNext()) {
            int v1 = it1.next();
            int v2 = it2.next();
            System.out.println(v1 + " * " + v2 + " = " + (v1*v2));
        }
    }

    public static TreeSet<Integer> unionConjuntos() {
        TreeSet<Integer> union = (TreeSet<Integer>) ts1.clone();
        union.addAll(ts2);
        return union;
    }

    public static TreeSet<Integer> diferenciaConjuntos() {
        TreeSet<Integer> diferencia = (TreeSet<Integer>) ts1.clone();
        diferencia.removeAll(ts2);
        return diferencia;
    }

    public static void mostrarElementos(Set set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        rellenarConjuntos();
        System.out.println("----CONJUNTO 1");
        mostrarElementos(ts1);
        System.out.println("----CONJUNTO 2");
        mostrarElementos(ts2);

        sumaConjuntos();
        restaConjuntos();
        multiplicacionConjuntos();

        System.out.println("----UNION DE LOS CONJUNTOS");
        mostrarElementos(unionConjuntos());

        System.out.println("----DIFERENCIA DE LOS CONJUNTOS");
        mostrarElementos(diferenciaConjuntos());
    }
}
