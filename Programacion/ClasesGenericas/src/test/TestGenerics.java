package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<String> objetoInt = new ClaseGenerica("Hola");
        objetoInt.obtenerTipo();
        
    }
}
