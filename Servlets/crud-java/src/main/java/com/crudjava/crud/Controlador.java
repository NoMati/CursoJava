package com.crudjava.crud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 60)
@RestController
@RequestMapping({"/personas"})
public class Controlador {

    @Autowired
    PersonaService service;
    
    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Persona agregar(@RequestBody Persona persona){
        return service.agregar(persona);
    }
    
    @GetMapping(path = {"/{id}"})
    public Persona listarId(@PathVariable("id") int id){
     return service.listarId(id);
    }
    
    @PutMapping(path = {"/{id}"})
    public Persona editar(@RequestBody Persona persona, @PathVariable("id") int id){
        persona.setId(id);
        return service.editar(persona);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public Persona delete(@PathVariable("id") int id){
        return service.eliminar(id);
    }
}
