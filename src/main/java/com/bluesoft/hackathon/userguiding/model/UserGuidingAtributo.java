package com.bluesoft.hackathon.userguiding.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserGuidingAtributo {

    @Id
    private Long userGuidingAtributoKey;

    private String name;

    private String value;

    @ManyToOne
    private UserGuidingElemento elemento;

    public UserGuidingAtributo(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public UserGuidingAtributo() {
    }

    public Long getUserGuidingAtributoKey() {
        return userGuidingAtributoKey;
    }

    public void setUserGuidingAtributoKey(Long userGuidingAtributoKey) {
        this.userGuidingAtributoKey = userGuidingAtributoKey;
    }

    public UserGuidingElemento getElemento() {
        return elemento;
    }

    public void setElemento(UserGuidingElemento elemento) {
        this.elemento = elemento;
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
