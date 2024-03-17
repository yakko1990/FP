//Implementar una clase Serie con las siguientes características:
//    • Atributos: titulo, numero de temporadas, entregado, genero y creador.
//    • Por defecto, el numero de temporadas es  3 y entregado false.
//    • Constructores:
//            ▪ Un constructor por defecto.
//            ▪ Un constructor con el titulo y creador. El resto por defecto.
//            ▪ Un constructor con todos los atributos, excepto entregado.
//    • Métodos:
//        ◦ Getter y setter de todos los atributos, excepto de entregado.
//        ◦ Sobreescribe los métodos toString.
//
//Crear una clase Videojuego:
//    • Atributos: titulo, horas estimadas, entregado, genero y compañia.
//    • Por defecto, las horas estimadas serán de 10 horas y entregado false.
//    • Constructores:
//            ▪ Un constructor por defecto.
//            ▪ Un constructor con el titulo y horas estimadas. El resto por defecto.
//            ▪ Un constructor con todos los atributos, excepto entregado.
//    • Métodos:
//            ▪ Getter y setter de todos los atributos, excepto de entregado.
//            ▪ Sobrescribe los métodos toString.
//
//Las clases anteriores tienen  métodos en común, que son los siguientes:
//    • entregar(): cambia el atributo prestado a true.
//    • devolver(): cambia el atributo prestado a false.
//    • isEntregado(): devuelve el estado del atributo
//	entregado.
//
//Ahora crea una aplicación ejecutable y realiza lo siguiente:
//    • Crea dos conjuntos, uno de Series y otro de Videojuegos, de 5 posiciones cada uno,
//    donde cada Serie y cada Videojuego se identfique en el conjunto con una clave única.
//    • Entrega algunos Videojuegos y Series con el método entregar().
//    • Cuenta cuántos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
//    • Por último, indica el Videojuego tiene más horas estimadas y la serie con más temporadas.
//    Muéstralos en pantalla con toda su información (usa el método toString()).

package Videojuego;

import java.util.HashMap;

public class Principal {
    HashMap<Integer, Serie> series = new HashMap<>();
    private void rellenarHashMap() {
        series.put( 1, new Serie());
        series.put( 2, new Serie());
        series.put( 3, new Serie());
        series.put( 4, new Serie());
        series.put( 5, new Serie());

    }
    HashMap<Integer, Videojuego> videojuegos = new HashMap<>();
    private void rellenarHashMap2() {
        videojuegos.put( 1, new Videojuego());
        videojuegos.put( 2, new Videojuego());
        videojuegos.put( 3, new Videojuego());
        videojuegos.put( 4, new Videojuego());
        videojuegos.put( 5, new Videojuego());

    }

    public static void main(String[] args) {
        
    }
}
