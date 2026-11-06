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
    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A01: a*b+c.
     * @param cadena La cadena a validar.
     * @return true si la cadena es válida según el autómata, false en caso contrario.
     */
    public boolean g4ValidarA01_aStarbPlusc(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 0;
                    } else if (c == 'b') {
                        estado = 1;
                    } else {
                        estado = 3;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estado = 1;
                    } else if (c == 'c') {
                        estado = 2;
                    } else {
                        estado = 3;
                    }
                    break;
                default:
                    estado = 3;
                    break;
            }
        }
        return estado == 2;
    }
    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A02: ab+ca.
     * @param cadena
     * @return
     */
    public boolean g4ValidarA02_abPlusca(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 1;
                    } else {
                        estado = 5;
                    }
                    break;
                case 1:
                    if (c == 'b') {
                        estado = 2;
                    } else {
                        estado = 5;
                    }
                    break;
                case 2:
                    if (c == 'b') {
                        estado = 2;
                    } else if (c == 'c') {
                        estado = 3;
                    } else {
                        estado = 5;
                    }
                    break;
                case 3:
                    if (c == 'a') {
                        estado = 4;
                    } else {
                        estado = 5;
                    }
                    break;
                default:
                    estado = 5;
                    break;
            }
        }
        return estado == 4;
    }
    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A03 variante: a*b*c* o 1*0*1*.
     * @param cadena
     * @return
     */
    public boolean g4ValidarA03_Variante(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'a') {
                        estado = 1;
                    } else if (c == '1') {
                        estado = 4;
                    } else {
                        estado = 7;
                    }
                    break;
                case 1:
                    if (c == 'a') {
                        estado = 1;
                    } else if (c == 'b') {
                        estado = 2;
                    } else {
                        estado = 7;
                    }
                    break;
                case 2:
                    if (c == 'b') {
                        estado = 2;
                    } else if (c == 'c') {
                        estado = 3;
                    } else {
                        estado = 7;
                    }
                    break;
                case 3:
                    if (c == 'c') {
                        estado = 3;
                    } else {
                        estado = 7;
                    }
                    break;
                case 4:
                    if (c == '1') {
                        estado = 4;
                    } else if (c == '0') {
                        estado = 5;
                    } else {
                        estado = 7;
                    }
                    break;
                case 5:
                    if (c == '0') {
                        estado = 5;
                    } else if (c == '1') {
                        estado = 6;
                    } else {
                        estado = 7;
                    }
                    break;
                case 6:
                    if (c == '1') {
                        estado = 6;
                    } else {
                        estado = 7;
                    }
                    break;
                default:
                    estado = 7;
                    break;
            }
        }
        return estado == 3 || estado == 5 || estado == 6;
    }
    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A04: Decimal.
     * @param cadena
     * @return
     */
    public boolean g4ValidarA04Decimal(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == '+' || c == '-') {
                        estado = 1;
                    } else if (c >= '0' && c <= '9') {
                        estado = 2;
                    } else if (c == '.') {
                        estado = 3;
                    } else {
                        estado = 5;
                    }
                    break;
                case 1:
                    if (c >= '0' && c <= '9') {
                        estado = 2;
                    } else if (c == '.') {
                        estado = 3;
                    } else {
                        estado = 5;
                    }
                    break;
                case 2:
                    if (c >= '0' && c <= '9') {
                        estado = 2;
                    } else if (c == '.') {
                        estado = 3;
                    } else {
                        estado = 5;
                    }
                    break;
                case 3:
                    if (c >= '0' && c <= '9') {
                        estado = 4;
                    } else {
                        estado = 5;
                    }
                    break;
                case 4:
                    if (c >= '0' && c <= '9') {
                        estado = 4;
                    } else {
                        estado = 5;
                    }
                    break;
                default:
                    estado = 5;
                    break;
            }
        }
        return estado == 4;
    }

    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A05: Variable Java.
     * @param cadena
     * @return
     */
    public boolean g4ValidarA05VariableJava(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            boolean letra = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean numero = c >= '0' && c <= '9';
            boolean delimitador = c == ';' || c == ',' || c == '=';
            switch (estado) {
                case 0:
                    if (letra || c == '_' || c == '$') {
                        estado = 1;
                    } else {
                        estado = 4;
                    }
                    break;
                case 1:
                    if (letra || numero || c == '_' || c == '$') {
                        estado = 1;
                    } else if (c == ' ') {
                        estado = 3;
                    } else if (delimitador) {
                        estado = 2;
                    } else {
                        estado = 4;
                    }
                    break;
                case 3:
                    if (c == ' ') {
                        estado = 3;
                    } else if (delimitador) {
                        estado = 2;
                    } else {
                        estado = 4;
                    }
                    break;
                default:
                    estado = 4;
                    break;
            }
        }
        return estado == 1 || estado == 2;
    }
    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A06: Tokens de lenguaje.
     * @param cadena
     * @return
     */
    public boolean g4ValidarA06TokensLenguaje(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == 'f') {
                        estado = 1;
                    } else if (c == 'i') {
                        estado = 6;
                    } else if (c == 'e') {
                        estado = 9;
                    } else {
                        estado = 99;
                    }
                    break;
                case 1:
                    if (c == 'o') {
                        estado = 2;
                    } else {
                        estado = 99;
                    }
                    break;
                case 2:
                    if (c == 'r') {
                        estado = 3;
                    } else {
                        estado = 99;
                    }
                    break;
                case 3:
                    if (c == '(') {
                        estado = 5;
                    } else if (c == ' ') {
                        estado = 4;
                    } else if (c == 'e') {
                        estado = 14;
                    } else {
                        estado = 99;
                    }
                    break;
                case 4:
                    if (c == ' ') {
                        estado = 4;
                    } else if (c == '(') {
                        estado = 5;
                    } else {
                        estado = 99;
                    }
                    break;
                case 6:
                    if (c == 'f') {
                        estado = 7;
                    } else {
                        estado = 99;
                    }
                    break;
                case 7:
                    if (c == '(') {
                        estado = 8;
                    } else if (c == 'e') {
                        estado = 12;
                    } else {
                        estado = 99;
                    }
                    break;
                case 8:
                    if (c == ')') {
                        estado = 10;
                    } else {
                        estado = 99;
                    }
                    break;
                case 9:
                    if (c == 'l') {
                        estado = 11;
                    } else {
                        estado = 99;
                    }
                    break;
                case 11:
                    if (c == 's') {
                        estado = 13;
                    } else {
                        estado = 99;
                    }
                    break;
                case 12:
                    if (c == 'l') {
                        estado = 11;
                    } else {
                        estado = 99;
                    }
                    break;
                case 13:
                    if (c == 'e') {
                        estado = 15;
                    } else {
                        estado = 99;
                    }
                    break;
                case 14:
                    if (c == 'a') {
                        estado = 16;
                    } else {
                        estado = 99;
                    }
                    break;
                case 16:
                    if (c == 'c') {
                        estado = 17;
                    } else {
                        estado = 99;
                    }
                    break;
                case 17:
                    if (c == 'h') {
                        estado = 18;
                    } else {
                        estado = 99;
                    }
                    break;
                default:
                    estado = 99;
                    break;
            }
        }
        return estado == 5 || estado == 10 || estado == 15 || estado == 18;
    }

    /**
     * Valida si la cadena ingresada pertenece al lenguaje definido por el autómata A07: Clave.
     * @param cadena
     * @return
     */
    public boolean g4ValidarA07Clave(String cadena) {
        int estado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            int tipo;
            if (c >= 'A' && c <= 'Z') {
                tipo = 1;
            } else if (c >= 'a' && c <= 'z') {
                tipo = 2;
            } else if (c >= '0' && c <= '9') {
                tipo = 3;
            } else {
                tipo = 4;
            }
            switch (tipo) {
                case 1:
                    estado = estado | 1;
                    break;
                case 2:
                    estado = estado | 2;
                    break;
                case 3:
                    estado = estado | 4;
                    break;
                default:
                    estado = estado | 8;
                    break;
            }
        }
        return estado == 15;
    }}
