package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num_1 = in.nextInt();
        System.out.println("Input second number: ");
        int num_2 = in.nextInt();
        System.out.printf("Sum: %d, div: %d", num_1 + num_2, num_1 - num_2);
        in.close();
    }
}
