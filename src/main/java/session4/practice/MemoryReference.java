package session4.practice;

public class MemoryReference {

    public static void main(String[] args) {

        Animal lion1 = new Animal();

//        System.out.println(lion1.name); //null
//        System.out.println(lion1.age); // 0
        lion1.setName("Simba");

        Animal lion2 = new Animal();
        lion2.setName("Simba");

        Animal lion3 = new Animal();
        lion3.setName("Simba");

        System.out.println(lion2 == lion3); //false
        System.out.println(lion2.equals(lion3)); // basic false, need to override equals & hashcode
        System.out.println(lion2.name == lion3.name);

        Animal lion4 = new Animal();
        lion4.setAge(10);
        Animal lion5 = new Animal();
        lion5.setAge(15);
        System.out.println("Animals with different age: " + lion4.equals(lion5));





    }
}
