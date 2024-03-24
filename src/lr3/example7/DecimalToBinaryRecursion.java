package lr3.example7;

public class DecimalToBinaryRecursion {
    public static void  decimalToBinary(int n) {
        if (n > 1) {
            decimalToBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}
