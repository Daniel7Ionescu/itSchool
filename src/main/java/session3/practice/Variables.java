package session3.practice;

public class Variables {

    private static String name = "John";

    public static void main(String[] args) {
        int age; //declaration
        age = 16; //initialization

        System.out.println("I'm John and I'm " + age + " years old.");
    }

    public static void practiceVariableScope(){
        int outerVal = 24;
        if(outerVal > 10){
            int innerVal = 200;
            System.out.println(innerVal + outerVal);
        }
//        System.out.println(innerVal); leads to compile error due to variable scope
    }
}
