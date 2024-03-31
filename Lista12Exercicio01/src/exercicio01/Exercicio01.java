package exercicio01;

public class Exercicio01 {

	// Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        // Se o número for menor ou igual a 1, não é primo
        if (numero <= 1) {
            return false;
        }
        
        // Verifica se o número é divisível por algum número diferente de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        // Se nenhum divisor foi encontrado, o número é primo
        return true;
    }

    public static void main(String[] args) {
        int numero = 18; // Número a ser verificado
        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
