package pkgSerie;

import java.util.Scanner;
import pkgSerie.pkgArrays.Arrays;
import pkgSerie.pkgAutomatas.Automatas;
import pkgSerie.pkgCadenaCaracteres.CadenaCaracteres;
import pkgSerie.pkgFiguras.Figuras;
import pkgSerie.pkgLoading.Loading;
import pkgSerie.pkgRecursion.Recursion;
import pkgSerie.pkgSeriesCaracteres.SeriesCaracteres;
import pkgSerie.pkgSeriesNumericas.SeriesNumericas;

public class Controller {
    private Scanner scanner;
    private int opcionPrincipal;

    /**
     * Constructor de la clase Controller.
     */
    public Controller() {
        this.scanner = new Scanner(System.in);
        this.opcionPrincipal = 0;
    }

    /**
     * Valida que el usuario ingrese un número entero válido.
     * @return El número entero ingresado por el usuario.
     */
    private int validarEntero(){
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido.");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    /**
     * Valida que el usuario ingrese un número entero positivo.
     * @return El número entero positivo ingresado por el usuario.
     */
    private int validarEnteroPositivo() {
        int numero = validarEntero();
        while (numero <= 0) {
            System.out.println("Ingrese un numero positivo");
            numero = validarEntero();
        }
        return numero;
    }

    /**
     * Valida que el usuario ingrese un texto no vacío.
     * @return El texto ingresado por el usuario.
     */
    private String validarTexto() {
        String texto = scanner.nextLine();
        while (texto == null || texto.trim().isEmpty()) {
            System.out.println("El texto no puede estar vacio");
            texto = scanner.nextLine();
        }
        return texto;
    }

    /**
     * Valida que el usuario ingrese una vocal válida.
     * @return La vocal ingresada por el usuario.
     */
    private char validarVocal() {
        char vocal = Character.toLowerCase(scanner.next().charAt(0));
        while (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u') {
            System.out.println("Ingrese una vocal valida");
            vocal = Character.toLowerCase(scanner.next().charAt(0));
        }
        scanner.nextLine();
        return vocal;
    }

    /**
     * Valida que el usuario ingrese una letra válida.
     * @return La letra ingresada por el usuario.
     */
    private char validarLetra() {
        char letra = Character.toLowerCase(scanner.next().charAt(0));
        while (letra == '\n' || letra == ' ') {
            System.out.println("Ingrese una letra valida");
            letra = Character.toLowerCase(scanner.next().charAt(0));
        }
        scanner.nextLine();
        return letra;
    }

    /**
     * Inicia el programa y muestra el menú principal.
     */
    public void iniciar() {
        System.out.println("Grupo-4");
        System.out.println("Integrantes:Toapanta.David, Urbina.Daniel, Vargas.Benjamin, Velez.Jhostyn");

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
            System.out.println("3. Figuras");
            System.out.println("4. Cadenas de Caracteres");
            System.out.println("5. Arrays");
            System.out.println("6. Loading");
            System.out.println("7. Recursion");
            System.out.println("8. Autómatas");

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
                case 3:
                    mostrarFiguras();
                    break;
                case 4:
                    mostrarCadenasCaracteres();
                    break;
                case 5:
                    mostrarArrays();
                    break;
                case 6:
                    mostrarLoading();
                    break;
                case 7:
                    mostrarRecursion();
                    break;
                case 8:
                    mostrarAutomatas();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionPrincipal != 0);
    }

    /**
     * Muestra el menú de autómatas.
     */
    private void mostrarAutomatas() {
        Automatas automatas = new Automatas();
        int opcion;
        do {
            System.out.println("\n Menu Automatas");
            System.out.println("0. Volver");
            System.out.println("1. a*b+c");
            System.out.println("2. ab+ca");
            System.out.println("3. a+b+c+ o 1+0+1*");
            System.out.println("4. Decimal");
            System.out.println("5. Variable Java");
            System.out.println("6. Tokens");
            System.out.println("7. Clave");
            System.out.print("Seleccione una opcion: ");
            opcion = validarEntero();
            if (opcion >= 1 && opcion <= 7) {
                System.out.print("Ingrese la cadena a evaluar: ");
                String cadena = scanner.nextLine();
                boolean valida = false;
                switch (opcion) {
                    case 1:
                        valida = automatas.g4ValidarA01_aStarbPlusc(cadena);
                        break;
                    case 2:
                        valida = automatas.g4ValidarA02_abPlusca(cadena);
                        break;
                    case 3:
                        valida = automatas.g4ValidarA03_Variante(cadena);
                        break;
                    case 4:
                        valida = automatas.g4ValidarA04Decimal(cadena);
                        break;
                    case 5:
                        valida = automatas.g4ValidarA05VariableJava(cadena);
                        break;
                    case 6:
                        valida = automatas.g4ValidarA06TokensLenguaje(cadena);
                        break;
                    case 7:
                        valida = automatas.g4ValidarA07Clave(cadena);
                        break;
                }
                if (valida) {
                    System.out.println("Cadena valida");
                } else {
                    System.out.println("Cadena invalida");
                }
            } else if (opcion != 0) {
                System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }
    /**
     * Muestra el menú de recursión.
     */
    private void mostrarRecursion() {
        System.out.println("Ingrese el valor limite para recursion: ");
        String limite = validarTexto();
        Recursion recursion = new Recursion(limite);
        System.out.println("1. Recursion Factorial");
        recursion.g4Recursion01Factorial();
        System.out.println("2. Recursion Suma");
        recursion.g4Recursion02Suma();
        System.out.println("3. Recursion Multiplicacion");
        recursion.g4Recursion03mult();
        System.out.println("4. Recursion Potencia");
        recursion.g4Recursion04Potencia();
        System.out.println("5. Recursion Conteo");
        recursion.g4Recursion05Conteo();
        System.out.println("6. Recursion Conteo Regresivo");
        recursion.grRecursion06ContoReg();
    }

    /**
     * Muestra el menú de carga.
     */
    private void mostrarLoading() {
        System.out.println("Ingrese la longitud de la barra de carga: ");
        int longitudBarra = validarEnteroPositivo();
        Loading loading = new Loading(longitudBarra);
        loading.g4L01_indicadorCargaRotacional();
        loading.g4L02_caracterCargando('#');
        loading.g4L03_desplazarCaracter('-');
        loading.g4L04_waitingIdaYVuelta();
        loading.g4L05_barraPuntaCambiante();
        loading.g4L06_barraCambianteDeIzquierdaADerecha();
        loading.g4L07_barraRotacional();
        System.out.println("\n8. Carga mostrando el nombre letra a letra:");
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreL08 = validarTexto();
        loading.g4L08_cargaLetraaLetra(nombreL08);
        System.out.println("\n9. Carga mostrando solo una letra del nombre:");
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreL09 = validarTexto();
        loading.g4L09_cargaUnaLetra(nombreL09);
        System.out.println("\n10. Carga de archivo:");
        loading.g4L10_cargaArchivo();
        loading.g4L11_cargaSimetricas();
        loading.g4L11_cargasDeSonido();
        loading.g4L12_figuraDesplazable();

    }

    /**
     * Muestra el menú de arrays.
     */
    private void mostrarArrays() {
        System.out.print("Ingrese el tamanio de la matriz: ");
        int tamanioMatriz = validarEnteroPositivo();
        Arrays arrays = new Arrays("Benjamin", "Vargas", tamanioMatriz);
        int opcion;
        do {
            System.out.println("\n Menu Arrays");
            System.out.println("0. Volver");
            System.out.println("1. Carga de palabras");
            System.out.println("2. Iniciales B y V");
            System.out.println("3. Plano cartesiano f(x)=2x");
            System.out.println("4. Matriz en X");
            System.out.println("5. Matriz aleatoria");
            System.out.print("Seleccione una opcion: ");
            opcion = validarEntero();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    arrays.g4MostrarCargaNombre(scanner);
                    scanner.nextLine();
                    break;
                case 2:
                    arrays.g4MostrarInicialesMatriz(scanner);
                    scanner.nextLine();
                    break;
                case 3:
                    arrays.g4GraficarFuncionNombre();
                    break;
                case 4:
                    arrays.g4MostrarMatrizXNombreApellido();
                    break;
                case 5:
                    arrays.g4MostrarMatrizRandomNombreCompleto();
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 0);
    }
    /**
     * Muestra el menú de cadenas de caracteres.
     */
    private void mostrarCadenasCaracteres() {
        System.out.println("Ingrese la frase que desea analizar: ");
        String frase = validarTexto();
        int intentos=0;
        String respuesta="";
        CadenaCaracteres cadenaCaracteres = new CadenaCaracteres(frase);
        

        System.out.println("Frase ingresada: " + frase);
        System.out.println("Contar vocales");
        cadenaCaracteres.g4ContarVocales();
        System.out.println("Contar consonantes");
        cadenaCaracteres.g4ContarConsonantes();
        System.out.println("Eliminar vocal");
        System.out.println("Ingrese la vocal que desea eliminar de la frase: ");
        char vocal = validarVocal();
        cadenaCaracteres.g4EliminarVocal(vocal);
        System.out.println("Eliminar letra");
        System.out.println("Ingrese la letra que desea eliminar de la frase: ");
        char letra = validarLetra();
        cadenaCaracteres.g4EliminarLetra(letra);
        System.out.println("Invertir frase con vocales en mayusculas");
        cadenaCaracteres.g4InvertirFraseConVocalesMayusculas();
        System.out.println("Invertir frase con consonantes en mayusculas");
        cadenaCaracteres.g4InvertirFraseConConsonantesMayusculas();
        System.out.println("Cambiar frase a mayusculas sin la letra J");
        cadenaCaracteres.g4CambiarFraseMayusculaSinJ();
        System.out.println("Adivinar anagrama");
        int posicion = cadenaCaracteres.g4ObtenerPalabraAleatoria();
        do{
            System.out.println("Ingrese el anagrama de la palabra:");
            respuesta = validarTexto();
            intentos++;
        }while(!cadenaCaracteres.g4AdivinarAnagrama(posicion, respuesta) && intentos < 3);
        System.out.println("Mayusculas y minusculas alternadas");
        cadenaCaracteres.g4MayusculasAlternadas();
    }

    /**
     * Muestra el menú de figuras.
     */
    private void mostrarFiguras() {
        System.out.println("Ingrese el tamanio/niveles de la figura: ");
        String tamanio = validarTexto();
        Figuras figuras = new Figuras(tamanio);
        System.out.println("1. Triangulo de asteriscos");
        figuras.gr4Figura03Triangulo();
        System.out.println("2. Triangulo invertido de asteriscos");
        figuras.gr4Figura04Trianguloin();
        System.out.println("3. Piramide invertida de asteriscos");
        figuras.gr4Figura05Piramidein();
        System.out.println("4. Piramide de asteriscos");
        figuras.gr4Figura06Piramide();
        System.out.println("5. Escalera");    
        figuras.gr4Figura07Escalera();
        System.out.println("6. Escalera invertida");
        figuras.gr4Figura08Escalerain();
        System.out.println("7. Escaleras");
        figuras.gr4Figura09Escaleras();
        System.out.println("8. Escaleras con signos alternados");
        figuras.gr4Figura10Simboloescalonado();
        System.out.println("9. Escalera sumando _");
        figuras.gr4Figura11EscaleraSumando();
        System.out.println("10. Piramide de números invertida");
        figuras.gr4Figura12PiramideNumerosin();
        System.out.println("11. Piramide de números");
        figuras.gr4Figura13PiramideNumeros();


        System.out.println("14. Triangulo de Pascal");
        figuras.g4MostrarTrianguloPascal();
        System.out.println("15. Triangulo rectángulo de Pascal");
        figuras.g4MostrarTrianguloRectanguloPascal();
        System.out.println("16. X con + y -");
        figuras.g4MostrarFigura16();
        System.out.println("16. X con 1 y 0");
        figuras.g4MostrarFigura17();
        System.out.println("18. Triangulo rectángulo de Pascal con 2 en la diagonal");
        figuras.g4MostrarTrianguloRectanguloPascalCon2();
        System.out.println("18. Triangulo rectángulo de Pascal con caracteres");
        figuras.g4MostrarTrianguloRectanguloPascalConCaracteres();
    }

    /**
     * Muestra las series de caracteres.
     */
    private void mostrarSeriesCaracteres() {
        System.out.print("Ingrese el numero de terminos que desea generar: ");
        int numeroTerminos = validarEnteroPositivo();
        SeriesCaracteres seriesCaracteres = new SeriesCaracteres(numeroTerminos);
        
        System.out.println("1. Signos alternados");
        seriesCaracteres.gr4Serie01Signosalternados();
        System.out.println("2. Grupo de signos (+)");
        seriesCaracteres.gr4Serie02Gruposdesignos();
        System.out.println("3. Grupo de signos (+)+1");
        seriesCaracteres.gr4Serie03Gruposdesignos(); 
        System.out.println("4. Operadores ciclicos");
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
        System.out.println("10. Serie de letras con repeticion");
        seriesCaracteres.g4LetrasconRepeticion();
        System.out.println("11. Serie de grupos de hashtags");
        seriesCaracteres.g4GruposdeHashtags();
        System.out.println("12. Serie de vocales con repeticion");
        seriesCaracteres.g4VocalesRepetidas();
        System.out.println("13. Serie de letras repetidas en orden creciente");
        seriesCaracteres.g4LetrarepetidaCreciente();
        System.out.println("14. Serie de letras del alfabeto");
        seriesCaracteres.g4Alfabeto();
        System.out.println("15. Serie de bloques");
        seriesCaracteres.g4Bloques();
        System.out.println("16. Serie de alternancia");
        seriesCaracteres.g4Alternancia();
        System.out.println("17. Serie de simbolos");
        seriesCaracteres.g4Simbolos();
    }

    /**
     * Muestra las series numéricas.
     */
    private void mostrarSeriesNumericas() {
        System.out.print("Ingrese el numero de terminos que desea generar: ");
        int numeroTerminos = validarEnteroPositivo();
        SeriesNumericas seriesNumericas = new SeriesNumericas(numeroTerminos);
        
        System.out.println("1. Serie de Fibonacci");
        seriesNumericas.g4Serie01Fibonacci();
        System.out.println("2. Serie de impares con ceros");
        seriesNumericas.g4Serie02ImparesCero();
        System.out.println("3. Serie de Fibonacci sobre impares");
        seriesNumericas.g4Serie03FibonacciSobreImpares();
        System.out.println("4. Serie de Fibonacci sobre pares");
        seriesNumericas.g4Serie04FibonacciSobrePares();
        System.out.println("5. Serie de numeros primos");
        seriesNumericas.g4Serie05NumerosPrimos();
        System.out.println("6. Serie de cuadrados perfectos");
        seriesNumericas.g4Serie06CuadradosPerfectos();
        System.out.println("7. Serie de progresion aritmetica");
        seriesNumericas.g4Serie07ProgresionAritmetica();
        System.out.println("8. Serie de progresion aritmética 2");
        seriesNumericas.g4Serie08ProgresionAritmetica();
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
