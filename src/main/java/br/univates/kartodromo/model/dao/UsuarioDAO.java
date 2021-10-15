/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.dao;

import javax.persistence.Query;

/**
 *
 * @author Arthur
 */
public class UsuarioDAO extends BaseDAO {

    public boolean validateUser(String user, String password) {
        StringBuilder stringQuery = new StringBuilder();

        stringQuery.append(" select exists (select tx_login ");
        stringQuery.append("                from   usuarios ");
        stringQuery.append("                where  tx_login = '" + user + "' ");
        stringQuery.append("                and    tx_senha = '" + password + "') ");

        Query query = getEntityManager().createNativeQuery(stringQuery.toString());

        return (boolean) query.getSingleResult();
    }
}
