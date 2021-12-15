/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.ExercicioFicha;
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

        this.emf = Persistence.createEntityManagerFactory("SigmasGymPU");
    }

    public EntityManager getEntityManager() {

        return this.emf.createEntityManager();

    }

    public void delete(FichaTreino f) {

        EntityManager em = this.emf.createEntityManager();
        FichaTreino alf = (FichaTreino) em.find(FichaTreino.class, f.getCodigo());
        System.out.println(f.toString());
        em.getTransaction().begin();

        for (ExercicioFicha e : f.getExerciciosFicha()) {
            System.out.println(e.toString());
            try {
                em.remove(em.merge(e));
            } catch (Exception ex) {
                em.remove(e);
            }
        }

        em.getTransaction().commit();

        em.close();

        excluirFicha(f);

    }

    public void excluirFicha(FichaTreino alf) {

        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(em.merge(alf));
        } catch (Exception ex) {
            em.remove(alf);
        }
        em.getTransaction().commit();

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

    public List<FichaTreino> listNomes(Usuario nome) {

        EntityManager em = this.emf.createEntityManager();

        TypedQuery<FichaTreino> query = em.createNamedQuery("FichaTreino.listaNomes", FichaTreino.class);
        query.setParameter("usuario", nome);

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
