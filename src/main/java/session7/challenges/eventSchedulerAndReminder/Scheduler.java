package session7.challenges.eventSchedulerAndReminder;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Scheduler {

    private List<Event> events = new ArrayList<>();

    public List<Event> getEventsOn(LocalDate date) {
        List<Event> eventsOn = new ArrayList<>();

        for (Event e : events) {
            LocalDate eventDate = e.getEventDateTime().toLocalDate();
            if (date.equals(eventDate)) {
                eventsOn.add(e);
            }
        }
        return eventsOn;
    }

    public String getPendingReminders(int lessThanHours) {
        StringBuilder pendingReminders = new StringBuilder();
        pendingReminders.append("Upcoming pending reminders: \n");

        for (Event event : events) {
            if (event.timeUntilReminder() < lessThanHours) {
                pendingReminders.append(event.getEventName() + " will be reminded at: " + event.getFormatedReminder() + "\n");
            }
        }
        return pendingReminders.toString();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    public void removeEvent(String targetEventName) {
        Iterator<Event> eventIterator = events.iterator();

        while (eventIterator.hasNext()) {
            Event checkEvent = eventIterator.next();
            if (checkEvent.getEventName().equals(targetEventName)) {
                eventIterator.remove();
                System.out.println("Event " + checkEvent.getEventName() + " has been removed");
            }
        }
    }

    public List<Event> getUpcomingEvents(int numOfEvents) {
        List<Event> upcomingEvents = new ArrayList<>();

        for (int counter = 0; counter < numOfEvents; counter++) {
            if (counter < events.size()) {
                upcomingEvents.add(events.get(counter));
            }
        }
        return upcomingEvents;
    }

    public String getAllEvents(){
        StringBuilder allEvents = new StringBuilder();
        for(Event event : events){
            allEvents.append(event + "\n");
        }
        return allEvents.toString();
    }


}
