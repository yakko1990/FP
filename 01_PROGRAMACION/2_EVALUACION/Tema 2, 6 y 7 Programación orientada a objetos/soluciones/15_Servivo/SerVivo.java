/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.h_Servivo;

/**
 *
 * @author nuria
 */
public abstract class SerVivo {
    public String nombreCientifico;
    public String nombreComun;

    public SerVivo(String nombreCientifico, String nombreComun) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }
    
    public abstract void alimentar();
}
