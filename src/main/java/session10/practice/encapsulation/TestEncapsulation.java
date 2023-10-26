package session10.practice.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        System.out.println(student1.getName() + " " + student1.getAge());

        student1.setAge(-2);
        System.out.println(student1.getName() + " " + student1.getAge());
    }
}
