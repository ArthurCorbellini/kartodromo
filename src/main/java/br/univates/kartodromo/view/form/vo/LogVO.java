/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.view.form.vo;

import java.util.Calendar;

/**
 *
 * @author Arthur
 */
public class LogVO {

    private Calendar data;
    private String tipo;
    private String local;
    private String exception;
    private String conteudo;

    public LogVO(Calendar data, String tipo, String local, String exception, String conteudo) {
        this.data = data;
        this.tipo = tipo;
        this.local = local;
        this.exception = exception;
        this.conteudo = conteudo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
