package session7.challenges.eventSchedulerAndReminder;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {

    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public String timeUntilEvent() {
        LocalDateTime dateNow = LocalDateTime.now();

        long days = dateNow.until(getEventDateTime(), ChronoUnit.DAYS);
        dateNow = dateNow.plusDays(days);
        long hours = dateNow.until(getEventDateTime(), ChronoUnit.HOURS);
        dateNow = dateNow.plusHours(hours);
        long minutes = dateNow.until(getEventDateTime(), ChronoUnit.MINUTES);
        return "Time until event: " + days + " Days " + hours + " hours " + minutes + " minutes";
    }

    public int timeUntilReminder() {
        LocalDateTime dateNow = LocalDateTime.now();
        long hours = dateNow.until(getReminderDateTime(), ChronoUnit.HOURS);
        return (int) hours;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public String getFormattedEventDateTime() {
        String month = eventDateTime.getMonth().toString();
        int day = eventDateTime.getDayOfMonth();
        int year = eventDateTime.getYear();
        int hour = eventDateTime.getHour();
        int minutes = eventDateTime.getMinute();

        return month + " " + day + " " + year + " at " + hour + ":" + minutes;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public String getFormatedReminder(){
        String month = reminderDateTime.getMonth().toString();
        int day = reminderDateTime.getDayOfMonth();
        int year = reminderDateTime.getYear();
        int hour = reminderDateTime.getHour();
        int minutes = reminderDateTime.getMinute();

        return month + " " + day + " " + year + " at " + hour + ":" + minutes;
    }

    @Override
    public String toString() {
        return "Event: " + getEventName() + ", on: " + getFormattedEventDateTime() + " Notes: " + getEventDescription();
    }
}