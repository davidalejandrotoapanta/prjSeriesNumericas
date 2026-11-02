package pkgSerie.pkgFiguras;

public class Figuras {
    private int tamanio;
    
    /**
     * Constructor de la clase Figuras con validación para el tamaño ingresado.
     * @param tamanio
     */
    public Figuras(int tamanio) {
        if (tamanio <= 0) {
            System.out.println("Tamanio de figura invalido. Se asigna 5 por defecto.");
            this.tamanio = 5;
        } else {
            this.tamanio = tamanio;
        }
    }
}
