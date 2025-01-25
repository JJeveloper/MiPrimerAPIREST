package com.web.primerapirest.service;

import com.web.primerapirest.model.entity.Persona;

public interface IPersona {

      Persona guardar(Persona p);

      Persona buscarPorId(int id);

      void eliminar(Persona persona);

}
