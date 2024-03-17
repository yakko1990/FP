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
public class Deportivo extends Vehiculo{
    private int cilindrada;

    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, int cilindrada) {
        super(matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }
    

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
