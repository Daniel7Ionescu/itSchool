package session9_oop_intro.challenges.college_management;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String description;
    private int credits;
    private boolean isCourseActive = false;
    private Academic professor;
    private List<Academic> students = new ArrayList<>();

    public Course(String name, String description, int credits) {
        this.name = name;
        this.description = description;
        this.credits = credits;
    }

    public void addProfessor(Academic professor){
        this.professor = professor;
        isCourseActive = true;
    }

    public void addStudent(Academic student){
        students.add(student);
    }

    public void printAttendingStudents(){
        if(students.size() > 0){
            for(Academic student : students){
                System.out.println("Student: " + student.getId() + " " +  student.getLastName());
            }
        } else {
            System.out.println("No students enlisted yet.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Academic getProfessor() {
         return professor;
    }

    public boolean isCourseActive() {
        return isCourseActive;
    }
}
