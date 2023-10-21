package session15_equals_hashcode.challenges.enum_scheduler_13;

public class EnumSchedulerApp {

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Activity activityRunning = new Activity("Laps around the lake", Day.MONDAY);
        Activity activityGym = new Activity("It hurts so good", Day.WEDNESDAY);
        Activity activityShootingHoops = new Activity("Playing ball with the boys", Day.SATURDAY);

        scheduler.getActivities().add(activityRunning);
        scheduler.getActivities().add(activityGym);
        scheduler.getActivities().add(activityShootingHoops);

        System.out.println("What am i doing on Monday: " + scheduler.getActivityOnDay(Day.MONDAY));
        System.out.println("How about on Saturday: " + scheduler.getActivityOnDay(Day.SATURDAY));
    }
}
