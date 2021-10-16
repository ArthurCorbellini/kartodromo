/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.model.dao.UsuarioDAO;
import br.univates.kartodromo.model.entity.Usuario;
import br.univates.kartodromo.model.type.PerfilType;

/**
 *
 * @author Arthur
 */
public class Main {

    public static void main(String[] args) {
//        Usuario user = new Usuario();
//        
//        user.setLogin("adm");
//        user.setSenha("adm");
//        user.setNome("Administrador");
//        user.setPerfil(PerfilType.ADMIN);
//        
//        UsuarioDAO dao = new UsuarioDAO();        
//        dao.insert(user);
        
        SystemKartodromo sys = SystemKartodromo.getInstance();
        sys.start();
    }

}
