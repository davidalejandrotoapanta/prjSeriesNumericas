package pkgSerie.pkgCadenaCaracteres;

public class CadenaCaracteres {
    private String frase;
    private static final String[] PALABRAS_BASE = {"delira", "ballena", "alonda", "españa", "enrique"};
    private static final String[] PALABRAS_ANAGRAMA = {"lidera", "llenaba", "ladrona", "apañes", "quieren"};
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

    /**
     * Método para contar la cantidad de vocales en una frase.
     * @return La cantidad de vocales en la frase.
     */
    public void g4ContarVocales(){
        int contadorVocales = 0;
        for(int cont =0; cont < this.frase.length(); cont++){
            char caracter = Character.toLowerCase(this.frase.charAt(cont));
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales en la frase: " + contadorVocales);
    }

    /**
     * Método para contar la cantidad de consonantes en una frase.
     */
    public void g4ContarConsonantes(){
        int contadorVocales = 0;
        int contadorEspaciosBlancos = 0;
        for(int cont =0; cont < this.frase.length(); cont++){
            char caracter = Character.toLowerCase(this.frase.charAt(cont));
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contadorVocales++;
            }
            if (caracter == ' ') {
                contadorEspaciosBlancos++;
            }
        }
        int cantidadConsonantes=this.frase.length()-contadorVocales-contadorEspaciosBlancos;
        System.out.println("Cantidad de consonantes en la frase: " + cantidadConsonantes);
    }

    /**
     * Método para eliminar una vocal específica de la frase.
     * @param vocal La vocal que se desea eliminar.
     */
    public void g4EliminarVocal(char vocal) {
        String fraseMinuscula = this.frase.toLowerCase();
        String fraseResultado = fraseMinuscula.replace(vocal, ' ');
        System.out.println(fraseResultado);
    }

    /**
     * Método para eliminar una letra específica de la frase.
     * @param letra La letra que se desea eliminar.
     */
    public void g4EliminarLetra(char letra) {
        String fraseMinuscula = this.frase.toLowerCase();
        String fraseResultado = fraseMinuscula.replace(letra, ' ');
        System.out.println(fraseResultado);
    }

    /**
     * Método para invertir la frase y convertir las vocales en mayúsculas.
     */
    public void g4InvertirFraseConVocalesMayusculas(){
        StringBuilder fraseInvertida = new StringBuilder();

        for(int pos=this.frase.length()-1; pos>=0; pos--){
            char caracter = Character.toLowerCase(this.frase.charAt(pos));
            if(caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'){
                caracter = Character.toUpperCase(caracter);
            }
            fraseInvertida.append(caracter);
        }
        System.out.println(fraseInvertida);
    }

    /**
     * Método para invertir la frase y convertir las consonantes en mayúsculas.
     */
    public void g4InvertirFraseConConsonantesMayusculas(){
        StringBuilder fraseInvertida = new StringBuilder();

        for(int pos=this.frase.length()-1; pos>=0; pos--){
            char caracter = Character.toLowerCase(this.frase.charAt(pos));
            if(caracter!='a' && caracter!='e' && caracter!='i' && caracter!='o' && caracter!='u'){
                caracter = Character.toUpperCase(caracter);
            }
            fraseInvertida.append(caracter);
        }
        System.out.println(fraseInvertida);
    }

    /**
     * Método para cambiar la frase a mayúsculas y eliminar la letra 'J'.
     */
    public void g4CambiarFraseMayusculaSinJ(){
        String fraseMayuscula = this.frase.toUpperCase();
        String fraseResultado = fraseMayuscula.replace('J', ' ');
        System.out.println(fraseResultado);
    }

    /**
     * Método para obtener una palabra aleatoria de la lista de palabras base.
     * @return La posición de la palabra aleatoria en la lista.
     */
    public int g4ObtenerPalabraAleatoria(){
        int posicion=(int)(Math.random() * PALABRAS_BASE.length);
        System.out.println("Palabra: " + PALABRAS_BASE[posicion]);
        return posicion;
    }
    
    /**
     * Método para adivinar un anagrama de una palabra en una posición específica.
     * @param posicion La posición de la palabra en la lista de palabras base.
     * @param respuesta La respuesta del usuario para adivinar el anagrama.
     * @return true si la respuesta es correcta, false si es que no.
     */
    public boolean g4AdivinarAnagrama(int posicion, String respuesta){
        String palabraAnagrama=PALABRAS_ANAGRAMA[posicion];
        if(respuesta.equalsIgnoreCase(palabraAnagrama)){
            System.out.println("Correcto");
            return true;    
        } else {
            System.out.println("Incorrecto");
            return false;
        }
    }
    
    public void g4MayusculasAlternadas(){
        StringBuilder fraseResultado = new StringBuilder();
        int contadorLetras=0;
        for(int posicion=0; posicion<this.frase.length(); posicion++){
            char caracter = this.frase.charAt(posicion);
            if(caracter != ' '){
                contadorLetras++;
            }
            if(contadorLetras % 2 != 0){
                caracter = Character.toUpperCase(caracter);
            } else {
                caracter = Character.toLowerCase(caracter);
            }
            fraseResultado.append(caracter);
        }
        System.out.println(fraseResultado);
    }
}
