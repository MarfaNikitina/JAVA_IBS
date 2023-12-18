import java.util.Scanner;

public class FinishTask4_1 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Отгадай загадку: ");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String trueAnswer = "Заархивированный вирус";
        for (int i = 1; i < 4; i++) {
            String userAnswer = sc.nextLine();
            if (userAnswer.equals(trueAnswer)) {
                System.out.println("Правильно!");
                break;
            } else if (userAnswer.equals("Подсказка") && (i == 1)) {
                System.out.println("zip, rar... подумай об этом");
                String firstAnswerAfterClue = sc.nextLine();
                if (firstAnswerAfterClue.equals(trueAnswer)) {
                    System.out.println("Правильно!");
                    break;
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
            } else if (userAnswer.equals("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                continue;
            } else if (i != 3) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}
