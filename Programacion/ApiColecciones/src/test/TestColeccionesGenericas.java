package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        
        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
        
        Set miSet = new HashSet();
        
        miSet.add("Naranja");
        miSet.add("Uva");
        miSet.add("Manzana");
        miSet.add("Banana");
        
        System.out.println("----------------------------------");
        
        miSet.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
        
        Map miMapa = new HashMap();
        
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Marcelo");
        miMapa.put("valor3", "Cristobal");
        
        String elemento = (String)miMapa.get("valor2");
        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection collection){
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
    }
}
