package pkgSerie.pkgSeriesNumericas;


public class SeriesNumericas {
    private int numeroTerminos=-1;

    /**
     * Constructor de la clase SeriesNumericas.
     * @param numeroTerminos
     */
    public SeriesNumericas(int numeroTerminos) {
        if (numeroTerminos <= 0) {
            System.out.println(" Warning: Términos inválidos. Se asigna 1 por defecto.");
            this.numeroTerminos = 1;
        } else {
            this.numeroTerminos = numeroTerminos;
        }
    }


    /**
     * Método para generar la serie de Fibonacci hasta n términos.
     */
    public void g4Serie01Fibonacci(){
        int a = 0, b = 1;
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        
    }
    /**
     * Método para generar una serie de números impares y ceros hasta n términos.
     */

    public void g4Serie02ImparesCero(){
        for (int i = 0; i < this.numeroTerminos; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    /**
     * Método para generar una serie que combina la serie de Fibonacci y los números impares hasta n términos.
     */

    public void g4Serie03FibonacciSobreImpares(){
        int a = 0, b = 1, impar = 1;
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(a + "/" + impar + (i < this.numeroTerminos - 1 ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
            impar += 2;
        }
    }
    /**
     * Método para generar una serie que combina la serie de Fibonacci y los números pares hasta n términos.
     */

    public void g4Serie04FibonacciSobrePares(){
        int a = 0, b = 1, par = 2;
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(a + "/" + par + (i < this.numeroTerminos - 1 ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
            par += 2;
        }
    }
    /**
     * Método para generar una serie de números primos hasta n términos.
     */

    public void g4Serie05NumerosPrimos(){
        int count = 0, num = 2;
        while (count < this.numeroTerminos) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + (count < this.numeroTerminos - 1 ? ", " : "\n"));
                count++;
            }
            num++;
        }
    }
    /**
     * Método para generar una serie de cuadrados perfectos hasta n términos.
     */

    public void g4Serie06CuadradosPerfectos(){
        for (int i = 1; i <= this.numeroTerminos; i++) {
            System.out.print((i * i) + (i < this.numeroTerminos ? ", " : "\n"));
        }
    }
    /**
     * Método para generar una progresión aritmética con diferencia común de 3 hasta n términos.
     */

    public void g4Serie07ProgresionAritmetica(){
        int val=1;
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(val + (i < this.numeroTerminos - 1 ? ", " : "\n"));
            val += 3; 
        }
    }
    /**
     * Método para generar una progresión aritmética con diferencia común de 5 hasta n términos.
     */

    public void g4Serie08ProgresionAritmetica(){
        int val=3;
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(val + (i < this.numeroTerminos - 1 ? ", " : "\n"));
            val += 5; 
        }
    }
    /**
     * Método para generar una serie de potencias de 2 hasta n términos.
     */

    public void g4Serie09Potencia(){
        int val=2;
        for (int i = 0; i < this.numeroTerminos; i++) {
            System.out.print(val + (i < this.numeroTerminos - 1 ? ", " : "\n"));
            val *= 2; 
        }
    }

    /**
     * Imprime la serie de potencias de 3 hasta el número de términos especificado.   
     */
    public void g4imprimirPotencias3() {
        for (int contador=1; contador <= this.numeroTerminos; contador++){
            int potencia = (int) Math.pow(3, contador);
            System.out.print(potencia + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números oblongos hasta el número de términos especificado.
     */
    public void g4imprimirNumerosOblongos() {
        for (int contador=1; contador <= this.numeroTerminos; contador++){
            int oblongos = contador * (contador + 1);
            System.out.print(oblongos + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números triangulares hasta el número de términos especificado.
     */
    public void g4imprimirSerieTriangular(){
        for (int contador=1; contador <= this.numeroTerminos; contador++){
            int triangular = contador * (contador + 1) / 2;
            System.out.print(triangular + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números factoriales hasta el número de términos especificado. 
     */
    public void g4imprimirSerieFactorial(){
        int factorial=1;

        for(int contador=1; contador <= this.numeroTerminos; contador++){
            factorial=factorial*contador;
            System.out.print(factorial + " ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de numeros que si son pares sean negativos y si son impares sean positivos. 
     */
    public void g4imprimirSignosAlternos(){
        for(int contador=1; contador <= this.numeroTerminos; contador++){
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
     */
    public void g4imprimirCuadradosDesplazados(){
        for(int contador=1; contador <= this.numeroTerminos; contador++){
            int cuadradoDesplazado = 2*(int)(Math.pow(contador-1, 2));
            System.out.print(cuadradoDesplazado + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de repunidades hasta el número de términos especificado.   
     */
    public void g4imprimirRepunidades(){
        for(int contador=1; contador <= this.numeroTerminos; contador++){
            int repunidad = (int)(Math.pow(10, contador) - 1) / 9;
            System.out.print(repunidad + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números Lucas hasta el número de términos especificado.
     */
    public void g4imprimirNumerosLucas(){
        int a=2, b=1, c=0;
        System.out.print(a + " " + b + " ");
        for(int contador=1; contador <= this.numeroTerminos; contador++){    
            c=a+b;
            System.out.print(c + " "); 
            a=b;
            b=c;
        }
        System.out.println();
    }

    /**
     * Imprime la serie de números crecientes en la que su variación cambia linealmente de 1 en 1 hasta el número de términos especificado.
     */
    public void g4imprimirSerieCrecientes(){
        for(int contador=1; contador <= this.numeroTerminos; contador++){
            int crecientes= ((int)Math.pow(contador, 2) - contador + 2)/2;
            System.out.print(crecientes + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie de alternancias en la que los números impares son elevados al cuadrado y los números pares son elevados al cubo hasta el número de términos especificado.
     */
    public void g4imprimirAlternancias(){
        int alternancia=0;

        for(int contador=1; contador <= this.numeroTerminos; contador++){
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

