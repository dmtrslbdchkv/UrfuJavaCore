package lr4.task2.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            byte[] array = new byte[size];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                try {
                    array[i] = Byte.parseByte(scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования строки в число типа byte");
                    return;
                }
            }
            int sum = 0;
            for (byte value : array) {
                try {
                    sum = Math.addExact(sum, value);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка вычисления значения за границами диапазона типа byte");
                    return;
                }
            }
            System.out.println("Сумма элементов массива: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода строки вместо числа");
        }
    }
}

