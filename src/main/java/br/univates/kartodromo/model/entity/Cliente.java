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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
    private Long cpf;
    private String sexo;
    private String email;
    private Long telefone;
    private String endereco;
    private Long cep;
    private Calendar melhorTempo;
    private Calendar diaMelhorTempo;

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente() {
    }

    @Id
    @SequenceGenerator(name = "clientes_id_cliente_seq", sequenceName = "clientes_id_cliente_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientes_id_cliente_seq")
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

    @Column(name = "dt_nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Column(name = "nr_cpf")
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Column(name = "dm_sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "tx_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "nr_telefone")
    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @Column(name = "tx_endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Column(name = "nr_cep")
    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    @Column(name = "dt_melhor_tempo")
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getMelhorTempo() {
        return melhorTempo;
    }

    public void setMelhorTempo(Calendar melhorTempo) {
        this.melhorTempo = melhorTempo;
    }

    @Column(name = "dt_dia_melhor_tempo")
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getDiaMelhorTempo() {
        return diaMelhorTempo;
    }

    public void setDiaMelhorTempo(Calendar diaMelhorTempo) {
        this.diaMelhorTempo = diaMelhorTempo;
    }

}
