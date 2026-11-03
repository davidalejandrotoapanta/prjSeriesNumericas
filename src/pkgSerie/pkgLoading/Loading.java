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
    /**
     * Método para mostrar un indicador de carga rotacional.
     */

    public void g4L01_indicadorCargaRotacional(){
        char[] rotacion = {'|', '/', '-', '\\'};
        for(int i=0; i<100; i++){
            System.out.print("\r" + rotacion[i % rotacion.length] + " Cargando... " + (i+1) + "%");
            try{
            Thread.sleep(this.retrasoMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        }
        System.out.println("\nCarga completa.");
        
    }

    /**
     * Método para mostrar una barra de carga con un caracter específico.
     * @param caracter Caracter que se utilizará para llenar la barra de carga.
     */

    public void g4L02_caracterCargando(char caracter){
        for(int i=0; i<100; i++){
            int caracteresLlenos= (i*this.longitudBarra)/100;
            int espaciosVacios = this.longitudBarra - caracteresLlenos;
            System.out.print("\r[");
            for(int j=0; j<caracteresLlenos; j++){
                System.out.print(caracter);
            }
            for(int j=0; j<espaciosVacios; j++){
                System.out.print(" ");
            }
            System.out.print("] " + (i+1) + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");

    }
    /**
     * Método para mostrar un caracter que se desplaza a lo largo de la barra de carga.
     * @param caracter Caracter que se desplazará a lo largo de la barra de carga.
     */

    public void g4L03_desplazarCaracter(char caracter){
        for(int i=0; i<100; i++){
            int posicionActual=(i*(this.longitudBarra-1))/100;
            System.out.print("\r[");
            for(int j=0; j<this.longitudBarra; j++){
                if(j==posicionActual){
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + (i+1) + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }
    /**
     * Método para mostrar un indicador de carga que se mueve de ida y vuelta.
     */

    public void g4L04_waitingIdaYVuelta(){
        String[] animacion={"0oo", "o0o", "oo0","o0o"};
        for(int i=0; i<100; i++){
            System.out.print("\r" + animacion[i % 4] + " Cargando... " + i + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }
    /**
     * Método para mostrar una barra de carga con una punta que cambia de posición.
     */

    public void g4L05_barraPuntaCambiante(){
        for(int i=0; i<100; i++){
            int caracteresLlenos= (i*this.longitudBarra)/100;
            int espaciosVacios = this.longitudBarra - caracteresLlenos;
            System.out.print("\r[");
            for(int j=0; j<caracteresLlenos; j++){
                System.out.print("=");
            }
            if(caracteresLlenos<this.longitudBarra){
                System.out.print(">");
            }
            for(int j=0; j<espaciosVacios-1; j++){
                System.out.print(" ");
            }
            System.out.print("] " + (i+1) + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }

    /**
     * Método para mostrar una barra de carga con un indicador que se mueve de izquierda a derecha.
     */

    public void g4L06_barraCambianteDeIzquierdaADerecha(){
        for(int i=0; i<100; i++){
            int posicionActual=(i*(this.longitudBarra-1))/100;
            System.out.print("\r[");
            for(int j=0; j<this.longitudBarra; j++){
                if(j ==posicionActual){
                    System.out.print("<=>");
                    j+=2;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("] " + (i+1) + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }
    /**
     * Método para mostrar una barra de carga con un indicador rotacional.
     */

    public void g4L07_barraRotacional(){
        char[] rotacion = {'|', '/', '-', '\\'};
        for(int i=0; i<100; i++){
            int caracteresLlenos= (i*this.longitudBarra)/100;
            int espaciosVacios = this.longitudBarra - caracteresLlenos;
            System.out.print("\r[");
            for(int j=0; j<caracteresLlenos; j++){
                System.out.print("=");
            }
            if(caracteresLlenos<this.longitudBarra){
                System.out.print(rotacion[i % rotacion.length]);
            }
            for(int j=0; j<espaciosVacios-1; j++){
                System.out.print(" ");
            }
            System.out.print("] " + (i+1) + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }
    /**
     * Método para mostrar un nombre completo que se carga letra a letra.
     * @param nombreCompleto Nombre completo que se mostrará letra a letra.
     */

    public void g4L08_cargaLetraaLetra(String nombreCompleto){
        int longitudNombre= nombreCompleto.length();
        for(int i=0; i<100; i++){
            int letrasVisibles=(i*longitudNombre)/100;
            System.out.print("\r[");
            for(int j=0; j<longitudNombre; j++){
                if(j<=letrasVisibles){
                    System.out.print(nombreCompleto.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + i + "%");
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }
    /**
     * Método para mostrar un nombre completo que se carga letra a letra, pero solo una letra a la vez.
     * @param nombreCompleto Nombre completo que se mostrará letra a letra.
     */

    public void g4L09_cargaUnaLetra(String nombreCompleto){
        int longitud= nombreCompleto.length();
        for(int i=0; i<100; i++){
            int indiceLetra=(i*longitud)/100;
            System.out.print("\r" + nombreCompleto.charAt(indiceLetra));
            try{
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
        System.out.println("\nCarga completa.");

    }
    /**
     * Método para simular la carga de un archivo con una barra de progreso.
     */

    public void g4L10_cargaArchivo() {
        int fileSize = 10 + (int)(Math.random() * 91);
        System.out.println("Downloading ArchivoYarl-win_amd64.whl (" + fileSize + " kB)");
        
        
        String colorVerde = "\u001B[32m";
        String colorReset = "\u001B[0m";

        for (int i = 0; i <= 100; i++) {
            int caracteresLlenos = (i * this.longitudBarra) / 100;
            int espaciosVacios = this.longitudBarra - caracteresLlenos;
            double currentKb = (i * fileSize) / 100.0;
            
            System.out.print("\r[");
            System.out.print(colorVerde); 
            
            for (int j = 0; j < caracteresLlenos; j++) {
                System.out.print("="); 
            }
            
            System.out.print(colorReset); 
            
            for (int j = 0; j < espaciosVacios; j++) {
                System.out.print(" ");
            }
            
            
            System.out.printf("] %.1f/%.1f kB", currentKb, (double)fileSize);
            
            try {
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }

    /**
     * Método para mostrar una barra de carga simétrica que se llena desde el centro hacia los extremos.
     */

    public void g4L11_cargaSimetricas(){
        String colorCian= "\u001B[36m";
        String colorReset= "\u001B[0m";

        System.out.println(" ");

        for (int i=0; i<=50;i++){
            int r=(int)(Math.random()*11);
            int espacios=10-r;
            System.out.print(colorCian);
            for(int j=0;j<espacios;j++){
                System.out.print(" ");
            }
            for(int j=0;j<r;j++){
                System.out.print("-");
            }
            System.out.print("|");
            for(int j=0;j<r;j++){
                System.out.print("-");
            }
            System.out.println(colorReset);
            try {
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        }
        System.out.println("\nCarga completa.");
    }
    /**
     * Método para mostrar una barra de carga que simula la carga de barras de sonido.
     */

    public void g4L11_cargasDeSonido() {
        String colorMagenta = "\u001B[35m";
        String colorReset = "\u001B[0m";
        
        System.out.println();
        
        for (int i = 0; i <= 100; i++) {
            int columnasActivas = (i * this.longitudBarra) / 100;
            int[] alturas = new int[this.longitudBarra];
            
            for (int j = 0; j < this.longitudBarra; j++) {
                if (j < columnasActivas) {
                    alturas[j] = (int)(Math.random() * 9); 
                } else {
                    alturas[j] = 0; 
                }
            }
            
            for (int nivel = 8; nivel >= 1; nivel--) {
                System.out.print("\r"); 
                
                for (int j = 0; j < this.longitudBarra; j++) {
                    if (alturas[j] >= nivel) {
                        System.out.print(colorMagenta + "≡ " + colorReset);
                    } else {
                        System.out.print("  "); 
                    }
                }
                System.out.println(); 
            }
            
            System.out.println("\rProgreso: " + i + "%");
            
            try {
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            if (i < 100) {
                System.out.print("\033[9A");
            }
        }
        
        System.out.println("\nCarga de barras de sonido completada.");
    }

    /**
     * Método para mostrar una figura que se desplaza a lo largo de la barra de carga.
     */

    public void g4L12_figuraDesplazable() {
        String l1 = "   \\|||/         ";
        String l2 = "   (> <)         ";
        String l3 = "ooO-(_)-Ooo      ";
        
        System.out.println();
        
        for (int i = 0; i <= 100; i++) {
            int espaciosMax = this.longitudBarra;
            int espacios = i <= 50 ? (i * espaciosMax) / 50 : ((100 - i) * espaciosMax) / 50;
            
            String prefix = "";
            for (int s = 0; s < espacios; s++) {
                prefix += " ";
            }
            
            System.out.println("\r" + prefix + l1);
            System.out.println("\r" + prefix + l2);
            System.out.print("\r" + prefix + l3);
            
            try {
                Thread.sleep(this.retrasoMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            if (i < 100) {
                System.out.print("\033[2A");
            }
        }
        System.out.println("\n\nCarga de figura desplazable completada.");
    }
    

}
