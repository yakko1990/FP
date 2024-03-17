package ArrayList.Ej6_AlmacenBebidas2;

/**
 * En un almacén se guardan productos de alimentación y bebidas. Existirán 2 tipos de bebidas: agua mineral y refrescos. De todos los productos nos interesa saber su identificador, nombre, precio, marca y localizacion.
 *
 * Para las bebidas necesitaremos también conocer el tipo de envase en el que se presenta.
 *
 * Si es agua mineral nos interesa saber también el origen. Por el contrario, para los refrescos, queremos saber su porcentaje de azúcar y si tiene o no alguna promoción (para aplicar un descuento del 15% en el precio).
 *
 * El precio del agua mineral variará en función de 2 criterios: en caso de que se presente en envase de cristal, su precio se incrementará un 10%; además, la marca "aguarón" supondrá un plus de 0,30€.
 *
 * En el caso de los refrescos, si vienen en lata, valdrán un 5% menos, mientras que si su porcentaje de azúcar es superior al 10%, supondrá un 10% de incremento sobre el precio. Por último, deberá aplicarse el descuento correspondiente en caso de que tenga promoción.
 *
 * Los productos de alimentación registrarán su categoría y se deberá indicar si contienen o no gluten.
 *
 * Las operaciones del almacén son las siguientes:
 *
 * Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.
 * Calcular el precio total de una marca de producto: dada una marca, calcular el precio total de esas bebidas.
 * Agregar producto: agrega un producto en la primera posición libre, si el identificador está repetido en alguna de las bebidas, no se agregará esa bebida.
 * Eliminar un producto: dado un ID, eliminar el producto del almacén.
 * Mostrar información: mostramos para cada refresco toda su información.
 * */

public class Principal {
    public static void main(String[] args) {
        gestionAlmacen();
    }

    public static void gestionAlmacen() {
        Almacen a = new Almacen();
        a.agregarProducto(new AguaMineral(1,"agua sousas","Gadis Teis",1.20,"botella de cristal","Sousas", "Agua de Sousas"));
        a.agregarProducto(new AguaMineral(2,"Aguarón","Froiz Plaza E",0.75,"botella de plástico", "Sierra nevada", "aguarón"));
        a.agregarProducto(new ProductoAlimentacion(301, "Patatas fritas", "Gadis travesia", 1.2, true, "Snacks", "Lays"));
        a.agregarProducto(new AguaMineral(3,"Agua mondariz","Mercadona Aragón",1.10,"botella de cristal","Mondariz", "Aguas de Mondariz"));
        a.agregarProducto(new Refresco());
        a.agregarProducto(new ProductoAlimentacion(305, "Chocolate", "Eroski Garcia Barbon", 2.5, false, "Snacks", "Valor"));
        a.agregarProducto(new Refresco(4,"Kas Naranja","Lidl Teis",1.00,"lata",7.0, "Pepsico", true));
        a.agregarProducto(new AguaMineral(101, "manantial1", "zona1", 2, "botella cristal", "Trescasas" ,"Bezoya"));
        a.agregarProducto(new AguaMineral(102, "manantial2", "zona3", 1, "botella plástico", "Mondariz", "Aguas de Mondariz"));
        a.agregarProducto(new Refresco(201, "Fanta", "zona1", 2, "lata", 5, "Pepsico", false));
        a.agregarProducto(new Refresco(202, "Nestea", "zona3", 1.5, "lata", 8, "Nestle", false));
        a.agregarProducto(new Refresco(203, "Aquarius", "zona2", 2, "botella plástico", 9, "Cocacola", true));

        a.mostrarProductos();

        a.eliminarProducto(202);

        a.mostrarProductos();

        a.calcularPrecioBebidas();

        a.calcularPrecioMarca("Pepsico");
        a.calcularPrecioMarca("Nestle");
    }
}
