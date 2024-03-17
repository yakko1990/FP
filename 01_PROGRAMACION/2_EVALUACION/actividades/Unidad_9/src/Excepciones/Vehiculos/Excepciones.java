package Excepciones.Vehiculos;

public class Excepciones {

    class MatriculaException extends Exception {
        public MatriculaException(String message) {
            super(message);
        }
    }

    class ColorException extends Exception {
        public ColorException(String message) {
            super(message);
        }
    }
}
