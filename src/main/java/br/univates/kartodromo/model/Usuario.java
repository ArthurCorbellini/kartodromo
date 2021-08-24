/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model;

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
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    private Integer id;
    private String name;

    public Usuario(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name = "ID_USUARIO")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "NM_USUARIO")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
