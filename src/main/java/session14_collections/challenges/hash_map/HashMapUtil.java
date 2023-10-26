package session14_collections.challenges.hash_map;

import session14_collections.practice.MapPractice;

import java.util.*;

public class HashMapUtil {

    protected static Set<String> getValues(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        Iterator valuesIterator = map.values().iterator();
        while (valuesIterator.hasNext()){
            set.add((String) valuesIterator.next());
        }
        return set;
    }

    protected static Set<String> getKeys(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (String key : map.keySet()) {
            set.add(key);
        }
        return set;
    }

    protected static Set<String> getSetViewOfMappings(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            set.add(entry.getKey() + " : " + entry.getValue());
        }
        return set;
    }

    protected static boolean keyHasMapping(Map<String, String> map, String key) {
        boolean result = false;
        Iterator keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            if (keyIterator.next().equals(key)) {
                result = true;
            }
        }
        return result;
    }

    protected static int getNumOfElementsInMap(Map<String, String> map) {
        int counter = 0;
        for (String key : map.keySet()) {
            counter++;
        }
        return counter;
    }

    protected static void updateValueOfKeyInMap(Map<String, String> map, String targetKey, String value) {
        if (!map.containsKey(targetKey)) {
            System.out.println("Key: " + targetKey + " not found in map.");
            return;
        }
        map.put(targetKey, value);
        System.out.println("Key: " + targetKey + " updated.");
    }

    protected static Map<String, String> initHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Cow", "Goes moo");
        map.put("Dog", "Goes bark");
        map.put("Duck", null);
        map.put("Bull", "Goes moo");
        return map;
    }
}
