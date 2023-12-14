import java.util.Scanner;

public class FinishTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int count = sc.nextInt();
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Строка " + (i + 1) + ":");
            String word = sc.next();
            arr[i] = word;
        }
        int[] arrayOfLenght = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int wordLength = countUniqueCharacters(arr[i]);
            arrayOfLenght[i] = wordLength;
        }
        int max = arrayOfLenght[0];
        int maxIndex = 0;
        for (int i = 1; i < arrayOfLenght.length; i++) {
            if (arrayOfLenght[i] > max) {
                max = arrayOfLenght[i];
                maxIndex = i;
            }
        }
        System.out.println("Ответ: " + arr[maxIndex]);
    }

    public static int countUniqueCharacters(String input)
    {
        String unique = input.replaceAll("(?i)(.)(?=.*?\\1)", "");
        return unique.length();
    }
}