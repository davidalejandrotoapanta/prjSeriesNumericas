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

    /**
     * Imprime la serie de números factoriales hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirSerieFactorial(int numeroTerminos){
        int factorial=1;
        System.out.println("Serie de numeros factoriales:");

        for(int contador=1; contador <= numeroTerminos; contador++){
            factorial=factorial*contador;
            System.out.print(factorial + " ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de numeros que si son pares sean negativos y si son impares sean positivos.
     * @param numeroTerminos
     */
    public void imprimirSignosAlternos(int numeroTerminos){
        System.out.println("Serie de signos alternos:");

        for(int contador=1; contador <= numeroTerminos; contador++){
            if(contador % 2 == 0){
                System.out.print(contador + " ");
            } else {
                System.out.print(-contador + " ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime la serie de cuadrados desplazados hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirCuadradosDesplazados(int numeroTerminos){
        System.out.println("Serie de cuadrados desplazados:");

        for(int contador=1; contador <= numeroTerminos; contador++){
            int cuadradoDesplazado = 2*(int)(Math.pow(contador-1, 2));
            System.out.print(cuadradoDesplazado + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de repunidades hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirRepunidades(int numeroTerminos){
        System.out.println("Serie de repunidades:");

        for(int contador=1; contador <= numeroTerminos; contador++){
            int repunidad = (int)(Math.pow(10, contador) - 1) / 9;
            System.out.print(repunidad + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números Lucas hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirNumerosLucas(int numeroTerminos){
        System.out.println("Serie de numeros Lucas:");

        int a=2, b=1, c=0;
        System.out.print(a + " " + b + " ");
        for(int contador=1; contador <= numeroTerminos; contador++){    
            c=a+b;
            System.out.print(c + " "); 
            a=b;
            b=c;
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números crecientes en la que su variación cambia linealmente de 1 en 1 hasta el número de términos especificado.
     * @param numeroTerminos
     */
    public void imprimirSerieCrecientes(int numeroTerminos){
        System.out.println("Serie de numeros crecientes:");

        for(int contador=1; contador <= numeroTerminos; contador++){
            int crecientes= ((int)Math.pow(contador, 2) - contador + 2)/2;
            System.out.print(crecientes + " ");
        }
        System.out.println();
    }

    public void imprimirAlternancias(int numeroTerminos){
        int alternancia=0;
        System.out.println("Serie de alternancias:");

        for(int contador=1; contador <= numeroTerminos; contador++){
            
            if(contador % 2 == 0){
                alternancia=(int)(Math.pow(contador, 3));
            } else {
                alternancia=(int)(Math.pow(contador, 2));
            }
            System.out.print(alternancia + " ");
        }
        System.out.println();
    }


}

