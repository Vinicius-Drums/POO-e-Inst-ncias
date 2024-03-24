// Classe App.java
public class App {
    public static void main(String[] args) {
        // Testando a classe Contador
        String frase = "Até a pé nós iremos, para o que der e vier";
        Contador contador = new Contador(frase);

        // Chamando o método contarPalavras e exibindo o resultado
        int numeroPalavras = contador.contarPalavras();
        System.out.println("Número de palavras na frase: " + numeroPalavras);
    }
}
