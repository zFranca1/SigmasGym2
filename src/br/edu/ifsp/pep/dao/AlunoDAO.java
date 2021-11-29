/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Aluno;
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
public class AlunoDAO {

    private EntityManagerFactory emf;

    public AlunoDAO() {

        this.emf = Persistence.createEntityManagerFactory("SigmasGymPU");
    }

    public void insert(Aluno al) {

        System.out.println("Aluno cadastrado");

        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(al);
        em.getTransaction().commit();
        em.close();

    }

    public List<Aluno> listAluno() {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<Aluno> query = em.createNamedQuery("Aluno.find", Aluno.class);

        return query.getResultList();

    }

    public List<Aluno> listbyName(String nome) {

        EntityManager em = this.emf.createEntityManager();
        TypedQuery<Aluno> query = em.createNamedQuery("Aluno.findByName", Aluno.class);

        return query.getResultList();

    }

}
