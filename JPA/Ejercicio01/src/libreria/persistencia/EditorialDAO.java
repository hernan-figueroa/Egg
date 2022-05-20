/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author Hernan
 */
public final class EditorialDAO extends DAO{
    
     public void guardar(Editorial editorial){
         conectar();
         em.getTransaction().begin();
         em.persist(editorial);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void editar(Editorial editorial){
         conectar();
         em.getTransaction().begin();
         em.merge(editorial);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void eliminar(Editorial editorial){
         conectar();
         em.getTransaction().begin();
         em.remove(editorial);
         em.getTransaction().commit();
         desconectar();
     }
}
