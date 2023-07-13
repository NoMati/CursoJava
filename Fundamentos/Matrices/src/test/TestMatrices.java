package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 10;
        edades[1][1] = 12;
        
        System.out.println("edades = " + edades[0][0]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("Edades " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Matias");
        personas[1][0] = new Persona("Rodolfo");
        personas[1][1] = new Persona("Javiera");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Edades " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
