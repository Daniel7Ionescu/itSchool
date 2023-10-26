package session15_equals_hashcode.challenges.enum_scheduler_13;


import java.util.ArrayList;
import java.util.List;

public class Scheduler {

    private List<Activity> activities;

    public Scheduler() {
        activities = new ArrayList<>();
    }

    public Activity getActivityOnDay(Day day){
        for(Activity activity : activities){
            if(activity.getDay().equals(day)){
                return activity;
            }
        }
        System.out.println("No activity on " + day);
        return null;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
