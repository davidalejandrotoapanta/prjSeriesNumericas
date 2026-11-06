package pkgSerie.pkgSeriesCaracteres;

public class SeriesCaracteres {
    private int numeroTerminos = -1;

    /**
     * Constructor de la clase SeriesCaracteres.
     * @param numeroTerminos
     */
    public SeriesCaracteres(int numeroTerminos) {
        if (numeroTerminos <= 0) {
            System.out.println(" Warning: Términos inválidos. Se asigna 1 por defecto.");
            this.numeroTerminos = 1;
        } else {
            this.numeroTerminos = numeroTerminos;
        }
    }

    /**
     * Método para generar una serie de signos alternados + y -.
     */
    public void gr4Serie01Signosalternados() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    /**
     * Método para generar un grupo de signos + crecientes.
     */
    public void gr4Serie02Gruposdesignos() {
        for (int i = 1; i <= this.numeroTerminos; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    /**
     * Método para generar Grupo de signos + crecientes.
     */
    public void gr4Serie03Gruposdesignos() {
        int a = 2;
        int b = 3;

        for (int i = 0; i < this.numeroTerminos; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.print(", ");

            if (i == this.numeroTerminos - 1) {
                break;
            }

            if (a > Integer.MAX_VALUE - b) {
                System.out.println("\nAviso: se detuvo la serie para evitar el desbordamiento de enteros.");
                return;
            }

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    /**
     * Método para generar operadores cíclicos.
     */
    public void gr4Serie04Operadoresciclicos() {
        char[] operadores = {'+', '-', '*', '/'};

        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(operadores[i % 4] + ", ");
        }
        System.out.println();
    }

    /**
     * Método para generar indicador direccional cíclico.
     */
    public void gr4Serie05Indicadordireccionalciclico() {
        String[] direcciones = {"\\", "|", "/", "-", "|"};

        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(direcciones[i % 5] + ", ");
        }
        System.out.println();
    }

    /**
     * Método para generar letras consecutivas.
     */
    public void gr4Serie06Letrasconsecutivas() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print((char) ('a' + i) + ", ");
        }
        System.out.println();
    }

    /**
     * Método para generar letras y signos alternados.
     */
    public void gr4Serie07Letraysignoalternados() {
        char signo = '+';

        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print((char) ('a' + i) + ", ");
            System.out.print(signo + ", ");

            if (signo == '+') {
                signo = '-';
            } else {
                signo = '+';
            }
        }
        System.out.println();
    }

    /**
     * Método para generar letras repetidas.
     */
    public void gr4Serie08Letrasrepetidas() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            char letra = (char) ('a' + i);

            long repeticiones = 2L * (i + 1L);
            for (long j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    /**
     * Método para generar letras repetidas.
     */
    public void gr4Serie09Letrasrepetidas() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            char letra = (char) ('a' + i);

            long repeticiones = 2L * i + 1;
            for (long j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }
            System.out.print(", ");
        }
        System.out.println();
    }
    /**
     * Método para generar una serie de letras con repetición.
     */
    public void g4LetrasconRepeticion() {
        for (int i = 0; i < this.numeroTerminos; i++){
            char caracter = (char) ('a' + (i % 26));
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de grupos de hashtags.
     */
    public void g4GruposdeHashtags() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("##");
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de vocales con repetición.
     */
    public void g4VocalesRepetidas() {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < this.numeroTerminos; i++) {
            char caracter = vocales[i % 5];
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de letras repetidas en orden creciente.
     */
    public void g4LetrarepetidaCreciente() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            char caracter = (char) ('A' + (i % 26));
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de letras del alfabeto.
     */
    public void g4Alfabeto() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            char caracter = (char) ('A' + (i % 26));
            System.out.print(caracter + " ");
        }
    }
    /**
     * Método para generar una serie de bloques.
     */
    public void g4Bloques() {
        for (int i = 0; i < this.numeroTerminos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de alternancia entre letras minúsculas y mayúsculas.
     */
    public void g4Alternancia() {
        for (int i = 0; i < this.numeroTerminos; i++){
            char minusculas = (char) ('a' + (i % 26));
            char mayusculas = (char) ('A' + (i % 26));
            if (i % 2 == 0) {
                System.out.print(minusculas);
            } else {
                System.out.print(mayusculas);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de símbolos.
     */
    public void g4Simbolos() {
        char[] simbolos = {'+', '-', '*', '/', '%'};
        for (int i = 0; i < this.numeroTerminos; i++) {
            char caracter = simbolos [i % 5];
            System.out.print(caracter);
            System.out.print(" ");
        }
    }
}