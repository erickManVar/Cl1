// App.java
package aw1.cl1;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductoDao dao = new ProductoDaoImpl();
        
        // insert a new Producto
        Producto producto = new Producto();
        producto.setNombre("Producto Test");
        producto.setPrecio(100.0);
        producto.setCantidad(10);
        dao.insertar(producto);
        
        // fetch all Producto from the database
        List<Producto> productos = dao.obtenerTodos();
        
        // print all Producto to the console
        for (Producto p : productos) {
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() + ", Precio: " + p.getPrecio() + ", Cantidad: " + p.getCantidad());
        }
    }
}
