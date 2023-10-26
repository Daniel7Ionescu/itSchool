package session14_collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initMap();
        System.out.println(myMap);

        int retrievedValue = retrieveValue(myMap, "two");
        System.out.println("Retrieved value: " + retrievedValue);

        updateMap(myMap, "one", 10);
        System.out.println("Updated map: " + myMap);
    }

    private static void updateMap(Map<String, Integer> map, String key, int value){
        map.put(key, value);
    }

    private static Integer retrieveValue(Map<String, Integer> map, String key){
        return map.get(key);
    }

    private static Map<String, Integer> initMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        return map;
    }
}
