package exercicio02;

public class Exercicio02 {

	public static int main1(String[] args) {
		int numero = 0;
		if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser positivo.");
        }
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 5; // Número para calcular o fatorial
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

	private static int calcularFatorial(int numero) {
		// TODO Stub de método gerado automaticamente
		return 0;
	}
}