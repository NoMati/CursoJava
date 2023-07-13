package com.crudjava.crud;

import java.util.List;

public interface PersonaService {
    List<Persona> listar();
    Persona listarId(int id);
    Persona agregar(Persona persona);
    Persona editar(Persona persona);
    Persona eliminar(int id);
}
