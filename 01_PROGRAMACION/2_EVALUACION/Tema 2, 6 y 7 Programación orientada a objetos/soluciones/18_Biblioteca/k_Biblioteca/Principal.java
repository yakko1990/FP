package MasEjercicios.k_Biblioteca;

/**
 *
 * Escribe una aplicación para una biblioteca que contenga libros y revistas.
 *
 * Las características comunes para las revistas y para los libros son el código, el título, y el año de publicación. Estos datos se pasarán por parámetro al crear los objetos.
 *
 * Los libros tienen un atributo propio "prestado". Por defecto, al crear un libro, dicho atributo estará a false.
 *
 * Las revistas tienen un atributo propio "numero". Al crear las revistas se pasa el número por parámetro.
 *
 * Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve el valor de todos los atributos en una cadena de caracteres.
 * También tienen un método que devuelve el año de publicación, y otro el código.
 *
 * Ambas clases implementarán obligatoriamente los método prestar(), devolver(), heredados de la clase Prestable.
 *
 * */

public class Principal {
    public static void main(String[] args) {

        Prestable[] biblioteca = new Prestable[3];
        biblioteca[0] = new Libro("123", "Libro1", 2000);
        biblioteca[1] = new Revista("223", "Revista1", 2010, 1);
        biblioteca[2] = new Libro("124", "Libro2", 2022);

        biblioteca[1].prestar();

        for (Prestable p: biblioteca) {
            System.out.println(p.toString());
        }
/*
        // EN CASO DE REALIZAR UN ARRAY DE ELEMENTOS DE LA CLASE HEREDADA (EN LUGAR DE LA INTERFAZ),
        // SERÍA NECESARIO COMPROBAR EL TIPO DE DATO DE CADA UNO DE LOS ELEMENTOS ANTES DE LLAMAR AL MÉTODO PRESTAR,
        // Y REALIZAR UN CAST

        Biblioteca[] Coleccion = new Biblioteca[3];

        Coleccion[0] = new Libros("12345", "Mobydick", 1998);
        Coleccion[1] = new Interfaces.Biblioteca2.Revista("6789A", "National Geographic", 2023, 82);
        Coleccion[2] = new Interfaces.Biblioteca2.Revista("63234A", "Revista El Corazon", 2022, 83);
        for (Biblioteca i: Coleccion){
            System.out.println(i.toString());
            if (i instanceof Libros) ((Libros) i).prestar();
        }
 */
    }
}
