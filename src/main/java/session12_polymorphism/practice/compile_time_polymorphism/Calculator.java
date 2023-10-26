package session12_polymorphism.practice.compile_time_polymorphism;

public class Calculator {

    //method overloading - compile-time polymorphism
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }
}
