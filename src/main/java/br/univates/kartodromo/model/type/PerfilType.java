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
public enum PerfilType {

    ADMIN("1", "Administrador"),
    PADRAO("2", "Padrão");

    public static Object valueOf(PerfilType perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String id;
    private String name;

    private PerfilType() {
    }

    private PerfilType(String id, String name) {
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
