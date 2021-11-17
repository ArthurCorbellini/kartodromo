/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.controller;

import br.univates.kartodromo.model.dao.ClienteDAO;
import br.univates.kartodromo.model.entity.Cliente;
import java.util.List;

/**
 *
 * @author Arthur
 */
public class ClienteController {

    private final ClienteDAO getClienteDAO = new ClienteDAO();

    public List<Cliente> getAll() {
        return getClienteDAO.getAll(Cliente.class);
    }
}
