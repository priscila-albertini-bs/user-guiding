package com.bluesoft.hackathon.userguiding.service;

import com.bluesoft.hackathon.userguiding.dto.ElementoDTO;
import com.bluesoft.hackathon.userguiding.model.UserGuidingElemento;
import com.bluesoft.hackathon.userguiding.repository.UserGuidingElementoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class VerificadorElementoNaoExiste {

    UserGuidingElementoRepository elementoRepository;

    @Autowired
    public VerificadorElementoNaoExiste(UserGuidingElementoRepository elementoRepository) {
        this.elementoRepository = elementoRepository;
    }

    public boolean verificar(ElementoDTO elementoDto) {

        UserGuidingElemento elemento = elementoRepository.findByCssSelector(elementoDto.getCssSelector());

        return isNull(elemento);
    }
}
