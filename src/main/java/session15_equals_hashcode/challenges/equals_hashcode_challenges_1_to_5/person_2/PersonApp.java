package session15_equals_hashcode.challenges.equals_hashcode_challenges_1_to_5.person_2;



public class PersonApp {

    public static void main(String[] args) {
        Person person1 = new Person("Kenny", 10);
        Person person2 = new Person("Kenny", 10);

        System.out.println("person1 hashcode: " + person1.hashCode());
        System.out.println("person2 hashcode: " + person2.hashCode());
        System.out.println("person1 equals person2: " + person1.equals(person2));
    }
}
