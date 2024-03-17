package Vehiculos;


public class ExVehiculo extends Exception {


    private String mError; // Mensaje asociado al codigo de excepcion

    static final int MAL_TAMANIO = 1;
    static final int MAL_LETRA = 2;
    static final int MAL_COLOR = 3;
    static final int MAL_DESCONOCIDO = 4;

    //Constructores


    public ExVehiculo() {
    }

    public ExVehiculo(String s) {
        super(s);
    }

    public ExVehiculo(int malFormada) {
        switch (malFormada) {
            case 1:
                mError = "*** ERROR: Tamanho de matrícula incorrecto";
                break;
            case 2:
                mError = "*** ERROR: Letras de matrícula incorrecta";
                break;
            case 3:
                mError = "*** ERROR: Color del vehiculo incorrecto";
                break;
            case 4:
                mError = "*** ERROR: Error desconocido";
                break;
        }
    }

    @Override
    public String getMessage() {
        return mError;
    }

}