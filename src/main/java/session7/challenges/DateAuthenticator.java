package session7.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAuthenticator {

    public static void main(String[] args) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean isMyDateValid = isValidDate(datePattern);

        System.out.println("Is my date valid: " + isMyDateValid);
    }

    private static boolean isValidDate(DateTimeFormatter pattern) {
        //get use input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date, format yyyy-MM-dd, to check if it is valid or not.");
        String stringDate = scanner.nextLine();
        scanner.close();

        //check input format
        if (checkDateFormat(stringDate, pattern)) {
            LocalDate date = LocalDate.parse(stringDate, pattern);

            //check leap-year
            int year = extractDateComponent(date, "year");
//            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                //is february and is day > 29
                int month = extractDateComponent(date, "month");
//                int day = extractDateComponent(date, "day"); //gives the corrected day
                //getting the day from string input
                String[] stringDateArr = stringDate.split(("-"));
                int day = Integer.parseInt(stringDateArr[2]);
                System.out.println("Month: " + month + " day: " + day);
                if (month == 2 && day > 29) {
                    return false;
                } else {
                    return true;
                }
            }

            //not a leap year
            else {
                return true;
            }
        }
        //invalid input
        else {
            System.out.println("Invalid date input!");
            return false;
        }
    }

    private static int extractDateComponent(LocalDate date, String component) {
        int data = 0;
        switch (component) {
            case "year" -> data = date.getYear();
            case "month" -> data = date.getMonth().getValue();
            case "day" -> data = date.getDayOfMonth();
            default -> data = 0;
        }
        return data;
    }

    private static boolean checkDateFormat(String date, DateTimeFormatter pattern) {
        try {
            LocalDate.parse(date, pattern);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
