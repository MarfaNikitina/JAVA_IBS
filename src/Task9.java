import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int lengthArray = sc.nextInt();
        double sum = 0;
        double[] arr = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            double number = sc.nextDouble();
            sum += number;
            arr[i] = number;
        }
        double avg = sum / lengthArray;
        for (double num: arr) {
            System.out.println(num * avg);
        }
    }
}
