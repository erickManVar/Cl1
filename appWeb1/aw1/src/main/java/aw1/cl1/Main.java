package aw1.cl1;

public class Main {
	public static void main(String[] args) {
	    ProductoDao productoDao = new ProductoDaoImpl();

	    // Crear un nuevo producto
	    Producto nuevoProducto = new Producto();
	    nuevoProducto.setNombre("Nuevo producto");
	    nuevoProducto.setPrecio(100.0);
	    nuevoProducto.setCantidad(10);

	    // Insertar el nuevo producto
	    productoDao.insertar(nuevoProducto);
	}

}
