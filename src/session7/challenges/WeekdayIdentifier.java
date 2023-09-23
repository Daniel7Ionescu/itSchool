package session7.challenges;

import java.time.LocalDate;

public class WeekdayIdentifier {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(findDayOfWeek(today));
    }

    private static String findDayOfWeek(LocalDate date){
        StringBuilder dateToString = new StringBuilder();
        dateToString.append(date.getDayOfWeek().toString().toLowerCase());
        dateToString.setCharAt(0, Character.toUpperCase(dateToString.charAt(0)));
        return dateToString.toString();

    }
}
