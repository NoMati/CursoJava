package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,3,5,6,1,2};
        
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona persona[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for(Persona personas: persona){
            System.out.println("personas = " + personas);
        }
    }
}
