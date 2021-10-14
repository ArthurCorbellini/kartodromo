/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Arthur
 */
@Entity
@Table(name = "TRACADOS")
public class Tracado implements Serializable {

    private Integer id;
    private String nome;
    private String dificuldade;
    private String maximo;
    private BigDecimal tamanho;

    public Tracado(Integer id) {
        this.id = id;
    }

    public Tracado() {
    }

    @Id
    @Column(name = "id_tracado")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nm_tracado")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "dm_dificuldade")
    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Column(name = "vl_maximo")
    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    @Column(name = "vl_tamanho")
    public BigDecimal getTamanho() {
        return tamanho;
    }

    public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
    }

}
