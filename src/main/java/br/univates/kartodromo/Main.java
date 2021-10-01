/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.controller.AuditoriaController;
import br.univates.kartodromo.controller.UsuarioController;
import br.univates.kartodromo.model.dao.MarcaDAO;
import br.univates.kartodromo.model.dao.TracadoDAO;
import br.univates.kartodromo.model.dao.UsuarioDAO;
import br.univates.kartodromo.model.entity.Auditoria;
import br.univates.kartodromo.model.entity.Marca;
import br.univates.kartodromo.model.entity.Tracado;
import br.univates.kartodromo.model.entity.Usuario;
import br.univates.kartodromo.model.entity.Veiculo;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TESTE DE INSERÇÃO
        UsuarioDAO dao = new UsuarioDAO();
        Usuario entity = new Usuario(11);
        entity.setName("teste");

        dao.insert(entity);
    }

}
