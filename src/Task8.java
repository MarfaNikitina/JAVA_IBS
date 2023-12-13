import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел, которые меньше введенного числа составляет:" + sum);
    }
}
