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
            System.out.println("10. Serie de potencias de 3");
            System.out.println("11. Serie de numeros oblongos");
            System.out.println("12. Serie de numeros triangulares");
            System.out.print("Opcion:");

            opcionNumericas = scanner.nextInt();

            switch (opcionNumericas) {
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
                    seriesNumericas.imprimirPotencias3(numeroTerminos);
                    break;
                case 11: 
                    seriesNumericas.imprimirNumerosOblongos(numeroTerminos);
                    break;
                case 12: 
                    seriesNumericas.imprimirSerieTriangular(numeroTerminos);
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
