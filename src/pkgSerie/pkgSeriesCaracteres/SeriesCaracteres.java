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
}
