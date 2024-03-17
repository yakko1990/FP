package Alamcen;

public abstract class Bebida extends Producto {
    private String envase;


    public Bebida(int id, String nombre, double precio, String marca, String localizacion, String envase) {
        super(id, nombre, precio, marca, localizacion);
        this.envase = envase;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    abstract void calcularPrecio();
}
