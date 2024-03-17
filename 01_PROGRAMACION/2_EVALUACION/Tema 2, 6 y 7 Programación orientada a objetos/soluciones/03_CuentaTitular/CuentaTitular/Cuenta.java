package MasEjercicios.CuentaTitular;

/*
*
* Clase Cuenta con los siguientes atributos: titular y cantidad (puede tener decimales).
* El titular será obligatorio y la cantidad es opcional
* Tendrá dos métodos:
* ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no hará nada.
* retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es
* negativa, la cantidad de la cuenta pasa a ser 0
*
* */

public class Cuenta {
    private Titular titular;
    private double cantidad;

    public Cuenta(Titular titular) {
        this(titular, 0);
    }

    public Cuenta(Titular titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    public String toString() {
        return "El titular " + titular.getNombre() + " tiene " + cantidad + " euros en la cuenta";
    }
}
