package inventario;

/**
 * @author Laura Vacas
 * @version 1.0.0
 * @since 2025/03/04
 */
public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    /**
     * Método de fábrica para crear un nuevo Producto
     *
     * @param nombre El nombre del producto
     * @param precio El precio del producto
     * @param stock El stock del producto
     * @return el nuevo producto creado
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {

        Producto p = new Producto();

        p.nombre = nombre;

        p.precio = precio;

        p.stock = stock;

        return p;
    }

    /**
     * Obtiene el nombre del producto
     *
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del producto
     *
     * @param nombre nuevo valor que se le da a nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto
     *
     * @return el precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio del producto
     *
     * @param precio nuevo valor que se le da a precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el stock del producto
     *
     * @return el stock del producto
     */
    public int getStock() {
        return stock;
    }

    /**
     * Cambia el stock del producto
     *
     * @param stock nuevo valor que se le da al stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Imprime por pantalla la información del producto
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

}
