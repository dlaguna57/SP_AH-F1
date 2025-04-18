package org.F1.Mun2024;

import java.util.List;

public class Piloto {
    String nameP;
    Equipo equipo;
    int edad;
    String nacionalidad;
    int campGanadosP;
    int carrerasDispF1;
    int puntosAcum2024P;
    Circuito posiciones;

    // Definicion de Constructores
    public Piloto() {
    }

    public Piloto(String nameP, Equipo equipo, int edad, String nacionalidad, int campGanadosP, int carrerasDispF1, int puntosAcum2024P) {
        this.nameP = nameP;
        this.equipo = equipo;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.campGanadosP = campGanadosP;
        this.carrerasDispF1 = carrerasDispF1;
        this.puntosAcum2024P = puntosAcum2024P;
    }

    public void printPiloto(List<Piloto> pilotos) {
        System.out.println("**** Pilotos ****\n");
        int countPil = 1;
        for (Piloto piloto : pilotos) {
            System.out.println("[" + countPil + "] Piloto: "+piloto.nameP + " Equipo: "+piloto.equipo.nameEqu);
            countPil++;
        }
    }

    // Definicion de Metodo de Impresion
    public void printInfPilotos(Piloto piloto) {
        System.out.println("**** Informacion de Pilotos ****\n");
        System.out.println("Nombre y apellido: " + piloto.nameP + "\nEquipo: " + piloto.equipo.nameEqu + "\nEdad: " + piloto.edad);
        System.out.println("Nacionalidad: " + piloto.nacionalidad + "\n# Campeonatos Ganados: " + piloto.campGanadosP);
        System.out.println("# Carreras Disputadas en F1: " + piloto.carrerasDispF1 + "\nPuntos Acumulados 2024: " + piloto.puntosAcum2024P);
        System.out.println();
    }
}
