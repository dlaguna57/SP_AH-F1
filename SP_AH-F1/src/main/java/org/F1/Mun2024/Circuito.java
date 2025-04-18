package org.F1.Mun2024;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    String nameCirc;
    String fecha;
    String paisCirc;
    int vueltas;
    String longCirc;
    List<String> pilotos = new ArrayList<>();
    List<String> posSal = new ArrayList<>();
    List<String> posLleg = new ArrayList<>();
    List<Integer> puntosAdq = new ArrayList<>();

    // Constructores
    public Circuito(){
    }

    public Circuito(String nameCirc, String fecha, String paisCirc, int vueltas, String longCirc) {
        this.nameCirc = nameCirc;
        this.fecha = fecha;
        this.paisCirc = paisCirc;
        this.vueltas = vueltas;
        this.longCirc = longCirc;
    }

    // Definicion Metodo
    public void agregarResultado(String piloto, String salida, String llegada, int puntos) {
        pilotos.add(piloto);
        posSal.add(salida);
        posLleg.add(llegada);
        puntosAdq.add(puntos);
    }

    // Definicion Metodo de Impresion
    public void mostrarResultados() {
        System.out.println("Resultados en " + nameCirc + " (" + fecha + ", " + paisCirc + ")");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < pilotos.size(); i++) {
            System.out.println("Piloto: " + pilotos.get(i));
            System.out.println("Posición de salida: " + posSal.get(i));
            System.out.println("Posición de llegada: " + posLleg.get(i));
            System.out.println("Puntos adquiridos: " + puntosAdq.get(i));
            System.out.println();
        }
    }
}
