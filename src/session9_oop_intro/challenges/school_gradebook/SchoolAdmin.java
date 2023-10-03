package session9_oop_intro.challenges.school_gradebook;

import java.util.ArrayList;
import java.util.List;

public class SchoolAdmin {

    List<Course> courses = new ArrayList<>();


    public Course createCourse(String name, String teacher){
        Course course = new Course(name, teacher);
        courses.add(course);
        return course;
    }

    public void addStudentToCourse(Course course, Student student){
        course.addStudent(student);
        student.attendCourse(course);
    }

    public void gradeStudent(Course course, double grade, Student student){
        course.addGradeToStudent(grade, student);
    }

    public void printStudentCoursesAndGrades(Student student){
        System.out.println("Courses and grades for student: " + student.getFirstName() + " " + student.getLastName());
        for(Course course : courses){
            if(course.students.contains(student)){
                System.out.println(course.getName());
                System.out.println(course.getStudentGrades(student));
            }
        }
    }
}
