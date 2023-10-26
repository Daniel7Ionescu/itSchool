package session15_equals_hashcode.practice.enum_practice;

public class EnumPracticeApp {

    public static void main(String[] args) {
        printEnumValue();
        printDayMessage(Day.SATURDAY);
    }

    private static void printDayMessage(Day day){
        switch (day){
            case MONDAY -> System.out.println("Oh no, the week is starting");
            case SATURDAY -> System.out.println("Yay weekend!!!");
            default -> System.out.println("I don't know anymore.");
        }
    }

    private static void printEnumValue(){
        for(Day day : Day.values()){
            System.out.println(day + " is a weekday: " + day.isWeekday());
        }
    }
}
