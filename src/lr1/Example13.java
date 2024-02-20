package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first summand: ");
        int sum_1 = in.nextInt();
        System.out.println("Input second summand: ");
        int sum_2 = in.nextInt();
        System.out.printf("Sum is %d + %d = %d", sum_1, sum_2, sum_1 + sum_2);
        in.close();
    }
}
