package session14_collections.challenges.hash_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static session14_collections.challenges.hash_map.HashMapUtil.*;

public class HashMapPracticeApp {

    public static void main(String[] args) {
        Map<String, String> map1 = initHashMap();
        System.out.println("Starting map:");
        System.out.println(map1);

        //updated specific key with specified value
        updateValueOfKeyInMap(map1, "Duck", "Goes quack");
        //count the number of elements
        System.out.println("Number of elements " + getNumOfElementsInMap(map1));

        //-Copy-
        //shallow copy, deep for primitives
        Map<String, String> shallowCopyOfMap1 = new HashMap<>(map1);
        Map<String, String> anotherShallowCopy = (HashMap)((HashMap<String, String>)map1).clone();
        Map<String, String> yetAnotherShallowCopy = new HashMap<>();
        yetAnotherShallowCopy.putAll(map1); //or iterate and put in a loop

        //deep copy
        Map<String, String> deepCopy1 = map1.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        //check for key
        System.out.println("Key 'Duck' is in map: " + map1.containsKey("Duck"));
        System.out.println("Key 'Duck' is in map, iterating: " + keyHasMapping(map1, "Duck"));

        //check for value
        System.out.println("Value 'Goes moo' by one or more keys: " + map1.containsValue("Goes moo"));

        //set view of mappings
        Set<String> entriesSet = getSetViewOfMappings(map1);
        System.out.println("Set of entries: " + entriesSet);

        //set view of keys
        Set<String> keysSet = getKeys(map1);
        System.out.println("Set of keys: " + keysSet);

        //set of values
        Set<String> valuesSet = getValues(map1);
        System.out.println("Set of values: " + valuesSet);






    }
}
