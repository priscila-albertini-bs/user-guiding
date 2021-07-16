package com.bluesoft.hackathon.userguiding.api;

import com.bluesoft.hackathon.userguiding.dto.ElementoDTO;
import com.bluesoft.hackathon.userguiding.model.UserGuidingElemento;
import com.bluesoft.hackathon.userguiding.service.UserGuidingElementoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/elementos")
public class UserGuidingElementoController {
    
    private UserGuidingElementoService elementoService;

    @Autowired
    public UserGuidingElementoController(UserGuidingElementoService elementoService) {
        this.elementoService = elementoService;
    }

    @PostMapping(value = "/salvar")
    public void salvar(@RequestBody ElementoDTO elemento){
    	elementoService.salvar(elemento);
    }

    @GetMapping("/obterbaseuri/{baseUri}")
    @ResponseBody
    public ResponseEntity<ElementoDTO> obter(@PathVariable("baseUri") String baseUri){
        return ResponseEntity.status(HttpStatus.CREATED).body(elementoService.obter(baseUri));
    }

    @GetMapping(value = "/obter/")
    @ResponseBody
    public String obterFixo(){
        return "["
               + ""
               + " {"
               + ""
               + ""
               + " \"intro\": \"Olá, bem vindo! ao,\""
               + " },"
               + ""
               + " {"
               + " \"element\": \"body > div.main-content.ng-scope > div > div > div.flex-body.ng-scope > div.clearfix.bs-menu-lateral-container > aside > bs-menu-lateral > ul > li:nth-child(1) > a\","
               + " \"intro\": \"Nesta aba é possível visualizar as informações gerais\","
               + " \"position\": \"right\""
               + " }"
               + " ]";
    }
}
