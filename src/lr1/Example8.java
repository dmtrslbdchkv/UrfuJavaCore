package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input day: ");
        String day = in.nextLine();
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Input day number: ");
        int day_number = in.nextInt();
        System.out.printf("Day: %s, Day number: %d, Month: %s", day, day_number, month);
        in.close();
    }
}
