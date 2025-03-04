package inventario;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public static Producto crearProducto(String nombre, double precio, int stock) {
        
        Producto p = new Producto();
        
        p.nombre = nombre;
        
        p.precio = precio;
        
        p.stock = stock;
        
        return p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

    public void borrarDatos() {
        nombre = "";
        precio = 0.0;
        stock = 0;
    }
}