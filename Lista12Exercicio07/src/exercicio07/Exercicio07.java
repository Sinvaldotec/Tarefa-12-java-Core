package exercicio07;

public class Exercicio07 {

	public static boolean isAnoBissexto(int ano) {
        // Ano é bissexto se for divisível por 4 e não for divisível por 100, exceto se for divisível por 400
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    public static void main(String[] args) {
        int ano = 2019; // Altere o ano conforme necessário

        if (isAnoBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}
