package session7.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComparingUserEnteredDates {

    public static void main(String[] args) {
        compareDatesInput();
    }

    private static void compareDatesInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first date, format: year-month-day");
        String strDate1 = scanner.nextLine();
        System.out.println("Enter the second date, format: year-month-day");
        String strDate2 = scanner.nextLine();
        scanner.close();
        System.out.println("Are they equal: " + areDatesEqual(strDate1, strDate2));
    }

    private static boolean areDatesEqual(String strDate1, String strDate2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(strDate1, formatter);
        LocalDate date2 = LocalDate.parse(strDate2, formatter);

        //equals requires LocalDate, can handle null
        return date1.equals(date2);

        //isEqual can be called with other dates, compares whether they are the same point on the local type, exception on null
//        return date1.equals(date2);
    }
}
