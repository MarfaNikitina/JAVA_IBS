
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < y; k++) {
            System.out.println(array[0][k] * 3);

        }
    }
    
}
