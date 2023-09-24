package session7.challenges;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreateASpecificDate {

    public static void main(String[] args) {
        String dateStr = "19th August 2025";
        //'ignored characters' <- while in quotes
        System.out.println(createSpecificDate(dateStr));
    }

    private static LocalDate createSpecificDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy");
        return LocalDate.parse(dateStr, formatter);

        //more explicit variant
//        LocalDate date = LocalDate.parse(dateStr, formatter);
//        return date;
    }
}