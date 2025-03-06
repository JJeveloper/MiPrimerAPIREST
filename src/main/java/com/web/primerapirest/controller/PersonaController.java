package com.web.primerapirest.controller;

import com.web.primerapirest.model.dto.PersonaDTO;
import com.web.primerapirest.model.dto.PersonaMapper;
import com.web.primerapirest.model.entity.Persona;
import com.web.primerapirest.model.payload.MensajeResponse;
import com.web.primerapirest.service.interfaces.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/primeraapi/v1/")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @PostMapping("persona")
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDTO pdto) {
        PersonaDTO dto = personaService.guardar(pdto);
        return  new ResponseEntity<>( dto, HttpStatus.CREATED);
    }

    @PutMapping("persona/{id}")
    public ResponseEntity<?> actualizarPersona(@RequestBody PersonaDTO pdto, @PathVariable Integer id){
            PersonaDTO dto = personaService.actualizar(id,pdto);

            if (dto == null){
                return new ResponseEntity<>("La persona que busca no existe", HttpStatus.METHOD_NOT_ALLOWED);
            }else {
                return new ResponseEntity<>(dto, HttpStatus.CREATED);
            }
    }


    @GetMapping("personas")
    public ResponseEntity<?> mostarPersonas(){
        return new ResponseEntity<>(personaService.mostrarPersonas(), HttpStatus.OK);
    }

    @DeleteMapping("persona/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable Integer id){
        PersonaDTO personaDTO = personaService.buscarPorId(id);

        if (personaDTO == null){
            return new ResponseEntity<>("La persona que busca no existe", HttpStatus.METHOD_NOT_ALLOWED);
        }else {
            personaService.eliminar(id);
            return new ResponseEntity<>(personaDTO, HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("persona/{id}")
    public ResponseEntity<?> obtenerPersonaPorID(@PathVariable Integer id){
        PersonaDTO personaDTO = personaService.buscarPorId(id);

        if (personaDTO==null){
            return new ResponseEntity<>("La persona que busca no existe", HttpStatus.METHOD_NOT_ALLOWED);
        }else {
            return new ResponseEntity<>(personaDTO, HttpStatus.OK);
        }
    }
}
