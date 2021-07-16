package com.bluesoft.hackathon.userguiding.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Atributo {

    @Id
    private Long atributoId;

    private String name;

    private String value;

    @ManyToOne
    private Elemento elemento;

    public Atributo(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Long getAtributoId() {
        return atributoId;
    }

    public void setAtributoId(Long atributoId) {
        this.atributoId = atributoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
