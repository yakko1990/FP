package MasEjercicios.Electrodomesticos;

public class Lavavajillas extends Electrodomestico {
    private final static int SERVICIOS = 12;
    private int numServicios;

    public Lavavajillas() {
        this(100, 5, 'F', "blanco", SERVICIOS);
    }

    public Lavavajillas(double precioBase, double peso) {
        this(precioBase, peso, 'F', "blanco", SERVICIOS);
    }

    public Lavavajillas(double precioBase, double peso, char consumoEnergetico, String color, int numServicios) {
        super(precioBase, peso, consumoEnergetico, color);
        this.numServicios = numServicios;
    }

    public int getNumServicios() {
        return numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }

    public double precioFinal() {
        double precio = super.precioFinal();
        if (numServicios > 12) {
            precio += 60;
        }

        return precio;
    }
}
