import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice1 = sc.nextInt();
        if (choice1 == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int choice2 = sc.nextInt();
            System.out.println("Введите число");
            int count = sc.nextInt();
            switch (choice2) {
                case  (1):
                    System.out.println("Результат:");
                    System.out.println("Метры: " + count);
                    System.out.println("Мили: " + count * 0.0006);
                    System.out.println("Ярды: " + count * 1.094);
                    System.out.println("Футы: " + count * 3.281);
                    break;
                case (2):
                    System.out.println("Результат:");
                    System.out.println("Метры: " + count * 1609.344);
                    System.out.println("Мили: " + count);
                    System.out.println("Ярды: " + count * 1760);
                    System.out.println("Футы: " + count * 5280);
                    break;
                case (3):
                    System.out.println("Результат:");
                    System.out.println("Метры: " + count * 0.914);
                    System.out.println("Мили: " + count * 0.0006);
                    System.out.println("Ярды: " + count);
                    System.out.println("Футы: " + count * 3);
                    break;
                case (4):
                    System.out.println("Результат:");
                    System.out.println("Метры: " + count * 0.305);
                    System.out.println("Мили: " + count * 0.000189);
                    System.out.println("Ярды: " + count * 0.333);
                    System.out.println("Футы: " + count);
                    break;
                default:
                    System.out.println("неизвестная мера длины");
                    break;
            }
        } else if (choice1 == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - фунт, 3 - унция, 4 - килограмм");
            int choice2 = sc.nextInt();
            System.out.println("Введите число");
            int count = sc.nextInt();
            switch (choice2) {
                case (1):
                    System.out.println("Результат:");
                    System.out.println("Граммы: " + count);
                    System.out.println("Фунты: " + count * 0.0022);
                    System.out.println("Унции: " + count * 0.0353);
                    System.out.println("Килограммы: " + count * 0.001);
                    break;
                case (2):
                    System.out.println("Результат:");
                    System.out.println("Граммы: " + count * 453.592);
                    System.out.println("Фунты: " + count);
                    System.out.println("Унции: " + count * 16);
                    System.out.println("Килограммы: " + count * 0.454);
                    break;
                case (3):
                    System.out.println("Результат:");
                    System.out.println("Граммы: " + count * 28.35);
                    System.out.println("Фунты: " + count * 0.0625);
                    System.out.println("Унции: " + count);
                    System.out.println("Килограммы: " + count * 0.0283);
                    break;
                case (4):
                    System.out.println("Результат:");
                    System.out.println("Граммы: " + count * 1000);
                    System.out.println("Фунты: " + count * 2.205);
                    System.out.println("Унции: " + count * 35.274);
                    System.out.println("Килограммы: " + count);
                    break;
                default:
                    System.out.println("Неизвестная мера массы");
                    break;
            }
        }
    }

}
