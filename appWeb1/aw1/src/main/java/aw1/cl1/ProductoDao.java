// ProductoDao.java
package aw1.cl1;

import java.util.List;

public interface ProductoDao {
    void insertar(Producto producto);
    List<Producto> obtenerTodos();
    List<Producto> obtenerSinStock();
    
    Producto obtenerPorId(int id);
    void actualizar(Producto producto);
    void eliminar(int id);
}
