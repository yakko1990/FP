package MasEjercicios.k_Biblioteca;

public class Revista extends Publicacion implements Prestable{
    private int numero;

    public Revista(String codigo, String titulo, int anio, int numero) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "Numero: " + numero;
    }

    @Override
    public void prestar() {
        System.out.println("Revista prestada " + getTitulo());
    }

    @Override
    public void devolver() {
        System.out.println("Revista devuelta " + getTitulo());
    }

    @Override
    public boolean prestado() {
        return false;
    }
}
