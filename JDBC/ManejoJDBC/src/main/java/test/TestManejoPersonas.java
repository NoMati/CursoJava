package test;

import datos.*;
import domain.*;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        // SELECCIONAR 
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("Usuario: " + usuario);
        });
        
        //
        
//        PersonaDAO personaDao = new PersonaDAO();
//        
//        // Insert
//        Persona personaNueva = new Persona("Carlos", "Tapia", "cm@com.cl", "45858405");
//        personaDao.insertar(personaNueva);
//        
//        //Delete
//        Persona personaEliminar = new Persona(4);
//        personaDao.eliminar(personaEliminar);
//        
//        //Update 
//        Persona personaModificar = new Persona(7, "Miguel", "Garcia", "mg@com.cl", "123456789");
//        personaDao.actualizar(personaModificar);
//        
//        List<Persona> personas = personaDao.seleccionar();
//        personas.forEach(persona -> {
//            System.out.println("Persona: " + persona);
//        });
        

    
    }
}
