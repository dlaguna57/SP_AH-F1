package org.F1.Mun2024;

import java.util.List;

public class Piloto {
    private String nameP;
    private Equipo equipo;
    private int edad;
    private String nacionalidad;
    private int campGanadosP;
    private int carrerasDispF1;
    private int puntosAcum2024P;

    // Definicion de Constructores
    public Piloto() {    }

    public Piloto(String nameP, Equipo equipo, int edad, String nacionalidad, int campGanadosP, int carrerasDispF1, int puntosAcum2024P) {
        this.nameP = nameP;
        this.equipo = equipo;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.campGanadosP = campGanadosP;
        this.carrerasDispF1 = carrerasDispF1;
        this.puntosAcum2024P = puntosAcum2024P;
    }

    // Definicion de metodos Get
    public String getNameP() {return nameP;}
    public Equipo getEquipo() {return equipo;}
    public int getEdad() {return edad;}
    public String getNacionalidad() {return nacionalidad;}
    public int getCampGanadosP() {return campGanadosP;}
    public int getCarrerasDispF1() {return carrerasDispF1;}
    public int getPuntosAcum2024P() {return puntosAcum2024P;}

    // Definicion de metodos Set
    public void setNameP(String nameP) {this.nameP = nameP;}
    public void setEquipo(Equipo equipo) {this.equipo = equipo;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}
    public void setCampGanadosP(int campGanadosP) {this.campGanadosP = campGanadosP;}
    public void setCarrerasDispF1(int carrerasDispF1) {this.carrerasDispF1 = carrerasDispF1;}
    public void setPuntosAcum2024P(int puntosAcum2024P) {this.puntosAcum2024P = puntosAcum2024P;}


    public void printPiloto(List<Piloto> pilotos) {
        System.out.println("**** Pilotos ****\n");
        int countPil = 1;
        for (Piloto piloto : pilotos) {
            System.out.println("[" + countPil + "] Piloto: "+piloto.getNameP() + " Equipo: "+piloto.getEquipo().getNameEqu());
            countPil++;
        }
    }

    // Definicion de Metodo de Impresion
    public void printInfPilotos(Piloto piloto) {
        System.out.println("**** Informacion de Pilotos ****\n");
        System.out.println("Nombre y apellido: " + piloto.getNameP() + "\nEquipo: " + piloto.getEquipo().getNameEqu() + "\nEdad: " + piloto.getEdad());
        System.out.println("Nacionalidad: " + piloto.getNacionalidad() + "\n# Campeonatos Ganados: " + piloto.getCampGanadosP());
        System.out.println("# Carreras Disputadas en F1: " + piloto.getCarrerasDispF1() + "\nPuntos Acumulados 2024: " + piloto.getPuntosAcum2024P());
        System.out.println();
    }
}
