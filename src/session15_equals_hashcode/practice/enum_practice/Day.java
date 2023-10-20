package session15_equals_hashcode.practice.enum_practice;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}
