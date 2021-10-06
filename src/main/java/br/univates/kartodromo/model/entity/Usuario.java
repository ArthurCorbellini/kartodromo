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
    private String cpf;
    private String telefone;
    private String email;
    private String senha;
    private Integer perfilUsuario;
    private String sexo;
     

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
    
    @Column(name = "CPF_usuario")
    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Column(name = "telefone_usuario")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Column(name = "email_usuario")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     @Column(name = "senha_usuario")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Column(name = "Perfilusuario")
    public Integer getPerfil() {
        return perfilUsuario;
    }

    public void setPerfil(Integer perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }
    
    @Column(name = "sexo_cliente")
    public String getSexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
}
