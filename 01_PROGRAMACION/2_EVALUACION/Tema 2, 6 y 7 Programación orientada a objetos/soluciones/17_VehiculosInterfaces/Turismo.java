package MasEjercicios.j_VehiculosInterfaces;

public class Turismo implements Vehiculo {
    int velocidad = 0;

    @Override
    public String frenar(int vel) {
        if ((velocidad - vel) <= 0)
            velocidad = 0;
        else
            velocidad -= vel;
        return "El coche ha frenado y va a " + velocidad + "km/h";
    }

    @Override
    public String acelerar(int vel) {
        String cadena = "";
        velocidad += vel;
        if (velocidad > VMAX)
            cadena = "EXCESO DE VELOCIDAD. REDUZCA\n";
        cadena += "El coche ha acelerado y va a " + velocidad + "km/h";
        return cadena;
    }
}
