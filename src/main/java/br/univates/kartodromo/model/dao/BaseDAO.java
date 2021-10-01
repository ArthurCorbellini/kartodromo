/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.dao;

import br.univates.kartodromo.util.HibernateUtil;
import java.util.Arrays;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Arthur
 */
public class BaseDAO {
    
        public <T> List<T> getAll(Class<T> exampleClass) {
        List<T> listReturn = null;

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery criteriaQuery = builder.createQuery(exampleClass);
            criteriaQuery.from(exampleClass);

            listReturn = session.createQuery(criteriaQuery).getResultList();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            session.close();
        }
        return listReturn;
    }

    public void insert(Object entity) {
        insert(Arrays.asList(entity));
    }

    public void update(Object entity) {
        update(Arrays.asList(entity));
    }

    public void delete(Object entity) {
        delete(Arrays.asList(entity));
    }

    public void insert(List<Object> entityList) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();

//            entityList.stream().forEach(v -> sessao.save(v));
            for (Object entity : entityList) {
                sessao.save(entity);
            }
            transacao.commit();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
    }

    public void update(List<Object> entityList) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();

            for (Object entity : entityList) {
                sessao.update(entity);
            }
            transacao.commit();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
    }

    public void delete(List<Object> entityList) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();

            for (Object entity : entityList) {
                sessao.delete(entity);
            }
            transacao.commit();
        } catch (HibernateException hibEx) {
            hibEx.printStackTrace();
        } finally {
            sessao.close();
        }
    }

}
