/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.entity;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Arthur
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    public Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
