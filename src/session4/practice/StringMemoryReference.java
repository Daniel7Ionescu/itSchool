package session4.practice;

public class StringMemoryReference {

    public static void main(String[] args) {

        String greeting = new String("Hello");
        String greeting1 = "hello";
        String greeting2= "Hello";

        System.out.println(greeting1 == greeting2);
        System.out.println(greeting1.equalsIgnoreCase(greeting2));

        System.out.println(greeting == greeting1);
        System.out.println(greeting.equals(greeting1));

        int num1 = 10;
        double num2 = 10.0;

        System.out.println(num1 == num2);

    }
}
