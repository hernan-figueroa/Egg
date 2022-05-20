/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Hernan
 */
public class EditorialServicio {

    EditorialDAO eDAO = new EditorialDAO();

    public void guardarEditorial(Editorial editorial) {

        eDAO.guardar(editorial);
    }

    public void bajaEditorial(Integer id) {

        Editorial editorial = eDAO.getEm().find(Editorial.class, id);
        editorial.setAlta(false);
        eDAO.editar(editorial);
    }

    public void altaEditorial(Integer id) {

        Editorial editorial = eDAO.getEm().find(Editorial.class, id);
        editorial.setAlta(true);
        eDAO.editar(editorial);
    }
}
