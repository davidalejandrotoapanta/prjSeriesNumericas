package pkgSerie.pkgArrays;

import java.util.Scanner;

public class Arrays {
    private String nombre;
    private String apellido;
    private int tamanioMatriz;

    /**
     * Constructor de la clase Arrays con validación para los parámetros ingresados.
     * @param nombre
     * @param apellido
     * @param tamanioMatriz
     */
    public Arrays(String nombre, String apellido, int tamanioMatriz) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "nombre";
        } else {
            this.nombre = nombre;
        }

        if (apellido == null || apellido.trim().isEmpty()) {
            this.apellido = "apellido";
        } else {
            this.apellido = apellido;
        }

        if (tamanioMatriz <= 0) {
            System.out.println("Tamanio de matriz invalido. Se asigna 5 por defecto.");
            this.tamanioMatriz = 5;
        } else {
            this.tamanioMatriz = tamanioMatriz;
        }
    }
    /**
     * Muestra la carga de nombres con barras de progreso y porcentajes ingresados por el usuario.
     */
    public void g4MostrarCargaNombre(Scanner scanner) {
        String[] nombres = {"Benjamin", "David", "Vargas", "Armas"};
        String[] barras = {
            "[=>   ]",
            "[==>  ]",
            "[===> ]",
            "[====>]"
        };
        int[] porcentajes = new int[4];
        System.out.println("Benjamin David Vargas Armas");
        System.out.println("Ingrese los porcentajes de cada palabra:");
        for (int i = 0; i < 4; i++) {
            porcentajes[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            int porcentajeActual = porcentajes[i];
            String barraElegida = "";

            if (porcentajeActual == 100) {
                barraElegida = barras[3];
            } else if (porcentajeActual == 75) {
                barraElegida = barras[2];
            } else if (porcentajeActual == 50) {
                barraElegida = barras[1];
            } else {
                barraElegida = barras[0];
            }

            System.out.print(barraElegida + " " + porcentajeActual + "% ");

            int totalLetras = nombres[i].length();
            int letrasAMostrar = (int) ((totalLetras * porcentajeActual) / 100.0);

            for (int j = 0; j < letrasAMostrar; j++) {
                System.out.print(nombres[i].charAt(j));
            }

            System.out.println();
        }
    }
    /**
     * Muestra las iniciales de un nombre y apellido en una matriz de tamaño especificado por el usuario, utilizando un carácter ingresado por el usuario para representar las iniciales.
     */
    public void g4MostrarInicialesMatriz(Scanner scanner) {
        System.out.print("Ingrese caracter: ");
        char simbolo = scanner.next().charAt(0);

        int n = this.tamanioMatriz;
        int medio = n / 2;
        int fin = n - 1;

        System.out.println();

        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                boolean columnaIzquierda = (c == 0);
                boolean lineasHorizontales = (f == 0 || f == medio || f == fin) && (c < fin);
                boolean bordeDerecho = (c == fin) && (f != 0 && f != medio && f != fin);

                if (columnaIzquierda || lineasHorizontales || bordeDerecho) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int c = 0; c < n; c++) {
                boolean brazoIzq = (c == f / 2);
                boolean brazoDer = (c == fin - (f / 2));

                if (brazoIzq || brazoDer) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
    /**
     * Grafica la función del nombre "BENJAMIN" en un formato de gráfico de barras, mostrando cada letra del nombre en una línea correspondiente a su posición en el nombre, con espacios y una línea base al final.
     */
    public void g4GraficarFuncionNombre() {
        String nombre = "BENJAMIN";
        int totalLetras = nombre.length();

        for (int y = totalLetras; y >= 1; y--) {
            System.out.print(y + " |");

            int espacios = 2 * y;
            for (int c = 0; c < espacios; c++) {
                System.out.print(" ");
            }

            System.out.println(nombre.charAt(y - 1));
        }

        System.out.print("0 |");
        for (int c = 0; c <= (2 * totalLetras) + 2; c++) {
            System.out.print("_");
        }
        System.out.println();
    }
    /**
     * Muestra una matriz de tamaño 8x8 con las letras del nombre completo "Benjamin David Vargas Armas" colocadas en posiciones aleatorias. Si una posición ya está ocupada, se coloca un asterisco '*' en su lugar. La matriz se muestra en la consola después de cada inserción de letra, con un pequeño retraso entre cada actualización para crear un efecto visual.
     */
    public void g4MostrarMatrizRandomNombreCompleto() {
        String nombreCompleto = "Benjamin David Vargas Armas";
        int n = 8;
        char[][] matriz = new char[n][n];
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                matriz[f][c] = ' ';
            }
        }
        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            if (letra != ' ') {
                int fila = (int) (Math.random() * n);
                int columna = (int) (Math.random() * n);
                if (matriz[fila][columna] == ' ') {
                    matriz[fila][columna] = letra;
                } else {
                    matriz[fila][columna] = '*';
                }
                System.out.println();
                for (int f = 0; f < n; f++) {
                    for (int c = 0; c < n; c++) {
                        System.out.print(matriz[f][c] + " ");
                    }
                    System.out.println();
                }
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    /**
     * Muestra una matriz de tamaño 8x8 con las letras del nombre "BENJAMIN" y el apellido "VARGAS" colocadas en posiciones específicas. Las letras del nombre se colocan en la diagonal principal de la matriz, mientras que las letras del apellido se colocan en la diagonal secundaria. La matriz se muestra en la consola después de colocar todas las letras.
     */
    public void g4MostrarMatrizXNombreApellido() {
        String nombre = "BENJAMIN";
        String apellido = "VARGAS";
        int n = 8;
        char[][] matriz = new char[n][n];
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                matriz[f][c] = ' ';
            }
        }
        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }
        for (int i = 0; i < apellido.length(); i++) {
            matriz[i + 1][n - 2 - i] = apellido.charAt(i);
        }
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
