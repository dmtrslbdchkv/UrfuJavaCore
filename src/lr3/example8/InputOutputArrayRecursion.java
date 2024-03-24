package lr3.example8;

import java.util.Scanner;

public class InputOutputArrayRecursion {
    public static void inputArray(int[] arr, int index, Scanner in) {
        if (index < arr.length) {
            System.out.print("Введите элемент массива [" + index + "] = ");
            arr[index] = in.nextInt();
            inputArray(arr, index + 1, in);
        }
    }

    public static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Элемент массива [" + index + "] = " + arr[index]);
            outputArray(arr, index + 1);
        }
    }
}
