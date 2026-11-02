package pkgSerie.pkgAutomatas;

public class Automatas {
    private String expresionValidar;

    /**
     * Constructor con validación para Autómatas y Gramáticas.
     * @param expresionValidar
     */
    public Automatas(String expresionValidar) {
        if (expresionValidar == null || expresionValidar.trim().isEmpty()) {
            System.out.println("Expresion invalida o vacia. Se asigna 'a' por defecto.");
            this.expresionValidar = "a";
        } else {
            this.expresionValidar = expresionValidar.trim();
        }
    }
}
