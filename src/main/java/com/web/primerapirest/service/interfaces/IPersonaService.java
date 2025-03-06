package com.web.primerapirest.service.interfaces;

import com.web.primerapirest.model.dto.PersonaDTO;
import com.web.primerapirest.model.entity.Persona;

import java.util.List;

public interface IPersonaService {

      PersonaDTO guardar(PersonaDTO personaDTO);

      PersonaDTO actualizar(Integer id, PersonaDTO personaDTO);

      PersonaDTO buscarPorId(Integer id);

      Iterable<Persona> mostrarPersonas();

      void eliminar(Integer id);

}
