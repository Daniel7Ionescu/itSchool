package session11_abstraction.challenges.student_marks;

import java.util.ArrayList;
import java.util.List;

public class StudentB extends Marks{

    private List<Double> studentMarks;

    public StudentB(double historyMark, double mathMark, double peMark, double geoMark) {
        studentMarks = new ArrayList<>();
        super.checkAndAddMark(historyMark, studentMarks);
        super.checkAndAddMark(mathMark, studentMarks);
        super.checkAndAddMark(peMark, studentMarks);
        super.checkAndAddMark(geoMark, studentMarks);
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
