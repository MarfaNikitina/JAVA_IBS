import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int X = 25;
        final int Y = 87;
        final int Z = 38;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int lengthArray = sc.nextInt();
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Введите число");
            int number = sc.nextInt();
            if (number == X || number == Y || number == Z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }

}
