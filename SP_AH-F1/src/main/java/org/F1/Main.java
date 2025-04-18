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

 equipos.add(new Pilotos("Pierre Gasly"," Alpine",29,"Francia",4,136,42") );
 equipos.add(new Pilotos("Esteban Ocon"," Alpine",28,"Francia",3,133,23") );
 equipos.add(new Pilotos("Jack Doohan"," Alpine",22,"Australia",2,0,0") );
 equipos.add(new Pilotos("Fernando Alonso","Aston Martin ",43,"España",13,381,70") );
 equipos.add(new Pilotos("Lance Stroll","Aston Martin ",26,"Canada",1,148,24") );
 equipos.add(new Pilotos("Charles Leclerc","Ferrari",27,"Monaco",5,128,356") );
 equipos.add(new Pilotos("Carlos Sainz","Ferrari",30,"España",2,188,290") );
 equipos.add(new Pilotos("Oliver Bearman","Ferrari",20,"Reino Unido",1,2,6") );
 equipos.add(new Pilotos("Nico Hulkenberg","Haas ",37,"Alemania",3,206,41") );
 equipos.add(new Pilotos("Kevin Magnussen","Haas ",32,"Dinamarca",2,163,16") );
 equipos.add(new Pilotos("Oliver Bearman","Haas ",20,"Reino Unido",1,2,7") );
 equipos.add(new Pilotos("Zhou Guanyu","Kick Sauber ",26,"China",1,52,4") );
 equipos.add(new Pilotos("Valtteri Bottas","Kick Sauber ",35,"Finlandia",4,226,0") );
 equipos.add(new Pilotos("Lando Norris","McLaren ",25,"Reino Unido",5,110,374") );
 equipos.add(new Pilotos("Oscar Piastri","McLaren ",24,"Australia",6,38,292") );
 equipos.add(new Pilotos("George Russell","Mercedes",27,"Reino Unido",3,110,245") );
 equipos.add(new Pilotos("Lewis Hamilton","Mercedes",40,"Reino Unido",15,340,223") );
 equipos.add(new Pilotos("Yuki Tsunoda","RB Honda RBPT",25,"Japon",1,72,30") );
 equipos.add(new Pilotos("Daniel Ricciardo","RB Honda RBPT",35,"Australia",3,244,12") );
 equipos.add(new Pilotos("Liam Lawson","RB Honda RBPT",23,"Nueva Zelanda",3,5,4") );
 equipos.add(new Pilotos("Max Verstappen","Red Bull Racing",27,"Paises Bajos",9,192,437") );
 equipos.add(new Pilotos("Sergio Perez","Red Bull Racing",35,"Mexico",3,266,152") );
 equipos.add(new Pilotos("Alexander Albon","Williams ",29,"Tailandia",2,82,12") );
 equipos.add(new Pilotos("Franco Colapinto","Williams ",22,"Argentina",2,5,5") );
 equipos.add(new Pilotos("Logan Sargeant","Williams ",24,"Estados Unidos",1,28,0") );



        Equipo listaEquipos = new Equipo ();
        listaEquipos.printEquipos(equipos);


    }
}
