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
        Tracado tracado = new Tracado(1);
        
        Marca marca = new Marca();
        marca.setNome("teste");
        marca.setContato("teste");

        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.insert(marca);
        
        
        tracado.setNome("teste");
        tracado.setTamanho(new BigDecimal(10));

        TracadoDAO tracadoDAO = new TracadoDAO();
        tracadoDAO.insert(tracado);

        // ------------------
        
    }

}
