package pkgSerie.pkgSeriesCaracteres;

public class SeriesCaracteres {
    /**
     * Método para generar una serie de signos alternados + y -.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie01Signosalternados(int numeroTerminos) {
        for (int i = 0; i < numeroTerminos; i++) {
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
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie02Gruposdesignos(int numeroTerminos) {
        for (int i = 1; i <= numeroTerminos; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    /**
     * Método para generar Grupo de signos + crecientes.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie03Gruposdesignos(int numeroTerminos) {
        int a = 2;
        int b = 3;

        for (int i = 0; i < numeroTerminos; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.print(", ");

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    /**
     * Método para generar operadores cíclicos.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie04Operadoresciclicos(int numeroTerminos) {
        char[] operadores = {'+', '-', '*', '/'};

        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(operadores[i % 4] + ", ");
        }
        System.out.println();
    }

    /**
     * Método para generar indicador direccional cíclico.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie05Indicadordireccionalciclico(int numeroTerminos) {
        String[] direcciones = {"\\", "|", "/", "-", "|"};

        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(direcciones[i % 5] + ", ");
        }
        System.out.println();
    }

    /**
     * Método para generar letras consecutivas.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie06Letrasconsecutivas(int numeroTerminos) {
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print((char) ('a' + i) + ", ");
        }
        System.out.println();
    }

    /**
     * Método para generar letras y signos alternados.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie07Letraysignoalternados(int numeroTerminos) {
        char signo = '+';

        for (int i = 0; i < numeroTerminos; i++) {
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
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie08Letrasrepetidas(int numeroTerminos) {
        for (int i = 0; i < numeroTerminos; i++) {
            char letra = (char) ('a' + i);

            for (int j = 0; j < 2 * (i + 1); j++) {
                System.out.print(letra);
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    /**
     * Método para generar letras repetidas.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void gr4Serie09Letrasrepetidas(int numeroTerminos) {
        for (int i = 0; i < numeroTerminos; i++) {
            char letra = (char) ('a' + i);

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(letra);
            }
            System.out.print(", ");
        }
        System.out.println();
    }
    /**
     * Método para generar una serie de letras con repetición.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4LetrasconRepeticion(int numeroTerminos) {
        System.out.println("Letras con repeticion");
        for (int i = 0; i < numeroTerminos; i++){
            char caracter = (char) ('a' + (i % 26));
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de grupos de hashtags.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4GruposdeHashtags(int numeroTerminos) {
        System.out.println("Grupos de #");
        for (int i = 0; i < numeroTerminos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("##");
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de vocales con repetición.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4VocalesRepetidas(int numeroTerminos) {
        System.out.println("Vocales con repeticion");
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < numeroTerminos; i++) {
            char caracter = vocales[i % 5];
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de letras repetidas en orden creciente.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4LetrarepetidaCreciente(int numeroTerminos) {
        System.out.println("Letra repetida creciente");
        for (int i = 0; i < numeroTerminos; i++) {
            char caracter = (char) ('A' + (i % 26));
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de letras del alfabeto.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4Alfabeto(int numeroTerminos) {
        System.out.println("Alfabeto");
        for (int i = 0; i < numeroTerminos; i++) {
            char caracter = (char) ('A' + (i % 26));
            System.out.print(caracter + " ");
        }
    }
    /**
     * Método para generar una serie de bloques.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4Bloques(int numeroTerminos) {
        System.out.println("Bloques");
        for (int i = 0; i < numeroTerminos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    /**
     * Método para generar una serie de alternancia entre letras minúsculas y mayúsculas.
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4Alternancia(int numeroTerminos) {
        System.out.println("Alternancia");
        for (int i = 0; i < numeroTerminos; i++){
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
     * @param numeroTerminos Número de términos a generar en la serie.
     */
    public void g4Simbolos(int numeroTerminos) {
        System.out.println("Simbolos");
        char[] simbolos = {'+', '-', '*', '/', '%'};
        for (int i = 0; i < numeroTerminos; i++) {
            char caracter = simbolos [i % 5];
            System.out.print(caracter);
            System.out.print(" ");
        }
    }
}
