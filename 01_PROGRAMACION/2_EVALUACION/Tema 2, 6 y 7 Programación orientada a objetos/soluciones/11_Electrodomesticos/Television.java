package MasEjercicios.Electrodomesticos;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this(100, 5, 'F', "blanco", 32, false);
    }

    public Television(double precioBase, double peso) {
        this(precioBase, peso, 'F', "blanco", 32, false);
    }

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal() {
        double precio = super.precioFinal();

        if (resolucion > 40) {
            precio += super.getPrecioBase() * 0.3;
        }
        if (sintonizadorTDT) {
            precio += 50;
        }

        return precio;
    }
}
