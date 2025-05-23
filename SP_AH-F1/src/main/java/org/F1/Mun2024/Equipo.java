package org.F1.Mun2024;

import java.util.List;

public class Equipo {
    private String nameEqu;
    private String director;
    private String paisOrig;
    private int campGanadosEqu;
    private int puntosAcumMun2024;
    private Piloto pOne;
    private Piloto pTwo;
    private Piloto extra;

    // Definicion de Constructores
    public Equipo(){    }

    public Equipo(String nameEqu, String director, String paisOrig, int campGanadosEqu, int puntosAcumMun2024) {
        this.nameEqu = nameEqu;
        this.director = director;
        this.paisOrig = paisOrig;
        this.campGanadosEqu = campGanadosEqu;
        this.puntosAcumMun2024 = puntosAcumMun2024;
    }

    // Definicion de metodos Get
    public String getNameEqu() {return nameEqu;}
    public String getDirector() {return director;}
    public String getPaisOrig() {return paisOrig;}
    public int getCampGanadosEqu() {return campGanadosEqu;}
    public int getPuntosAcumMun2024() {return puntosAcumMun2024;}
    public Piloto getPOne() {return pOne;}
    public Piloto getPTwo() {return pTwo;}
    public Piloto getExtra() {return extra;}

    // Definicion de metodos Set
    public void setNameEqu(String nameEqu) {this.nameEqu = nameEqu;}
    public void setDirector(String director) {this.director = director;}
    public void setPaisOrig(String paisOrig) {this.paisOrig = paisOrig;}
    public void setCampGanadosEqu(int campGanadosEqu) {this.campGanadosEqu = campGanadosEqu;}
    public void setPuntosAcumMun2024(int puntosAcumMun2024) {this.puntosAcumMun2024 = puntosAcumMun2024;}
    public void setPOne(Piloto pOne) {this.pOne = pOne;}
    public void setPTwo(Piloto pTwo) {this.pTwo = pTwo;}
    public void setExtra(Piloto extra) {this.extra = extra;}

    // Definicion Metodo de asignacion de Pilotos
    public void setPilotos(Piloto pOne, Piloto pTwo, Piloto extra) {
        this.pOne = pOne;
        this.pTwo = pTwo;
        this.extra = extra;
    }

    // Definicion Metodo de Impresion Lista de Equipos
    public void printEquipos(List<Equipo> equipos){
        for (int i = 0; i < equipos.size(); i += 2) {
            // Primer Equipo en la fila
            Equipo equipo1 = equipos.get(i);
            String eq1 = String.format("[%-2d] %-16s", i + 1, equipo1.getNameEqu());

            // Segundo Equipo en la fila
            String eq2 = "";
            for (int j = i + 1; j < i + 2 && j < equipos.size(); j++) {
                Equipo equipo2 = equipos.get(j);
                eq2 = String.format("[%-2d] %-16s", j + 1, equipo2.getNameEqu());
            }
            System.out.println(eq1 + "   " + eq2);
        }
    }

    // Definicion Metodo de Impresion Informacion Equipo en Tabla
    public void printInfEquipo(Equipo equipo) {
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ %-18s ▐ %-20s ▐ %-15s ▐ %-10s ▐ %n",
                "Equipo", "Director", "País de Origen", "Camp. Wins");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ ♦ %-18s ▐ %-20s ▐ %-15s ▐ %-10d ▐ %n",
                equipo.getNameEqu(), equipo.getDirector(), equipo.getPaisOrig(), equipo.getCampGanadosEqu());
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ %-20s ▐ %-15s ▐ %-15s ▐ %n", "Piloto", "Equipo", "Puntos 2024");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ ♦ %-20s ▐ %-15s ▐ %-15d ▐ %n",
                equipo.getPOne().getNameP(), equipo.getNameEqu(), equipo.getPOne().getPuntosAcum2024P());
        System.out.printf("▐ ♦ %-20s ▐ %-15s ▐ %-15d ▐ %n",
                equipo.getPTwo().getNameP(), equipo.getNameEqu(), equipo.getPTwo().getPuntosAcum2024P());
        if (equipo.getExtra() != null) {
            System.out.printf("▐ ♦ %-20s ▐ %-15s ▐ %-15d ▐ %n",
                    equipo.getExtra().getNameP(), equipo.getNameEqu(), equipo.getExtra().getPuntosAcum2024P());
        }
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
    }
}
