package org.F1.Mun2024;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    String nameCirc;
    String paisCirc;
    String fecha;
    String longCirc;
    List<String> pilotos = new ArrayList<>();
    List<String> equipos = new ArrayList<>();
    List<Integer> vueltas = new ArrayList<>();
    List<String> posSal = new ArrayList<>();
    List<String> posLleg = new ArrayList<>();
    List<Integer> puntosAdq = new ArrayList<>();

    // Definicion de Constructores
    public Circuito(){
    }

    public Circuito(String nameCirc, String paisCirc, String fecha, String longCirc) {
        this.nameCirc = nameCirc;
        this.paisCirc = paisCirc;
        this.fecha = fecha;
        this.longCirc = longCirc;
    }

    // Definicion Metodo Agregar Lista de Resultados
    public void Resultados(String piloto, String equipo, int vuelta, String salida, String llegada, int puntos) {
        pilotos.add(piloto);
        equipos.add(equipo);
        vueltas.add(vuelta);
        posSal.add(salida);
        posLleg.add(llegada);
        puntosAdq.add(puntos);
    }

    // Definicion Metodo de Impresion Lista Circuitos
    public void printCircuitos(List<Circuito> circuitos) {
        int countCirc = 1;
        System.out.println("**** Informacion de Circuitos ****");
        for (Circuito circuito : circuitos) {
            System.out.println("["+countCirc+"] Nombre de Circuito: "+circuito.nameCirc+"  Pais: "+circuito.paisCirc);
            countCirc++;
        }
    }

    // Definicion Metodo de Impresion Resultados Circuito
    public void printResultCircuito(Circuito circuito) {
        System.out.println("*** Informacion de Circuito ****");
        System.out.println("Nombre de Circuito: "+nameCirc+"\nFecha: "+fecha+"\nPais: "+paisCirc+"\nLongitud: "+longCirc+"\n");
        System.out.println("*** Resultados ****");
        for (int i = 0; i < pilotos.size(); i++) {
            System.out.println("Piloto: "+pilotos.get(i));
            System.out.println("Equipo: "+equipos.get(i));
            System.out.println("Posición de salida: "+posSal.get(i));
            System.out.println("Posición de llegada: "+posLleg.get(i));
            System.out.println("Puntos adquiridos: "+puntosAdq.get(i));
            System.out.println("_____________________________________");
        }
    }
}
