/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Arthur
 */
@Entity
@Table(name = "VEICULOS")
public class Veiculo implements Serializable {

    private Integer id;
    private String nome;
    private String marca;

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Veiculo() {
    }

    @Id
    @Column(name = "id_veiculo")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nm_veiculo")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "id_marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
