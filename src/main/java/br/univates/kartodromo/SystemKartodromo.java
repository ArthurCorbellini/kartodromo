/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.model.dao.BaseDAO;
import br.univates.kartodromo.view.Login;

/**
 *
 * @author Arthur
 */
public class SystemKartodromo {

    private static SystemKartodromo sys = new SystemKartodromo();

    public static SystemKartodromo getInstance() {
        return sys;
    }

    public void start() {
        BaseDAO.connect();
        
        new Login().setVisible(true);
    }

}
