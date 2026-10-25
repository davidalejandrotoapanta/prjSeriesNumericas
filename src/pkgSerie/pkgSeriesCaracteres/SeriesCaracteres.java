package pkgSerie.pkgSeriesCaracteres;

public class SeriesCaracteres {
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
