package Alamcen;

public class Refresco extends Bebida{
    private double porcentajeAzucar;
    private boolean promocion;

    public Refresco(int id, String nombre, double precio, String marca, String localizacion, String envase, double porcentajeAzucar, boolean promocion) {
        super(id, nombre, precio, marca, localizacion, envase);
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

    }
}
