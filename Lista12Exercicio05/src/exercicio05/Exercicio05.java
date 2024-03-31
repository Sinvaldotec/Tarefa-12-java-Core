package exercicio05;

public class Exercicio05 {

	public static String inverterString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
    }
    
    public static void main(String[] args) {
        String original = "Hello, World!";
        System.out.println("Original: " + original);
        String inverted = inverterString(original);
        System.out.println("Inverted: " + inverted);
    }
}
