package com.bluesoft.hackathon.userguiding.repository;

import com.bluesoft.hackathon.userguiding.model.UserGuidingElemento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGuidingElementoRepository extends CrudRepository<UserGuidingElemento, Long> {

    UserGuidingElemento findByCssSelector(String cssSelector);

    UserGuidingElemento findByBaseUri(String baseUri);

}
