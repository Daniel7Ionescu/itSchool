package session7.challenges;

import java.time.LocalDate;

public class DateArithmetic {

    public static void main(String[] args) {
        int weeksAdded = 4;
        System.out.println("Adding " + weeksAdded + " weeks to today: " + addWeeksToToday(weeksAdded));
    }

    public static LocalDate addWeeksToToday(int weeks) {
        LocalDate today = LocalDate.now();
        return today.plusWeeks(weeks);
    }
}
