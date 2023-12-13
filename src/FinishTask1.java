import java.util.Scanner;

public class FinishTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double course = sc.nextDouble();
        System.out.println("Количество рублей: ");
        double count = sc.nextDouble();
        double value = count / course;
        double scale = Math.pow(10, 2);
        double result = Math.round(value * scale) / scale;
        String resultToPrint = String.format("%.2f", result);
        System.out.println(resultToPrint);
    }
}
