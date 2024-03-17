package Excepciones.Vehiculos;

import java.util.ArrayList;

// Implementa un programa que almacene 5 vehiculos en una lista.
// De cada vehiculo se almacena color, modelo, matrícula y año de fabricación.
// Cada vez que recoja una matrícula, deberá verificar que tenga el formato adecuado
// ( longitud = 7 y 3 letras al final). En caso de que la matrícula no cumpla alguna
// de las 2 condiciones, se lanzará una excepción.
// En caso de que el color no sea válido ( rojo, azul, blanco, gris o negro) también
// se lanzará una excepción que será capturada en el programa principal.
// Las comprobaciones no deberán ser realaizadas en el programa principal.
// Las excepciones deberán ser personalizadas y se empleará para ello una única clase
// en la que, en función del código de error que reciba, se generarça un mensaje de error u otro.
public class principal extends Excepciones {


    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        try {
            vehiculos.add(new Vehiculo("rojo", "Toyota", "1234ABC", 2020));
            vehiculos.add(new Vehiculo("azul", "Honda", "5678DEF", 2018));
            vehiculos.add(new Vehiculo("blanco", "Ford", "9012GHI", 2019));
            vehiculos.add(new Vehiculo("gris", "Chevrolet", "3456JKL", 2021));
            vehiculos.add(new Vehiculo("negro", "Nissan", "7890MNO", 2017));

        }
        catch (MatriculaException | ColorException e) {
            System.out.println("Error al crear un vehículo: " + e.getMessage());
        }

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Color: " + vehiculo.getColor() + ", Modelo: " + vehiculo.getModelo() +
                    ", Matrícula: " + vehiculo.getMatricula() + ", Año de fabricación: " + vehiculo.getAnioFabricacion());
        }
    }
}

