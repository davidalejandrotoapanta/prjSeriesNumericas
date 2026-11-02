package pkgSerie.pkgCadenaCaracteres;

public class CadenaCaracteres {
    private String frase;

    /**
     * Constructor de la clase CadenaCaracteres con validación para la frase ingresada.
     * @param frase
     */
    public CadenaCaracteres(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            System.out.println("Frase nula o vacia. Se asigna 'Hola Mundo' por defecto.");
            this.frase = "Hola Mundo";
        } else {
            this.frase = frase;
        }
    }

}
