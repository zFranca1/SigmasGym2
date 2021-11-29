/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author joaop
 */
@Entity
@DiscriminatorValue("P")
@NamedQueries({
    @NamedQuery(name = "Personal.findByCodigo",
            query = "SELECT p FROM Personal p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Personal.findByName",
            query = "select p from Personal p where p.nome LIKE :nome"),
    @NamedQuery(name = "Personal.find",
            query = "select p from Personal p")
})
public class Personal extends Usuario implements Serializable {

    public Personal() {
    }

    public Personal(int codigo, String nome, String login, String senha, String email, char tipo) {
        super(codigo, nome, login, senha, email, tipo);
    }

    @Override
    public String toString() {
        return this.getCodigo() + " - " + this.getNome();
    }

}
