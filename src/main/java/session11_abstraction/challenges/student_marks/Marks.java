package session11_abstraction.challenges.student_marks;

import java.util.List;

public abstract class Marks {

    abstract double getPercentage();

    public void checkAndAddMark(double mark, List<Double> studentMarks){
        if(isMarkValid(mark)){
            studentMarks.add(mark);
        } else {
            System.out.println("Mark: "+ mark + " is invalid!");
        }
    }

    private boolean isMarkValid(double mark){
        if(mark < 0 || mark > 100){
            return false;
        }
        return true;
    }
}
