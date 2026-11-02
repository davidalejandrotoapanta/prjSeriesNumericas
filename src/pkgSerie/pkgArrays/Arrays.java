package pkgSerie.pkgArrays;

public class Arrays {
    private String nombre;
    private String apellido;
    private int tamanioMatriz;

    /**
     * Constructor de la clase Arrays con validación para los parámetros ingresados.
     * @param nombre
     * @param apellido
     * @param tamanioMatriz
     */
    public Arrays(String nombre, String apellido, int tamanioMatriz) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "nombre";
        } else {
            this.nombre = nombre;
        }

        if (apellido == null || apellido.trim().isEmpty()) {
            this.apellido = "apellido";
        } else {
            this.apellido = apellido;
        }

        if (tamanioMatriz <= 0) {
            System.out.println("Tamanio de matriz invalido. Se asigna 5 por defecto.");
            this.tamanioMatriz = 5;
        } else {
            this.tamanioMatriz = tamanioMatriz;
        }
    }
}
