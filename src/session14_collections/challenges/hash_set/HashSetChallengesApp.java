package session14_collections.challenges.hash_set;

import java.util.*;

import static session14_collections.challenges.hash_set.HashSetUtil.*;

public class HashSetChallengesApp {

    public static void main(String[] args) {

        Set<String> set1 = initHashSet();
//        printHashSet(set1);
        System.out.println("set1: " + set1);

        //add element to set
        addElementToSet(set1, "pink");

        //-CLONING-
//        Set<String> notAClone = new HashSet<>(set1); // - not a clone, just copy the object references into a new set
        //a change in one element will affect both sets

        //.clone comes from Object.clone(), HashSet implementation returns a shallow copy
        //cast set1 as HashSet to get the .clone() implementation, then cast the result as HashSet as well
        Set<String> shallowCopy = (HashSet) ((HashSet<String>) set1).clone();
        System.out.println("shallow copy cloned: " + shallowCopy);

        //addAll()
        Set<String> set2 = new HashSet<>();
        set2.addAll(set1);
        System.out.println("set2: " + set2);

        //-Converting hash set-
        //to array
        Object[] arrayFromHashSet1 = set1.toArray();
        for(int index = 0; index < arrayFromHashSet1.length; index++){
            System.out.println(arrayFromHashSet1[index]);
        }
        //with loop
        String[] arrayFromHashSet2 = hashSetToArray(set1);
        System.out.println("Array from hash set with loop: ");
        for(int index = 0; index < arrayFromHashSet2.length; index++){
            System.out.println(arrayFromHashSet2[index]);
        }

        //to tree set
        Set<String> treeSetFromHashSet1 = new TreeSet<>(set1);
        Set<String> treeSetFromHashSet2 = new HashSet<>();
        treeSetFromHashSet2.addAll(set1);
        Set<String> treeSetFromHashSet3 = hashSetToTreeSet(set1);

        //to list/arrayList
        List<String> arrayListFromHashSet1 = new ArrayList<>(set1);
        List<String> arrayListFromHashSet2 = new ArrayList<>();
        arrayListFromHashSet2.addAll(set1);

        //compare 2 hash set, doesn't consider order
        System.out.println("set2 equals set1: " + set2.equals(set1));

        //compare and retain common elements
        Set<String> setA = new HashSet<>();
        setA.add("Dog");
        setA.add("Cat");
        setA.add("Duck");

        Set<String> setB = new HashSet<>();
        setB.add("Cow");
        setB.add("Cat");
        setB.add("Dog");

        setA.retainAll(setB);
        System.out.println("Common elements: " + setA);

        setA.clear();
        System.out.println("setA cleared of elements: " + setA);




    }
}
