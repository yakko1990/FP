/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.i_Maquinas;

/**
 *
 * @author nuria
 */
public class MaqIndustrial extends Maquina{
    private float potenciaConsumo;
    
    public MaqIndustrial(String numSerie, String modelo, int horasFuncionamiento, float potencia) {
        super(numSerie, modelo, horasFuncionamiento);
        this.potenciaConsumo = potencia;
    }
    
    public float getPotenciaConsumo() {
        return potenciaConsumo;
    }

    public void setPotenciaConsumo(float potenciaConsumo) {
        this.potenciaConsumo = potenciaConsumo;
    }
    
    @Override
    public void encender() {
        System.out.println("ENCENDIENDO MÁQUINA INDUSTRIAL");
    }

    @Override
    public void apagar() {
        System.out.println("APAGANDO MÁQUINA INDUSTRIAL");
    }
    
}
