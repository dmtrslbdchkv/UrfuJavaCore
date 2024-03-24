package lr3.task2;

public class DecimalToBinaryRecursion {
    public static void decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
