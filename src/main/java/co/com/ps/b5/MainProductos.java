package co.com.ps.b5;

public class MainProductos {
    public static void main(String[] args) {
        System.out.println("Lista de productos:");

        for (Productos producto : Productos.values()) {
            System.out.println(producto.getNombre());
        }
    }
}
