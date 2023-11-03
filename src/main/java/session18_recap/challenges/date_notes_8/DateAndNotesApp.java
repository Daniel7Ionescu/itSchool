package session18_recap.challenges.date_notes_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateAndNotesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Event> eventList = new ArrayList<>();

        Event event1 = new Event();
        event1.setEventDate("03-07-2024");
        event1.setDescription("Cool sample event");
        Event event2 = new Event();
        event2.setEventDate("12-02-2023");
        event2.setDescription("Another cool event");

        eventList.add(event1);
        eventList.add(event2);


        Menu_LOOP:
        while (true) {
            showOptions();
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> addEvent(scanner, eventList);
                case "2" -> viewEvents(eventList);
                case "0" -> {
                    break Menu_LOOP;
                }
                default -> System.out.println("Invalid input.");
            }
        }

    }

    private static void addEvent(Scanner scanner, List<Event> eventList) {
        System.out.println("Enter a date: as day-month-year 02-07-2023");
        String date = scanner.nextLine();
        System.out.println("Enter description: ");
        String description = scanner.nextLine();
//        System.out.printf("The event at date: %s%nDescription: %s%n%n", date, description);

        Event event = new Event();
        event.setEventDate(date);
        event.setDescription(description);
        System.out.println(event);
        eventList.add(event);
    }

    private static void viewEvents(List<Event> eventList) {
        System.out.println("List of events: ");
        eventList.stream()
                        .sorted((event1, event2) -> event1.getEventDate().compareTo(event2.getEventDate()))
                                .forEach(System.out::println);
    }

    private static void showOptions() {
        System.out.println("1. Add event type");
        System.out.println("2. View events");
        System.out.println("0. Exit");
    }
}
