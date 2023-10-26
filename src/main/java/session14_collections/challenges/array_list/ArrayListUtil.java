package session14_collections.challenges.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListUtil {

    protected static void trimListToTargetSize(List<String> list, int maxSize){
        if(list.size() > maxSize){
            //the returned view will contain all the elements that are above the maxSize, they are removed
            //the changes in the view are reflected in the source list
            list.subList(maxSize, list.size()).clear();
        }
    }

    protected static List<String> createJoinedList(List<String> list1, List<String> list2){
        List<String> list = new ArrayList<>(list1);
        list.addAll(list2);
        return list;
    }

    protected static void swapElementsByIndex(List<String> list, int indexOne, int indexTwo){
        String holder = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, holder);
    }

    protected static List<String> extractPartOfList(List<String> list, int startIndex, int endIndex){
        //validate index values
        if(startIndex < 0 || startIndex >= list.size()){
            System.out.println("Invalid start index: " + startIndex);
            return null;
        }
        if(endIndex < 0 || endIndex >= list.size() || endIndex < startIndex){
            System.out.println("Invalid end index: " + endIndex);
            return null;
        }
        return list.subList(startIndex, endIndex);
    }

    protected static void shuffleListLoop(List<String> list){
        Random random = new Random();

        for(int index = 0; index < list.size(); index++){
            //roll a random index in the bounds of the list
            int randomIndex = random.nextInt(list.size() -1);

            //store the value at the current index in a temp variable
            String holder = list.get(index);
            //the current index gets the value from a random index
            list.set(index, list.get(randomIndex));
            //that random index gets the value from the current index
            list.set(randomIndex, holder);
        }
    }

    protected static void sortListBasedOnOption(List<String> list, String option) {
        if (option.equalsIgnoreCase("ascending")) {
            Collections.sort(list);
        } else if (option.equalsIgnoreCase("descending")) {
            Collections.sort(list, Collections.reverseOrder());
        } else {
            System.out.println("Invalid option, use ascending or descending");
        }

    }

    protected static String getSpecifiedElement(List<String> list, String target) {
        for (String element : list) {
            if (element.equals(target)) {
                return element;
            }
        }
        System.out.println("Element: " + target + " not found in list.");
        return null;
    }

    protected static void removeElementByNum(List<String> list, int elementNumber) {
        //elementNumber to index
        int index = elementNumber - 1;
        //check if index is valid
        if (index < 0 || index >= list.size()) {
            System.out.println("No element at specified element number.");
            return;
        }
        list.remove(index);
        System.out.println("Element number: " + elementNumber + " removed.");
    }

    protected static void updateElement(List<String> list, String target, String value) {
        if (list.contains(target)) {
            int index = list.indexOf(target);
            list.set(index, value);
            System.out.println("Element successfully updated.");
        } else {
            System.out.println("Element: " + target + " not found in list.");
        }
    }

    protected static String getElementAtIndex(List<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return null;
        }
        return list.get(index);
    }

    protected static void insertElementInListAtPosition(List<String> list, int index, String value) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return;
        }
        list.add(index, value);
        System.out.println("Element: " + value + " inserted at position: " + index);
    }

    protected static void displayList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    protected static List<String> initList() {

        return new ArrayList<>(List.of("Red", "Blue", "Yellow", "Green", "Turquoise", "Almond", "Cyan"));
    }
}
