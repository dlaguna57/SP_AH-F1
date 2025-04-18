package org.F1.Mun2024;

import java.util.List;

public class Equipo {
    String nameEqu;
    String director;
    String paisOrig;
    int campGanadosEqu;
    int puntosAcumMun2024;
    Piloto pOne;
    Piloto pTwo;
    Piloto extra;

    // Definicion de Constructores
    public Equipo(){
    }

    public Equipo(String nameEqu, String director, String paisOrig, int campGanadosEqu, int puntosAcumMun2024) {
        this.nameEqu = nameEqu;
        this.director = director;
        this.paisOrig = paisOrig;
        this.campGanadosEqu = campGanadosEqu;
        this.puntosAcumMun2024 = puntosAcumMun2024;
    }

    // Definicion Metodo de asignacion de Pilotos
    public void setPilotos(Piloto pOne, Piloto pTwo, Piloto extra) {
        this.pOne = pOne;
        this.pTwo = pTwo;
        this.extra = extra;
    }

    // Definicion Metodo de Impresion
    public void printEquipos(List<Equipo> equipos){
        System.out.println("**** Informacion de Equipos ****\n");
        for (Equipo equipo : equipos) {
            System.out.println("Nombre de equipo: "+equipo.nameEqu+"\nDirector general: "+equipo.director+"\nPais de origen: "+equipo.paisOrig);
            System.out.println("# Campeonatos ganados: "+equipo.campGanadosEqu+"\nPuntos acumlados Mundial 2024: "+equipo.puntosAcumMun2024);
            System.out.println("Piloto 1: "+equipo.pOne.nameP+"\nPiloto 2: "+equipo.pTwo.nameP);
            if (equipo.extra != null) {
                System.out.println("Piloto Extra: " + equipo.extra.nameP);
            }
            System.out.println();
        }
    }
}
