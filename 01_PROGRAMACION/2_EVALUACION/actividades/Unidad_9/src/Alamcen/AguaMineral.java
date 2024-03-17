package Alamcen;

public class AguaMineral extends Bebida {
    private String origen;

    public AguaMineral(int id, String nombre, double precio, String marca, String localizacion, String envase, String origen) {
        super(id, nombre, precio, marca, localizacion, envase);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    void calcularPrecio() {
        if (getEnvase().equals("botella de cristal")){

        }
    }
}
