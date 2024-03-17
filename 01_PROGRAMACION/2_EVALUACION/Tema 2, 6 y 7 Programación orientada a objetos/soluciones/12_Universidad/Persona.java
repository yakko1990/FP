/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.Universidad;

/**
 * @author nccasares
 */

public class Persona {
    private String nombre, DNI;
    private int edad;
    private char sexo;
    private double peso, altura;

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;

        if (esCorrectaEdad(edad) && esMayorDeEdad(edad)) {
            this.edad = edad;
        } else {
            System.out.println("persona no creada");
            this.nombre = null;
            return;
        }

        if (esCorrectoSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.nombre = null;
            this.edad = 0;
            System.out.println("persona no creada");
            return;
        }

        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esCorrectoSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return true;
        } else {
            System.out.println(sexo + " no es un valor válido para el sexo.");
            return false;
        }
    }

    private boolean esCorrectaEdad(int edad) {
        if (edad >= 0 && edad <= 150) {
            return true;
        } else {
            System.out.println(edad + " no es un valor válido para la edad.");
            return false;
        }
    }

    public void mostrarInfo() {
        System.out.println("---------------------");
        System.out.println("Informacion personal");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + DNI);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (esCorrectaEdad(edad)) {
            this.edad = edad;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (esCorrectoSexo(sexo)) {
            this.sexo = sexo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
