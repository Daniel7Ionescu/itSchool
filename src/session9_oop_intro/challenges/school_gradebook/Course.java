package session9_oop_intro.challenges.school_gradebook;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    List<Student> students = new ArrayList<>();
    private List<ArrayList<Double>> studentsGrades = new ArrayList<>();

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
        studentsGrades.add(new ArrayList<>());
    }

    public void addGradeToStudent(double grade, Student student) {
        studentsGrades.get(students.indexOf(student)).add(grade);
    }

    public List<Double> getStudentGrades(Student student){
        return studentsGrades.get(students.indexOf(student));
    }

    public double getStudentAverageForCourse(Student student){
        double average = 0;
        List<Double> grades = getStudentGrades(student);
        for(double grade : grades){
            average += grade;
        }
        return average / grades.size();
    }

    public List<ArrayList<Double>> getAllStudentsGrades() {
        return studentsGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", students=" + students +
                '}';
    }
}
