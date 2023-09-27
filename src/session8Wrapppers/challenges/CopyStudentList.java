package session8Wrapppers.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyStudentList {

    public static void main(String[] args) {
        String[] students = {"Tom", "Ana", "Bobby", "Mike", "Tim", "Rebecca", "Alice", "Vinnie", "Claire", "Matt"};
        List<String> studentList = new ArrayList<>();
        populateArray(students, studentList);

        //1. Assign the reference to the second array, any change in array1 will reflect in array2
        List<String> graduateStudentList = new ArrayList<>();
        graduateStudentList = studentList;

        //2. Using the constructor, creates a duplicate
        List<String> graduateStudentList2 = new ArrayList<>(studentList);

        //3. addAll()
        List<String> graduateStudentList3 = new ArrayList<>();
        graduateStudentList3.addAll(studentList);

        //4. List.copyOf()
        List<String> graduateStudentList4 = new ArrayList<>();
        graduateStudentList4 = List.copyOf(studentList);
    }

    private static void populateArray(String[] sourceArr, List<String> targetArr) {
        for (String item : sourceArr) {
            targetArr.add(item);
        }
    }
}
