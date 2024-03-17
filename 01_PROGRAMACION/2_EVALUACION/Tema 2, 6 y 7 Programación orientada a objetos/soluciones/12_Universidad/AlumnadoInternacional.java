/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.Universidad;

/**
 * @author nccasares
 */
public class AlumnadoInternacional extends Alumnado {
    private String pais;

    public AlumnadoInternacional(String pais, String escuela, String grado, String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        super(escuela, grado, nombre, edad, DNI, sexo, peso, altura);
        this.pais = pais;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Pais: " + pais);
    }

    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }
}
