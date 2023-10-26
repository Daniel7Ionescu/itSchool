package session7.challenges;

import java.time.LocalDate;

public class DisplayingTodaysDate {

    public static void main(String[] args) {
        displayTodaysDate();
    }

    private static void displayTodaysDate() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's date: " + currentDate);
    }
}
