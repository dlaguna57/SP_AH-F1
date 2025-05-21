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

        for (int i = 0; i < pilotos.size(); i += 2) {
            // Primer piloto en la fila
            Piloto piloto1 = pilotos.get(i);
            String pil1 = String.format("[%-2d] %-16s : %-20s", i + 1, piloto1.getNameP(), piloto1.getEquipo().getNameEqu());

            // Segundo piloto en la fila
            String pil2 = "";
            for (int j = i + 1; j < i + 2 && j < pilotos.size(); j++) {
                Piloto piloto2 = pilotos.get(j);
                pil2 = String.format("[%-2d] %-16s : %-20s", j + 1, piloto2.getNameP(), piloto2.getEquipo().getNameEqu());
            }
            System.out.println(pil1 + "   " + pil2); // Se imprimen dos por fila
        }
    }

    // Definicion de Metodo de Impresion en Tabla
    public void printInfPilotos(Piloto piloto) {
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ %-20s ▐ %-15s ▐ %-5s ▐ %-15s ▐ %-10s ▐ %-10s ▐ %-9s ▐ %n",
                "Nombre", "Equipo", "Edad", "Nacionalidad", "Campeonatos", "Carreras", "Puntos 2024");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ ♦ %-20s  ▐ %-15s ▐ %-5d ▐ %-15s ▐ %-10d ▐ %-10d ▐ %-10d▐ %n",
                piloto.getNameP(), piloto.getEquipo().getNameEqu(), piloto.getEdad(),
                piloto.getNacionalidad(), piloto.getCampGanadosP(), piloto.getCarrerasDispF1(),
                piloto.getPuntosAcum2024P());
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
    }
}
