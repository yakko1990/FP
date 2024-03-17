package Expedientes;

//Programa que almacene y gestione los nº expediente y
// alumnos de la clase( de cada alumno se almacenará DNI,
// nombre, edad y dirección).
// Utiliza un hashmap para almacenar los datos de tus compañeros de clase.
// a.Indica cuantos alumnos hay.
// b. Pide un Nº expediente, si existe muestra el nombre del
// alumno, sino indica el error.
// c. Permite eliminar un alumno de la lista.

import java.util.*;

import java.util.Scanner;

public class Expediente {

    public static void main(String[] args) {
        // Creamos un HashMap para almacenar los datos de los alumnos
        HashMap<Integer, Alumno> alumnos = new HashMap<>();

        // Pedimos los datos de los alumnos al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los datos de los alumnos:");
        for (int i = 1; i < 3; i++) {
            System.out.println("Alumno " + (i) + ":");
            System.out.println("DNI:");
            String dni = scanner.nextLine();
            System.out.println("Nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Edad:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiamos el buffer
            System.out.println("Dirección:");
            String direccion = scanner.nextLine();

            // Creamos un objeto Alumno con los datos introducidos
            Alumno alumno = new Alumno(dni, nombre, edad, direccion);

            // Añadimos el alumno al HashMap
            alumnos.put(i, alumno);
        }

        // Mostramos el número de alumnos
        System.out.println("Hay " + alumnos.size() + " alumnos en la clase.");

        // Pedimos el número de expediente de un alumno
        System.out.println("Introduce el número de expediente de un alumno:");
        int numeroExpediente = scanner.nextInt();
        scanner.nextLine(); // Limpiamos el buffer

        // Comprobamos si existe el alumno
        if (alumnos.containsKey(numeroExpediente)) {
            // Mostramos el nombre del alumno
            System.out.println("El nombre del alumno con número de expediente " + numeroExpediente + " es " + alumnos.get(numeroExpediente).getNombre());
        } else {
            // Mostramos un mensaje de error
            System.out.println("No existe ningún alumno con número de expediente " + numeroExpediente);
        }

        // Pedimos el número de expediente de un alumno a eliminar
        System.out.println("Introduce el número de expediente del alumno que quieres eliminar:");
        int numeroExpedienteEliminar = scanner.nextInt();
        scanner.nextLine(); // Limpiamos el buffer

        // Comprobamos si existe el alumno
        if (alumnos.containsKey(numeroExpedienteEliminar)) {
            // Eliminamos el alumno del HashMap
            alumnos.remove(numeroExpedienteEliminar);

            // Mostramos un mensaje de confirmación
            System.out.println("El alumno con número de expediente " + numeroExpedienteEliminar + " ha sido eliminado.");
        } else {
            // Mostramos un mensaje de error
            System.out.println("No existe ningún alumno con número de expediente " + numeroExpedienteEliminar);
        }

        // Cerramos el scanner
        scanner.close();
    }
}
