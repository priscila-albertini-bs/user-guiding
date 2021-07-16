package com.bluesoft.hackathon.userguiding.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_guiding_elemento")
public class UserGuidingElemento {

    @Id
    private Long userGuidingElementoKey;

    private String xpath;

    private String cssSelector;

    private String tagName;

    private String id;

    private String className;

    private String innerText;

    private String baseUri;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_guiding_elemento_key")
    private List<UserGuidingAtributo> userGuidingAtributos;

    private String intro;

    private Date data;

    private String texto;

    public UserGuidingElemento(String xpath, String cssSelector, String tagName, String id, String className, String innerText, String baseURI, List<UserGuidingAtributo> attributes, String intro, String texto) {
        this.xpath = xpath;
        this.cssSelector = cssSelector;
        this.tagName = tagName;
        this.id = id;
        this.className = className;
        this.innerText = innerText;
        this.baseUri = baseURI;
        this.userGuidingAtributos = attributes;
        this.intro = intro;
        this.data = new Date();
        this.texto = texto;
    }

    public UserGuidingElemento() {

    }

    public Long getUserGuidingElementoKey() {
        return userGuidingElementoKey;
    }

    public void setUserGuidingElementoKey(Long userGuidingElementoKey) {
        this.userGuidingElementoKey = userGuidingElementoKey;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public List<UserGuidingAtributo> getUserGuidingAtributos() {
        return userGuidingAtributos;
    }

    public void setUserGuidingAtributos(List<UserGuidingAtributo> userGuidingAtributos) {
        this.userGuidingAtributos = userGuidingAtributos;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
