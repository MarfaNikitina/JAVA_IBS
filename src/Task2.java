import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = sc.nextInt();
        if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int distanceChoice = sc.nextInt();
            System.out.println("Введите число");
            double countChoice = sc.nextDouble();
            switch (distanceChoice) {
                case (1):
                    System.out.println("Метры: " + countChoice);
                    System.out.println("Мили: " + countChoice * 0.0006);
                    System.out.println("Ярды: " + countChoice * 1.094);
                    System.out.println("Футы: " + countChoice * 3.281);
            }
        }


    }
}