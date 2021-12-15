/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Aluno;
import br.edu.ifsp.pep.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.QueryHint;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author joaop
 */
public class UsuarioDAO {

    private EntityManagerFactory emf;

    public static Usuario usu;

    public static Usuario getUsu() {

        return usu;

    }

    public static void setUsu(Usuario usu) {

        UsuarioDAO.usu = usu;

    }

    public UsuarioDAO() {

        this.emf = Persistence.createEntityManagerFactory("SigmasGymPU");

    }

    public EntityManager getEntityManager() {

        return this.emf.createEntityManager();

    }

    public Usuario login(String login, String senha) throws NoResultException {

        EntityManager em = getEntityManager();
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.login", Usuario.class)
                .setParameter("login", login)
                .setParameter("senha", senha)
                .setHint(QueryHints.REFRESH, HintValues.TRUE);

        if (!(query.getSingleResult().getCodigo() == 0)) {
            UsuarioDAO.usu = query.getSingleResult();

        }

        return query.getSingleResult();

    }

    public Usuario findByCodigo(Integer codigo) throws NoResultException {
        EntityManager em = getEntityManager();
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findByCodigo", Usuario.class)
                .setParameter("codigo", codigo)
                .setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getSingleResult();
    }

    public List<Usuario> listbyName(String nome) {
        EntityManager em = this.emf.createEntityManager();

        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findByName", Usuario.class);
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();

    }

}
