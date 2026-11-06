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
