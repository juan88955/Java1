package co.com.ps.b4;

public class TrabajoEnClase3 {
    import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            // Declarar una lista de palabras
            List<String> palabras = Arrays.asList("gato", "perro", "árbol", "casa", "sol");

            // Imprimir la lista de palabras
            System.out.println("Lista de palabras:");
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        }
    }

}
