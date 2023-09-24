package session7.challenges;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class IntervalBetweenDates {

    public static void main(String[] args) {
        int days = daysBetween();
        System.out.println(days);
    }

    private static int daysBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date, format: year-month-day");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter the second date, format: year-month-day");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());
        scanner.close();

        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
