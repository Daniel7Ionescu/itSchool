package session7.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocatDatetimePractice {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time: " + current);

        LocalDateTime newTime = current.plusHours(10).plusMinutes(5);
        System.out.println("In the future of: " + newTime);

        LocalDate datePart = current.toLocalDate();
        LocalTime timePart = current.toLocalTime();
        System.out.println("Date: " + datePart);
        System.out.println("Time: " + timePart);

        checkBeforeAndAfter();

        String dateTimeValue = "2025-01-01 10:30";
        convertStringToLocalDateTime(dateTimeValue);
    }

    private static void convertStringToLocalDateTime(String dateTime){
        //2025-01-01 10:30
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTimeConverted = LocalDateTime.parse(dateTime, formatter);
        System.out.println("Parsed LocalDatetime: " + dateTimeConverted);
    }

    public static void checkBeforeAndAfter(){
        LocalDateTime dateTime = LocalDateTime.of(2025, 12, 7,10,15,20);

        if(dateTime.isBefore(LocalDateTime.now())){
            System.out.println(dateTime + " is old news.");
        } else {
            System.out.println(dateTime + " is from the future!");
        }
    }
}
