package mundopc;

import domain.Computadora;
import domain.Monitor;
import domain.Orden;
import domain.Raton;
import domain.Teclado;

public class MundoPC {
    Monitor monitorHP = new Monitor("HP", 13);
    Teclado tecladoHP = new Teclado("bluetooth","HP");
    Raton ratonHP = new Raton("bluetooth", "HP");
    
    Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP); 
    
    Orden orden1 = new Orden();
}
