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
public class Usuario extends BaseEntity {

    private String name;

    public Usuario(Integer id) {
        super.setId(id);
    }

    public Usuario() {
    }

    @Id
    @Column(name = "id_usuario")
    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Column(name = "nm_usuario")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
