package session8_wrapppers.challenges;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CheckNameAndRemove {

    public static void main(String[] args) {
        String[] students = {"Tom", "Ana", "Bobby", "Mike", "Tim", "Rebecca", "Alice", "Vinnie", "Claire", "Matt"};
        List<String> studentNames = new LinkedList<>();
        populateList(students, studentNames);

        checkStringAndRemove(studentNames);
    }

    private static void checkStringAndRemove(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to search for");
        String name = scanner.next();
        scanner.close();

        if (list.contains(name)) {
            list.remove(name);
            System.out.println("Student: " + name + " has been removed.");
        } else {
            System.out.println("No such student found.");
        }
    }

    private static void populateList(String[] sourceArr, List<String> targetArr) {
        for (String item : sourceArr) {
            targetArr.add(item);
        }
    }
}
