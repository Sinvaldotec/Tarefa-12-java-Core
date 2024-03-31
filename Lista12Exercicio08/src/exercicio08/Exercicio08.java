package exercicio08;

public class Exercicio08 {

	public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePower(base, exponent);
        System.out.println(base + " elevado a " + exponent + " é igual a " + result);
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0)
            return 1;
        
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
