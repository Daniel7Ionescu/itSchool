package session14_collections.challenges.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static session14_collections.challenges.array_list.ArrayListUtil.*;

public class ArrayListChallengesApp {

    public static void main(String[] args) {
        //initialize list & display its contents
        List<String> colorList = initList();
        displayList(colorList);

        //insert new element at a valid position
        insertElementInListAtPosition(colorList, 0, "Magenta");
        //retrieve element at specified index
        String retrievedElement = getElementAtIndex(colorList, 0);
        System.out.println("Retrieved element: " + retrievedElement);

        System.out.println("--Update specified element, invalid and valid input cases--");
        //update specified element -Invalid input-
        updateElement(colorList, "Aqua", "Pink");
        //update specified element -Valid input-
        updateElement(colorList, "Blue", "Pink");
        //remove element based on inout number, starting from 1
        removeElementByNum(colorList, 3);
        //search for element, with for loop
        String searchedElement = getSpecifiedElement(colorList, "Green");
        System.out.println(searchedElement);

        //sort list ascending or descending based on option
        sortListBasedOnOption(colorList, "ascending");
        System.out.println("--Sorted--");
        displayList(colorList);
        //shuffled with for loop, can also use Collections.shuffle(colorList) or Collections.shuffle(colorList, new Random(seed optional))
        System.out.println("--Shuffled--");
        shuffleListLoop(colorList);
        displayList(colorList);

        //extracted a portion of the list, not copied, returned a view, after shuffle! ^^^^
        System.out.println("--A portion of the list--");
        List<String> portionViewOfColorList = extractPartOfList(colorList, 2, 4);
        displayList(portionViewOfColorList);

        //compare lists
        List<String> list1 = new ArrayList<>(List.of("red", "blue", "green"));
        List<String> list2 = new ArrayList<>(List.of("green", "blue", "red"));
        //sort both then compare
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("After sorting and .equals(): " + list1.equals(list2));
        //use remove.all
        System.out.println("List 1 after sort and remove.all(list2), are they equal: " + list1.removeAll(list2));

        //swap elements
        List<String> colors2 = new ArrayList<>(List.of("red", "green", "blue"));
        System.out.println("Starting array: " + colors2);
//        Collections.swap(colors2, 0, 2);
        swapElementsByIndex(colors2, 0, 2);
        System.out.println("After swapping index 0 with index 2: " + colors2);

        //join lists
        List<String> list3 = new ArrayList<>(List.of("red", "blue", "green"));
        List<String> list4 = new ArrayList<>(List.of("green", "blue", "red"));
//        List<String> joinedList = new ArrayList<>();
//        joinedList.addAll(list3);
//        joinedList.addAll(list4);
        List<String> joinedList = createJoinedList(list3, list4);
        System.out.println("Joined list: " + joinedList);

        //empty list
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));
        numbers.clear();
        System.out.println("Numbers after .clear(): " + numbers);
        System.out.println("Is it empty: " + numbers.isEmpty());

        //trim list if .size() > a certain value
        List<String> pets = new ArrayList<>(List.of("dog", "cat", "duck"));
        trimListToTargetSize(pets, 2);
        System.out.println(pets);




    }
}
