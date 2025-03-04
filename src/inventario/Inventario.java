package inventario;

import java.util.ArrayList;

/**
 *
 * @author Laura Vacas
 * @version 1.0.0
 * @since 2025/03/04
 */
public class Inventario {

    public ArrayList<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Agrega productos a la lista de productos (ArrayList)
     *
     * @param p el producto a agregar a la lista
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    /**
     * Método para mostrar la informacion de cada uno de los productos
     * 
     * @throws IndexOutOfBoundsException 
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    /**
     * Metodo main
     * @param args argumentos
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);

        inventario.agregar(p1);
        inventario.agregar(p2);

        System.out.println("Inventario de productos:");
        inventario.mostrar();

    }
}
