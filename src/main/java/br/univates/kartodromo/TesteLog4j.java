/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

import org.apache.log4j.Logger;

/**
 *
 * @author Arthur
 */
public class TesteLog4j {

    static final Logger logger = Logger.getLogger(TesteLog4j.class);

    public static void main(String[] args) {
        TesteLog4j teste = new TesteLog4j();

        try {
            teste.dividir();
        } catch (Exception e) {
            logger.error("erro ao dividir", e);
        }
    }

    private void dividir() {
        int i = 20 / 0;
    }
}
