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

    public void g4ImprimirMatriz(String[][] matriz){
        for(int fila=0; fila<matriz.length; fila++){
            for(int columna=0; columna<matriz[0].length; columna++){
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }
    }

    /**
     *  Método para mostrar un triángulo de Pascal
     */
    public void g4MostrarTrianguloPascal(){
        int ancho = this.tamanio*2;
        String[][] triangulo = new String[this.tamanio][ancho];
        int mitad=(ancho/2)-1;
        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                triangulo[fila][columna] = " ";
            }
        }
        for(int fila=0; fila<this.tamanio; fila++){
            for(int columna=0; columna<ancho; columna++){
                if(columna==mitad-fila || columna==mitad+fila){
                    triangulo[fila][columna]=Integer.toString(1);
                }else if (fila > 0 && columna > mitad - fila && columna < mitad + fila && columna > 0 && columna < ancho - 1) {
    
                    String izqString = triangulo[fila - 1][columna - 1];
                    String derString = triangulo[fila - 1][columna + 1];

                    int izquierda = izqString.equals(" ") ? 0 : Integer.parseInt(izqString);
                    int derecha = derString.equals(" ") ? 0 : Integer.parseInt(derString);

                    int suma = izquierda + derecha;
                    if (suma > 0) {
                        triangulo[fila][columna] = Integer.toString(suma);
                    }
                }else{
                    triangulo[fila][columna]=" ";
                }
            }
        }
        g4ImprimirMatriz(triangulo);
    }

    /** 
     * Método para mostrar un triángulo rectángulo de pascal 
     */
    public void g4MostrarTrianguloRectanguloPascal(){
        int ancho = this.tamanio * 2;
        String[][] triangulo = new String[this.tamanio][ancho];
        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                triangulo[fila][columna] = " ";
            }
        }

        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                if (columna == 0 || columna == 2 * fila) {
                    triangulo[fila][columna] = "1";
                } else if (fila > 0 && columna > 1 && columna < 2 * fila) {
                    String izqString = triangulo[fila - 1][columna - 2];
                    String derString = triangulo[fila - 1][columna];

                    int izquierda = izqString.equals(" ") ? 0 : Integer.parseInt(izqString);
                    int derecha = derString.equals(" ") ? 0 : Integer.parseInt(derString);

                    int suma = izquierda + derecha;
                    if (suma > 0) {
                        triangulo[fila][columna] = Integer.toString(suma);
                    } else {
                        triangulo[fila][columna] = " ";
                    }
                } else {
                    triangulo[fila][columna] = " ";
                }
            }
        }

        g4ImprimirMatriz(triangulo);
    }

    /**
     * Método para mostrar una figura con forma de x con + y - intercalados
     */
    public void g4MostrarFigura16() {
        int filasMax = 2 * (this.tamanio - 1);
        int columnasMax = filasMax * 2;
        int centro = filasMax/2;
        String[][] matriz = new String[filasMax + 1][columnasMax + 1];

        for (int fila = 0; fila <= filasMax; fila++) {
            String caracter = (Math.abs(fila - centro) % 2 == 0) ? "+" : "-";

            for (int columna = 0; columna <= columnasMax; columna++) {
                if (columna == 2 * fila || columna == columnasMax - 2 * fila) {
                    matriz[fila][columna] = caracter;
                } else {
                    matriz[fila][columna] = " ";
                }
            }
        }
        g4ImprimirMatriz(matriz);
    }

    /**
     * Método para mostrar una figura con forma de x con 1 y 0 intercalados
     */
    public void g4MostrarFigura17() {
        int filasMax = 2 * (this.tamanio - 1);
        int columnasMax = filasMax * 2;
        int centro = filasMax/2;
        String[][] matriz = new String[filasMax + 1][columnasMax + 1];

        for (int fila = 0; fila <= filasMax; fila++) {
            String caracter = (Math.abs(fila - centro) % 2 == 0) ? "1" : "0";

            for (int columna = 0; columna <= columnasMax; columna++) {
                if (columna == 2 * fila || columna == columnasMax - 2 * fila) {
                    matriz[fila][columna] = caracter;
                } else {
                    matriz[fila][columna] = " ";
                }
            }
        }
        g4ImprimirMatriz(matriz);
    }

    /**
     * Método para mostrar un triángulo de Pascal con 2 en la diagonal
     */
    public void g4MostrarTrianguloRectanguloPascalCon2(){
        int ancho = this.tamanio * 2;
        String[][] triangulo = new String[this.tamanio][ancho];
        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                triangulo[fila][columna] = " ";
            }
        }

        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                if (columna == 2 * fila) {
                    triangulo[fila][columna] = "2";
                }else if(columna == 0){
                    triangulo[fila][columna] = "1";
                }else if (fila > 0 && columna > 1 && columna < 2 * fila) {
                    String izqString = triangulo[fila - 1][columna - 2];
                    String derString = triangulo[fila - 1][columna];

                    int izquierda = izqString.equals(" ") ? 0 : Integer.parseInt(izqString);
                    int derecha = derString.equals(" ") ? 0 : Integer.parseInt(derString);

                    int suma = izquierda + derecha;
                    if (suma > 0) {
                        triangulo[fila][columna] = Integer.toString(suma);
                    } else {
                        triangulo[fila][columna] = " ";
                    }
                } else {
                    triangulo[fila][columna] = " ";
                }
            }
        }

        g4ImprimirMatriz(triangulo);
    }

    public void g4MostrarTrianguloRectanguloPascalConCaracteres(){
        int ancho = this.tamanio * 2;
        String[][] triangulo = new String[this.tamanio][ancho];
        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                triangulo[fila][columna] = " ";
            }
        }

        for (int fila = 0; fila < this.tamanio; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                if (columna == 2 * fila) {
                    triangulo[fila][columna] = "2";
                }else if(columna == 0){
                    triangulo[fila][columna] = "1";
                }else if (fila > 0 && columna > 1 && columna < 2 * fila) {
                    String izqString = triangulo[fila - 1][columna - 2];
                    String derString = triangulo[fila - 1][columna];

                    int izquierda = izqString.equals(" ") ? 0 : Integer.parseInt(izqString);
                    int derecha = derString.equals(" ") ? 0 : Integer.parseInt(derString);

                    int suma = izquierda + derecha;
                    if (suma > 0) {
                        triangulo[fila][columna] = Integer.toString(suma);
                    } else {
                        triangulo[fila][columna] = " ";
                    }
                } else {
                    triangulo[fila][columna] = " ";
                }
            }
        }

        for (int fila = 0; fila < this.tamanio; fila++) {
            triangulo[fila][0] = "+";
            triangulo[fila][2 * fila] = "*";
        }

        g4ImprimirMatriz(triangulo);
    }
  }
