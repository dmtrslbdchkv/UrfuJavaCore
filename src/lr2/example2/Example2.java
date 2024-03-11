package lr2.example2;

import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int rows = in.nextInt();
        System.out.println("Введите количество столбцов: ");
        int cols = in.nextInt();
        int[][] nums = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    nums[i][j] = random.nextInt(200);
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    nums[i][j] = random.nextInt(200);
                }
            }
        }
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
