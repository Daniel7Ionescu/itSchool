package session4.challenges;

public class Challenge18Array {

    public static void main(String[] args) {
        int[] numArr = new int[5];

        //increment index + 1 and print
        System.out.println("increment index + 1 and print then decrement");
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = i + 1;
            System.out.print(numArr[i] + " ");
        }

        System.out.println();
        for(int i : numArr){
            i--;
            System.out.print(i + " ");
        }
    }
}
