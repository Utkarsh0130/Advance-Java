// This program demonstrates the use of Set in Java

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet of strings
        Set<String> fruits = new HashSet<>();
        
        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, will not be added
        
        // Iterating over the HashSet
        System.out.println("Fruits in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Checking if an element exists in the HashSet
        System.out.println("Does the set contain 'Banana'? " + fruits.contains("Banana"));
        
        // Removing an element from the HashSet
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
    }
}
