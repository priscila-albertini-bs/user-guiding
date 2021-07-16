package com.bluesoft.hackathon.userguiding.service;

import com.bluesoft.hackathon.userguiding.dto.ElementoDTO;
import com.bluesoft.hackathon.userguiding.model.UserGuidingElemento;
import com.bluesoft.hackathon.userguiding.repository.UserGuidingElementoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGuidingElementoService {

    UserGuidingElementoRepository elementoRepository;

    VerificadorElementoNaoExiste verificadorElemento;

    @Autowired
    public UserGuidingElementoService(UserGuidingElementoRepository elementoRepository, VerificadorElementoNaoExiste verificadorElemento) {
        this.elementoRepository = elementoRepository;
        this.verificadorElemento = verificadorElemento;
    }

    public void salvar(ElementoDTO elemento) {

        if (verificadorElemento.verificar(elemento)){

            elementoRepository.save(elemento.toEntity());
        }

    }

    public ElementoDTO obter(String baseURI) {

        if (!baseURI.isEmpty()){
            UserGuidingElemento userGuidingElemento = elementoRepository.findByBaseUri(baseURI);
            return new ElementoDTO(userGuidingElemento);
        }

        return null;
    }
}
