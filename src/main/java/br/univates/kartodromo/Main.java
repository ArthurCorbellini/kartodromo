/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.controller.ClienteController;
import br.univates.kartodromo.model.dao.BaseDAO;

/**
 *
 * @author Arthur
 */
public class Main {

    static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TesteLog4j.class);

    public static void main(String[] args) {
        try {
            new ClienteController().getAll();
        } catch (Exception e) {
            BaseDAO.firstExecutionProcess();
            BaseDAO.populateDataBase();
        }

        SystemKartodromo sys = SystemKartodromo.getInstance();
        sys.start();
    }

}
