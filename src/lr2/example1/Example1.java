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
        Arrays.sort(nums);
        System.out.println("Произведена сопротивка массива");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
        int min = nums[0];
        System.out.println("Значение минимального элемента: " + min);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.println("Индекс минимального элемента: " + i);
            }
        }
    }
}
