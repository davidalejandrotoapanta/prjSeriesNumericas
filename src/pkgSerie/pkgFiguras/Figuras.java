package pkgSerie.pkgFiguras;

//import java.util.Scanner;

public class Figuras {
    private static final int MAX_TAMANIO = 1000;
    private int tamanio;
    
    /**
     * Constructor de la clase Figuras con validación para el tamaño ingresado.
     * @param tamanio
     */
    public Figuras(String tamanio) {
        if (tamanio == null || !tamanio.matches("[0-9]+")) {
            System.out.println("Tamanio de figura invalido. Se asigna 5 por defecto.");
            this.tamanio = 5;
            return;
        }

        try {
            int valor = Integer.parseInt(tamanio);
            if (valor == 0) {
                System.out.println("Tamanio de figura invalido. Se asigna 5 por defecto.");
                this.tamanio = 5;
            } else if (valor > MAX_TAMANIO) {
                System.out.println("Tamanio excedido. Se ajusta a " + MAX_TAMANIO + ".");
                this.tamanio = MAX_TAMANIO;
            } else {
                this.tamanio = valor;
            }
        } catch (NumberFormatException e) {
            System.out.println("Tamanio de figura invalido. Se asigna 5 por defecto.");
            this.tamanio = 5;
        }
    }
    /**
     * Método para generar un triangulo de asterisos.
     */
    public void gr4Figura03Triangulo() {
    for (int i = 0; i < this.tamanio; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
    /**
     * Método para generar un triangulo invertido de asteriscos.
     */
    public void gr4Figura04Trianguloin() {
        for (int i = 0; i < this.tamanio; i++) {
            for(int j=-2;j>=i-this.tamanio;j--)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
    /**
     * Método para generar una piramide invertida de asteriscos.
     */
    public void gr4Figura05Piramidein() {
        for (int i = 0; i < this.tamanio; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = this.tamanio * 2 - i * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    /**
     * Método para generar una piramide de asteriscos.
     */
    public void gr4Figura06Piramide() {
        for (int i = 0; i < this.tamanio; i++) {

            for (int j = 0; j < this.tamanio - i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    /**
     * Método para generar una escalera de _ y |.
     */
    public void gr4Figura07Escalera() {
        for (int i = 0; i < this.tamanio; i++) {

        for (int j = 0; j < i * 4; j++) {
            System.out.print(" ");
         }

         if (i > 0) {
            System.out.print("|");
         }

        System.out.print("__");
        System.out.println();
       }
    }
    /**
     * Método para generar una escalera invertida de _ y |.
     */
    public void gr4Figura08Escalerain() {
        for (int i = 0; i < this.tamanio; i++) {

        for (int j = 0; j < (this.tamanio - i - 1) * 3; j++) {
            System.out.print(" ");
         }

         if (i > 0) {
            System.out.print("__");
             System.out.print("|");
         } 
         else
            System.out.print("__");
         
        System.out.println();
       }
    }
    /**
     * Método para generar una escalera de _ y | de subida y bajada.
     */
    public void gr4Figura09Escaleras() {

    for (int i = 0; i < this.tamanio; i++) {

        for (int j = 0; j <= (this.tamanio - i - 1) * 3; j++) {
            System.out.print(" ");
        }

        if (i > 0) {
            System.out.print("__");
            System.out.print("|");

            for (int j = 0; j <= i * 6 - 5; j++) {
                System.out.print(" ");
              }   

            System.out.print("|");
            System.out.print("__");
        }  
        else
            System.out.print("__");

        System.out.println();
     }
  }
  /**
     * Método para generar una escalera de simbolos + y -.
     */
  public void gr4Figura10Simboloescalonado() {

     for (int i = 0; i < this.tamanio; i++) {
        for (int j = 0; j <= i * 5 - 2; j++) {
            System.out.print(" ");
        }

        if (i == 1) {
            System.out.print("|");
            System.out.print("_-_");

        } else if (i > 1) {
            if (i % 2 != 0) {
                System.out.print("|");
                System.out.print("_-_");

            } else if (i % 2 == 0) {
                System.out.print("|");
                System.out.print("_+_");
            }

        } else {
            System.out.print("_+_");
        }

        if (i == this.tamanio - 1) {
            System.out.println();

            for (int j = 0; j <= i * 6 - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("|");
        }

        System.out.println();
      }
    }
    /**
     * Método para generar una escalera sumando _.
     */
    public void gr4Figura11EscaleraSumando()
    {
       

    for (int i = 0; i < this.tamanio; i++) {

        if (this.tamanio > 2) {
            for (int j = 2; j <= (i - 1) * 3; j++) {
                System.out.print(" ");
            }
        }

        if (this.tamanio > 3) {
            for (int j = 1; j <= (i - 2) * 3; j++) {
                System.out.print(" ");
            }
        }

        for (int j = 0; j <= i * 2; j++) {
            System.out.print(" ");
        }

        System.out.print("|");

        for (int j = 0; j <= i; j++) {
            System.out.print("_ ");
        }

        System.out.println();
    }
    }
    /**
     * Método para generar una piramide invertida de numeros.
     */
    public void gr4Figura12PiramideNumerosin() {
         

    for (int i = this.tamanio; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
   
    }
     /**
     * Método para generar una piramide de numeros.
     */
     public void gr4Figura13PiramideNumeros(){
        
        for (int i = 0; i <= this.tamanio; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }

            System.out.println();
        }
    }
  }
