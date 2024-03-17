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
public class Vegetal extends SerVivo{
    private int altura;

    public Vegetal(String nombreCientifico, String nombreComun) {
        super(nombreCientifico, nombreComun);
    }
    
    public Vegetal(String nombreCientifico, String nombreComun, int a) {
        super(nombreCientifico, nombreComun);
        this.altura = a;
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando vegetal");
    }
    
}
