package com.crudjava.crud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{
    
    @Autowired
    private PersonaRepositorio repositorio;
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Persona agregar(Persona persona) {
        return repositorio.save(persona);
    }

    @Override
    public Persona editar(Persona persona) {
        return repositorio.save(persona);
    }

    @Override
    public Persona eliminar(int id) {
        Persona persona = repositorio.findById(id);
        if(persona!=null){
            repositorio.delete(persona);
        }
        return persona;
    }
    
}
