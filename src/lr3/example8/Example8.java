package lr3.example8;

import java.util.Scanner;

public class Example8 {
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
