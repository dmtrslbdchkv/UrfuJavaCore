package lr4.task2.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество строк в матрице: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов в матрице: ");
            int cols = scanner.nextInt();
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = (int) (Math.random() * 100);
                }
            }
            System.out.print("Введите номер столбца для вывода: ");
            int columnNumber = scanner.nextInt();
            if (columnNumber < 0 || columnNumber >= cols) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером");
            }
            System.out.println("Столбец " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

