/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Autor;

/**
 *
 * @author Hernan
 */
public final class AutorDAO extends DAO{
    
     public void guardar(Autor autor){
         conectar();
         em.getTransaction().begin();
         em.persist(autor);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void editar(Autor autor){
         conectar();
         em.getTransaction().begin();
         em.merge(autor);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void eliminar(Autor autor){
         conectar();
         em.getTransaction().begin();
         em.remove(autor);
         em.getTransaction().commit();
         desconectar();
     }
     
     public Autor buscarAutor(String name){
         Autor autor = 
                 (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :name").setParameter("name", name).getSingleResult();
         return autor;
     }
     

}
