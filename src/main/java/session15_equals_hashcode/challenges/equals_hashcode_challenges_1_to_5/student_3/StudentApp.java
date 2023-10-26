package session15_equals_hashcode.challenges.equals_hashcode_challenges_1_to_5.student_3;

public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student(25, "Tom", "Tom@bombadil.com");
        Student student2 = new Student(25, "Tom", "Tom@bombadil.com");

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("student1 hashcode: " + student1.hashCode());
        System.out.println("student1 hashcode: " + student2.hashCode());
        System.out.println("student1 equals student2: " + student1.equals(student2));
    }
}
