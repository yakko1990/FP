package MasEjercicios.l_CollectionPila;

import java.util.NoSuchElementException;

/**
 *
 * LIFO (Last In First Out)
 *
 *
 Escribe una clase CollectionInterface, que DECLARE los siguientes métodos:

 isEmpty(): devuelve true si la colección está vacía y false en caso contrario.
 get(): devuelve y elimina el primer elemento de la colección.
 first(): devuelve el primer elemento de la colección.
 add(): añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.

 A continuación, escribe una clase Pila, que implemente esta clase, utilizando para ello un array y un contador de objetos.
 * */

public class Pila implements CollectionInterface {

    private Object[] array;
    private int contador;

    public Pila(int maxSize) {
        array = new Object[maxSize];
        contador = 0;
    }

    public boolean isEmpty() {
        return contador == 0;
    }

    public Object get() {
        if (isEmpty()) {
            throw new NoSuchElementException();// puede ser return null;
        } else {// contador=3
            // --contador: contador=2, busca array[2]
            Object toReturn = array[--contador];// le resta 1 a contador, y luego busca posición
            eliminarUltimoElemento();
            return toReturn;
        }
    }

    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException(); // puede ser return null;
        } else {
            return array[contador-1];
        }
    }

    public boolean add(Object objeto) {
        if (contador == array.length) {
            return false;
        } else {
            array[contador] = objeto;
            contador++;
            return true;
        }
    }

    private void eliminarElementoModificaTamanho () {
        Object[] arrayCopy = new Object[array.length-1];
        for (int i=0; i <= array.length-2; i++) {
            arrayCopy[i] = array[i];
        }
        array = arrayCopy;
        for (Object o : array) {
            System.out.println(o);
        }
    }

    private void eliminarUltimoElemento () {
        array[contador] = null;
        System.out.println("Contenido tras eliminar: ");
        for (Object o : array) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Pila p = new Pila(5);
        p.add(8);
        p.add(9);
        p.add(10);
        System.out.println("Obtengo y elimino primer elemento de la pila: " + p.get());
        System.out.println("Obtengo primer elemento de la pila: ");
        System.out.println(p.first());
    }
}
