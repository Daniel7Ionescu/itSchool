package session9_oop_intro.challenges.school_gradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private UUID studentID;
    private String firstName;
    private String lastName;
    List<Course> attendedCourses = new ArrayList<>();

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        studentID = UUID.randomUUID();
    }

    public void attendCourse(Course course){
        attendedCourses.add(course);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName;

    }
}
