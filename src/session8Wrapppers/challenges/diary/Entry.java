package session8Wrapppers.challenges.diary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Entry {

    private String message;
    private LocalDate entryDate;

    public void createEntry(String message, String date){
        setMessage(message);
        setEntryDate(date);
        System.out.println("Diary entry created for: " + getEntryDate());

    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        LocalDate date = LocalDate.parse(entryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.entryDate = date;
    }

    @Override
    public String toString() {
        return message + ": " + entryDate;
    }
}
