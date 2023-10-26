package session7.challenges.eventSchedulerAndReminder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Event event1 = new Event("Cousin Bob's wedding", "Don't mention Las Vegas!",
                LocalDateTime.of(2023, 10, 14, 16, 15),
                LocalDateTime.of(2023, 10, 14, 10, 00));

        Event event2 = new Event("Meet Mike and Ana", "Definitely mention Las Vegas!",
                LocalDateTime.of(2023, 9, 27, 10, 30),
                LocalDateTime.of(2023, 9, 27, 9, 15));

//        System.out.println(event1);

        Scheduler scheduler = new Scheduler();
        scheduler.addEvent(event1);
        scheduler.addEvent(event2);

        myScheduler(scheduler);

//        System.out.println(scheduler.events);

        //test remove
//        scheduler.removeEvent("Cousin Bob's wedding");

        //test get upcoming events
//        System.out.println(scheduler.getUpcomingEvents(4));

        //test pending reminders
//        System.out.println(scheduler.getPendingReminders(72));

        //test get events on
        LocalDate checkOnDate = LocalDate.of(2023, 10, 14);
//        System.out.println(scheduler.getEventsOn(checkOnDate));

//        System.out.println(event1.timeUntilEvent());
//        System.out.println("Time until reminder in hrs: " + event1.timeUntilReminder());
    }


    private static void myScheduler(Scheduler scheduler) {
        Scanner scanner = new Scanner(System.in);
        showOptions();
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("==All events==");
            System.out.println(scheduler.getAllEvents());
        } else if (option == 2) {
            System.out.println("How many max events?");
            option = scanner.nextInt();
            System.out.println(scheduler.getUpcomingEvents(option));
        } else if (option == 3) {
            System.out.println("Enter date, (yyyy-MM-dd)");
            String dateStr = scanner.next();
            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println(scheduler.getEventsOn(date));
        } else if (option == 4) {
            System.out.println("Show remainders, time limit in hours");
            option = scanner.nextInt();
            System.out.println(scheduler.getPendingReminders(option));
        }
        scanner.close();
    }

    private static void showOptions() {
        System.out.println("==My Little Scheduler==");
        System.out.println("Select and option");
        System.out.println("1. Show events");
        System.out.println("2. Show a few upcoming events");
        System.out.println("3. Get events on");
        System.out.println("4. Show reminders until");
        System.out.println("5. Exit");
    }
}