/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author joaop
 */
public class Avaliacao {

    public class Avaliacao implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int idAvaliacao;

        @Column(name = "peso")
        private float peso;

        @Column(name = "altura")
        private float altura;

        @Column(name = "percentual_de_gordura")
        private float percentualGordura;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "aluno_id")
        private Usuario aluno;

        public Avaliacao() {

        }

        public Avaliacao(float peso, float altura, float percentualGordura, Usuario aluno) {
            this.peso = peso;
            this.altura = altura;
            this.percentualGordura = percentualGordura;
            this.aluno = aluno;
        }

        public int getIdAvaliacao() {
            return idAvaliacao;
        }

        public void setIdAvaliacao(int idAvaliacao) {
            this.idAvaliacao = idAvaliacao;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) {
            this.peso = peso;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getPercentualGordura() {
            return percentualGordura;
        }

        public void setPercentualGordura(float percentualGordura) {
            this.percentualGordura = percentualGordura;
        }

        public Usuario getAluno() {
            return aluno;
        }

        public void setAluno(Usuario aluno) {
            this.aluno = aluno;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 97 * hash + this.idAvaliacao;
            hash = 97 * hash + Float.floatToIntBits(this.peso);
            hash = 97 * hash + Float.floatToIntBits(this.altura);
            hash = 97 * hash + Float.floatToIntBits(this.percentualGordura);
            hash = 97 * hash + Objects.hashCode(this.aluno);
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
            final br.edu.ifsp.pep.model.Avaliacao other = (br.edu.ifsp.pep.model.Avaliacao) obj;
            if (this.idAvaliacao != other.idAvaliacao) {
                return false;
            }
            if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
                return false;
            }
            if (Float.floatToIntBits(this.altura) != Float.floatToIntBits(other.altura)) {
                return false;
            }
            if (Float.floatToIntBits(this.percentualGordura) != Float.floatToIntBits(other.percentualGordura)) {
                return false;
            }
            if (!Objects.equals(this.aluno, other.aluno)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Avaliacao{" + "idAvaliacao=" + idAvaliacao + ", peso=" + peso + ", altura=" + altura + ", percentualGordura=" + percentualGordura + '}';
        }
    }
