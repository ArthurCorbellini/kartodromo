/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Arthur
 */
@Entity
@Table(name = "MARCAS")
public class Marca implements Serializable {

    private Integer id;
    private String nome;
    private String contato;

    public Marca(Integer id) {
        this.id = id;
    }

    public Marca() {
    }

    @Id
    @SequenceGenerator(name = "marcas_id_marca_seq", sequenceName = "marcas_id_marca_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marcas_id_marca_seq")
    @Column(name = "id_marca")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nm_marca")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "nm_contato")
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
