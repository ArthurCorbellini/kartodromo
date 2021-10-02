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
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    private Integer id;
    private String name;
    // VARCHAR (String) CPF
    // VARCHAR (String) telefone
    // VARCHAR (String) e-mail
    // VARCHAR (String) senha
    // INTEGER (Integer) perfilUsuario
    // VARCHAR (String) sexo 

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario() {
    }

    @Id
    @Column(name = "id_usuario")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nm_usuario")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
