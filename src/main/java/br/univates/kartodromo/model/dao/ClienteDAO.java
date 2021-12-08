/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.dao;

import static br.univates.kartodromo.model.dao.BaseDAO.logger;
import br.univates.kartodromo.model.entity.Cliente;
import br.univates.kartodromo.util.HibernateUtil;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author JORGE
 */
public class ClienteDAO extends BaseDAO {

    public Cliente getById(int id) {
        EntityManager em = getEntityManager();
        return em.createQuery("select c from Cliente c where c.id = :id", Cliente.class)
                .setParameter("id", id)
                .getSingleResult();
    }

}
