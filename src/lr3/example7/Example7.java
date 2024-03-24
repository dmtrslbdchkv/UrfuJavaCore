package lr3.example7;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int decimal = in.nextInt();
        System.out.println("Двоичное представление числа " + decimal + ": ");
        DecimalToBinaryRecursion.decimalToBinary(decimal);
        in.close();
    }
}
