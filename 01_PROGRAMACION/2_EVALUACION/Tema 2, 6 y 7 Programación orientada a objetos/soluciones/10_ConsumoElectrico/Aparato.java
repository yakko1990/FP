package MasEjercicios.ConsumoElectrico3;

/**
 * Implementar un programa que represente el consumo de energía de una instalación eléctrica.
 * Existirá una clase genérica "Aparato" que represente los aparatos conectados a la instalación.
 * Cada uno de ellos tendrá un consumo eléctrico determinado.
 * Al encender un aparato eléctrico, el consumo de energía total se incrementa en la potencia de dicho aparato.
 * Al apagarlo, se decrementa el consumo.
 * Por defecto, al crearse, los aparatos están todos apagados.
 * Deberá poder consultarse el consumo total de la instalación.
 * */

public class Aparato {
    static double consumoTotal = 0;
    private double consumoAparato;
    private boolean encendido;

    public Aparato(double consumoAparato) {
        this.consumoAparato = consumoAparato;
        encendido = false;
    }

    void encender() {
        if (!encendido) {
            encendido = true;
            consumoTotal += consumoAparato;
        }
    }

    void apagar() {
        if (encendido) {
            encendido = false;
            consumoTotal -= consumoAparato;
        }
    }

    static double getConsumoTotal() {
        return consumoTotal;
    }
}
