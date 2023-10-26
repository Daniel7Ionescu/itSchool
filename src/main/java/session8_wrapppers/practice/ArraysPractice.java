package session8_wrapppers.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 9, 4};
        printArrayAverage(numbers);

        String[][] names = {{"Tom", "Ana"}, {"Bob", "Mike"}};
        print2DArray(names);

        System.out.println("Printed array: " + Arrays.toString(numbers));
        System.out.println("Binary search index value: " + Arrays.binarySearch(numbers, 5));

    }



    public static void printArrayAverage(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("Average is: " + sum / arr.length);
    }

    public static void sortArray(int[] arr){
        Arrays.sort(arr);
    }

    public static void print2DArray(String[][] arr){
        for(String[] names : arr){
            for(String name : names){
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }


}
