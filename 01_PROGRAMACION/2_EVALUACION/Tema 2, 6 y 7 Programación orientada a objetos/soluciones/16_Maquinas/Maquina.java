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
public abstract class Maquina {
    private String numSerie;
    private String modelo;
    private int horasFuncionamiento;

    public Maquina(String numSerie, String modelo, int horasFuncionamiento) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasFuncionamiento() {
        return horasFuncionamiento;
    }

    public void setHorasFuncionamiento(int horasFuncionamiento) {
        this.horasFuncionamiento = horasFuncionamiento;
    }
    
    public abstract void encender();
    public abstract void apagar();
}
