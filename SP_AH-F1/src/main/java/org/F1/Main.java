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

 equipos.add(new Equipo("Red Bull Racing","Christian Horner","Austria",7,589,"Max Verstappen","Sergio Pérez") );
 equipos.add(new Equipo("Mercedes","Toto Wolff","Alemania",16,468,"Lewis Hamilton","George Russell") );
 equipos.add(new Equipo("Ferrari","Frédéric Vasseur","Italia",24,658,"Charles Leclerc","Carlos Sainz","Oliver Bearman") );
 equipos.add(new Equipo("McLaren","Andrea Stella","Reino Unido",12,666,"Lando Norris","Oscar Piastri") );
 equipos.add(new Equipo("Aston Martin","Mike Krack","Reino Unido",0,94,"Fernando Alonso","Lance Stroll") );
 equipos.add(new Equipo("Alpine","Bruno Famin","Francia",0,65,"Pierre Gasly","Esteban Ocon","Jack Doohan") );
 equipos.add(new Equipo("Williams","James Vowles","Reino Unido",16,17,"Alexander Albon","Logan Sargeant","Franco Colapinto") );
 equipos.add(new Equipo("RB Honda RBPT","Laurent Mekies","Italia",0,46,"Daniel Ricciardo","Yuki Tsunoda","Liam Lawson") );
 equipos.add(new Equipo("Kick Sauber","Alessandro Alunni Bravi","Suiza",0,4,"Valtteri Bottas","Zhou Guanyu") );
 equipos.add(new Equipo("Haas","Ayao Komatsu","Estados Unidos",0,58,"Nico Hulkenberg","Kevin Magnussen","Oliver Bearman") );


        Equipo listaEquipos = new Equipo ();
        listaEquipos.printEquipos(equipos);


    }
}
