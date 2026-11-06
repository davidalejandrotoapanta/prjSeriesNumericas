package pkgSerie.pkgRecursion;

import java.util.Scanner;

public class Recursion {
    private static final Scanner entrada = new Scanner(System.in);
    private static final int MAX_RECURSION = 500;
    private static final int MAX_FACTORIAL = 20;
    private int limite;

    /**
     * Constructor con validación para métodos recursivos.
     * @param limite Límite de control para la recursión.
     */
     public Recursion(String limite) {
        if (limite == null || !limite.matches("[0-9]+")) {
            System.out.println("Limite invalido. Se asigna 5 por defecto.");
            this.limite = 5;
            return;
        }

        try {
            int valor = Integer.parseInt(limite);
            if (valor == 0) {
                System.out.println("Limite invalido. Se asigna 5 por defecto.");
                this.limite = 5;
            } else if (valor > MAX_RECURSION) {
                System.out.println("Limite excedido. Se ajusta a " + MAX_RECURSION + ".");
                this.limite = MAX_RECURSION;
            } else {
                this.limite = valor;
            }
        } catch (NumberFormatException e) {
            System.out.println("Limite invalido. Se asigna 5 por defecto.");
            this.limite = 5;
        }
    }
    /**
     * Método para generar una secuencia factorial.
     */
    public long g4Recursion01Factorial() {
        if (limite > MAX_FACTORIAL) {
            System.out.println("Aviso: el factorial excede el rango de long.");
            return -1;
        }
        long resultado = g4Recursion01Factorial(limite);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    private long g4Recursion01Factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * g4Recursion01Factorial(numero - 1);
    }
     /**
     * Método para generar una recursión de suma.
     */
    public long g4Recursion02Suma() {
        System.out.println("Ingrese el segundo numero (b):");
        int b = entrada.nextInt();

        if (Math.abs((long) b) > MAX_RECURSION) {
            System.out.println("Aviso: el segundo numero no puede superar " + MAX_RECURSION + " en valor absoluto.");
            return 0;
        }

        long resultado = g4Recursion02Suma(limite, b);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    private long g4Recursion02Suma(long a, int b) {
        if (b == 0) {
            return a;
        }
        if (b > 0) {
            return g4Recursion02Suma(a + 1, b - 1);
        }
        return g4Recursion02Suma(a - 1, b + 1);
    }
    /**
     * Método para generar una recursión de multiplicación.
     */
    public long g4Recursion03mult() {
        System.out.println("Ingrese el segundo numero (b):");
        int b = entrada.nextInt();

        if (Math.abs((long) b) > MAX_RECURSION) {
            System.out.println("Aviso: el segundo numero no puede superar " + MAX_RECURSION + " en valor absoluto.");
            return 0;
        }

        long resultado = g4Recursion03mult(limite, b);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    private long g4Recursion03mult(long a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + g4Recursion03mult(a, b - 1);
        }
        return -a + g4Recursion03mult(a, b + 1);
    }

    /**
     * Método para generar una recursión de potencia.
     */
    public void g4Recursion04Potencia() {
        System.out.println("Ingrese el exponente (b):");
        int b = entrada.nextInt();

        if (b < 0 || b > MAX_RECURSION) {
            System.out.println("Aviso: el exponente debe estar entre 0 y " + MAX_RECURSION + ".");
            return;
        }

        try {
            System.out.println("Resultado: " + g4Recursion04Potencia(limite, b));
        } catch (ArithmeticException e) {
            System.out.println("Aviso: el resultado excede el rango de long.");
        }
    }

    private long g4Recursion04Potencia(long a, int b) {
        if (b == 0) {
            return 1;
        }
        return Math.multiplyExact(a, g4Recursion04Potencia(a, b - 1));
    }

    /**
     * Método para generar un Conteo progresivo.
     */
    public void g4Recursion05Conteo() {
        g4Recursion05Conteo(1);
    }

    private void g4Recursion05Conteo(int n) {
        if (n <= limite) {
            System.out.println(n);
            g4Recursion05Conteo(n + 1);
        }
    }

    /**
     * Método para generar un Conteo regresivo.
     */
    public void grRecursion06ContoReg() {
        grRecursion06ContoReg(limite);
    }

    private void grRecursion06ContoReg(int n) {
        System.out.println(n);
        if (n > 0) {
            grRecursion06ContoReg(n - 1);
        }
    }
}
