/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.controller;

import br.univates.kartodromo.model.dao.AuditoriaDAO;
import br.univates.kartodromo.model.entity.Auditoria;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class AuditoriaController {

    private final AuditoriaDAO getAuditoriaDAO = new AuditoriaDAO();

    public List<Auditoria> getAll() {
        return getAuditoriaDAO.getAll(Auditoria.class);
    }
}
