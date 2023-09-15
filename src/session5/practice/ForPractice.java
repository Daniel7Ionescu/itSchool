package session5.practice;

public class ForPractice {

    public static void main(String[] args) {
        printEvenNumbers(20);
        printFactorialOfNumber(3);

        String[] names = {"Tom", "Ana"};
        printArray(names);

        int[] numArr = {5, 1, 11, 9};
        printArrayMaxValue(numArr);

        printSearchedValue(numArr, 6);

        int[][] numArr2 = {{1,3,5}, {2,4,6}};
        print2DArray(numArr2);
    }

    public static void printEvenNumbers(int number){
        for(int index = 0; index <= number; index += 2){
            System.out.println(index);
        }
    }

    public static void printFactorialOfNumber(int number){
        if(number < 0){
            System.out.println("Enter a positive int");
            return;
        }

        int factorial = 1;
        for(int index = 1; index <= number; index++){
            factorial *= index;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void printArray(String[] array){
        for(String element : array){
            System.out.println(element);
        }
    }

    public static void printArrayMaxValue(int[] array){
        int maxValue = array[0];
        for(int num : array){
            if(num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println(maxValue);
    }

    public static void printSearchedValue(int[] array, int value){
        for(int number : array){
            if(number == value){
                System.out.println("Number found " + value);
                break;
            }
        }
        System.out.println("That number is not in the array");
    }

    public static void print2DArray(int[][] array){
        for(int firstIndex = 0; firstIndex < array.length; firstIndex++){
            for(int secondIndex = 0; secondIndex < array[firstIndex].length; secondIndex++){
                System.out.print(array[firstIndex][secondIndex] + " ");
            }
            System.out.println();
        }
    }
}
