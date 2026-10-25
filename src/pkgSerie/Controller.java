package pkgSerie;

import java.util.Scanner;
import pkgSerie.pkgSeriesCaracteres.SeriesCaracteres;
import pkgSerie.pkgSeriesNumericas.SeriesNumericas;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private int numeroTerminos = 0;
    private int opcionPrincipal = 0;

    public void iniciar() {
        System.out.println("Grupo-4");
        System.out.println("Integrantes:Toapanta.David, Urbina.Daniel, Vargas.Benjamin, Velez.Jhostyn");
        System.out.print("Ingrese el número de términos que desea generar: ");
        numeroTerminos = scanner.nextInt();

        mostrarMenuInicial();
    }

    private void mostrarMenuInicial() {
        do {
            System.out.println("\n Menu Principal");
            System.out.println("1. Series Numericas");
            System.out.println("2. Series de Caracteres");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    mostrarMenuNumericas();
                    break;
                case 2:
                    mostrarMenuCaracteres();
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionPrincipal != 3);
    }

    private void mostrarMenuCaracteres() {
        SeriesCaracteres seriesCaracteres = new SeriesCaracteres();
        int opcionCaracteres = -1;

        
        do {

            System.out.println("\n Menu de Series de Caracteres");
            System.out.println("0. Salir");
            System.out.print("Opcion:");

            opcionCaracteres = scanner.nextInt();

            switch (opcionCaracteres) {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1: 
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4: 
                    break;
                case 5: 
                    break;
                case 6: 
                    break;
                case 7: 
                    break;
                case 8: 
                    break;
                case 9: 
                    break;
                case 10:
                    seriesCaracteres.g4LetrasconRepeticion(numeroTerminos);
                    break; 
                case 11: 
                    seriesCaracteres.g4GruposdeHashtags(numeroTerminos);
                    break;
                case 12: 
                    seriesCaracteres.g4VocalesRepetidas(numeroTerminos);
                    break;
                case 13: 
                    seriesCaracteres.g4LetrarepetidaCreciente(numeroTerminos);
                    break;
                case 14: 
                    seriesCaracteres.g4Alfabeto(numeroTerminos);
                    break;
                case 15:
                    seriesCaracteres.g4Bloques(numeroTerminos);
                    break;
                case 16: 
                    seriesCaracteres.g4Alternancia(numeroTerminos);
                    break;
                case 17: 
                    seriesCaracteres.g4Simbolos(numeroTerminos);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionCaracteres != 0);

    }

    private void mostrarMenuNumericas() {
        SeriesNumericas seriesNumericas = new SeriesNumericas();
        int opcionNumericas = -1;

        do {

            System.out.println("\n Menu de Series Numericas");
            System.out.println("0. Salir");
            System.out.print("Opcion:");

            opcionNumericas = scanner.nextInt();

            switch (opcionNumericas) {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1: 
                System.out.print("SN01: ");
                seriesNumericas.g4Serie01FIbonacci(numeroTerminos);
                    break;
                case 2:
                    System.out.print("SN02: ");
                    seriesNumericas.g4Serie02ImparesCero(numeroTerminos);
                    break;
                case 3: 
                System.out.print("SN03: ");
                seriesNumericas.g4Serie03FibonacciSobreIpares(numeroTerminos);
                    break;
                case 4: 
                System.out.print("SN04: ");
                seriesNumericas.g4Serie04FibonacciSobrePares(numeroTerminos);
                    break;
                case 5: 
                    System.out.print("SN05: ");
                    seriesNumericas.g4Serie05NumerosPrimos(numeroTerminos);
                    break;
                case 6: 
                    System.out.print("SN06: ");
                    seriesNumericas.g4Serie06CuadradosPerfectos(numeroTerminos);
                    break;
                case 7: 
                    System.out.print("SN07: ");
                    seriesNumericas.g4Serie07ProgresionArimetica(numeroTerminos);
                    break;
                case 8: 
                    System.out.print("SN08: ");
                    seriesNumericas.g4Serie08ProgresionArimetica(numeroTerminos);
                    break;
                case 9: 
                System.out.print("SN09: ");
                seriesNumericas.g4Serie09Potencia(numeroTerminos);
                    break;
                case 10:
                    break;
                case 11: 
                    break;
                case 12: 
                    break;
                case 13: 
                    break;
                case 14: 
                    break;
                case 15: 
                    break;
                case 16: 
                    break;
                case 17: 
                    break;
                case 18: 
                    break;
                case 19: 
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionNumericas != 0);

    }
}   
