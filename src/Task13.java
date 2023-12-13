import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        int countLatinic = 0;
        for (String word: words) {
            boolean onlyLatinAlphabet = word.matches("^[a-zA-Z0-9]+$");
            if (onlyLatinAlphabet) {
                System.out.println(word);
                countLatinic += 1;
            }
        }
        System.out.println("Количество слов, состоящих из латиницы: " + countLatinic);
    }
}
