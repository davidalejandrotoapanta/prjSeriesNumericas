public class App {
    public static void main(String[] args) throws Exception {
        // Código ANSI para colorear solo este mensaje
        String VERDE = "\u001B[32m";
        String RESET = "\u001B[0m";

        System.out.println(VERDE + "Hello, World!" + RESET);
    }
}
