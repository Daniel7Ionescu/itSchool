package session14_collections.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);

        List<Integer> updatedList = getUpdatedList(myList, 1, 20);
        System.out.println(updatedList);

        List<Integer> evenNumsList = getEvenNumsList(myList);
        System.out.println(evenNumsList);

        int maxNum = getMaxNumFromList(myList);
        System.out.println(String.format("Max value is: %d", maxNum));
    }

    private static Integer getMaxNumFromList(List<Integer> list) {
        if(list == null || list.isEmpty()){
            System.out.println("Invalid list or empty");
            return null;
        }

        int result = list.get(0);
        for(int num : list){
            if(result < num){
                result  = num;
            }
        }
        return result;
    }

    private static List<Integer> getEvenNumsList(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    private static List<Integer> getUpdatedList(List<Integer> list, int index, int value) {
        if (index >= list.size() || index < 0) {
            System.out.println("Invalid index");
            return list;
        }
        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }

    private static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        return list;
    }
}
