package session7.challenges;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConventionAcrossZones {

    public static void main(String[] args) {
        //easy copy/paste  2023-09-23 16:30:00 to EST -> 2023-09-23 09:30:00
        DateTimeFormatter inputPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneId newTimeZone = ZoneId.of("America/Detroit");

        System.out.println(changeTimeZone(newTimeZone, inputPattern));
    }

    private static String changeTimeZone(ZoneId newTimeZone, DateTimeFormatter pattern) {
        //get user input
        String input = getUserInput();

        //check the format
        if (checkDateFormat(input, pattern)) {
            LocalDateTime inputDate = LocalDateTime.parse(input, pattern);
            return convertToTimeZone(inputDate, newTimeZone, pattern);
        }
        return "Something went wrong, panic!";
    }

    private static String convertToTimeZone(LocalDateTime dateTime, ZoneId newTimeZone, DateTimeFormatter pattern) {
        //get the local zoneId
        ZoneId localZoneId = ZoneId.systemDefault();

        //add local ZoneId to input string
        ZonedDateTime localDate = dateTime.atZone(localZoneId);

        //updating with new zoneID
        ZonedDateTime updatedDate = localDate.withZoneSameInstant(newTimeZone);

        //format to pattern
        String formattedDate = updatedDate.format(pattern);
        return formattedDate;
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date and time in format: yyyy-MM-dd HH:mm:ss");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    private static boolean checkDateFormat(String date, DateTimeFormatter pattern) {
        try {
            LocalDateTime.parse(date, pattern);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
