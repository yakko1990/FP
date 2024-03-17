package MasEjercicios.Electrodomesticos;

/**
 *
 * @author nccasares
 */
public class Electrodomestico {

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this(100, 5, 'F', "blanco");
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, 'F', "blanco");
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    private void comprobarColor(String color) {

        //Colores disponibles
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {

            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {

        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }

    }

    public double precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                return precioBase += 100;
            case 'B':
                return precioBase += 80;
            case 'C':
                return precioBase += 60;
            case 'D':
                return precioBase += 50;
            case 'E':
                return precioBase += 30;
            case 'F':
                return precioBase += 10;
        }
        return precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}