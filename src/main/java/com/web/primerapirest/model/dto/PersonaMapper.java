package com.web.primerapirest.model.dto;

import com.web.primerapirest.model.entity.Persona;

public class PersonaMapper {

    public static PersonaDTO personaDTO(Persona p){
        PersonaDTO dto = new PersonaDTO();
        dto.setIdpersona(p.getIdpersona());
        dto.setNombre(p.getNombre());
        dto.setApellido(p.getApellido());
        dto.setCorreo(p.getCorreo());
        return dto;
    }

    public static Persona personaEntity(PersonaDTO dto){
        Persona p = new Persona();
        p.setIdpersona(dto.getIdpersona());
        p.setNombre(dto.getNombre());
        p.setApellido(dto.getApellido());
        p.setCorreo(dto.getCorreo());
        return  p;
    }

}
