package ArrayList.Ej6_AlmacenBebidas2;


public abstract class Bebida extends Producto {
    private String envase;

    public Bebida() {
        super();
        this.envase = "lata";
    }

    public Bebida(int identificador, String nombre, String localizacion, double precio, String envase, String marca) {
        super(identificador, nombre, localizacion, precio, marca);
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
