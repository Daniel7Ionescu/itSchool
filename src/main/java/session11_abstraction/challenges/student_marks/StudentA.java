package session11_abstraction.challenges.student_marks;

import java.util.ArrayList;
import java.util.List;

public class StudentA extends Marks {

    private List<Double> studentMarks;

    public StudentA(double historyMark, double mathMark, double PEMark) {
        studentMarks = new ArrayList<>();
        super.checkAndAddMark(historyMark, studentMarks);
        super.checkAndAddMark(mathMark, studentMarks);
        super.checkAndAddMark(PEMark, studentMarks);
    }

    @Override
    double getPercentage() {
        double sum = 0;
        for (double mark : studentMarks) {
            sum += mark;
        }
        return sum / (studentMarks.size() * 100) * 100;
    }
}
