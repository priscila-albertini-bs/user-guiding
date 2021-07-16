package com.bluesoft.hackathon.userguiding.dto;

import com.bluesoft.hackathon.userguiding.model.Atributo;

public class AtributoDTO {

    private String name;

    private String value;

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

    public Atributo toEntity(){
        return new Atributo(name, value);
    }
}
