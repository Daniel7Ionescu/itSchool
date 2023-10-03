package session9_oop_intro.challenges.college_management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Administration {
    static List<Academic> professors = new ArrayList<>();
    static List<Academic> students = new ArrayList<>();
    List<Course> activeCourses = new ArrayList<>();

    public Academic createAcademicAndAddToAdmin(String rank, String firstName, String lastName) {
        Academic academic = new Academic(rank, firstName, lastName);
        generateAndSetId(academic);
        addAcademicToAdmin(academic);
        return academic;
    }

    private void generateAndSetId(Academic academic) {
        int number;
        if (academic.getRank().equals("Professor")) {
            number = Administration.professors.size();
        } else {
            number = Administration.students.size();
        }
        String twoDigitYear = LocalDate.now().toString().substring(2, 4);
        String id = academic.getRank().charAt(0) + twoDigitYear + number;
        academic.setId(id);
    }

    private void addAcademicToAdmin(Academic member) {
        if (member.getRank().equals("Professor")) {
            professors.add(member);
        } else if (member.getRank().equals("Student")) {
            students.add(member);
        }
    }

    public Course createCourse(String name, String description, int credits) {
        return new Course(name, description, credits);
    }

    public void assignProfessor(Course course, Academic professor) {
        course.addProfessor(professor);
        activeCourses.add(course);
    }

    public void addStudentToCourse(Course course, Academic student) {
        //check if course is active
        if (course.isCourseActive()) {
            course.addStudent(student);
            return;
        }
        System.out.println("Course is not active yet.");
    }

    public void printActiveCoursesInfo() {
        for (Course course : activeCourses) {
            System.out.println("Course name: " + course.getName() + " - Credits: " + course.getCredits() + " Professor: "
                    + course.getProfessor().getLastName() + " with id: " + course.getProfessor().getId());
            System.out.println("Students attending:");
            course.printAttendingStudents();
        }
    }

    public void printAcademicsByRank(String rank) {
        if (rank.equals("Professor")) {
            System.out.println("All professors:");
            for (Academic academic : professors) {
                System.out.println(academic.getId() + " - " + academic.getFirstName() + " " + academic.getLastName());
            }
        } else if (rank.equals("Student")) {
            System.out.println("All students:");
            for (Academic academic : students) {
                System.out.println(academic.getId() + " - " + academic.getFirstName() + " " + academic.getLastName());
            }
        }
    }
}
