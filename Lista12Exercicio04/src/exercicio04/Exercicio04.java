package exercicio04;

public class Exercicio04 {

	public static double calcularMedia(double[] numeros) {
        double soma = 0;

        // Somando todos os números na lista
        for (double numero : numeros) {
            soma += numero;
        }

        // Calculando a média
        double media = soma / numeros.length;
        return media;
    }

    public static void main(String[] args) {
        // Exemplo de utilização da função
        double[] listaNumeros = {10.5, 20.5, 30.5, 40.5, 50.5};
        double media = calcularMedia(listaNumeros);
        System.out.println("A média da lista é: " + media);
    }
}