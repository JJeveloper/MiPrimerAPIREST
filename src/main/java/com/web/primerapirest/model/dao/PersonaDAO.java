package com.web.primerapirest.model.dao;

import com.web.primerapirest.model.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Integer> {
}
