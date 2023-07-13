package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        escribirArchivo(nombreArchivo, "Hola desde Java");
        anexarArchivo(nombreArchivo, " - Nuevo contenido");
        leerArchivo(nombreArchivo);
    }
    
    
}
