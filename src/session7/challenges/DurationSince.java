package session7.challenges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;

public class DurationSince {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.parse("10:00:00");
        System.out.println(elapsedTimeSince(time1));
    }

    private static String elapsedTimeSince(LocalTime priorTime) {
        LocalTime currenTime = LocalTime.now();
        Duration result = Duration.between(priorTime, currenTime);

        //from duration to miliseconds so we can use the format from DateFormat
        long resultInMilis = result.toMillis();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String duration = timeFormat.format(resultInMilis);
        return duration;
    }
}
