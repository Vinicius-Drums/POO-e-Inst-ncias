// Classe Contador.java
public class Contador {
    private String frase;

    // Construtor
    public Contador(String frase) {
        this.frase = frase;
    }

    // Método para contar palavras
    public int contarPalavras() {
        // Dividindo a frase em palavras usando split()
        String[] palavras = frase.split("\\s+");
        // Retornando o número de palavras
        return palavras.length;
    }
}
