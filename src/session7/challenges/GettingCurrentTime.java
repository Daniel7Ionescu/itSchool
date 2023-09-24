package session7.challenges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GettingCurrentTime {

    public static void main(String[] args) {
        displayCurrentTime();
    }

    private static void displayCurrentTime() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(timeFormatter));
    }
}
