/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.dao.UsuarioDAO;
import br.univates.kartodromo.model.Usuario;

/**
 *
 * @author Arthur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario entity = new Usuario(1, "Arthur");
        
        UsuarioDAO dao = new UsuarioDAO();
        
        dao.insert(entity);
    }

}
