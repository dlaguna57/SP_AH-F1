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

        
        // Asignar Resultados a Circuito 3
        cr3.Resultados("Carlos Sainz",58,"2","1",25); cr3.Resultados("Charles Leclerc",58,"4","2",19);
        cr3.Resultados("Lando Norris",58,"3","3",15); cr3.Resultados("Oscar Piastri",58,"5","4",12);
        cr3.Resultados("Sergio Perez",58,"6","5",10); cr3.Resultados("Lance Stroll",58,"9","6",8);
        cr3.Resultados("Yuki Tsunoda",58,"8","7",6); cr3.Resultados("Fernando Alonso",58,"10","8",4);
        cr3.Resultados("Nico Hulkenberg",58,"16","9",2); cr3.Resultados("Kevin Magnussen",57,"14","10",1);
        cr3.Resultados("Alexander Albon",57,"12","11",0); cr3.Resultados("Daniel Ricciardo",57,"18","12",0);
        cr3.Resultados("Pierre Gasly",57,"17","13",0); cr3.Resultados("Valtteri Bottas",57,"13","14",0);
        cr3.Resultados("Zhou Guanyu",57,"19","15",0); cr3.Resultados("Esteban Ocon",57,"15","16",0);
        cr3.Resultados("George Russell",56,"7","17",0); cr3.Resultados("Lewis Hamilton",15,"11","NC",0);
        cr3.Resultados("Max Verstappen",3,"1","NC",0);

        // Asignar Resultados a Circuito 4
        cr4.Resultados("Max Verstappen",53,"1","1",26); cr4.Resultados("Sergio Perez",53,"2","2",18);
        cr4.Resultados("Carlos Sainz",53,"4","3",15); cr4.Resultados("Charles Leclerc",53,"8","4",12);
        cr4.Resultados("Lando Norris",53,"3","5",10); cr4.Resultados("Fernando Alonso",53,"5","6",8);
        cr4.Resultados("George Russell",53,"9","7",6); cr4.Resultados("Oscar Piastri",53,"6","8",4);
        cr4.Resultados("Lewis Hamilton",53,"7","9",2); cr4.Resultados("Yuki Tsunoda",52,"10","10",1);
        cr4.Resultados("Nico Hulkenberg",52,"12","11",0); cr4.Resultados("Lance Stroll",52,"16","12",0);
        cr4.Resultados("Kevin Magnussen",52,"18","13",0); cr4.Resultados("Valtteri Bottas",52,"13","14",0);
        cr4.Resultados("Esteban Ocon",52,"15","15",0); cr4.Resultados("Pierre Gasly",52,"17","16",0);
        cr4.Resultados("Logan Sargeant",52,"19","17",0); cr4.Resultados("Zhou Guanyu",12,"20","NC",0);
        cr4.Resultados("Daniel Ricciardo",0,"11","NC",0); cr4.Resultados("Alexander Albon",0,"14","NC",0);

        // Asignar Resultados a Circuito 5
        cr5.Resultados("Max Verstappen",56,"1","1",25); cr5.Resultados("Lando Norris",56,"4","2",18);
        cr5.Resultados("Sergio Perez",56,"2","3",15); cr5.Resultados("Charles Leclerc",56,"6","4",12);
        cr5.Resultados("Carlos Sainz",56,"7","5",10); cr5.Resultados("George Russell",56,"8","6",8);
        cr5.Resultados("Fernando Alonso",56,"3","7",7); cr5.Resultados("Oscar Piastri",56,"5","8",4);
        cr5.Resultados("Lewis Hamilton",56,"18","9",2); cr5.Resultados("Nico Hulkenberg",56,"9","10",1);
        cr5.Resultados("Esteban Ocon",56,"13","11",0); cr5.Resultados("Alexander Albon",56,"14","12",0);
        cr5.Resultados("Pierre Gasly",56,"15","13",0); cr5.Resultados("Zhou Guanyu",56,"16","14",0);
        cr5.Resultados("Lance Stroll",56,"11","15",0); cr5.Resultados("Kevin Magnussen",56,"17","16",0);
        cr5.Resultados("Logan Sargeant",56,"20","17",0); cr5.Resultados("Daniel Ricciardo",33,"12","NC",0);
        cr5.Resultados("Yuki Tsunoda",26,"19","NC",0); cr5.Resultados("Valtteri Bottas",19,"10","NC",0);

        // Asignar Resultados a Circuito 6
        cr6.Resultados("Lando Norris",57,"5","1",25); cr6.Resultados("Max Verstappen",57,"1","2",18);
        cr6.Resultados("Charles Leclerc",57,"2","3",15); cr6.Resultados("Sergio Perez",57,"4","4",12);
        cr6.Resultados("Carlos Sainz",57,"3","5",10); cr6.Resultados("Lewis Hamilton",57,"8","6",8);
        cr6.Resultados("Yuki Tsunoda",57,"10","7",6); cr6.Resultados("George Russell",57,"7","8",4);
        cr6.Resultados("Fernando Alonso",57,"15","9",2); cr6.Resultados("Esteban Ocon",57,"13","10",1);
        cr6.Resultados("Nico Hulkenberg",57,"9","11",0); cr6.Resultados("Pierre Gasly",57,"12","12",0);
        cr6.Resultados("Oscar Piastri",57,"6","13",0); cr6.Resultados("Zhou Guanyu",57,"20","14",0);
        cr6.Resultados("Daniel Ricciardo",57,"18","15",0); cr6.Resultados("Valtteri Bottas",57,"16","16",0);
        cr6.Resultados("Lance Stroll",57,"11","17",0); cr6.Resultados("Alexander Albon",57,"14","18",0);
        cr6.Resultados("Kevin Magnussen",57,"19","19",0); cr6.Resultados("Logan Sargeant",27,"17","NC",0);

        // Asignar Resultados a Circuito 7
        cr7.Resultados("Max Verstappen",63,"1","1",25); cr7.Resultados("Lando Norris",63,"2","2",18);
        cr7.Resultados("Charles Leclerc",63,"3","3",15); cr7.Resultados("Oscar Piastri",63,"4","4",12);
        cr7.Resultados("Carlos Sainz",63,"5","5",10); cr7.Resultados("Lewis Hamilton",63,"6","6",8);
        cr7.Resultados("George Russell",63,"7","7",7); cr7.Resultados("Sergio Perez",63,"8","8",4);
        cr7.Resultados("Lance Stroll",63,"9","9",2); cr7.Resultados("Yuki Tsunoda",62,"10","10",1);
        cr7.Resultados("Nico Hulkenberg",62,"11","11",0); cr7.Resultados("Kevin Magnussen",62,"12","12",0);
        cr7.Resultados("Daniel Ricciardo",62,"13","13",0); cr7.Resultados("Esteban Ocon",62,"14","14",0);
        cr7.Resultados("Zhou Guanyu",62,"15","15",0); cr7.Resultados("Pierre Gasly",62,"16","16",0);
        cr7.Resultados("Logan Sargeant",62,"17","17",0); cr7.Resultados("Valtteri Bottas",62,"18","18",0);
        cr7.Resultados("Fernando Alonso",62,"19","19",0); cr7.Resultados("Alexander Albon",51,"NC","NC",0);

        // Asignar Resultados a Circuito 8
        cr8.Resultados("Charles Leclerc",78,"1","1",25); cr8.Resultados("Oscar Piastri",78,"2","2",18);
        cr8.Resultados("Carlos Sainz",78,"3","3",15); cr8.Resultados("Lando Norris",78,"4","4",12);
        cr8.Resultados("George Russell",78,"5","5",10); cr8.Resultados("Max Verstappen",78,"6","6",8);
        cr8.Resultados("Lewis Hamilton",78,"7","7",7); cr8.Resultados("Yuki Tsunoda",77,"8","8",4);
        cr8.Resultados("Alexander Albon",77,"9","9",2); cr8.Resultados("Pierre Gasly",77,"10","10",1);
        cr8.Resultados("Fernando Alonso",76,"16","11",0); cr8.Resultados("Daniel Ricciardo",76,"13","12",0);
        cr8.Resultados("Valtteri Bottas",76,"19","13",0); cr8.Resultados("Lance Stroll",76,"14","14",0);
        cr8.Resultados("Logan Sargeant",76,"17","15",0); cr8.Resultados("Zhou Guanyu",76,"20","16",0);
        cr8.Resultados("Esteban Ocon",0,"11","NC",0); cr8.Resultados("Sergio Perez",0,"18","NC",0);
        cr8.Resultados("Nico Hulkenberg",0,"12","NC",0); cr8.Resultados("Kevin Magnussen",0,"15","NC",0);

        // Asignar Resultados a Circuito 9
        cr9.Resultados("Max Verstappen",70,"6","1",25); cr9.Resultados("Lando Norris",70,"4","2",18);
        cr9.Resultados("George Russell",70,"5","3",15); cr9.Resultados("Lewis Hamilton",70,"7","4",13);
        cr9.Resultados("Oscar Piastri",70,"2","5",10); cr9.Resultados("Fernando Alonso",70,"16","6",8);
        cr9.Resultados("Lance Stroll",70,"14","7",6); cr9.Resultados("Daniel Ricciardo",70,"13","8",4);
        cr9.Resultados("Pierre Gasly",70,"10","9",2); cr9.Resultados("Esteban Ocon",70,"11","10",1);
        cr9.Resultados("Nico Hulkenberg",70,"12","11",0); cr9.Resultados("Kevin Magnussen",70,"15","12",0);
        cr9.Resultados("Valtteri Bottas",70,"19","13",0); cr9.Resultados("Yuki Tsunoda",70,"8","14",0);
        cr9.Resultados("Zhou Guanyu",69,"20","15",0); cr9.Resultados("Carlos Sainz",52,"3","NC",0);
        cr9.Resultados("Alexander Albon",52,"9","NC",0); cr9.Resultados("Sergio Perez",51,"18","NC",0);
        cr9.Resultados("Charles Leclerc",40,"1","NC",0); cr9.Resultados("Logan Sargeant",23,"17","NC",0);

        // Asignar Resultados a Circuito 10
        cr10.Resultados("Max Verstappen",66,"2","1",25); cr10.Resultados("Lando Norris",66,"3","2",19);
        cr10.Resultados("Lewis Hamilton",66,"7","3",15); cr10.Resultados("George Russell",66,"1","4",12);
        cr10.Resultados("Charles Leclerc",66,"11","5",10); cr10.Resultados("Carlos Sainz",66,"12","6",8);
        cr10.Resultados("Oscar Piastri",66,"4","7",6); cr10.Resultados("Sergio Perez",66,"16","8",4);
        cr10.Resultados("Pierre Gasly",66,"15","9",2); cr10.Resultados("Esteban Ocon",66,"18","10",1);
        cr10.Resultados("Nico Hulkenberg",66,"19","11",0); cr10.Resultados("Fernando Alonso",65,"6","12",0);
        cr10.Resultados("Zhou Guanyu",65,"20","13",0); cr10.Resultados("Lance Stroll",65,"10","14",0);
        cr10.Resultados("Daniel Ricciardo",65,"5","15",0); cr10.Resultados("Valtteri Bottas",65,"17","16",0);
        cr10.Resultados("Kevin Magnussen",65,"14","17",0); cr10.Resultados("Alexander Albon",65,"9","18",0);
        cr10.Resultados("Yuki Tsunoda",65,"8","19",0); cr10.Resultados("Logan Sargeant",64,"13","20",0);
        
        // Asignar Resultados a Circuito 11
        cr11.Resultados("George Russell",71,"3","1",25); cr11.Resultados("Oscar Piastri",71,"7","2",18);
        cr11.Resultados("Carlos Sainz",71,"4","3",15); cr11.Resultados("Lewis Hamilton",71,"5","4",12);
        cr11.Resultados("Max Verstappen",71,"1","5",10); cr11.Resultados("Nico Hulkenberg",71,"9","6",8);
        cr11.Resultados("Sergio Perez",71,"8","7",6); cr11.Resultados("Kevin Magnussen",71,"12","8",4);
        cr11.Resultados("Daniel Ricciardo",71,"11","9",2); cr11.Resultados("Pierre Gasly",71,"13","10",1);
        cr11.Resultados("Charles Leclerc",71,"6","11",0); cr11.Resultados("Esteban Ocon",71,"10","12",0);
        cr11.Resultados("Lance Stroll",70,"17","13",0); cr11.Resultados("Yuki Tsunoda",70,"14","14",0);
        cr11.Resultados("Alexander Albon",70,"16","15",0); cr11.Resultados("Valtteri Bottas",70,"18","16",0);
        cr11.Resultados("Zhou Guanyu",70,"20","17",0); cr11.Resultados("Fernando Alonso",70,"15","18",0);
        cr11.Resultados("Logan Sargeant",69,"19","19",0); cr11.Resultados("Lando Norris",64,"2","20",0);
        
        // Asignar Resultados a Circuito 12
        cr12.Resultados("Lewis Hamilton",52,"2","1",25); cr12.Resultados("Max Verstappen",52,"4","2",18);
        cr12.Resultados("Lando Norris",52,"3","3",15); cr12.Resultados("Oscar Piastri",52,"5","4",12);
        cr12.Resultados("Carlos Sainz",52,"7","5",11); cr12.Resultados("Nico Hulkenberg",52,"6","6",8);
        cr12.Resultados("Lance Stroll",52,"8","7",6); cr12.Resultados("Fernando Alonso",52,"10","8",4);
        cr12.Resultados("Alexander Albon",52,"9","9",2); cr12.Resultados("Yuki Tsunoda",52,"13","10",1);
        cr12.Resultados("Logan Sargeant",52,"12","11",0); cr12.Resultados("Kevin Magnussen",52,"17","12",0);
        cr12.Resultados("Daniel Ricciardo",51,"15","13",0); cr12.Resultados("Charles Leclerc",51,"11","14",0);
        cr12.Resultados("Valtteri Bottas",51,"16","15",0); cr12.Resultados("Esteban Ocon",50,"18","16",0);
        cr12.Resultados("Sergio Perez",50,"19","17",0); cr12.Resultados("Zhou Guanyu",50,"14","18",0);
        cr12.Resultados("George Russell",33,"1","NC",0); cr12.Resultados("Pierre Gasly",0,"20","NC",0);

        // Asignar Resultados a Circuito 13
        cr13.Resultados("Oscar Piastri",70,"2","1",25); cr13.Resultados("Lando Norris",70,"1","2",18);
        cr13.Resultados("Lewis Hamilton",70,"5","3",15); cr13.Resultados("Charles Leclerc",70,"6","4",12);
        cr13.Resultados("Max Verstappen",70,"3","5",10); cr13.Resultados("Carlos Sainz",70,"4","6",8);
        cr13.Resultados("Sergio Perez",70,"16","7",6); cr13.Resultados("George Russell",70,"17","8",5);
        cr13.Resultados("Yuki Tsunoda",70,"10","9",2); cr13.Resultados("Lance Stroll",70,"8","10",1);
        cr13.Resultados("Fernando Alonso",70,"7","11",0); cr13.Resultados("Daniel Ricciardo",69,"9","12",0);
        cr13.Resultados("Nico Hulkenberg",69,"11","13",0); cr13.Resultados("Alexander Albon",69,"13","14",0);
        cr13.Resultados("Kevin Magnussen",69,"15","15",0); cr13.Resultados("Valtteri Bottas",69,"12","16",0);
        cr13.Resultados("Logan Sargeant",69,"14","17",0); cr13.Resultados("Esteban Ocon",69,"19","18",0);
        cr13.Resultados("Zhou Guanyu",69,"18","19",0); cr13.Resultados("Pierre Gasly",33,"20","NC",0);

        // Asignar Resultados a Circuito 14
        cr14.Resultados("George Russell",44,"17","1",25); cr14.Resultados("Lewis Hamilton",44,"5","2",18);
        cr14.Resultados("Oscar Piastri",44,"2","3",15); cr14.Resultados("Charles Leclerc",44,"6","4",12);
        cr14.Resultados("Max Verstappen",44,"3","5",10); cr14.Resultados("Lando Norris",44,"1","6",8);
        cr14.Resultados("Carlos Sainz",44,"4","7",7); cr14.Resultados("Sergio Perez",44,"16","8",4);
        cr14.Resultados("Fernando Alonso",44,"7","9",2); cr14.Resultados("Esteban Ocon",44,"19","10",1);
        cr14.Resultados("Daniel Ricciardo",44,"9","11",0); cr14.Resultados("Lance Stroll",44,"8","12",0);
        cr14.Resultados("Alexander Albon",44,"13","13",0); cr14.Resultados("Pierre Gasly",44,"20","14",0);
        cr14.Resultados("Kevin Magnussen",44,"15","15",0); cr14.Resultados("Valtteri Bottas",44,"12","16",0);
        cr14.Resultados("Yuki Tsunoda",44,"10","17",0); cr14.Resultados("Logan Sargeant",44,"14","18",0);
        cr14.Resultados("Nico Hulkenberg",44,"11","DQ",0); cr14.Resultados("Zhou Guanyu",0,"18","NC",0);

        // Asignar Resultados a Circuito 15
        cr15.Resultados("Lando Norris",72,"1","1",26); cr15.Resultados("Max Verstappen",72,"2","2",18);
        cr15.Resultados("Charles Leclerc",72,"6","3",15); cr15.Resultados("Oscar Piastri",72,"3","4",12);
        cr15.Resultados("Carlos Sainz",72,"10","5",10); cr15.Resultados("Sergio Perez",72,"5","6",8);
        cr15.Resultados("George Russell",72,"4","7",6); cr15.Resultados("Lewis Hamilton",72,"14","8",4);
        cr15.Resultados("Pierre Gasly",71,"9","9",2); cr15.Resultados("Fernando Alonso",71,"7","10",1);
        cr15.Resultados("Nico Hulkenberg",71,"12","11",0); cr15.Resultados("Daniel Ricciardo",71,"15","12",0);
        cr15.Resultados("Lance Stroll",71,"8","13",0); cr15.Resultados("Alexander Albon",71,"20","14",0);
        cr15.Resultados("Esteban Ocon",71,"16","15",0); cr15.Resultados("Logan Sargeant",71,"19","16",0);
        cr15.Resultados("Yuki Tsunoda",71,"11","17",0); cr15.Resultados("Kevin Magnussen",71,"13","18",0);
        cr15.Resultados("Valtteri Bottas",70,"17","19",0); cr15.Resultados("Zhou Guanyu",70,"18","20",0);

        // Asignar Resultados a Circuito 16
        cr16.Resultados("Charles Leclerc",53,"4","1",25); cr16.Resultados("Oscar Piastri",53,"2","2",18);
        cr16.Resultados("Lando Norris",53,"1","3",16); cr16.Resultados("Carlos Sainz",53,"5","4",12);
        cr16.Resultados("Lewis Hamilton",53,"6","5",10); cr16.Resultados("Max Verstappen",53,"7","6",8);
        cr16.Resultados("George Russell",53,"3","7",6); cr16.Resultados("Sergio Perez",53,"8","8",4);
        cr16.Resultados("Alexander Albon",53,"9","9",2); cr16.Resultados("Kevin Magnussen",53,"13","10",1);
        cr16.Resultados("Fernando Alonso",53,"11","11",0); cr16.Resultados("Franco Colapinto",53,"18","12",0);
        cr16.Resultados("Daniel Ricciardo",53,"12","13",0); cr16.Resultados("Esteban Ocon",52,"15","14",0);
        cr16.Resultados("Pierre Gasly",52,"14","15",0); cr16.Resultados("Valtteri Bottas",52,"19","16",0);
        cr16.Resultados("Nico Hulkenberg",52,"10","17",0); cr16.Resultados("Zhou Guanyu",52,"20","18",0);
        cr16.Resultados("Lance Stroll",52,"17","19",0); cr16.Resultados("Yuki Tsunoda",7,"16","NC",0);

        // Asignar Resultados a Circuito 17
        cr17.Resultados("Oscar Piastri",51,"2","1",25); cr17.Resultados("Charles Leclerc",51,"1","2",18);
        cr17.Resultados("George Russell",51,"5","3",15); cr17.Resultados("Lando Norris",51,"15","4",13);
        cr17.Resultados("Max Verstappen",51,"6","5",10); cr17.Resultados("Fernando Alonso",51,"7","6",8);
        cr17.Resultados("Alexander Albon",51,"9","7",6); cr17.Resultados("Franco Colapinto",51,"8","8",4);
        cr17.Resultados("Lewis Hamilton",51,"19","9",2); cr17.Resultados("Oliver Bearman",51,"10","10",1);
        cr17.Resultados("Nico Hulkenberg",51,"12","11",0); cr17.Resultados("Pierre Gasly",51,"18","12",0);
        cr17.Resultados("Daniel Ricciardo",51,"14","13",0); cr17.Resultados("Zhou Guanyu",51,"17","14",0);
        cr17.Resultados("Esteban Ocon",50,"20","15",0); cr17.Resultados("Valtteri Bottas",50,"16","16",0);
        cr17.Resultados("Sergio Perez",49,"4","17",0); cr17.Resultados("Carlos Sainz",49,"3","18",0);
        cr17.Resultados("Lance Stroll",45,"13","19",0); cr17.Resultados("Yuki Tsunoda",14,"11","NC",0);

        // Asignar Resultados a Circuito 18
        cr18.Resultados("Lando Norris",62,"1","1",25); cr18.Resultados("Max Verstappen",62,"2","2",18);
        cr18.Resultados("Oscar Piastri",62,"5","3",15); cr18.Resultados("George Russell",62,"4","4",12);
        cr18.Resultados("Charles Leclerc",62,"9","5",10); cr18.Resultados("Lewis Hamilton",62,"3","6",8);
        cr18.Resultados("Carlos Sainz",62,"10","7",6); cr18.Resultados("Fernando Alonso",61,"7","8",4);
        cr18.Resultados("Nico Hulkenberg",61,"6","9",2); cr18.Resultados("Sergio Perez",61,"13","10",1);
        cr18.Resultados("Franco Colapinto",61,"12","11",0); cr18.Resultados("Yuki Tsunoda",61,"8","12",0);
        cr18.Resultados("Esteban Ocon",61,"15","13",0); cr18.Resultados("Lance Stroll",61,"17","14",0);
        cr18.Resultados("Zhou Guanyu",61,"20","15",0); cr18.Resultados("Valtteri Bottas",61,"19","16",0);
        cr18.Resultados("Pierre Gasly",61,"18","17",0); cr18.Resultados("Daniel Ricciardo",61,"16","18",0);
        cr18.Resultados("Kevin Magnussen",57,"14","19",0); cr18.Resultados("Alexander Albon",15,"11","NC",0);

        // Asignar Resultados a Circuito 19
        cr19.Resultados("Charles Leclerc",56,"4","1",25); cr19.Resultados("Carlos Sainz",56,"3","2",18);
        cr19.Resultados("Max Verstappen",56,"2","3",15); cr19.Resultados("Lando Norris",56,"1","4",12);
        cr19.Resultados("Oscar Piastri",56,"5","5",10); cr19.Resultados("George Russell",56,"20","6",8);
        cr19.Resultados("Sergio Perez",56,"9","7",6); cr19.Resultados("Nico Hulkenberg",56,"11","8",4);
        cr19.Resultados("Liam Lawson",56,"19","9",2); cr19.Resultados("Franco Colapinto",56,"15","10",1);
        cr19.Resultados("Kevin Magnussen",56,"8","11",0); cr19.Resultados("Pierre Gasly",56,"6","12",0);
        cr19.Resultados("Fernando Alonso",55,"7","13",0); cr19.Resultados("Yuki Tsunoda",55,"10","14",0);
        cr19.Resultados("Lance Stroll",55,"13","15",0); cr19.Resultados("Alexander Albon",55,"14","16",0);
        cr19.Resultados("Valtteri Bottas",55,"16","17",0); cr19.Resultados("Esteban Ocon",55,"12","18",0);
        cr19.Resultados("Zhou Guanyu",55,"18","19",0); cr19.Resultados("Lewis Hamilton",1,"17","NC",0);

        // Asignar Resultados a Circuito 20
        cr20.Resultados("Carlos Sainz",71,"1","1",25); cr20.Resultados("Lando Norris",71,"3","2",18);
        cr20.Resultados("Charles Leclerc",71,"4","3",16); cr20.Resultados("Lewis Hamilton",71,"6","4",12);
        cr20.Resultados("George Russell",71,"5","5",10); cr20.Resultados("Max Verstappen",71,"2","6",8);
        cr20.Resultados("Kevin Magnussen",71,"7","7",6); cr20.Resultados("Oscar Piastri",71,"17","8",4);
        cr20.Resultados("Nico Hulkenberg",70,"10","9",2); cr20.Resultados("Pierre Gasly",70,"8","10",1);
        cr20.Resultados("Lance Stroll",70,"14","11",0); cr20.Resultados("Franco Colapinto",70,"16","12",0);
        cr20.Resultados("Esteban Ocon",70,"20","13",0); cr20.Resultados("Valtteri Bottas",70,"15","14",0);
        cr20.Resultados("Zhou Guanyu",70,"19","15",0); cr20.Resultados("Liam Lawson",70,"12","16",0);
        cr20.Resultados("Sergio Perez",70,"18","17",0); cr20.Resultados("Fernando Alonso",15,"13","NC",0);
        cr20.Resultados("Alexander Albon",0,"9","NC",0); cr20.Resultados("Yuki Tsunoda",0,"11","NC",0);
        
        // Asignar Resultados a Circuito 21
        cr21.Resultados("Max Verstappen",69,"17","1",26); cr21.Resultados("Esteban Ocon",69,"4","2",18);
        cr21.Resultados("Pierre Gasly",69,"13","3",15); cr21.Resultados("George Russell",69,"2","4",12);
        cr21.Resultados("Charles Leclerc",69,"6","5",10); cr21.Resultados("Lando Norris",69,"1","6",8);
        cr21.Resultados("Yuki Tsunoda",69,"3","7",6); cr21.Resultados("Oscar Piastri",69,"8","8",4);
        cr21.Resultados("Liam Lawson",69,"5","9",2); cr21.Resultados("Lewis Hamilton",69,"14","10",1);
        cr21.Resultados("Sergio Perez",69,"12","11",0); cr21.Resultados("Oliver Bearman",69,"15","12",0);
        cr21.Resultados("Valtteri Bottas",69,"11","13",0); cr21.Resultados("Fernando Alonso",69,"9","14",0);
        cr21.Resultados("Zhou Guanyu",69,"19","15",0); cr21.Resultados("Carlos Sainz",38,"20","NC",0);
        cr21.Resultados("Franco Colapinto",30,"16","NC",0); cr21.Resultados("Alexander Albon",0,"7","NC",0);
        cr21.Resultados("Lance Stroll",0,"10","NC",0); cr21.Resultados("Nico Hulkenberg",0,"18","DQ",0);

        // Asignar Resultados a Circuito 22
        cr22.Resultados("George Russell",50,"1","1",25); cr22.Resultados("Lewis Hamilton",50,"10","2",18);
        cr22.Resultados("Carlos Sainz",50,"2","3",15); cr22.Resultados("Charles Leclerc",50,"4","4",12);
        cr22.Resultados("Max Verstappen",50,"5","5",10); cr22.Resultados("Lando Norris",50,"6","6",9);
        cr22.Resultados("Oscar Piastri",50,"8","7",6); cr22.Resultados("Nico Hulkenberg",50,"9","8",4);
        cr22.Resultados("Yuki Tsunoda",50,"7","9",2); cr22.Resultados("Sergio Perez",50,"15","10",1);
        cr22.Resultados("Fernando Alonso",50,"16","11",0); cr22.Resultados("Kevin Magnussen",50,"12","12",0);
        cr22.Resultados("Zhou Guanyu",50,"13","13",0); cr22.Resultados("Franco Colapinto",50,"20","14",0);
        cr22.Resultados("Lance Stroll",50,"18","15",0); cr22.Resultados("Liam Lawson",50,"14","16",0);
        cr22.Resultados("Esteban Ocon",49,"11","17",0); cr22.Resultados("Valtteri Bottas",49,"19","18",0);
        cr22.Resultados("Alexander Albon",25,"17","NC",0); cr22.Resultados("Pierre Gasly",15,"3","NC",0);

        // Asignar Resultados a Circuito 23
        cr23.Resultados("Max Verstappen",57,"2","1",25); cr23.Resultados("Charles Leclerc",57,"5","2",18);
        cr23.Resultados("Oscar Piastri",57,"4","3",15); cr23.Resultados("George Russell",57,"1","4",12);
        cr23.Resultados("Pierre Gasly",57,"11","5",10); cr23.Resultados("Carlos Sainz",57,"7","6",8);
        cr23.Resultados("Fernando Alonso",57,"8","7",6); cr23.Resultados("Zhou Guanyu",57,"12","8",4);
        cr23.Resultados("Kevin Magnussen",57,"10","9",2); cr23.Resultados("Lando Norris",57,"3","10",2);
        cr23.Resultados("Valtteri Bottas",57,"13","11",0); cr23.Resultados("Lewis Hamilton",57,"6","12",0);
        cr23.Resultados("Yuki Tsunoda",57,"14","13",0); cr23.Resultados("Liam Lawson",57,"17","14",0);
        cr23.Resultados("Alexander Albon",56,"16","15",0); cr23.Resultados("Nico Hulkenberg",39,"18","NC",0);
        cr23.Resultados("Sergio Perez",38,"9","NC",0); cr23.Resultados("Lance Stroll",8,"15","NC",0);
        cr23.Resultados("Franco Colapinto",0,"19","NC",0); cr23.Resultados("Esteban Ocon",0,"20","NC",0);

        // Asignar Resultados a Circuito 24
        cr24.Resultados("Lando Norris",58,"1","1",25); cr24.Resultados("Carlos Sainz",58,"3","2",18);
        cr24.Resultados("Charles Leclerc",58,"19","3",15); cr24.Resultados("Lewis Hamilton",58,"16","4",12);
        cr24.Resultados("George Russell",58,"6","5",10); cr24.Resultados("Max Verstappen",58,"4","6",8);
        cr24.Resultados("Pierre Gasly",58,"5","7",6); cr24.Resultados("Nico Hulkenberg",58,"7","8",4);
        cr24.Resultados("Fernando Alonso",58,"8","9",2); cr24.Resultados("Oscar Piastri",58,"2","10",1);
        cr24.Resultados("Alexander Albon",57,"18","11",0); cr24.Resultados("Yuki Tsunoda",57,"11","12",0);
        cr24.Resultados("Zhou Guanyu",57,"15","13",0); cr24.Resultados("Lance Stroll",57,"13","14",0);
        cr24.Resultados("Jack Doohan",57,"17","15",0); cr24.Resultados("Kevin Magnussen",57,"14","16",0);
        cr24.Resultados("Liam Lawson",55,"12","17",0); cr24.Resultados("Valtteri Bottas",30,"9","NC",0);
        cr24.Resultados("Franco Colapinto",26,"20","NC",0); cr24.Resultados("Sergio Perez",0,"10","NC",0);










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
