/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.entity;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JORGE
 */

@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable {
    
    private Integer id;
    private String nome;
    private Calendar dataNascimento;
    private String cpf;
    private String sexo;
    private String email;
    private String telefone;
    private String endereco;
    private String cep;

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente() {
    }
    
    @Id
    @Column(name = "id_cliente")
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
  }

    @Column(name = "nm_cliente")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Column(name = "dataNascimento_cliente")
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getdataNascimento() {
        return dataNascimento;
    }

    public void setActionTimeStamp(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Column(name = "CPF_cliente")
    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Column(name = "sexo_cliente")
    public String getSexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Column(name = "email_cliente")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name = "telefone_cliente")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Column(name = "endereco_cliente")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Column(name = "CEP_cliente")
    public String getcep() {
        return cep;
    }

    public void setcep(String cep) {
        this.cep = cep;
    }
}
