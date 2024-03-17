package ArrayList.Ej6_AlmacenBebidas2;

import java.util.HashMap;
import java.util.Iterator;

public class Almacen {

    private HashMap<Integer, Producto> productos;
    private final int TAMANHO;
    private int idSiguiente = 0;

    Almacen(int tamanho) {
        productos = new HashMap<>();
        this.TAMANHO = tamanho;
    }

    Almacen() {
        productos = new HashMap<>();
        this.TAMANHO = 20;
    }

    public void agregarProducto(Producto p) {
        if (!existeProducto(p) && idSiguiente < TAMANHO) {
            productos.put(idSiguiente, p);
            idSiguiente++;
        } else {
            System.out.println("El producto ya existe o la colección está llena");
        }
    }

    public boolean existeProducto(Producto p) {//(int id)
        Iterator claves = productos.keySet().iterator();
        Producto prod;
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            prod = productos.get(codigo);
            if (prod.getIdentificador() == p.getIdentificador()) {
                return true;
            }
        }
        return false;
    }

    public void mostrarProductos() {
        System.out.println("ELEMENTOS EN ALMACEN:");
        Iterator claves = productos.keySet().iterator();
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            System.out.println(codigo + ": " + productos.get(codigo).toString());
        }
    }

    public void mostrarRefrescos() {
        System.out.println("REFRESCOS EN ALMACEN:");
        Iterator claves = productos.keySet().iterator();
        while (claves.hasNext()) {
            Producto p = productos.get((Integer) claves.next());
            if (p instanceof Refresco)
                System.out.println(p.getIdentificador() + ": " + p.toString());
        }
    }

    public void eliminarProducto(int id) {
        Iterator claves = productos.keySet().iterator();
        Producto prod;
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            prod = productos.get(codigo);
            if (prod.getIdentificador() == id) {
                productos.remove(codigo);
                System.out.println("Producto " + id + " eliminado");
                return;
            }
        }
        System.out.println("No se ha encontrado el elemento");
    }

    public void calcularPrecioBebidas() {
        double precio = 0;
        System.out.println("PRECIO BEBIDAS ALMACEN:");
        Iterator claves = productos.keySet().iterator();
        while (claves.hasNext()) {
            Producto p = productos.get((Integer) claves.next());
            if (p instanceof Refresco || p instanceof AguaMineral || p instanceof Bebida)
                precio += p.getPrecio();
        }
        System.out.println("El precio total de las bebidas en el almacen es: " + precio);
    }

    public void calcularPrecioMarca(String marca) {
        double precio = 0;
        System.out.println("PRECIO MARCA: " + marca);
        Iterator claves = productos.keySet().iterator();
        while (claves.hasNext()) {
            Producto p = productos.get((Integer) claves.next());
            if (p.getMarca().equals(marca))
                precio += p.getPrecio();
        }
        System.out.println("El precio total de la marca " + marca + " en el almacen es: " + precio);
    }
}
