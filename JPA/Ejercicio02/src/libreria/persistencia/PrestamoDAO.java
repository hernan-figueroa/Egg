/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Prestamo;

/**
 *
 * @author Hernan
 */
public final class PrestamoDAO extends DAO{
    
    public void guardar(Prestamo prestamo){
         conectar();
         em.getTransaction().begin();
         em.persist(prestamo);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void editar(Prestamo prestamo){
         conectar();
         em.getTransaction().begin();
         em.merge(prestamo);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void eliminar(Prestamo prestamo){
         conectar();
         em.getTransaction().begin();
         em.remove(prestamo);
         em.getTransaction().commit();
         desconectar();
     }
     
     public List<Prestamo> buscarPrestamoId(Integer id){
         List<Prestamo> prestamos = 
                        em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.id = :id").setParameter("id", id).getResultList();
         return prestamos;
     }
}
