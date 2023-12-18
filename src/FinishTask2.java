import java.util.Scanner;

public class FinishTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;
        String mathSymbol = Character.toString(input.charAt(1));
        if (input.startsWith("x+")) {
            result = Character.getNumericValue(input.charAt(4)) - Character.getNumericValue(input.charAt(2));
        } else if (input.startsWith("x-")) {
            result = Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(4));
        } else if (input.endsWith("x") && mathSymbol.equals("-")) {
            result = Character.getNumericValue(input.charAt(0)) - Character.getNumericValue(input.charAt(2));
        } else if (input.endsWith("x") && mathSymbol.equals("+")) {
            result = Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(2));
        } else if (mathSymbol.equals("+") && Character.toString(input.charAt(2)).equals("x")) {
            result = Character.getNumericValue(input.charAt(4)) - Character.getNumericValue(input.charAt(0));
        } else if (mathSymbol.equals("-") && Character.toString(input.charAt(2)).equals("x")) {
            result = Character.getNumericValue(input.charAt(0)) - Character.getNumericValue(input.charAt(4));
        }
        System.out.println("x равен: " + result);
    }
}
