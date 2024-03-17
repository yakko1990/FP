

package Vehiculos;


import java.util.Arrays;

public class Vehiculo {

    //Atributo de matrícula
    private String[] colores = {"rojo", "azul", "blanco", "gris", "negro"};
    private String mat;
    private String color;
    private String modelo;
    private int anhoFab;
    //Constructor

    public Vehiculo(String color, String modelo, String mat, int anhoFab) throws ExVehiculo {
        validarMat(mat);
        validarColor(color);
        this.anhoFab = anhoFab;
        this.modelo = modelo;
    }

    //Retornamos la matrícula validada
    public String getmat() {
        return mat;
    }

    //---------------
    //COMPROBACIONES
    //---------------

    private void validarMat(String mat) throws ExVehiculo {
        //Comprobaciones previas a crear el objeto matrícula

        if (mat.length() != 7)
            //Lanzamos una excepcion por tamaño incorrecto
            throw new ExVehiculo(ExVehiculo.MAL_TAMANIO);
        else if (!verLetra(mat))
            //Lanzamos una excepcion por faltar la letra
            throw new ExVehiculo(ExVehiculo.MAL_LETRA);
        else
            this.mat = mat;
    }

    private boolean verLetra(String mat) {
        //Devuelve true si la matrícula comienza por una letra
        return mat.substring(mat.length()-3, 7).matches("[A-Za-z]{3}");
    }

    private void validarColor(String color) throws ExVehiculo {
        if (!Arrays.asList(colores).contains(color))
            throw new ExVehiculo(ExVehiculo.MAL_COLOR);
        else
            this.color = color;
    }

    @Override
    public String toString() {
        return "\nModelo: " + this.modelo + "\nColor: " + this.color + "\nMatricula: " + this.mat + "\nAnho de fabricacion: " + this.anhoFab;
    }

    //---------------
    //GETTERS Y SETTERS
    //---------------

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnhoFab() {
        return anhoFab;
    }

    public void setAnhoFab(int anhoFab) {
        this.anhoFab = anhoFab;
    }
}