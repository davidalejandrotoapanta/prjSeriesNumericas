package pkgSerie.pkgRecursion;

public class Recursion {
    private int limite;

    /**
     * Constructor con validación para métodos recursivos.
     * @param limite Límite de control para la recursión.
     */
    public Recursion(int limite) {
        if (limite <= 0) {
            System.out.println("Termino no valido. Se asigna 1 por defecto.");
            this.limite = 1;
        } else {
            this.limite = limite;
        }
    }
}
