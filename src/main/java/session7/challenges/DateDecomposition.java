package session7.challenges;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDecomposition {

    public static void main(String[] args) {
        Date current = new Date();
        displayDateComponents(current);
    }

    private static void displayDateComponents(Date date) {
        SimpleDateFormat onlyYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat onlyMonths = new SimpleDateFormat("MM");
        SimpleDateFormat onlyDays = new SimpleDateFormat("dd");

        String year = onlyYear.format(date);
        String month = onlyMonths.format(date);
        String day = onlyDays.format(date);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}