import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstInput = sc.nextLine();
        int secondNum = sc.nextInt();
        int firstNum = Integer.parseInt(firstInput);
        if (firstNum > secondNum) {
            System.out.println(firstNum);
            double number = (double) secondNum;
            System.out.println(number);
        } else if (firstNum < secondNum) {
            System.out.println(secondNum);
            double number = (double) firstNum;
            System.out.println(number);
        }
    }
}
