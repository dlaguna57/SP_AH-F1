package org.F1;

import org.F1.Mun2024.Circuito;
import org.F1.Mun2024.Equipo;
import org.F1.Mun2024.Piloto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Equipo> equipos = new ArrayList<>();
        List<Piloto> pilotos = new ArrayList<>();
        List<Circuito> circuitos = new ArrayList<>();


        equipos.add(
                new Equipo("Red Bull", "Christian Horner", "Austria",
                        5, 180, "Max Verstappen",
                        "Sergio Pérez", "Liam Lawson")
        );
        



        Equipo listaEquipos = new Equipo ();
        listaEquipos.printEquipos(equipos);


    }
}
