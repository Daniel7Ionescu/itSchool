package session4.challenges;

public class Challenge20GradeFromScoreRange {

    public static void main(String[] args) {
        //grade it with ternary operator
        double studentScore = 89.5;

        String grade = (studentScore >= 90) ? "A" :
                         (studentScore >= 80 && studentScore < 90) ? "B" :
                             (studentScore >= 70 && studentScore < 80) ? "C" :
                                 (studentScore >= 60 && studentScore < 70) ? "D" : "F";

        System.out.println("The student's grade is: " + grade);

//        Grades & range
//        A: 90 - 100
//        B: 80 - 89
//        C: 70 - 79
//        D: 60 - 69
//        F: 0 - 59
    }
}
