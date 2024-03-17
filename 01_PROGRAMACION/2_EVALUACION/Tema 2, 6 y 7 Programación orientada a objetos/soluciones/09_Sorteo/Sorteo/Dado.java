package RAMA.Sorteo;

/**
 *
 * @author nccasares
 */
public class Dado extends Sorteo {

    Dado() {
        posibilidades = 6;
    }

    public int lanzar() {
        int dato = (int) (Math.random() * posibilidades + 1);
        System.out.println(dato);
        return dato;
    }

    public static void main(String[] args) {
        new Dado().lanzar();
    }
}
