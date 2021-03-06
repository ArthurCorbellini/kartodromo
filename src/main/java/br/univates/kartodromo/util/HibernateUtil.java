/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Arthur
 */
public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Cria o registro
                // https://docs.jboss.org/hibernate/orm/5.3/javadocs/org/hibernate/boot/registry/class-use/StandardServiceRegistry.html
                registry = new StandardServiceRegistryBuilder().configure().build();

                // Cria o MetadataSources
                // https://docs.jboss.org/hibernate/orm/5.3/javadocs/org/hibernate/boot/MetadataSources.html
                MetadataSources sources = new MetadataSources(registry);

                // Create Metadata
                // https://docs.jboss.org/hibernate/orm/5.3/javadocs/org/hibernate/boot/Metadata.html
                Metadata metadata = sources.getMetadataBuilder().build();

                // Create SessionFactory
                // https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/SessionFactory.html
                sessionFactory = metadata.getSessionFactoryBuilder().build();

            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void closeConnections() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
