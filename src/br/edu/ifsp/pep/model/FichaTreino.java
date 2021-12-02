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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joaop
 */
@Entity
@Table(name = "ficha_treino")
@NamedQueries({
    @NamedQuery(name = "FichaTreino.listAlunos",
            query = "SELECT f FROM FichaTreino f WHERE f.usuario = :aluno"),
    @NamedQuery(name = "FichaTreino.listar",
            query = "SELECT f FROM FichaTreino f "),
    @NamedQuery(name = "FichaTreino.listaNomes",
            query = "SELECT f FROM FichaTreino f WHERE f.usuario.nome LIKE :aluno")
})
public class FichaTreino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @OneToMany(mappedBy = "FichaTreino", cascade = CascadeType.ALL)
    private List<ExercicioFicha> exerciciosFicha;
    
    @ManyToOne
    @JoinColumn(name = "usuario_codigo")
    private Usuario usuario;
    
    @Column(name = "nome")
    private String nome;

    public FichaTreino() {
    }

    public FichaTreino(int codigo, List<ExercicioFicha> exerciciosFicha, Usuario usuario, String nome) {
        this.codigo = codigo;
        this.exerciciosFicha = exerciciosFicha;
        this.usuario = usuario;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<ExercicioFicha> getExerciciosFicha() {
        return exerciciosFicha;
    }

    public void setExerciciosFicha(List<ExercicioFicha> exerciciosFicha) {
        this.exerciciosFicha = exerciciosFicha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.codigo;
        hash = 19 * hash + Objects.hashCode(this.exerciciosFicha);
        hash = 19 * hash + Objects.hashCode(this.usuario);
        hash = 19 * hash + Objects.hashCode(this.nome);
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
        final FichaTreino other = (FichaTreino) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.exerciciosFicha, other.exerciciosFicha)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }
    
    

}
