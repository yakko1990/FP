package ArrayList.Ej6_AlmacenBebidas2;

public class Producto {
    private int identificador;
    private String nombre;
    private String localizacion;
    private String marca;
    private double precio;

    public Producto(){
        this.identificador = 000;
        this.nombre = "producto";
        this.localizacion = "";
        this.precio = 0;
        this.marca = "";
    }

    public Producto(int identificador, String nombre, String localizacion, double precio, String marca) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.precio = precio;
        this.marca = marca;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", localizacion='").append(localizacion).append('\'');
        sb.append(", precio=").append(precio).append('\'');
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
