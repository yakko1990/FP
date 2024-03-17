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
public class Animal extends SerVivo {

    private float peso;
    private int altura;

    public Animal(String nombreCientifico, String nombreComun) {
        super(nombreCientifico, nombreComun);
    }

    public Animal(String nombreCientifico, String nombreComun, float p, int a) {
        super(nombreCientifico, nombreComun);
        this.peso = p;
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando animal");
    }

}
