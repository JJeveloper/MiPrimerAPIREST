package com.web.primerapirest.service.impl;

import com.web.primerapirest.model.dao.PersonaDAO;
import com.web.primerapirest.model.entity.Persona;
import com.web.primerapirest.service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaImpl implements IPersona {

    @Autowired
    private PersonaDAO personaDAO;

    @Transactional
    @Override
    public Persona guardar(Persona p) {
        return personaDAO.save(p);
    }

    @Transactional(readOnly = true)
    @Override
    public Persona buscarPorId(int id) {
        return personaDAO.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void eliminar(Persona persona) {
        personaDAO.delete(persona);
    }
}
