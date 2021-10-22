/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo;

/**
 *
 * @author Arthur
 */
public class Main {

    public static void main(String[] args) {       
        SystemKartodromo sys = SystemKartodromo.getInstance();
        sys.start();
    }

}
