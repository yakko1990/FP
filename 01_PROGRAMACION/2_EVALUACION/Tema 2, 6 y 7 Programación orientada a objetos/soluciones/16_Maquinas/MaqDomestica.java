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
public class MaqDomestica extends Maquina{

    public MaqDomestica(String numSerie, String modelo, int horasFuncionamiento) {
        super(numSerie, modelo, horasFuncionamiento);
    }

    @Override
    public void encender() {
        System.out.println("ENCENDIENDO MÁQUINA DOMÉSTICA");
    }

    @Override
    public void apagar() {
        System.out.println("APAGANDO MÁQUINA DOMÉSTICA");
    }
    
}
