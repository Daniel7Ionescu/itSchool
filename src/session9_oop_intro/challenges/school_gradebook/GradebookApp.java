package session9_oop_intro.challenges.school_gradebook;

public class GradebookApp {

    public static void main(String[] args) {
        SchoolAdmin admin = new SchoolAdmin();
        Course courseMath = admin.createCourse("Math", "Mr. Garrison");

        //create students
        Student studentStan = new Student("Stan", "Marsh");
        Student studentEric = new Student("Eric", "Cartman");
        Student studentKenny = new Student("Kenny", "McCormick");

        //adding them to a course
        admin.addStudentToCourse(courseMath, studentStan);
        admin.addStudentToCourse(courseMath, studentEric);
        admin.addStudentToCourse(courseMath, studentKenny);

        //grading test 1
        admin.gradeStudent(courseMath, 5, studentStan);
        admin.gradeStudent(courseMath, 6, studentEric);
        admin.gradeStudent(courseMath, 9, studentKenny);
        System.out.println(courseMath.getAllStudentsGrades());

        //grading test 2
        admin.gradeStudent(courseMath, 5, studentStan);
        admin.gradeStudent(courseMath, 7, studentEric);
        admin.gradeStudent(courseMath, 8.5, studentKenny);
        System.out.println(courseMath.getAllStudentsGrades());

//        System.out.println("Student grades: " + courseMath.getStudentGrades(studentStan));
        admin.printStudentCoursesAndGrades(studentStan);

        System.out.println("Average grades for math: " + courseMath.getStudentAverageForCourse(studentStan));


    }
}

/*
Math
    tim: 4, 5, 6
    bob: 7, 8 ,9
course.student
courseMath.studentStan.getGrades()
 */
