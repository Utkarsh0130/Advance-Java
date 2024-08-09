// This program demonstrates the basics of the Collection API in Java

import java.util.*;

public class CollectionAPIOverview {
    public static void main(String[] args) {
        // Creating a List using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        
        // Creating a Set using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate element, will not be added
        
        // Creating a Map using HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        
        // Displaying the collections
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashMap: " + hashMap);
    }
}
