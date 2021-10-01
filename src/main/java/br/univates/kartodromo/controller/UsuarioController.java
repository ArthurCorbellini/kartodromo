/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.controller;

import br.univates.kartodromo.model.dao.UsuarioDAO;
import br.univates.kartodromo.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class UsuarioController {
 
      private final UsuarioDAO getAuditoriaDAO = new UsuarioDAO();
    
    public List<Usuario> getAll(){
        return getAuditoriaDAO.getAll(Usuario.class);
    }
    
}
