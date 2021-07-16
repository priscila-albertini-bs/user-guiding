package com.bluesoft.hackathon.userguiding.model;

import com.bluesoft.hackathon.userguiding.dto.AtributoDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Elemento {

    @Id
    private Long elementoId;

    private String xpath;

    private String cssSelector;

    private String tagName;

    private String id;

    private String className;

    private String innerText;

    private String baseURI;

    @OneToMany
    private List<Atributo> attributes;

    private String intro;

    private String date;

    private String texto;

    public Elemento(String xpath, String cssSelector, String tagName, String id, String className, String innerText, String baseURI, List<Atributo> attributes, String intro, String date, String texto) {
        this.xpath = xpath;
        this.cssSelector = cssSelector;
        this.tagName = tagName;
        this.id = id;
        this.className = className;
        this.innerText = innerText;
        this.baseURI = baseURI;
        this.attributes = attributes;
        this.intro = intro;
        this.date = date;
        this.texto = texto;
    }

    public Long getElementoId() {
        return elementoId;
    }

    public void setElementoId(Long elementoId) {
        this.elementoId = elementoId;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String xpath) {
        this.xpath = xpath;
    }

    public String getCssSelector() {
        return cssSelector;
    }

    public void setCssSelector(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getInnerText() {
        return innerText;
    }

    public void setInnerText(String innerText) {
        this.innerText = innerText;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    public List<Atributo> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Atributo> attributes) {
        this.attributes = attributes;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
