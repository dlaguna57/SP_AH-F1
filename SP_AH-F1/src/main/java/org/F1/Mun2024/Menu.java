package org.F1.Mun2024;

import java.util.Scanner;
import java.util.List;

public class Menu {
    int opcion = 0;
    Scanner sc = new Scanner(System.in);
    //Llamado de lista de Clase Main
    private List<Equipo> equipos;
    private List<Piloto> pilotos;
    private List<Circuito> circuitos;

    //Definicion de Constructores
    public Menu() {
    }

    public Menu(List<Equipo> equipos, List<Piloto> pilotos, List<Circuito> circuitos) {
        this.equipos = equipos;
        this.pilotos = pilotos;
        this.circuitos = circuitos;
    }
    //metodos Get
    public List<Equipo> getEquipos() { return equipos;}
    public List<Piloto> getPilotos() {return pilotos;}
    public List<Circuito> getCircuitos() {return circuitos;}
    // metodos Set
    public void setEquipos(List<Equipo> equipos) {this.equipos = equipos;}
    public void setPilotos(List<Piloto> pilotos) {this.pilotos = pilotos;}
    public void setCircuitos(List<Circuito> circuitos) {this.circuitos = circuitos;
    }

    public void menuPrincipal() {
        while (opcion != 4) {
            System.out.println(Banner.getBanner4());
            System.out.println(Banner.getBanner2());
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("[1] Mostrar Equipos");
            System.out.println("[2] Mostrar Pilotos");
            System.out.println("[3] Mostrar Circuitos");
            System.out.println("[4] Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Llamada al metodo menuEquipos
                    menuEquipos();
                    break;

                case 2:
                    //Llamada al metodo de impresion de Pilotos
                    menuPilotos();
                    break;

                case 3:
                    menuCircuitos();

                case 4:
                    System.out.println("Saliendo del sistema");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida, ingrese de nuevo la opcion");
                    break;
            }
        }
    }

    public void menuEquipos() {
        int opcionEq = 0;
        new Equipo().printEquipos(equipos);
        while (true) {
            System.out.println("\n===== MENÚ DE EQUIPOS =====");
            System.out.println("[1] Seleccionar un Equipo");
            System.out.println("[2] Volver al Menu Principal");
            System.out.println("[3] Salir");
            System.out.print("Seleccione una opción: ");

            opcionEq = sc.nextInt();
            switch (opcionEq) {
                case 1:
                    menuSelecEqu();

                case 2:
                    menuPrincipal();
                    break;

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

    public void menuSelecEqu() {
        System.out.println("Ingrese el numero del equipo que desea ver:");
        int equSelect = sc.nextInt() - 1;
        if (equSelect >= 0 && equSelect < equipos.size()) {
            equipos.get(equSelect).printInfEquipo(equipos.get(equSelect));
        } else {
            System.out.println("Opcion no valida");
            return;
        }


        while (true) {
            System.out.println("\n===== MENÚ DE EQUIPO SELECCIONADO =====");
            System.out.println("[1] Volver al Menu Anterior");
            System.out.println("[2] Volver al Menu Principal");
            System.out.println("[3] Salir");
            System.out.print("Seleccione una opción: ");

            int opcionEqSelec = sc.nextInt();
            sc.nextLine();
            switch (opcionEqSelec) {
                case 1:
                    menuEquipos();
                    break;
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

    public void menuPilotos() {
        int opcionPi = 0;
        new Piloto().printPiloto(pilotos);
        while (true) {
            System.out.println("\n===== MENÚ DE PILOTOS =====");
            System.out.println("[1] Seleccionar un Piloto");
            System.out.println("[2] Volver al Menu Principal");
            System.out.println("[3] Salir");
            System.out.print("Seleccione una opción: ");

            opcionPi = sc.nextInt();
            switch (opcionPi) {
                case 1:
                    menuSelecPil();

                case 2:
                    menuPrincipal();
                    break;

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

    public void menuSelecPil() {
        System.out.println("Ingrese el numero del Piloto que desea ver:");
        int pilSelect = sc.nextInt() - 1;
        if (pilSelect >= 0 && pilSelect < pilotos.size()) {
            pilotos.get(pilSelect).printInfPilotos(pilotos.get(pilSelect));
        } else {System.out.println("Opcion no valida"); return;}

        while (true) {
            System.out.println("\n========== MENÚ DE SELECCION PILOTOS =====");
            System.out.println("[1] Volver al Menu Anterior");
            System.out.println("[2] Volver al Menu Principal");
            System.out.println("[3] Salir");
            System.out.print("Seleccione una opción: ");

            int opcionPiSelec = sc.nextInt();
            sc.nextLine();
            switch (opcionPiSelec) {
                case 1:
                    menuPilotos();
                    break;
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

    public void  menuCircuitos() {
        new Circuito().printCircuitos(circuitos);
        while (true) {
            System.out.println("\n===== MENÚ DE CIRCUITOS =====");
            System.out.println("[1] Seleccionar un Circuito");
            System.out.println("[2] Posiciones de equipos y pilotos por circuito ");
            System.out.println("[3] Volver al Menu Principal");
            System.out.println("[4] Salir");
            System.out.print("Seleccione una opción: ");

            int opcionCirc = sc.nextInt();
            switch (opcionCirc) {
                case 1:
                    menuSelecCirc();
                    break;
                case 2:
                    posxcarr();
                    break;

                case 3:
                    menuPrincipal();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida, ingrese de nuevo la opcion");
                    break;

            }
        }
    }

    public void menuSelecCirc() {
        System.out.println("Ingrese el numero del Circuito que desea ver:");
        int circSelec = sc.nextInt() - 1;
        if (circSelec >= 0 && circSelec < circuitos.size()) {
            circuitos.get(circSelec).printResultCircuito(circuitos.get(circSelec));
        } else {System.out.println("Opcion no valida"); return;}

        while (true) {
            System.out.println("\n===== MENÚ DE SELECCION CIRCUITOS =====");
            System.out.println("[1] Volver al Menu Anterior");
            System.out.println("[2] Volver al Menu Principal");
            System.out.println("[3] Salir");
            System.out.print("Seleccione una opción: ");

            int opcionPiSelec = sc.nextInt();
            sc.nextLine();
            switch (opcionPiSelec) {
                case 1:
                    menuCircuitos();
                    break;
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
    public void posxcarr() {
        for (Circuito circuito : circuitos) {
            System.out.println("Resultados de la carrera en " + circuito.getNameCirc() + " - " + circuito.getPaisCirc());

            // Imprimir posiciones de los pilotos
            System.out.println("Posiciones de equipos y Pilotos:");
            for (int i = 0; i < circuito.getEquipos().size(); i++) {
                String equipo = circuito.getEquipos().get(i);
                String salida = circuito.getPosSal().get(i);
                String llegada = circuito.getPosLleg().get(i);
                int puntos = circuito.getPuntosAdq().get(i);
                System.out.println( " - Circutio: " + circuito.getNameCirc() + " - Pais: " + circuito.getPaisCirc());
                System.out.println( " - Equipo: " + equipo);
                System.out.println(" - Piloto: " + circuito.getPilotos().get(i) + " Posición de salida: " + salida + " - Posición de llegada: " + llegada);
                System.out.println(" - Puntos obtenidos: " + puntos);
                System.out.println("----------------------------");
            }
        }
    }
}
