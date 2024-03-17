package Alamcen;

public class Aimentacion extends Producto {
    private String categoria;
    private boolean gluten;

    public Aimentacion(int id, String nombre, double precio, String marca, String localizacion, String categoria, boolean gluten) {
        super(id, nombre, precio, marca, localizacion);
        this.categoria = categoria;
        this.gluten = gluten;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }
}
