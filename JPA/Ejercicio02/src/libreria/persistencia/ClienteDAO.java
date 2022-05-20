/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Cliente;

/**
 *
 * @author Hernan
 */
public class ClienteDAO extends DAO{
    public void guardar(Cliente cliente){
         conectar();
         em.getTransaction().begin();
         em.persist(cliente);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void editar(Cliente cliente){
         conectar();
         em.getTransaction().begin();
         em.merge(cliente);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void eliminar(Cliente cliente){
         conectar();
         em.getTransaction().begin();
         em.remove(cliente);
         em.getTransaction().commit();
         desconectar();
     }
     
     public Cliente buscarCliente(String id){
         Cliente cliente = 
                 (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.id = :id").setParameter("id", id).getSingleResult();
         return cliente;
     }
}
