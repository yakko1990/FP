package MasEjercicios.j_VehiculosInterfaces;

public class Motocicleta implements Vehiculo {
    int velocidad = 0;

    @Override
    public String frenar(int vel) {
        if ((velocidad - vel) <= 0)
            velocidad = 0;
        else
            velocidad -= vel;
        return "La moto ha frenado y va a " + velocidad + "km/h";
    }

    @Override
    public String acelerar(int vel) {
        String cadena = "";
        velocidad += vel;
        if (velocidad > VMAX)
            cadena = "EXCESO DE VELOCIDAD. REDUZCA\n";
        cadena += "La moto ha acelerado y va a " + velocidad + "km/h";
        return cadena;
    }
}
