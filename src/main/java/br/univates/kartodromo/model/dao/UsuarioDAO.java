/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.dao;

/**
 *
 * @author Arthur
 */
public class UsuarioDAO extends BaseDAO {

    // TESTE
    public boolean validateUser(String user, String password) {
        StringBuilder query = new StringBuilder();

        query.append(" select * ");
        query.append(" from   usuarios usua ");
        query.append(" where  usua.user = " + user);
        query.append(" and    usua.password = " + password);

        return false;
    }
}
