package session15_equals_hashcode.challenges.equals_hashcode_challenges_1_to_5.student_3;


import java.util.Objects;
import java.util.UUID;

public class Student {

    private UUID studentId;
    private int age;
    private String name;
    private String email;

    public Student(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
        studentId = UUID.randomUUID();
    }

    public UUID getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, email);
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nName: " + name + " age: " + age + ", email: " + email;
    }
}
