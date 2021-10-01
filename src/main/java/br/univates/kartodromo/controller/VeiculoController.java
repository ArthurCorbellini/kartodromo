/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.controller;

import br.univates.kartodromo.model.dao.VeiculoDAO;
import br.univates.kartodromo.model.entity.Veiculo;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class VeiculoController {
    
    private final VeiculoDAO getVeiculoDAO = new VeiculoDAO();

    public List<Veiculo> getAll() {
        return getVeiculoDAO.getAll(Veiculo.class);
    }
}
