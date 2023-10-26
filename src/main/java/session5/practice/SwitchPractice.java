package session5.practice;

public class SwitchPractice {

    public static void main(String[] args) {
        char grade = 'A';
        printGradeInfo(grade);
        printGradeInfoEnhancedSwitch(grade);
        printSeasonInfo("Spring");
    }

    private static void printGradeInfoEnhancedSwitch(char grade){
        switch (grade) {
            case 'A' -> System.out.println("GG nerd!");
            case 'B' -> System.out.println("Very good");
            case 'C' -> System.out.println("Kinda good, kinda bad.");
            default -> System.out.println("Invalid input");
        }
    }

    private static void printGradeInfo(char grade){
        switch (grade){
            case 'A':
                System.out.println("GG nerd!");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("Kinda good, kinda bad.");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    private static void printSeasonInfo(String season){
        switch (season){
            case "Winter" -> System.out.println("Is so cold, brrr.");
            case "Spring" -> System.out.println("Bees and birds");
            default -> System.out.println("some other season?");
        }
    }
}
