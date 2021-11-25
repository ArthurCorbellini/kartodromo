/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.type;

/**
 *
 * @author Arthur
 */
public enum GeneroType {

    M("1", "Masculino"),
    F("2", "Feminino");

    private String id;
    private String name;

    private GeneroType() {
    }

    private GeneroType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
