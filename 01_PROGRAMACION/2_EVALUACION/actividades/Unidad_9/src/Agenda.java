
// Implementar una agenda de teléfonos, donde cada contacto tenga como clave un número
// entero y como valor un nombre y un teléfono.
// Desarrollar métodos para insertar una nueva entrada en la agenda, buscar un contacto
// por nombre, mostrando por pantalla su número de teléfono asociado, eliminar un contacto
// por nombre, listar todos los contactos y listar todos aquellos contactos que comienzan
// por una determinada letra.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Agenda {
    HashMap<Integer , Contacto> contactos = new HashMap();

    private void rellenarHashMap() {
        contactos.put(1, new Contacto("Maria", "652000111"));
        contactos.put(2, new Contacto("Pepe", "652000222"));
        contactos.put(3, new Contacto("Noel", "652000333"));
        contactos.put(4, new Contacto("Ana", "652000444"));
    }

    private void existeContacto(int nexp) {
        if (!contactos.containsKey(nexp)) {
            System.out.println("No existe contacto");
        } else {
            System.out.println("Contacto: " + contactos.get(nexp).toString());
        }
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del nuevo contacto ");
        String nombre = sc.next();
        System.out.println("Escribe su número de teléfono ");
        String tlf = sc.next();





    }


}
class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
