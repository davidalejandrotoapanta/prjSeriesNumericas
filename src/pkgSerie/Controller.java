package pkgSerie;

import java.util.Scanner;
import pkgSerie.pkgSeriesCaracteres.SeriesCaracteres;
import pkgSerie.pkgSeriesNumericas.SeriesNumericas;

public class Controller {
    private Scanner scanner;
    private int numeroTerminos;
    private int opcionPrincipal;

    /**
     * Constructor de la clase Controller.
     */
    public Controller() {
        this.scanner = new Scanner(System.in);
        this.numeroTerminos = -1;
        this.opcionPrincipal = 0;
    }

    /**
     * Valida que el usuario ingrese un número entero válido.
     * @return El número entero ingresado por el usuario.
     */
    private int validarEntero(){
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número entero válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Inicia el programa y muestra el menú principal.
     */
    public void iniciar() {
        System.out.println("Grupo-4");
        System.out.println("Integrantes:Toapanta.David, Urbina.Daniel, Vargas.Benjamin, Velez.Jhostyn");
        System.out.print("Ingrese el número de términos que desea generar: ");
        numeroTerminos = validarEntero();

        mostrarMenuInicial();
    }

    /**
     * Muestra el menú inicial del programa.
     */
    private void mostrarMenuInicial() {
        do {
            System.out.println("\n Menu Principal");
            System.out.println("0. Salir");
            System.out.println("1. Series Numericas");
            System.out.println("2. Series de Caracteres");

            System.out.print("Seleccione una opcion: ");
            opcionPrincipal = validarEntero();

            switch (opcionPrincipal) {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1:
                    mostrarSeriesNumericas();
                    break;
                case 2:
                    mostrarSeriesCaracteres();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionPrincipal != 0);
    }

    /**
     * Muestra las series de caracteres.
     */
    private void mostrarSeriesCaracteres() {
        SeriesCaracteres seriesCaracteres = new SeriesCaracteres(numeroTerminos);
        
        System.out.println("1. Signos alternados");
        seriesCaracteres.gr4Serie01Signosalternados();
        System.out.println("2. Greupo de signos (+)");
        seriesCaracteres.gr4Serie02Gruposdesignos();
        System.out.println("3. SGrupo de signos (+)+1");
        seriesCaracteres.gr4Serie03Gruposdesignos(); 
        System.out.println("4. Operadpres cíclicos");
        seriesCaracteres.gr4Serie04Operadoresciclicos();
        System.out.println("5. Indicador direccional ciclico");
        seriesCaracteres.gr4Serie05Indicadordireccionalciclico();
        System.out.println("6. Letras consecutivas");
        seriesCaracteres.gr4Serie06Letrasconsecutivas();
        System.out.println("7. Letra y signo alternados");
        seriesCaracteres.gr4Serie07Letraysignoalternados();
        System.out.println("8. Letras repetidas");
        seriesCaracteres.gr4Serie08Letrasrepetidas();
        System.out.println("9. Letras repetidas +1");
        seriesCaracteres.gr4Serie09Letrasrepetidas();
        System.out.println("10. Serie de letras con repetición");
        seriesCaracteres.g4LetrasconRepeticion();
        System.out.println("11. Serie de grupos de hashtags");
        seriesCaracteres.g4GruposdeHashtags();
        System.out.println("12. Serie de vocales con repetición");
        seriesCaracteres.g4VocalesRepetidas();
        System.out.println("13. Serie de letras repetidas en orden creciente");
        seriesCaracteres.g4LetrarepetidaCreciente();
        System.out.println("14. Serie de letras del alfabeto");
        seriesCaracteres.g4Alfabeto();
        System.out.println("15. Serie de bloques");
        seriesCaracteres.g4Bloques();
        System.out.println("16. Serie de alternancia");
        seriesCaracteres.g4Alternancia();
        System.out.println("17. Serie de símbolos");
        seriesCaracteres.g4Simbolos();
    }

    /**
     * Muestra las series numéricas.
     */
    private void mostrarSeriesNumericas() {
        SeriesNumericas seriesNumericas = new SeriesNumericas(numeroTerminos);
        
        System.out.println("1. Serie de Fibonacci");
        seriesNumericas.g4Serie01FIbonacci();
        System.out.println("2. Serie de impares con ceros");
        seriesNumericas.g4Serie02ImparesCero();
        System.out.println("3. Serie de Fibonacci sobre impares");
        seriesNumericas.g4Serie03FibonacciSobreIpares();
        System.out.println("4. Serie de Fibonacci sobre pares");
        seriesNumericas.g4Serie04FibonacciSobrePares();
        System.out.println("5. Serie de numeros primos");
        seriesNumericas.g4Serie05NumerosPrimos();
        System.out.println("6. Serie de cuadrados perfectos");
        seriesNumericas.g4Serie06CuadradosPerfectos();
        System.out.println("7. Serie de progresion aritmetica");
        seriesNumericas.g4Serie07ProgresionArimetica();
        System.out.println("8. Serie de progresion aritmética 2");
        seriesNumericas.g4Serie08ProgresionArimetica();
        System.out.println("9. Serie de potencias de 2");
        seriesNumericas.g4Serie09Potencia();
        System.out.println("10. Serie de potencias de 3");
        seriesNumericas.g4imprimirPotencias3();
        System.out.println("11. Serie de numeros oblongos");
        seriesNumericas.g4imprimirNumerosOblongos();
        System.out.println("12. Serie de numeros triangulares");
        seriesNumericas.g4imprimirSerieTriangular();
        System.out.println("13. Serie de numeros factoriales");
        seriesNumericas.g4imprimirSerieFactorial();
        System.out.println("14. Serie de signos alternos");
        seriesNumericas.g4imprimirSignosAlternos();
        System.out.println("15. Serie de cuadrados desplazados");
        seriesNumericas.g4imprimirCuadradosDesplazados();
        System.out.println("16. Serie de repunidades");
        seriesNumericas.g4imprimirRepunidades();
        System.out.println("17. Serie de numeros Lucas");
        seriesNumericas.g4imprimirNumerosLucas();
        System.out.println("18. Serie de numeros crecientes");
        seriesNumericas.g4imprimirSerieCrecientes();
        System.out.println("19. Serie de alternancias");
        seriesNumericas.g4imprimirAlternancias();
    }
}   
