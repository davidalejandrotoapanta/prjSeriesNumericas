package pkgSerie.pkgSeriesNumericas;

public class SeriesNumericas {

    /**
     * Imprime la serie de potencias de 3 hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirPotencias3(int numeroTerminos) {
        System.out.println("Serie de potencias de 3:");

        for (int contador=1; contador <= numeroTerminos; contador++){
            int potencia = (int) Math.pow(3, contador);
            System.out.print(potencia + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números oblongos hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirNumerosOblongos(int numeroTerminos) {
        System.out.println("Serie de numeros oblongos:");

        for (int contador=1; contador <= numeroTerminos; contador++){
            int oblongos = contador * (contador + 1);
            System.out.print(oblongos + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números triangulares hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirSerieTriangular(int numeroTerminos){
        System.out.println("Serie de numeros triangulares:");

        for (int contador=1; contador <= numeroTerminos; contador++){
            int triangular = contador * (contador + 1) / 2;
            System.out.print(triangular + " ");
        }
        System.out.println();
    }

}
