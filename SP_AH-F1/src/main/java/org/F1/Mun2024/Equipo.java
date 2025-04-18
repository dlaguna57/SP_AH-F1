package org.F1.Mun2024;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    String nameEqu;
    String director;
    String paisOrig;
    int campGanadosEqu;
    int puntosAcumMun2024;
    String pOne;
    String pTwo;
    String extra;
    List<Equipo> equipos = new ArrayList<>();
    
    public Equipo(){        
    }
    
    public Equipo(String nameEqu, String director, String paisOrig, int campGanadosEqu, int puntosAcumMun2024, String pOne, String pTwo, String extra) {
        this.nameEqu = nameEqu;
        this.director = director;
        this.paisOrig = paisOrig;
        this.campGanadosEqu = campGanadosEqu;
        this.puntosAcumMun2024 = puntosAcumMun2024;
        this.pOne = pOne;
        this.pTwo = pTwo;
        this.extra = extra
    }


    System.out.println("**** Informacion de Equipos ****");
        for (Equipo equipo : equipos) {
            System.out.println("Nombre de equipo: "+equipo.nameEqu+"\nDirector general: "+equipo.director);
            System.out.println("Vehiculo: "+ruta.vehiculo.modelo+" - "+ruta.vehiculo.placa+"\n");
        }

}
