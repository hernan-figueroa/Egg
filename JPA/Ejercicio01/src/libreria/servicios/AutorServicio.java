/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Hernan
 */
public class AutorServicio {

    AutorDAO aDAO = new AutorDAO();
    
    public void guardarAutor(Autor autor) {
        aDAO.guardar(autor);
    }
    
    public void bajaAutor(Integer id) {
        
        Autor autor = aDAO.getEm().find(Autor.class, id);
        autor.setAlta(false);
        aDAO.editar(autor);
    }
    
    public void altaAutor(Integer id) {
        
        Autor autor = aDAO.getEm().find(Autor.class, id);
        autor.setAlta(true);
        aDAO.editar(autor);
    }
    
    public Autor buscarAutor(String name) {     
        Autor autor = aDAO.buscarAutor(name);
        return autor;        
    }
}
