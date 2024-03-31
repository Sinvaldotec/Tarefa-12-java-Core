package exercicio09;

public class Exercicio09 {

	public static boolean podeSerTriangulo(int lado1, int lado2, int lado3) {
        // Verifica se cada lado é maior que zero
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
            return false;
        
        // Verifica a condição de existência de um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int lado1 = 0;
        int lado2 = -1;
        int lado3 = -8;

        if (podeSerTriangulo(lado1, lado2, lado3))
            System.out.println("Esses valores podem ser os comprimentos dos lados de um triângulo.");
        else
            System.out.println("Esses valores não podem ser os comprimentos dos lados de um triângulo.");
    }
}
