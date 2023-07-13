/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author mathi
 */
public class PruebaAritmetica {
    public static void main(String[] args){
        Aritmetica aritmetica1 = new Aritmetica();
        
        aritmetica1.a = 3;
        aritmetica1.b = 4;
        
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumento(5, 4); 
        System.out.println("resultado = " + resultado);
    }
}
