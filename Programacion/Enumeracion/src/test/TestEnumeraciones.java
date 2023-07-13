package test;

import enumeracicon.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Día 1: " + Dias.LUNES );
        indicarDiaSemana(Dias.MARTES);
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
        }
    }
}
