package MasEjercicios.m_Legislador;

/**
 * Declara además una clase Legislador que contenga un atributo provinciaRepresentada (String) y que también almacene los
 * datos correspondientes a la clase Persona (atributos DNI, nombre, apellidos, edad).
 * En dicha clase, deberá existir un método getCamaraEnQueTrabaja común a todos los tipos de Legisladores (Senador y Diputado)
 * aunque específico para cada tipo.
 *
 * Crea una lista de legisladores y muestra por pantalla la cámara en que trabajan haciendo uso del polimorfismo.
 * */


/**
 *
 * @author nccasares
 */
public class Prueba {

    public static void main(String[] args) {

        Legislador[] lista = new Legislador[4];
        Legislador l1 = new Senador("Carolina", "Pérez", "11111111A", 24, "Lugo", "Senado", true, 19);
        lista[0] = l1;
        lista[1] = new Senador("Alba", "García", "33333333C", 32, "Segovia", "Senado", false, 20);
        lista[2] = new Diputado("Carlos", "Soler", "55555555E", 40, "Málaga", "Diputado", true, 18);
        lista[3] = new Diputado("Marcos", "Pérez", "66666666F", 31, "Pontevedra", "Diputado", true, 16);

        for (Legislador l: lista) {
            System.out.println(l.toString());
        }
    }
}