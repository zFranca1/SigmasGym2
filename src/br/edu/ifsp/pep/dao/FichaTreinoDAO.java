/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.FichaTreino;
import br.edu.ifsp.pep.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author joaop
 */
public class FichaTreinoDAO {

    private EntityManagerFactory emf;

    public FichaTreinoDAO() {

        this.emf = Persistence.createEntityManagerFactory("Academia2PU");
    }

    public EntityManager getEntityManager() {

        return this.emf.createEntityManager();

    }
    
    public void insert(FichaTreino av) {


        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(av);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<FichaTreino> listAluno(Usuario aluno) {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<FichaTreino> query = em.createNamedQuery("FichaTreino.listAlunos", FichaTreino.class);
        query.setParameter("aluno", aluno);

        return query.getResultList();
    }
    public List<FichaTreino> listNomes(String nome) {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<FichaTreino> query = em.createNamedQuery("FichaTreino.listaNomes", FichaTreino.class);
        query.setParameter("aluno", "%" + nome + "%");

        return query.getResultList();
    }

    public List<FichaTreino> listar() {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<FichaTreino> query = em.createNamedQuery("FichaTreino.listar", FichaTreino.class);

        return query.getResultList();
    }
    
    public List<FichaTreino> listFichaTreino() {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<FichaTreino> query = em.createNamedQuery("avaliacao.listar", FichaTreino.class);

        return query.getResultList();
    }

}
