/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.dao;

import br.univates.kartodromo.SystemKartodromo;
import br.univates.kartodromo.model.entity.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Arthur
 */
public class UsuarioDAO extends BaseDAO {

    private static Usuario loggedUser;

    public static Usuario getLoggedUser() {
        return loggedUser;
    }

    public static boolean validateUser(String user, String password) {
        StringBuilder stringQuery = new StringBuilder();
        
        stringQuery.append(" from   Usuario ");
        stringQuery.append(" where  tx_login = '" + user + "' ");
        stringQuery.append(" and    tx_senha = '" + encrypt(password) + "' ");

        Query query = getEntityManager().createQuery(stringQuery.toString());

        List<Usuario> resultList = query.getResultList();
        
        if (resultList.isEmpty()) {
            return false;
        } else {
            loggedUser = resultList.get(0);
            return true;
        }
    }

    @Override
    public void insert(Object entity) {
        Usuario user = (Usuario) entity;
        user.setSenha(encrypt(user.getSenha()));

        super.insert(user);
    }

    private static String encrypt(String password) {
        String retorno = new String();

        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));

            retorno = hash.toString(16);
        } catch (Exception e) {
        }

        return retorno;
    }

}
