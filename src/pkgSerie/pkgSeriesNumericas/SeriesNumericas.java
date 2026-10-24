package pkgSerie.pkgSeriesNumericas;


public class SeriesNumericas {
    /**
     * Método para generar la serie de Fibonacci hasta n términos.
     *
     * @param n Número de términos a generar en la serie de Fibonacci.
     */
    public void g4Serie01FIbonacci(int n){
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        
    }
    /**
     * Método para generar una serie de números impares y ceros hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie02ImparesCero(int n){
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    /**
     * Método para generar una serie que combina la serie de Fibonacci y los números impares hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie03FibonacciSobreIpares(int n){
        int a = 0, b = 1, impar = 1;
        for (int i = 0; i < n; i++) {
           System.out.print(a + "/" + impar + (i < n - 1 ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
            impar += 2;
        }
    }
    /**
     * Método para generar una serie que combina la serie de Fibonacci y los números pares hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie04FibonacciSobrePares(int n){
        int a = 0, b = 1, par = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/" + par + (i < n - 1 ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
            par += 2;
        }
    }
    /**
     * Método para generar una serie de números primos hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie05NumerosPrimos(int n){
       int count = 0, num = 2;
        while (count < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + (count < n - 1 ? ", " : "\n"));
                count++;
            }
            num++;
        }
    }
    /**
     * Método para generar una serie de cuadrados perfectos hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie06CuadradosPerfectos(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + (i < n ? ", " : "\n"));
        }
    }
    /**
     * Método para generar una progresión aritmética con diferencia común de 3 hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie07ProgresionArimetica(int n){
        int val=1;
        for (int i = 0; i < n; i++) {
            System.out.print(val + (i < n - 1 ? ", " : "\n"));
            val += 3; 
        }
    }
    /**
     * Método para generar una progresión aritmética con diferencia común de 5 hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie08ProgresionArimetica(int n){
        int val=3;
        for (int i = 0; i < n; i++) {
            System.out.print(val + (i < n - 1 ? ", " : "\n"));
            val += 5; 
        }
    }
    /**
     * Método para generar una serie de potencias de 2 hasta n términos.
     *
     * @param n Número de términos a generar en la serie.
     */

    public void g4Serie09Potencia(int n){
        int val=2;
        for (int i = 0; i < n; i++) {
            System.out.print(val + (i < n - 1 ? ", " : "\n"));
            val *= 2; 
        }
    }

    






}
