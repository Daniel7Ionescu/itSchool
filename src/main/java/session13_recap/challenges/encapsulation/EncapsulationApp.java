package session13_recap.challenges.encapsulation;

public class EncapsulationApp {

    public static void main(String[] args) {

        Person person1 = new Person("Eric Cartman", 10, "Southpark");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAdress());

        person1.setName("Chef");
        person1.setAge(40);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAdress());
    }
}
