package lr4.task2.task1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                throw new NoSuchElementException("Неверный размер массива");
            }
            int[] array = new int[size];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите элемент массива: ");
                int num = scanner.nextInt();
                if (num > 0) {
                    sum += num;
                } else {
                    throw new NoSuchElementException("Неположительный элемент");
                }
            }
            double average = (double) sum / size;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка при вводе значений Int");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
