package genericos;

public class ClaseGenerica<T> {
    private T objecto;
    
    public ClaseGenerica(T objeto){
        this.objecto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + this.objecto.getClass().getSimpleName());
    }
}
