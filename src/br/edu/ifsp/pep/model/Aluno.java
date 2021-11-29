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
@DiscriminatorValue("A")
@NamedQueries({
    @NamedQuery(name = "Aluno.findByCodigo",
            query = "SELECT a FROM Aluno a WHERE a.codigo = :codigo")})
public class Aluno extends Usuario implements Serializable {

    public Aluno() {
    }

    public Aluno(String nome, String login, String senha, String email) {
        super(nome, login, senha, email);
    }

    @Override
    public String toString() {
        return this.getCodigo() + " - " + this.getNome();
    }

}
