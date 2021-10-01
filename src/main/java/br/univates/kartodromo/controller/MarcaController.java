/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.controller;

import br.univates.kartodromo.model.dao.MarcaDAO;
import br.univates.kartodromo.model.entity.Marca;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class MarcaController {

    private final MarcaDAO getMarcaDAO = new MarcaDAO();

    public List<Marca> getAll() {
        return getMarcaDAO.getAll(Marca.class);
    }
}
