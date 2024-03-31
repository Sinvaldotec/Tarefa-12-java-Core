package exercicio06;

public class Exercicio06 {

	public static int contarVogais(String str) {
        // Converte a string para minúsculas para evitar distinção entre maiúsculas e minúsculas
        str = str.toLowerCase();
        
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Verifica se o caractere atual é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String frase = "Esta é uma frase de exemplo";
        int vogais = contarVogais(frase);
        System.out.println("Número de vogais na frase: " + vogais);
    }
}