package aritmetica;

import excepciones.OperacioonExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if( denominador == 0 ){
            throw new OperacioonExcepcion("División entre 0");
        }
        
        return numerador / denominador;
    }
}
