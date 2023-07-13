package com.crudjava.crud;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "personas")
public class Persona implements Serializable {
    @Id 
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id_personas;
    @Column
    private String nombre;
    @Column
    private String apellido;

    public int getId() {
        return id_personas;
    }

    public void setId(int id) {
        this.id_personas = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
