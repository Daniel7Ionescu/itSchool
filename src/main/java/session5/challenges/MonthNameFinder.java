package session5.challenges;

public class MonthNameFinder {

    public static void main(String[] args) {
        int monthNumber = 7;
        printMonthNameSwitch(monthNumber);
        printMonthNameForLoop(monthNumber);
    }

    public static void printMonthNameSwitch(int number) {
        switch (number) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Month");
        }
    }

    public static void printMonthNameForLoop(int number) {
        String[] monthsNames = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        for (int index = 0; index < monthsNames.length; index++) {
            if (number - 1 == index) {
                System.out.println(monthsNames[index]);
                return;
            }
        }
        System.out.println("Invalid Month");
    }
}
