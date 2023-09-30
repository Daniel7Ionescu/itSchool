package session9_oop_intro.challenges.college_management;

import java.time.LocalDate;

public class ManagementApp {

    public static void main(String[] args) {
        Administration admin = new Administration();
        Course courseMath = admin.createCourse("Math", "How do numbers?", 10);
        Course coursePoetry = admin.createCourse("Poetry", "Roses are red.", 5);

        //create professors
        Academic prof1 = admin.createAcademicAndAddToAdmin("Professor", "Michael", "Church");
        Academic prof2 = admin.createAcademicAndAddToAdmin("Professor", "Alice", "Chains");

        //creating students
        Academic stud1 = admin.createAcademicAndAddToAdmin("Student", "Amber", "Heart");
        Academic stud2 = admin.createAcademicAndAddToAdmin("Student", "John", "Smith");
        Academic stud3 = admin.createAcademicAndAddToAdmin("Student", "Mike", "Judge");
        Academic stud4 = admin.createAcademicAndAddToAdmin("Student", "Tommy", "Pickles");

        //activate course by assigning a professor
        admin.assignProfessor(courseMath, prof2);
        //adding students
        admin.addStudentToCourse(courseMath, stud1);
        admin.addStudentToCourse(courseMath, stud3);

        admin.assignProfessor(coursePoetry, prof1);

        //print active courses
        admin.printActiveCoursesInfo();

        //print professors and students
//        admin.printAcademicsByRank("Professor");
//        admin.printAcademicsByRank("Student");







    }
}
