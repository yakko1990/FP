/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.f_Alquilervehiculos;

/**
 *
 * @author nccasares
 */
public class Furgoneta extends Vehiculo{
    private int carga;
    private int volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa,int carga, int volumen) {
        super(matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    
}
