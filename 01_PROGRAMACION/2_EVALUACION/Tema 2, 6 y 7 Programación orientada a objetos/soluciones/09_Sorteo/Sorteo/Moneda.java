package RAMA.Sorteo;

/**
 *
 * @author nccasares
 */
public class Moneda extends Sorteo {

    Moneda() {
        posibilidades = 2;
    }

    public int lanzar() {
        int dato = (int) (Math.random() * posibilidades + 1);
        if (dato == 1) {
            System.out.println("cara");
        } else {
            System.out.println("cruz");
        }
        return dato;
    }

    public static void main(String[] args) {
        new Moneda().lanzar();
    }

}

