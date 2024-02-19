package lr1;

import java.util.Date;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Date current_date = new Date();
        int current_year = current_date.getYear() + 1900;
        Scanner in = new Scanner(System.in);
        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();
        System.out.printf("Your age: %d", current_year - year_of_birth);
    }
}
