package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 4000);
        Empleado empleado2 = new Empleado("Juan", 4000);
        
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("Tienen la misma referencia en memoria.");
        }else{
            System.out.println("Tienen diferente referencia en memoria.");
        }
    }
}
