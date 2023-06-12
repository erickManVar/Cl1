// ProductoDaoImpl.java
package aw1.cl1;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class ProductoDaoImpl implements ProductoDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW1_Ventas");
    EntityManager em = emf.createEntityManager();

    @Override
    public void insertar(Producto producto) {
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
    }

    @Override
    public List<Producto> obtenerTodos() {
        return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
    }

    @Override
    public Producto obtenerPorId(int id) {
        return em.find(Producto.class, id);
    }

    @Override
    public void actualizar(Producto producto) {
        em.getTransaction().begin();
        em.merge(producto);
        em.getTransaction().commit();
    }

    @Override
    public List<Producto> obtenerSinStock() {
        return em.createQuery("SELECT p FROM Producto p WHERE p.stock = 0", Producto.class).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Producto producto = obtenerPorId(id);
        if (producto != null) {
            em.getTransaction().begin();
            em.remove(producto);
            em.getTransaction().commit();
        }
    }
}
