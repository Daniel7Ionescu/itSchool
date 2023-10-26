package session11_abstraction.challenges.student_marks;

import java.text.DecimalFormat;

public class MarksApp {

    public static void main(String[] args) {
        DecimalFormat markFormat = new DecimalFormat("##.00");
        StudentA studentA = new StudentA(60, 70, 90);
        StudentB studentB = new StudentB(60, 70, 90, 80);


        System.out.println("Overall percentage for student A: " + markFormat.format(studentA.getPercentage()));
        System.out.println("Overall percentage for student B: " + markFormat.format(studentB.getPercentage()));
    }
}
