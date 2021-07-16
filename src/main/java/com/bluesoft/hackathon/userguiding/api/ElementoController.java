package com.bluesoft.hackathon.userguiding.api;

import com.bluesoft.hackathon.userguiding.dto.ElementoDTO;
import com.bluesoft.hackathon.userguiding.service.ElementoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/elementos/")
public class ElementoController {
    
    private ElementoService elementoService;

    @Autowired
    public ElementoController(ElementoService elementoService) {
        this.elementoService = elementoService;
    }

    @PostMapping(value = "/salvar")
    public void salvar(@RequestBody ElementoDTO elemento){
    	elementoService.salvar(elemento.toEntity());
    }

}
