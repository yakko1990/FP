package MasEjercicios.k_Biblioteca;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String codigo, String titulo, int anio) {
        this (codigo, titulo, anio, false);
    }
    public Libro(String codigo, String titulo, int anio, boolean prestado) {
        super(codigo, titulo, anio);
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        prestado = true;

    }

    @Override
    public void devolver() {
        prestado = false;

    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString()+ "Libro [prestado=" + prestado + "]";
    }


}