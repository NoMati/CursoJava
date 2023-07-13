package test;

import aritmetica.Aritmetica;
import excepciones.OperacioonExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            resultado = Aritmetica.division(10, 0);
        }
        catch(OperacioonExcepcion e){
            System.out.println("Ocurrió un error de tipo Operación Excepción");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Ocurrió un error.");
            e.printStackTrace(System.out);
            System.out.println("e = " + e.getMessage());
        }
        finally{
            System.out.println("Se revisó la división entre 0");
        }
        
        
        System.out.println("resultado = " + resultado);
        
    }
}
