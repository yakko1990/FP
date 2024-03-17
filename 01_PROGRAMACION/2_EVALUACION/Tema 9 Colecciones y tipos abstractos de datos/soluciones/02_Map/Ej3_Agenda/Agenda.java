package HashMap.Agenda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * Implementar un agenda de teléfonos, donde cada contacto tenga como clave un número entero,
 * y como valor un nombre y un teléfono.
 * Desarrollar métodos para insertar un nueva entrada en la agenda, buscar un contacto por nombre,
 * mostrando por pantalla su número de teléfono asociado, eliminar un contacto por nombre,
 * listar todos los contactos, y listar todos aquellos contactos que comienzan por una determinada letra.
 * */

public class Agenda {
    private HashMap<Integer, Contacto> agenda = new HashMap<>();
    private int idSiguiente = 0;

    public void insertarContacto (Contacto c) {
        if (!agenda.containsValue(c)) {
            agenda.put(idSiguiente, c);
            idSiguiente++;
        } else
            System.out.println("El contacto ya existe");
    }

    public void buscarPorNombre(String nombre) {
        Iterator entradas = agenda.entrySet().iterator();
        while (entradas.hasNext()) {
            Map.Entry<Integer, Contacto> entrada = (Map.Entry<Integer, Contacto>) entradas.next();
            if (entrada.getValue().getNombre().equals(nombre)) {
                System.out.println("El contacto: " + nombre + " tiene como número de teléfono " + entrada.getValue().getTelefono());
                return;
            }
        }
    }

    public void eliminarPorNombre(String nombre) {
        Iterator entradas = agenda.entrySet().iterator();
        while (entradas.hasNext()) {
            Map.Entry<Integer, Contacto> entrada = (Map.Entry<Integer, Contacto>) entradas.next();
            if (entrada.getValue().getNombre().equals(nombre)) {
                agenda.remove(entrada.getKey());
                return;
            }
        }
    }

    public void listarTodos() {
        Iterator entradas = agenda.entrySet().iterator();
        while (entradas.hasNext()) {
            Map.Entry<Integer, Contacto> entrada = (Map.Entry<Integer, Contacto>) entradas.next();
            System.out.println("Id: " + entrada.getKey() + ", Nombre: " + entrada.getValue().getNombre() + ", Número: " + entrada.getValue().getTelefono());
        }
    }

    public void listarPorLetra(String letra) {
        Iterator entradas = agenda.entrySet().iterator();
        while (entradas.hasNext()) {
            Map.Entry<Integer, Contacto> entrada = (Map.Entry<Integer, Contacto>) entradas.next();
            if (entrada.getValue().getNombre().substring(0,1).equals(letra)) {
                System.out.println("Id: " + entrada.getKey() + ", Nombre: " + entrada.getValue().getNombre() + ", Número: " + entrada.getValue().getTelefono());
            }
        }
    }

    public static void main(String[] args) {
        Agenda a = new Agenda();

        a.insertarContacto(new Contacto("Pepe", 611111111));
        a.insertarContacto(new Contacto("Maria", 611112222));
        a.insertarContacto(new Contacto("Juan", 61133322));
        a.insertarContacto(new Contacto("Rosa", 611114442));
        a.insertarContacto(new Contacto("Ramon", 685852222));

        a.listarTodos();
        a.buscarPorNombre("Juan");

        System.out.println("----ELIMINAR CONTACTO JUAN");
        a.eliminarPorNombre("Juan");
        a.listarTodos();

        System.out.println("----LISTAR CONTACTOS LETRA R");
        a.listarPorLetra("R");
    }
}
