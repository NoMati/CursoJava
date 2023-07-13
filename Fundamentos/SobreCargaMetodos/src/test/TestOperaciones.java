package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(4, 3);
        System.out.println("resultado = " + resultado);
        
        double resultado2 = Operaciones.sumar(4.4, 3.0);
        System.out.println("resultado2 = " + resultado2);
        
        
    }
}
