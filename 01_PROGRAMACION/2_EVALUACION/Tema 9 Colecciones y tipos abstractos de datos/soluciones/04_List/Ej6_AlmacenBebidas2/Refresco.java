package ArrayList.Ej6_AlmacenBebidas2;


public class Refresco extends Bebida {

    private double porcentajeAzucar;

    private boolean promocion;

    public Refresco() {
        super();
        this.porcentajeAzucar = 0;
    }

    public Refresco(int identificador, String nombre, String localizacion, double precio, String envase, double porcentajeAzucar, String marca, boolean promocion) {
        super(identificador, nombre, localizacion, precio, envase, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    void calcularPrecio() {
        if (getEnvase().equals("lata")) setPrecio(getPrecio()*0.95);
        if (getPorcentajeAzucar() > 10) setPrecio(getPrecio()*1.1);
        if (isPromocion()) setPrecio(getPrecio()*0.85);
    }
}
