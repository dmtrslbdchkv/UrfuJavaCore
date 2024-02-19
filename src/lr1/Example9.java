package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Input count of days: ");
        int count_of_days = in.nextInt();
        System.out.printf("%s has %d days", month, count_of_days);
    }
}
