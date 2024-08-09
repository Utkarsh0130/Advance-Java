// This program demonstrates the use of ArrayList in Java

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));
        
        // Iterating over the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Removing an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
        
        // Checking the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());
    }
}
