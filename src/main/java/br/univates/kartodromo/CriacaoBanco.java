/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.model.dao.BaseDAO;

/**
 *
 * @author Arthur
 */
public class CriacaoBanco {

    // Classe para criar o banco de dacos. 
    // - Basta executar uma vez o método que os schemas do banco, tabelas, campos e triggers serão criados.
    // - Executar apenas quando o banco não estiver criado.
    // OBS.: A data base precisa ser criada a mão, com o nome de "kartodromo" para funcionar.
    public static void main(String[] args) {
        BaseDAO.firstExecutionProcess();
        
        System.exit(0);
    }

}
