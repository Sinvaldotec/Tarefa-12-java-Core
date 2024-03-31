package exercicio10;

public class Exercicio10 {

	public static double calcularMediaPonderada(double valor1, double valor2, double valor3, double peso1, double peso2, double peso3) {
        // Verifica se os pesos são válidos
        if (peso1 <= 0 || peso2 <= 0 || peso3 <= 0) {
            throw new IllegalArgumentException("Os pesos devem ser maiores que zero.");
        }
        
        // Calcula a média ponderada
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / somaPesos;
        
        return mediaPonderada;
    }

    public static void main(String[] args) {
        double valor1 = 10.0;
        double valor2 = 8.0;
        double valor3 = 9.5;
        double peso1 = 3.0;
        double peso2 = 2.0;
        double peso3 = 4.0;

        double media = calcularMediaPonderada(valor1, valor2, valor3, peso1, peso2, peso3);
        System.out.println("A média ponderada é: " + media);
    }
}
