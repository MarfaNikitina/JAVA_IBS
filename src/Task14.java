import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
            System.out.println(array[i]);
        }
        int min = array[0];
        int max = array[0];
        for (int number: array) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        int maxAbs = Math.abs(max);
        int minAbs = Math.abs(min);
        int maxOfAbs = Math.max(maxAbs, minAbs);
        System.out.println("Наибольшее по модулю: " + maxOfAbs);
    }
}
