/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.model.dao.MarcaDAO;
import br.univates.kartodromo.model.dao.TracadoDAO;
import br.univates.kartodromo.model.dao.UsuarioDAO;
import br.univates.kartodromo.model.entity.Marca;
import br.univates.kartodromo.model.entity.Tracado;
import br.univates.kartodromo.model.entity.Usuario;
import br.univates.kartodromo.model.entity.Veiculo;
import java.math.BigDecimal;

/**
 *
 * @author Arthur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TESTES DE INSERÇÃO
        // ------------------
        
//        Usuario teste = new Usuario();
//        
//        teste.setId(3);
//        teste.setName("teste3");
//        
//        UsuarioDAO dao = new UsuarioDAO();
//        dao.insert(teste);
        
        Tracado tracado = new Tracado(3);
        
        
        
                     
        tracado.setNome("teste2");
        tracado.setTamanho(new BigDecimal(100));

        TracadoDAO tracadoDAO = new TracadoDAO();
        tracadoDAO.insert(tracado);

        // ------------------
        
    }

}
