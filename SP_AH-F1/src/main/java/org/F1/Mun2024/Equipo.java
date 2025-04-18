package org.F1.Mun2024;

public class Equipo {
    String nameEqu;
    String director;
    String paisOrig;
    int campGanadosEqu;
    int puntosAcumMun2024;
    Piloto pOne = new Piloto();
    Piloto pTwo = new Piloto();
    


    public Equipo(String nameEqu, String director, String paisOrig, int campGanadosEqu, int puntosAcumMun2024, Piloto pOne, Piloto pTwo) {
        this.nameEqu = nameEqu;
        this.director = director;
        this.paisOrig = paisOrig;
        this.campGanadosEqu = campGanadosEqu;
        this.puntosAcumMun2024 = puntosAcumMun2024;
        this.pOne = pOne;
        this.pTwo = pTwo;
    }

    public void mostrarInfoEquipo() {
        System.out.println("Nombre del equipo: " + nameEqu);
        System.out.println("Director General: " + director);
        System.out.println("País de origen: " + paisOrig);
        System.out.println("Numero de Campeonatos ganados: " + campGanadosEqu);
        System.out.println("Puntos acumulados en el Mundial 2024: " + puntosAcumMun2024);
        System.out.println("=== PILOTOS OFICIALES ===");
        System.out.println("Piloto 1: " + pOne.getNameP());
        System.out.println("Piloto 2: " + pTwo.getNameP());
    }

}
