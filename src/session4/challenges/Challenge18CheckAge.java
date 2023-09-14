package session4.challenges;

import java.util.Scanner;

public class Challenge18CheckAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age human! *beep *boop *beep");
        int age = scanner.nextInt();
        printAge(age);
        scanner.close();
    }

    public static void printAge(int age){
        if(age < 12){
            System.out.println("Child");
        } else if(age >= 12 && age <=17){
            System.out.println("Teenager");
        } else if(age >= 18 && age <= 64){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
