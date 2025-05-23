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
            System.out.println(Banner.getBanner5());
            System.out.println(Banner.getBanner2());
            System.out.println("======================================");
            System.out.println("| [1] Mostrar Equipos               |");
            System.out.println("| [2] Mostrar Pilotos               |");
            System.out.println("| [3] Mostrar Circuitos             |");
            System.out.println("| [4] Salir                         |");
            System.out.println("======================================");
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
            System.out.println(Banner.getBanner6());
            System.out.println("======================================");
            System.out.println("| [1] Seleccionar un Equipo          |");
            System.out.println("| [2] Comparar equipos               |");
            System.out.println("| [3] Volver al Menu Principal       |");
            System.out.println("| [4] Salir                          |");
            System.out.println("======================================");
            System.out.print("Seleccione una opción: ");

            opcionEq = sc.nextInt();
            switch (opcionEq) {
                case 1:
                    menuSelecEqu();

                case 2:
                    menuCompEqu();
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
            System.out.println("======================================");
            System.out.println("\n===== MENÚ DE EQUIPO SELECCIONADO =====");
            System.out.println("======================================");
            System.out.println("| [1] Volver al Menu Anterior         |");
            System.out.println("| [2] Volver al Menu Principal        |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
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

    public void menuCompEqu() {
        System.out.println("Ingrese el numero del 1er equipo que desea ver:");
        int equSelect1 = sc.nextInt() - 1;
        System.out.println("Ingrese el numero del 2do equipo que desea ver:");
        int equSelect2 = sc.nextInt() - 1;
        if (equSelect1 >= 0 && equSelect1 < equipos.size()) {
            equipos.get(equSelect1).printInfEquipo(equipos.get(equSelect1));
            System.out.println();
        } else {
            System.out.println("Opcion no valida");
            return;
        }
        if (equSelect2 >= 0 && equSelect2 < equipos.size()) {
            equipos.get(equSelect2).printInfEquipo(equipos.get(equSelect2));
        } else {
            System.out.println("Opcion no valida");
            return;
        }

        while (true) {
            System.out.println("======================================");
            System.out.println("\n===== MENÚ DE COMPARACION DE EQUIPOS =====");
            System.out.println("======================================");
            System.out.println("| [1] Volver al Menu Anterior         |");
            System.out.println("| [2] Volver al Menu Principal        |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
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
            System.out.println(Banner.getBanner7());
            System.out.println("======================================");
            System.out.println("| [1] Seleccionar un Piloto          |");
            System.out.println("| [2] Comparacion Pilotos            |");
            System.out.println("| [3] Volver al Menu Principal       |");
            System.out.println("| [4] Salir                          |");
            System.out.println("======================================");
            System.out.print("Seleccione una opción: ");

            opcionPi = sc.nextInt();
            switch (opcionPi) {
                case 1:
                    menuSelecPil();

                case 2:
                    menuCompPil();
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

    public void menuSelecPil() {
        System.out.println("Ingrese el numero del Piloto que desea ver:");
        int pilSelect = sc.nextInt() - 1;
        if (pilSelect >= 0 && pilSelect < pilotos.size()) {
            pilotos.get(pilSelect).printInfPilotos(pilotos.get(pilSelect));
        } else {System.out.println("Opcion no valida"); return;}

        while (true) {
            System.out.println("======================================");
            System.out.println("\n========== MENÚ DE SELECCION PILOTOS =====");
            System.out.println("======================================");
            System.out.println("| [1] Volver al Menu Anterior         |");
            System.out.println("| [2] Volver al Menu Principal        |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
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

    public void menuCompPil() {
        System.out.println("Ingrese el numero del 1er Piloto que desea ver:");
        int pilSelect1 = sc.nextInt() - 1;
        System.out.println("Ingrese el numero del 2do Piloto que desea ver:");
        int pilSelect2 = sc.nextInt() - 1;
        if (pilSelect1 >= 0 && pilSelect1 < pilotos.size()) {
            pilotos.get(pilSelect1).printInfPilotos(pilotos.get(pilSelect1));
            System.out.println();
        } else {System.out.println("Opcion no valida"); return;}
        if (pilSelect2 >= 0 && pilSelect2 < pilotos.size()) {
            pilotos.get(pilSelect2).printInfPilotos(pilotos.get(pilSelect2));
        } else {System.out.println("Opcion no valida"); return;}

        while (true) {
            System.out.println("======================================");
            System.out.println("\n========== MENÚ DE SELECCION PILOTOS =====");
            System.out.println("======================================");
            System.out.println("| [1] Volver al Menu Anterior         |");
            System.out.println("| [2] Volver al Menu Principal        |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
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
            System.out.println(Banner.getBanner8());
            System.out.println("======================================");
            System.out.println("| [1] Seleccionar un Circuito        |");
            System.out.println("| [2] Volver al Menu Principal       |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
            System.out.print("Seleccione una opción: ");

            int opcionCirc = sc.nextInt();
            switch (opcionCirc) {
                case 1:
                    menuSelecCirc();
                    break;
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

    public void menuSelecCirc() {
        System.out.println("Ingrese el numero del Circuito que desea ver:");
        int circSelec = sc.nextInt() - 1;
        if (circSelec >= 0 && circSelec < circuitos.size()) {
            circuitos.get(circSelec).printResultCircuito(circuitos.get(circSelec));
            System.out.println();
        } else {System.out.println("Opcion no valida"); return;}

        while (true) {

            System.out.println("======================================");
            System.out.println("\n===== MENÚ DE SELECCION CIRCUITOS =====");
            System.out.println("======================================");
            System.out.println("| [1] Volver al Menu Anterior         |");
            System.out.println("| [2] Volver al Menu Principal        |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
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
}
