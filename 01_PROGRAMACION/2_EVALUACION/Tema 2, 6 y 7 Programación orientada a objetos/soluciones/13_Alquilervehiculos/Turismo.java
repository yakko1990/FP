/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.f_Alquilervehiculos;

/**
 * @author nccasares
 */
public class Turismo extends Vehiculo {
    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, int puertas, boolean marchaAutomatica) {
        super(matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marhaAutomatica) {
        this.marchaAutomatica = marhaAutomatica;
    }


}
