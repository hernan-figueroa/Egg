/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import javax.persistence.*;

/**
 *
 * @author Hernan
 */
public abstract class DAO {

    
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Ejercicio02PU");
    protected EntityManager em = EMF.createEntityManager();

    public EntityManager getEm() {
        return em;
    }

    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
}
