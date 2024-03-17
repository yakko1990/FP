package RAMA.Restaurante;

/*
 * El restaurante mejicano de Israel, cuya especialidad son las papas con chocos, nos pide diseñar un método con el que
 * se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el almacén.
 * El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender el
 * restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos.
 * */

public class restaurante {
    double papas;
    double chocos;

    restaurante(double p, double ch) {
        papas = p;
        chocos = ch;
    }

    public int getClientes() {
        int numclientes = 0;
        double p = papas;
        double ch = chocos;
        while (p >= 1 && ch >= 0.5) {
            numclientes += 3;
            p -= 1;
            ch -= 0.5;
        }
        return numclientes;
    }

    public static void main(String[] args) {
        restaurante r = new restaurante(20, 9);
        System.out.println(r.getClientes());
    }

    /*
     * Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del restaurante.
     * Implementa los siguientes métodos:
     * public void addChocos(int x): Añade x kilos de chocos a los ya existentes.
     *  public void addPapas(int x): Añade x kilos de papas a los ya existentes.
     *  public int getComensales(): Devuelve el número de clientes que puede atender el restaurante (este es el
     * método anterior).
     *  public void showChocos(): Muestra por pantalla los kilos de chocos que hay en el almacen.
     *  public void showPapas(): Muestra por pantalla los kilos de papas que hay en el almacen
     * */

    public void addChocos(int x) {
        chocos += x;
    }

    public void addPapas(int x) {
        papas += x;
    }

    public int getComensales() {
        return getClientes();
    }

    public void showChocos() {
        System.out.println("Chocos: "+chocos);
    }

    public void showPapas() {
        System.out.println("Papas: "+papas);
    }
}
