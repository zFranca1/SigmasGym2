/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Aluno;
import br.edu.ifsp.pep.model.Avaliacao;
import br.edu.ifsp.pep.model.Usuario;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author joaop
 */
public class AvaliacaoDAO {

    private EntityManagerFactory emf;

    public AvaliacaoDAO() {

        this.emf = Persistence.createEntityManagerFactory("SigmasGymPU");

    }

    public EntityManager getEntityManager() {

        return this.emf.createEntityManager();
    }

    public void insert(Avaliacao av) {

        System.out.println("Avaliacao adicionada");

        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(av);
        em.getTransaction().commit();
        em.close();
    }

    public List<Avaliacao> listAvaliacao() {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<Avaliacao> query = em.createNamedQuery("avaliacao.listar", Avaliacao.class);

        return query.getResultList();
    }

    public List<Avaliacao> listbyName(Usuario nome) {

        EntityManager em = this.emf.createEntityManager();
        TypedQuery<Avaliacao> query = em.createNamedQuery("avaliacao.listaNomes", Avaliacao.class);
        query.setParameter("aluno", nome);

        return query.getResultList();

    }

    public Avaliacao buscarcodigo(int codigo) {

        EntityManager em = this.emf.createEntityManager();
        TypedQuery<Avaliacao> query = em.createNamedQuery("avaliacao.buscar_id", Avaliacao.class);

        query.setParameter("codigo", codigo);

        return (Avaliacao) query.getSingleResult();
    }

    public void delete(Avaliacao av) {

        EntityManager em = this.emf.createEntityManager();

        em.getTransaction().begin();
        System.out.println(av.toString());
        em.remove(em.merge(av));
        em.getTransaction().commit();
        em.close();

    }

    public void atualizaAvaliacao(Avaliacao av, int codigo) {

        EntityManager em = this.emf.createEntityManager();

        System.out.println(av.getAluno().getNome());
        em.getTransaction().begin();
        av.setCodigo(codigo);
        em.merge(av);

        em.getTransaction().commit();
        em.close();
    }
}
