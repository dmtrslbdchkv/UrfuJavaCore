package lr3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        InputOutputArrayRecursion.inputArray(array, 0, in);
        System.out.println("Вывод массива: ");
        InputOutputArrayRecursion.outputArray(array, 0);
    }
}
