/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author joaop
 */
@Entity
@Table(name = "exercicio_treino")

public class ExercicioFicha implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;

    @Column(name = "series")
    private int series;

    @Column(name = "repeticoes")
    private int repeticoes;

    @Column(name = "carga")
    private int carga;

    @Column(name = "intervalo")
    private float intervalo;

    @ManyToOne
    @JoinColumn(name = "exercicio_idExercicio")
    private Exercicio exercicio;

    @ManyToOne
    @JoinColumn(name = "ficha_treino_idFicha")
    private FichaTreino fichaTreino;

    public ExercicioFicha() {
    }

    public ExercicioFicha(int codigo, int series, int repeticoes, int carga, float intervalo, Exercicio exercicio, FichaTreino fichaTreino) {
        this.codigo = codigo;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.intervalo = intervalo;
        this.exercicio = exercicio;
        this.fichaTreino = fichaTreino;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(float intervalo) {
        this.intervalo = intervalo;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public FichaTreino getFichaTreino() {
        return fichaTreino;
    }

    public void setFichaTreino(FichaTreino fichaTreino) {
        this.fichaTreino = fichaTreino;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
        hash = 97 * hash + this.series;
        hash = 97 * hash + this.repeticoes;
        hash = 97 * hash + this.carga;
        hash = 97 * hash + Float.floatToIntBits(this.intervalo);
        hash = 97 * hash + Objects.hashCode(this.exercicio);
        hash = 97 * hash + Objects.hashCode(this.fichaTreino);
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
        final ExercicioFicha other = (ExercicioFicha) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.series != other.series) {
            return false;
        }
        if (this.repeticoes != other.repeticoes) {
            return false;
        }
        if (this.carga != other.carga) {
            return false;
        }
        if (Float.floatToIntBits(this.intervalo) != Float.floatToIntBits(other.intervalo)) {
            return false;
        }
        if (!Objects.equals(this.exercicio, other.exercicio)) {
            return false;
        }
        if (!Objects.equals(this.fichaTreino, other.fichaTreino)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExercicioFicha{" + "codigo=" + codigo + ", series=" + series + ", repeticoes=" + repeticoes + ", carga=" + carga + ", intervalo=" + intervalo + ", exercicio=" + exercicio + ", fichaTreino=" + fichaTreino + '}';
    }

}
