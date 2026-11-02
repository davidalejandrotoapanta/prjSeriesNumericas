package pkgSerie.pkgLoading;

public class Loading {
    private int longitudBarra;
    private int retrasoMs;

    /**
     * Constructor con validación para Animaciones de Carga.
     * @param longitudBarra Longitud en caracteres de la barra de carga.
     */
    public Loading(int longitudBarra) {
        if (longitudBarra <= 0) {
            System.out.println("Longitud de barra invalida. Se asigna 20 por defecto.");
            this.longitudBarra = 20;
        } else {
            this.longitudBarra = longitudBarra;
        }
        this.retrasoMs = 100; 
    }
}
