/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.Universidad;


public class Docente extends Persona {

    private String materia;

    public Docente(String materia, String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        super(nombre, edad, DNI, sexo, peso, altura);
        this.materia = materia;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}

