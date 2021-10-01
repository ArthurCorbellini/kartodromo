/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.controller;

import br.univates.kartodromo.model.dao.TracadoDAO;
import br.univates.kartodromo.model.entity.Tracado;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class TracadoController {
    
    private final TracadoDAO getTracadoDAO = new TracadoDAO();

    public List<Tracado> getAll() {
        return getTracadoDAO.getAll(Tracado.class);
    }
}
