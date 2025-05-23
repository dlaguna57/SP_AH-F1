package org.F1.Mun2024;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    private String nameCirc;
    private String paisCirc;
    private String fecha;
    private String longCirc;
    private List<String> pilotos = new ArrayList<>();
    private List<String> equipos = new ArrayList<>();
    private List<String> vueltas = new ArrayList<>();
    private List<String> posSal = new ArrayList<>();
    private List<String> posLleg = new ArrayList<>();
    private List<Integer> puntosAdq = new ArrayList<>();

    // Definicion de Constructores
    public Circuito(){   }

    public Circuito(String nameCirc, String paisCirc, String fecha, String longCirc) {
        this.nameCirc = nameCirc;
        this.paisCirc = paisCirc;
        this.fecha = fecha;
        this.longCirc = longCirc;
    }

    // Definicion de metodos Get
    public String getNameCirc() {return nameCirc;}
    public String getPaisCirc() {return paisCirc;}
    public String getFecha() {return fecha;}
    public String getLongCirc() {return longCirc;}
    public List<String> getPilotos() {return pilotos;}
    public List<String> getEquipos() {return equipos;}
    public List<String> getVueltas() {return vueltas;}
    public List<String> getPosSal() {return posSal;}
    public List<String> getPosLleg() {return posLleg;}
    public List<Integer> getPuntosAdq() {return puntosAdq;}

    // Definicion de metodos Set
    public void setNameCirc(String nameCirc) {this.nameCirc = nameCirc;}
    public void setPaisCirc(String paisCirc) {this.paisCirc = paisCirc;}
    public void setFecha(String fecha) {this.fecha = fecha;}
    public void setLongCirc(String longCirc) {this.longCirc = longCirc;}

    // Definicion Metodo Agregar Lista de Resultados
    public void Resultados(String piloto, String equipo, String vuelta, String salida, String llegada, int puntos) {
        pilotos.add(piloto); equipos.add(equipo); vueltas.add(vuelta);
        posSal.add(salida); posLleg.add(llegada); puntosAdq.add(puntos);
    }

    // Definicion Metodo de Impresion Lista Circuitos
    public void printCircuitos(List<Circuito> circuitos) {
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ %-5s ▐ %-20s ▐ %-25s ▐ %-15s %n", "#", "País", "Fecha", "Circuito");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        int countCirc = 1;
        for (Circuito circuito : circuitos) {
            System.out.printf("▐ %-5d ▐ %-20s ▐ %-25s ▐ %-15s %n",
                    countCirc, circuito.getPaisCirc(), circuito.getFecha(), circuito.getNameCirc());
            countCirc++;
        }
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
    }

    // Definicion Metodo de Impresion Resultados Circuito en Tabla
    public void printResultCircuito(Circuito circuito) {
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ %-35s ▐ %-15s ▐ %-10s ▐ %-10s ▐ %n",
                "Circuito", "Fecha", "Pais", "Longitud");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ ♦ %-20s ▐ %-15s ▐ %-10s ▐ %-10s ▐ %n",
                circuito.getNameCirc(), circuito.getFecha(), circuito.getPaisCirc(), circuito.getLongCirc());
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.printf("▐ %-20s   ▐ %-15s ▐ %-10s ▐ %-10s ▐ %-10s ▐ %-10s ▐ %n",
                "Piloto", "Equipo", "Salida", "Llegada", "Puntos", "Vueltas");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");

        for (int i = 0; i < circuito.getPilotos().size(); i++) {
            System.out.printf("▐ ♦ %-20s ▐ %-15s ▐ %-10s ▐ %-10s ▐ %-10d ▐ %-10s ▐ %n",
                    circuito.getPilotos().get(i), circuito.getEquipos().get(i),
                    circuito.getPosSal().get(i), circuito.getPosLleg().get(i),
                    circuito.getPuntosAdq().get(i), circuito.getVueltas().get(i));
        }
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
    }
}
