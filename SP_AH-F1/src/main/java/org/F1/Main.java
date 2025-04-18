package org.F1;

import org.F1.Mun2024.Circuito;
import org.F1.Mun2024.Equipo;
import org.F1.Mun2024.Menu;
import org.F1.Mun2024.Piloto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creacion de Equipos
        Equipo e1 = new Equipo("Red Bull Racing","Christian Horner","Austria",7,589);
        Equipo e2 = new Equipo("Mercedes","Toto Wolff","Alemania",16,468);
        Equipo e3 = new Equipo("Ferrari","Frédéric Vasseur","Italia",24,658);
        Equipo e4 = new Equipo("McLaren","Andrea Stella","Reino Unido",12,666);
        Equipo e5 = new Equipo("Aston Martin","Mike Krack","Reino Unido",0,94);
        Equipo e6 = new Equipo("Alpine","Bruno Famin","Francia",0,65);
        Equipo e7 = new Equipo("Williams","James Vowles","Reino Unido",16,17);
        Equipo e8 = new Equipo("RB Honda RBPT","Laurent Mekies","Italia",0,46);
        Equipo e9 = new Equipo("Kick Sauber","Alessandro Alunni Bravi","Suiza",0,4);
        Equipo e10 = new Equipo("Haas","Ayao Komatsu","Estados Unidos",0,58);

        //Creacion de Pilotos con Asignacion de su respectivo Equipo
        Piloto p1 = new Piloto("Pierre Gasly",e6,29,"Francia",4,136,42);
        Piloto p2 = new Piloto("Esteban Ocon",e6,28,"Francia",3,133,23);
        Piloto p3 = new Piloto("Jack Doohan",e6,22,"Australia",2,0,0);
        Piloto p4 = new Piloto("Fernando Alonso",e5,43,"España",13,381,70);
        Piloto p5 = new Piloto("Lance Stroll",e5,26,"Canada",1,148,24);
        Piloto p6 = new Piloto("Charles Leclerc",e3,27,"Monaco",5,128,356);
        Piloto p7 = new Piloto("Carlos Sainz",e3,30,"España",2,188,290);
        Piloto p8 = new Piloto("Oliver Bearman",e3,20,"Reino Unido",1,2,6);
        Piloto p9 = new Piloto("Nico Hulkenberg",e10,37,"Alemania",3,206,41);
        Piloto p10 = new Piloto("Kevin Magnussen",e10,32,"Dinamarca",2,163,16);
        Piloto p11 = new Piloto("Oliver Bearman",e10,20,"Reino Unido",1,2,7);
        Piloto p12 = new Piloto("Zhou Guanyu",e9,26,"China",1,52,4);
        Piloto p13 = new Piloto("Valtteri Bottas",e9,35,"Finlandia",4,226,0);
        Piloto p14 = new Piloto("Lando Norris",e4,25,"Reino Unido",5,110,374);
        Piloto p15 = new Piloto("Oscar Piastri",e4,24,"Australia",6,38,292);
        Piloto p16 = new Piloto("George Russell",e2,27,"Reino Unido",3,110,245);
        Piloto p17 = new Piloto("Lewis Hamilton",e2,40,"Reino Unido",15,340,223);
        Piloto p18 = new Piloto("Yuki Tsunoda",e8,25,"Japon",1,72,30);
        Piloto p19 = new Piloto("Daniel Ricciardo",e8,35,"Australia",3,244,12);
        Piloto p20 = new Piloto("Liam Lawson",e8,23,"Nueva Zelanda",3,5,4);
        Piloto p21 = new Piloto("Max Verstappen",e1,27,"Paises Bajos",9,192,437);
        Piloto p22 = new Piloto("Sergio Perez",e1,35,"Mexico",3,266,152);
        Piloto p23 = new Piloto("Alexander Albon",e7,29,"Tailandia",2,82,12);
        Piloto p24 = new Piloto("Franco Colapinto",e7,22,"Argentina",2,5,5);
        Piloto p25 = new Piloto("Logan Sargeant",e7,24,"Estados Unidos",1,28,0);

        // Asignacion de Pilotos a cada Equipo
        e1.setPilotos(p21,p22,null); e2.setPilotos(p17,p16,null); e3.setPilotos(p6,p7,p8);
        e4.setPilotos(p14,p15,null); e5.setPilotos(p4,p5,null); e6.setPilotos(p1,p2,p3);
        e7.setPilotos(p23,p25,p24); e8.setPilotos(p19,p18,p20); e9.setPilotos(p13,p12,null);
        e10.setPilotos(p9,p10,p8);

        // Creacion de Circuitos
        Circuito cr1 = new Circuito(" Circuito Internacional de Baréhin (Sakhir)"," Barein"," 2 de marzo de 2024","5.412 km");
        Circuito cr2 = new Circuito(" Circuito Urbano de Jeddah"," Arabia Saudita"," 9 de marzo de 2024","6.174 km");
        Circuito cr3 = new Circuito(" Circuito de Albert Park (Melbourne)"," Australia"," 24 de marzo de 2024","5.278 km");
        Circuito cr4 = new Circuito(" Circuito de Suzuka"," Japon"," 7 de abril de 2024","5.807 km");
        Circuito cr5 = new Circuito("Circuito Internacional de Shanghái","China","21 de abril de 2024","5.451 km");
        Circuito cr6 = new Circuito(" Circuito Urbano de Miami (EE.UU.)"," Miami","5 de mayo de 2024","5.412 km");
        Circuito cr7 = new Circuito("Autódromo Enzo e Dino Ferrari (Imola)","Emilia-Romagna","19 de mayo de 2024","4.909 km");
        Circuito cr8 = new Circuito(" Circuito de Mónaco (Montecarlo)"," Monaco"," 26 de mayo de 2024","3.337 km");
        Circuito cr9 = new Circuito(" Circuito Gilles Villeneuve (Montreal)"," Canada"," 9 de junio de 2024","4.361 km");
        Circuito cr10 = new Circuito(" Circuito de Barcelona-Cataluña"," España"," 23 de junio de 2024","4.657 km");
        Circuito cr11 = new Circuito(" Red Bull Ring (Spielberg)"," Austria"," 30 de junio de 2024","4.318 km");
        Circuito cr12 = new Circuito(" Circuito de Silverstone"," Reino Unido"," 7 de julio de 2024","5.891 km");
        Circuito cr13 = new Circuito(" Hungaroring (Budapest)"," Hungria"," 21 de julio de 2024","4.381 km");
        Circuito cr14 = new Circuito(" Circuito de Spa-Francorchamps"," Belgica"," 28 de julio de 2024","7.004 km");
        Circuito cr15 = new Circuito(" Circuito de Zandvoort"," Paises Bajos"," 25 de agosto de 2024","4.259 km");
        Circuito cr16 = new Circuito(" Autódromo Nacional de Monza"," Italia"," 1 de septiembre de 2024","5.793 km");
        Circuito cr17 = new Circuito(" Circuito Urbano de Bakú"," Azerbaiyan"," 15 de septiembre de 2024","6.003 km");
        Circuito cr18 = new Circuito(" Circuito Urbano de Marina Bay"," Singapur"," 22 de septiembre de 2024","4.945 km");
        Circuito cr19 = new Circuito(" Circuito de las Américas (Austin)"," Estados Unidos"," 20 de octubre de 2024","5.513 km");
        Circuito cr20 = new Circuito(" Autódromo Hermanos Rodríguez (CDMX)"," Mexico"," 27 de octubre de 2024","4.304 km");
        Circuito cr21 = new Circuito(" Autódromo de Interlagos (São Paulo)"," Brasil"," 3 de noviembre de 2024","4.309 km");
        Circuito cr22 = new Circuito(" Circuito Urbano de Las Vegas"," Las Vegas"," 17 de noviembre de 2024","6.201 km");
        Circuito cr23 = new Circuito(" Circuito Internacional de Losail"," Qatar"," 1 de diciembre de 2024","5.419 km");
        Circuito cr24 = new Circuito(" Circuito Yas Marina"," Abu Dabi"," 8 de diciembre de 2024","5.281 km");

        // Asignar Resultados a Circuito 1
        cr1.Resultados("Max Verstappen",57,"1","1",26); cr1.Resultados("Sergio Perez",57,"2","2",18);
        cr1.Resultados("Carlos Sainz",57,"3","3",15); cr1.Resultados("Charles Leclerc",57,"4","4",12);
        cr1.Resultados("George Russell",57,"5","5",10); cr1.Resultados("Lando Norris",57,"6","6",8);
        cr1.Resultados("Lewis Hamilton",57,"7","7",6); cr1.Resultados("Oscar Piastri",57,"8","8",4);
        cr1.Resultados("Fernando Alonso",57,"9","9",2); cr1.Resultados("Lance Stroll",57,"10","10",1);
        cr1.Resultados("Zhou Guanyu",56,"11","11",0); cr1.Resultados("Kevin Magnussen",56,"12","12",0);
        cr1.Resultados("Daniel Ricciardo",56,"13","13",0); cr1.Resultados("Yuki Tsunoda",56,"14","14",0);
        cr1.Resultados("Alexander Albon",56,"15","15",0); cr1.Resultados("Nico Hulkenberg",56,"16","16",0);
        cr1.Resultados("Esteban Ocon",56,"17","17",0); cr1.Resultados("Pierre Gasly",56,"18","18",0);
        cr1.Resultados("Valtteri Bottas",56,"19","19",0); cr1.Resultados("Logan Sargeant",55,"20","20",0);

        // Asignar Resultados a Circuito 2
        cr2.Resultados("Max Verstappen",50,"1","1",25); cr2.Resultados("Sergio Perez",50,"2","2",18);
        cr2.Resultados("Charles Leclerc",50,"4","3",16); cr2.Resultados("Oscar Piastri",50,"8","4",12);
        cr2.Resultados("Fernando Alonso",50,"9","5",10); cr2.Resultados("George Russell",50,"5","6",8);
        cr2.Resultados("Oliver Bearman",50,"3","7",6); cr2.Resultados("Lando Norris",50,"6","8",4);
        cr2.Resultados("Lewis Hamilton",50,"7","9",2); cr2.Resultados("Nico Hulkenberg",50,"16","10",1);
        cr2.Resultados("Alexander Albon",50,"15","11",0); cr2.Resultados("Kevin Magnussen",50,"12","12",0);
        cr2.Resultados("Esteban Ocon",49,"17","13",0); cr2.Resultados("Logan Sargeant",49,"20","14",0);
        cr2.Resultados("Yuki Tsunoda",49,"14","15",0); cr2.Resultados("Daniel Ricciardo",49,"13","16",0);
        cr2.Resultados("Valtteri Bottas",49,"19","17",0); cr2.Resultados("Zhou Guanyu",49,"11","18",0);
        cr2.Resultados("Lance Stroll",5,"10","NC",0); cr2.Resultados("Pierre Gasly",1,"18","NC",0);



        // Creacion Listas equipos | pilotos | circuitos
        List<Equipo> equipos = new ArrayList<>();
        List<Piloto> pilotos = new ArrayList<>();
        List<Circuito> circuitos = new ArrayList<>();


        //Agregar los Equipos a la lista
        equipos.add(e1); equipos.add(e2); equipos.add(e3); equipos.add(e4); equipos.add(e5);
        equipos.add(e6); equipos.add(e7); equipos.add(e8); equipos.add(e9); equipos.add(e10);

        //Agregar los Pilotos a la lista
        pilotos.add(p1); pilotos.add(p2); pilotos.add(p3); pilotos.add(p4); pilotos.add(p5);
        pilotos.add(p6); pilotos.add(p7); pilotos.add(p8); pilotos.add(p9); pilotos.add(p10);
        pilotos.add(p11); pilotos.add(p12); pilotos.add(p13); pilotos.add(p14); pilotos.add(p15);
        pilotos.add(p16); pilotos.add(p17); pilotos.add(p18); pilotos.add(p19); pilotos.add(p20);
        pilotos.add(p21); pilotos.add(p22); pilotos.add(p23); pilotos.add(p24); pilotos.add(p25);

        //Agregar los Circuitos a la lista
        circuitos.add(cr1); circuitos.add(cr2); circuitos.add(cr3); circuitos.add(cr4); circuitos.add(cr5);
        circuitos.add(cr6); circuitos.add(cr7); circuitos.add(cr8); circuitos.add(cr9); circuitos.add(cr10);
        circuitos.add(cr11); circuitos.add(cr12); circuitos.add(cr13); circuitos.add(cr14); circuitos.add(cr15);
        circuitos.add(cr16); circuitos.add(cr17); circuitos.add(cr18); circuitos.add(cr19); circuitos.add(cr20);
        circuitos.add(cr21); circuitos.add(cr22); circuitos.add(cr23); circuitos.add(cr24);


//        Circuito circSelect = circuitos.get(0);
//        circSelect.printResultCircuito();

        Menu menu = new Menu(equipos,pilotos,circuitos);
        menu.menuPrincipal();

    }
}
