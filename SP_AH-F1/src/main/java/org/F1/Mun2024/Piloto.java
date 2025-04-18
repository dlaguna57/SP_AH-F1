package org.F1.Mun2024;
import org.F1.Mun2024.Equipo;

public class Piloto {
    String nameP;
    int edad;
    String nacionalidad;
    Equipo equipo;
    int campGanadosP;
    int carrerasDispF1;
    int puntosAcum2024P;
    Circuito posiciones;

    public Piloto(){

    }
    public Piloto(String nameP) {
        this.nameP = nameP;
    }
    public Piloto(String nameP, int edad, String nacionalidad, Equipo equipo, int campGanadosP, int carrerasDispF1, int puntosAcum2024P, Circuito posiciones) {
        this.nameP = nameP;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.campGanadosP = campGanadosP;
        this.carrerasDispF1 = carrerasDispF1;
        this.puntosAcum2024P = puntosAcum2024P;
        this.posiciones = new Circuito();
    }


    public String getNameP() {
        return nameP;
    }
}
