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
    private String login;
    private String senha;
    private String nome;
    private Long cpf;
    private Long telefone;
    private String email;
    private Integer perfil;
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

    @Column(name = "tx_login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "tx_senha")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Column(name = "nm_nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "nr_cpf")
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Column(name = "nr_telefone")
    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @Column(name = "tx_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "dm_perfil")
    public Integer getPerfil() {
        return perfil;
    }

    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

    @Column(name = "dm_sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
