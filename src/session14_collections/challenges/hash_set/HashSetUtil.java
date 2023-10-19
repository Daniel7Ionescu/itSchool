package session14_collections.challenges.hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetUtil {

    protected static TreeSet<String> hashSetToTreeSet(Set<String> set) {
        if(set.isEmpty()){
            System.out.println("Empty collection!");
            return null;
        }

        TreeSet<String> result = new TreeSet<>();
        for(String str : set){
            result.add(str);
        }
        return result;
    }

    protected static String[] hashSetToArray(Set<String> set) {
        String[] array = new String[set.size()];
        Iterator<String> setIterator = set.iterator();
        int counter = 0;
        while (setIterator.hasNext()) {
            array[counter] = setIterator.next();
            counter++;
        }
        return array;
    }

    protected static void addElementToSet(Set<String> set, String str) {
        if (set.contains(str)) {
            System.out.println("Element already in set.");
            return;
        }
        set.add(str);
    }

    protected static void printHashSet(Set<String> set) {
        for (String str : set) {
            System.out.println(str);
        }
    }

    protected static Set<String> initHashSet() {
        Set<String> set = new HashSet<>();
        set.add("blue");
        set.add("red");
        set.add("yellow");
        set.add("brown");
        set.add("green");
        return set;
    }
}
