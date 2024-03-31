package exercicio03;

public class Exercicio03 {

	public static boolean verificarPalindromo(String texto) {
        // Remover espaços em branco e converter para minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        
        // Inicializar dois índices, um do início da string e outro do fim
        int inicio = 0;
        int fim = texto.length() - 1;
        
        // Iterar sobre a string até que os índices se cruzem
        while (inicio < fim) {
            // Se os caracteres nas posições inicio e fim forem diferentes, não é um palíndromo
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            // Avançar para o próximo par de caracteres
            inicio++;
            fim--;
        }
        // Se chegarmos até aqui, a string é um palíndromo
        return true;
    }
    
    public static void main(String[] args) {
        // Exemplo de uso
        String texto = "Ame a ema";
        if (verificarPalindromo(texto)) {
            System.out.println("A string \"" + texto + "\" é um palíndromo.");
        } else {
            System.out.println("A string \"" + texto + "\" não é um palíndromo.");
        }
    }
}