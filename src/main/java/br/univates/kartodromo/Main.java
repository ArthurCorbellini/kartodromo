/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import br.univates.kartodromo.view.form.FormLog;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arthur
 */
public class Main {

    static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TesteLog4j.class);
    
    public static void main(String[] args) {
        SystemKartodromo sys = SystemKartodromo.getInstance();
        sys.start();

//        try {
//            BigDecimal teste = new BigDecimal(100).divide(BigDecimal.ZERO);
//        } catch (Exception e) {
//            logger.error("HibernateException - metodo BaseDAO.populateDataBase", e);
//        }

    }

}
