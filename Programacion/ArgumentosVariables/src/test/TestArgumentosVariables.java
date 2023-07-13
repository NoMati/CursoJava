package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumero(3,4,5,6,23);
        imprimirNumero(1,2,3);
        variosParametros("Juan", 1, 2, 3, 5);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumero(numeros);
    }
    
    private static void imprimirNumero(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
