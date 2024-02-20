package lr1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date current_date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(current_date);
        int current_year = calendar.get(Calendar.YEAR);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();
        System.out.printf("Name: %s, Age: %d", name, current_year - year_of_birth);
        in.close();
    }
}
