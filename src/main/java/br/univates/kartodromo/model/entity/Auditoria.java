/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.kartodromo.model.entity;

import br.univates.kartodromo.model.type.CrudType;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Arthur
 */
@Entity
@Table(name = "audit.logged_actions")
public class Auditoria implements Serializable {

    private Integer sequenceId;
    private String schemaName;
    private String tableName;
    private String userName;
    private Calendar actionTimeStamp;
    private CrudType action;
    private String originalData;
    private String newData;
    private String query;

    public Auditoria() {
    }

    public Auditoria(Integer id) {
        setSequenceId(id);
    }

    @Id
    @Column(name = "sequence_id")
    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    @Column(name = "schema_name")
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Column(name = "table_name")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "action_tstamp")
    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getActionTimeStamp() {
        return actionTimeStamp;
    }

    public void setActionTimeStamp(Calendar actionTimeStamp) {
        this.actionTimeStamp = actionTimeStamp;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "action")
    public CrudType getAction() {
        return action;
    }

    public void setAction(CrudType action) {
        this.action = action;
    }

    @Column(name = "original_data")
    public String getOriginalData() {
        return originalData;
    }

    public void setOriginalData(String originalData) {
        this.originalData = originalData;
    }

    @Column(name = "new_data")
    public String getNewData() {
        return newData;
    }

    public void setNewData(String newData) {
        this.newData = newData;
    }

    @Column(name = "query")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
