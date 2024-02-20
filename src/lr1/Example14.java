package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = in.nextInt();
        System.out.printf("""
                num-1: %d,
                num: %d,
                num+1: %d,
                (num-1+num+num+1)^2: %.0f""", num - 1, num, num + 1, Math.pow((num - 1 + num + num + 1), 2));
        in.close();
    }
}
