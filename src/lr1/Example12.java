package lr1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date current_date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(current_date);
        int current_year;
        current_year = calendar.get(Calendar.YEAR);
        System.out.println("Input age: ");
        int age = in.nextInt();
        System.out.printf("Year of birth: %d", current_year - age);
        in.close();
    }
}
