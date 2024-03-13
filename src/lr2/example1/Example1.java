package lr2.example1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива равен: " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        System.out.println("Начинается поиск минимума");
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Поиск минимума закончен.\nЗначение минимума = " + min);
        System.out.println("Поиск всех минимальных");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.println("Индекс минимального элемента: " + i);
                System.out.println("Значение минимального элемента: " + nums[i]);
            }
        }
    }
}
