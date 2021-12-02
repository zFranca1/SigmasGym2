/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Exercicio;
import br.edu.ifsp.pep.model.FichaTreino;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author joaop
 */
public class ExercicioDAO {

    private EntityManagerFactory emf;

    public ExercicioDAO() {

        this.emf = Persistence.createEntityManagerFactory("SigmasGymPU");

    }

    public EntityManager getEntityManager() {

        return this.emf.createEntityManager();

    }

    public void insert(Exercicio ex) {

        System.out.println("Exercicio adicionado");

        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(ex);
        em.getTransaction().commit();
        em.close();
    }

    public List<Exercicio> listExercises() {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<Exercicio> query = em.createNamedQuery("Exercicio.listar", Exercicio.class);

        return query.getResultList();

    }

    public List<Exercicio> listByName(String nome) {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<Exercicio> query = em.createNamedQuery("Exercicio.listaNomes", Exercicio.class);
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }

    public void delete(Exercicio av) {

        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        System.out.println(av.toString());
        em.remove(em.merge(av));
        em.getTransaction().commit();
        em.close();

    }
    
    public void atualizaExercicio(Exercicio ex, int codigo) {

        EntityManager em = this.emf.createEntityManager();

        System.out.println(ex.getNome());
        em.getTransaction().begin();
        ex.setCodigoExercicio(codigo);
        em.merge(ex);

        em.getTransaction().commit();
        em.close();

    }

}
