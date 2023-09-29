package session8_wrapppers.challenges.diary;

public class DiaryApp {

    public static void main(String[] args) {
        Diary diary = new Diary();

        Entry entry1 = new Entry();
        Entry entry2 = new Entry();
        Entry entry3 = new Entry();
        Entry entry4 = new Entry();

        entry1.createEntry("Today i saw a rainbow!", "2023-08-31");
        entry2.createEntry("What a great day!", "2023-09-23");
        entry3.createEntry("Oh noes, it's raining!", "2023-08-16");
        entry4.createEntry("Oh noes, it's raining!", "2023-08-16");

        //add entries + 1 duplicate date and print
        diary.addEntry(entry4);
        diary.addEntry(entry1);
        diary.addEntry(entry2);
        diary.addEntry(entry3);
        System.out.println("My diary entries so far: " + diary.getEntries());

        //edit entry
        diary.editEntryBasedOnDate("2023-08-16", "The rain wasn't so bad after all");
        System.out.println("My diary entries after i edited: " + diary.getEntries());

        //delete and entry
        diary.deleteEntryByDate("2023-08-31");
        System.out.println("My diary entries after I removed one: " + diary.getEntries());
    }
}
