package ArrayList.Ej6_AlmacenBebidas2;



public class ProductoAlimentacion extends Producto {

    private String categoria;
    private boolean sinGluten;

    public ProductoAlimentacion() {
        super();
        this.sinGluten = true;
        this.categoria = "conservas";
    }

    public ProductoAlimentacion(int identificador, String nombre, String localizacion, double precio, boolean sinGluten, String categoria, String marca) {
        super(identificador, nombre, localizacion, precio, marca);
        this.sinGluten = sinGluten;
        this.categoria = categoria;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
