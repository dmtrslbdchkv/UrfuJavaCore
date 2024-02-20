package lr1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Date current_date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(current_date);
        int current_year = calendar.get(Calendar.YEAR);
        Scanner in = new Scanner(System.in);
        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();
        System.out.printf("Your age: %d", current_year - year_of_birth);
        in.close();
    }
}
