/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author mathi
 */
public class Aritmetica {
    
    //Atributos
    int a;
    int b;
    
    //Metodos
    public void sumar(){
        System.out.println(a + b);
    }
    
    public int sumarRetorno(){
        int resultado = a + b; 
        
        return resultado;
    }
    
    public int sumarConArgumento(int arg1, int arg2){
        a = arg1;
        b = arg2;
        
        return a + b;
    }
}
