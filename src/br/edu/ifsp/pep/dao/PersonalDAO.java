/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Personal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author joaop
 */
public class PersonalDAO {

    private EntityManagerFactory emf;

    public PersonalDAO() {
        this.emf = Persistence.createEntityManagerFactory("SigmasGymPU");
    }

    public EntityManager getEntityManager() {

        return this.emf.createEntityManager();

    }

    public void insert(Personal pe) {
        System.out.println("Personal Adicionado");

        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(pe);
        em.getTransaction().commit();
        em.close();
    }

    public List<Personal> listPersonal() {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<Personal> query = em.createNamedQuery("Personal.find", Personal.class);

        return query.getResultList();

    }

    public List<Personal> listbyName(String nome) {

        EntityManager em = this.emf.createEntityManager();
        TypedQuery<Personal> query = em.createNamedQuery("Personal.findByName", Personal.class);

        return query.getResultList();

    }

}
