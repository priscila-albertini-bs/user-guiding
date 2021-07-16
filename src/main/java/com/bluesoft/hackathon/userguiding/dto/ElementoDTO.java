package com.bluesoft.hackathon.userguiding.dto;

import com.bluesoft.hackathon.userguiding.model.UserGuidingAtributo;
import com.bluesoft.hackathon.userguiding.model.UserGuidingElemento;

import java.util.List;
import java.util.stream.Collectors;

public class ElementoDTO {

    private String xpath;
    private String cssSelector;
    private String tagName;
    private String id;
    private String className;
    private String innerText;
    private String baseURI;
    private List<AtributoDTO> attributes;
    private String intro;
    private String date;
    private String texto;

    public ElementoDTO(UserGuidingElemento userGuidingElemento) {
        
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

    public List<AtributoDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AtributoDTO> attributes) {
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

    public UserGuidingElemento toEntity() {
        return new UserGuidingElemento(xpath, cssSelector, tagName, id, className, innerText, baseURI, getAtributos(), intro, texto);
    }

    private List<UserGuidingAtributo> getAtributos() {
        List<UserGuidingAtributo> atributos = attributes.stream().map(AtributoDTO::toEntity).collect(Collectors.toList());
        return atributos;
    }
}