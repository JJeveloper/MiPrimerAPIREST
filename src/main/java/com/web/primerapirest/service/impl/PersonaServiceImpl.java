package com.web.primerapirest.service.impl;

import com.web.primerapirest.model.dao.PersonaDAO;
import com.web.primerapirest.model.dto.PersonaDTO;
import com.web.primerapirest.model.dto.PersonaMapper;
import com.web.primerapirest.model.entity.Persona;
import com.web.primerapirest.service.interfaces.IPersonaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private PersonaDAO personaDAO;


    @Override
    public PersonaDTO guardar(PersonaDTO personaDTO) {

        try {
            Persona persona = PersonaMapper.personaEntity(personaDTO);
            Persona nuevaPersona = personaDAO.save(persona);
            PersonaDTO DTO = PersonaMapper.personaDTO(nuevaPersona);

            return DTO;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al guardar el usuario");
        }
    }

    @Override
    public PersonaDTO actualizar(Integer id, PersonaDTO personaDTO) {
        PersonaDTO dto= null;

        try {

            Persona actualizarPersona = PersonaMapper.personaEntity(personaDTO);
            dto = PersonaMapper.personaDTO( personaDAO.save(actualizarPersona));
        }catch (Exception e){
            System.out.println("No existe el id " +e );
        }

        return dto;
    }



    @Override
    public PersonaDTO buscarPorId(Integer id) {
        PersonaDTO dto = null;
        try {
            Persona persona = personaDAO.findById(id).orElse(null);

             dto  = PersonaMapper.personaDTO(persona);

        }catch (Exception e){
            System.out.println("No existe el id: " + e);
        }

        return dto;
    }

    @Override
    public Iterable<Persona> mostrarPersonas() {
        return  personaDAO.findAll();
    }


    @Override
    public void eliminar(Integer id) {

        try {
            PersonaDTO dto = buscarPorId(id);
            Persona persona = PersonaMapper.personaEntity(dto);
            personaDAO.delete(persona);

        }catch (Exception e){
            System.out.println("No existe el id " +e );
        }

    }
}
