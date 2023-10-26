package session7.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IsTodayASpecificDate {

    public static void main(String[] args) {
        String targetDate = "10th December 2019";
        System.out.println(isTodayASpecificDate(targetDate));
    }

    private static boolean isTodayASpecificDate(String targetDate) {
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy");
        return dateNow.equals(LocalDate.parse(targetDate, formatter));
    }
}
