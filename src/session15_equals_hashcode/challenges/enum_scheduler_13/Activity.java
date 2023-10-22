package session15_equals_hashcode.challenges.enum_scheduler_13;

public class Activity {

    private String name;
    private Day day;

    public Activity(String name, Day day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day + " : " + name;
    }
}
