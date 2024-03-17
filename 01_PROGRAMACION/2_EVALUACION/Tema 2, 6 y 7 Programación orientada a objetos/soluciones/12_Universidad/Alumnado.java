/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.Universidad;

/**
 * @author nccasares
 */
public class Alumnado extends Persona {
    private String escuela, grado;

    public Alumnado(String escuela, String grado, String nome, int edad, String DNI, char sexo, double peso, double altura) {
        super(nome, edad, DNI, sexo, peso, altura);
        this.escuela = escuela;
        this.grado = grado;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escuela: " + escuela);
        System.out.println("Grado: " + grado);
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}

 
