package session8Wrapppers.challenges.diary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    private List<Entry> entries = new ArrayList<>();

    public void addEntry(Entry entry) {
        //check duplicate
        if (isDuplicateDate(entry)) {
            System.out.println("There is already an entry on date: " + entry.getEntryDate());
            return;
        }

        //add latest first
        for (Entry e : entries) {
            if (entry.getEntryDate().isAfter(e.getEntryDate())) {
                entries.add(0, entry);
                return;
            }
        }
        entries.add(entry);
    }

    public void editEntryBasedOnDate(String date, String newMessage) {
        LocalDate inputDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        for (Entry e : entries) {
            if (e.getEntryDate().equals(inputDate)) {
                e.setMessage(newMessage);
                System.out.println("Entry updated!");
                return;
            }
        }
        System.out.println("No entry on date: " + date + " found");
    }

    public void deleteEntryByDate(String date) {
        LocalDate inputDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        for (Entry e : entries) {
            if (e.getEntryDate().equals(inputDate)) {
                entries.remove(e);
                System.out.println("Entry: " + e + " removed.");
                return;
            }
        }
        System.out.println("No entry on date: " + date + " found");
    }

    private boolean isDuplicateDate(Entry newEntry) {
        for (Entry e : entries) {
            if (e.getEntryDate().equals(newEntry.getEntryDate())) {
                return true;
            }
        }
        return false;
    }

    public List<Entry> getEntries() {
        return entries;
    }
}
