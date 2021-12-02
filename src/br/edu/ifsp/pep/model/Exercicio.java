/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joaop
 */
@Entity
@Table(name = "exercicio")
@NamedQueries({
    @NamedQuery(name = "Exercicio.listar", query = "select e from Exercicio e"),
    @NamedQuery(name = "Exercicio.listaNomes",
            query = "SELECT e FROM Exercicio e WHERE e.nome LIKE :nome")
})

public class Exercicio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigoExercicio;

    @Column(name = "nome", length = 40, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "exercicio", cascade = CascadeType.ALL)
    private List<ExercicioFicha> exercicios;

    public Exercicio() {
    }

    public Exercicio(String nome) {

        this.nome = nome;

    }

    public int getCodigoExercicio() {
        return codigoExercicio;
    }

    public void setCodigoExercicio(int codigoExercicio) {
        this.codigoExercicio = codigoExercicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ExercicioFicha> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<ExercicioFicha> exercicios) {
        this.exercicios = exercicios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigoExercicio;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.exercicios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exercicio other = (Exercicio) obj;
        if (this.codigoExercicio != other.codigoExercicio) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.exercicios, other.exercicios)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getCodigoExercicio() + " - " + this.getNome();
    }

}
