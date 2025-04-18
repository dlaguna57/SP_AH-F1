package org.F1.Mun2024;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import org.F1.Mun2024.Equipo;

public class Menu {
    int opcion = 0;
    Scanner sc=new Scanner(System.in);
    //Llamado de lista de Clase Main
    List<Equipo> equipos;
    List<Piloto> pilotos;
    List<Circuito> circuitos;

    //Definicion de Constructores
    public Menu() {
    }
    public Menu(List<Equipo> equipos, List<Piloto> pilotos, List<Circuito> circuitos) {
        this.equipos = equipos;
        this.pilotos = pilotos;
        this.circuitos = circuitos;
    }

    public void menuPrincipal(){
        while (opcion != 4) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("[1] Mostrar Equipos");
            System.out.println("[2] Mostrar Pilotos");
            System.out.println("[3] Mostrar Circuitos");
            System.out.println("[4] Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Llamada al metodo de impresion de Equipos
                    menuEquipos();
                    break;

                case 2:
                    //Llamada al metodo de impresion de Pilotos
                    new Piloto().printPilotos(pilotos);
                    break;

                case 3:
                    //Llamada al metodo de impresion de Lista de Circuitos
                    new Circuito().printCircuitos(circuitos);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Opcion no valida, ingrese de nuevo la opcion");
                    break;

            }
        }
    }

    public void menuEquipos(){
        int opcionEq = 0;
        new Equipo().printEquipos(equipos);
        while (opcionEq != 4) {
            System.out.println("\n===== MENÚ DE EQUIPOS =====");
            System.out.println("[1] Seleccionar un Equipo");
            System.out.println("[2] Volver al Menu Anterior");
            System.out.println("[3] Volver al Menu Principal");
            System.out.println("[4] Salir");
            System.out.print("Seleccione una opción: ");

            opcionEq = sc.nextInt();
            switch (opcionEq) {
                case 1:
                    menuEquSelec();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    return;

                default:
                    System.out.println("Opcion no valida, ingrese de nuevo la opcion");
                    break;

            }
        }
    }

    public void menuEquSelec() {
        System.out.println("Ingrese el numero del equipo que desea ver");
        int equSelect = sc.nextInt() - 1;
        if (equSelect >= 0 && equSelect < equipos.size()) {
            equipos.get(equSelect).printInfEquipo(equipos.get(equSelect));
        } else {System.out.println("Opcion no valida"); return;}


        while (true) {
            System.out.println("\n===== MENÚ DE EQUIPO SELECCIONADO =====");
            System.out.println("[1] Volver al Menu Anterior");
            System.out.println("[2] Volver al Menu Principal");
            System.out.println("[3] Salir");
            System.out.print("Seleccione una opción: ");

            int opcionEqSelec = sc.nextInt(); sc.nextLine();
            switch (opcionEqSelec){
                case 1:
                    return;
                case 2:
                    menuPrincipal();
                    return;
                case 3:
                    System.out.println("Saliendo del sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese de nuevo la opcion");
                    break;
            }
        }
    }
}

