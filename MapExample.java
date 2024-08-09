// This program demonstrates the use of Map in Java

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap of Integer keys and String values
        Map<Integer, String> fruitMap = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Orange");
        
        // Accessing a value by key
        System.out.println("Fruit with key 2: " + fruitMap.get(2));
        
        // Iterating over the HashMap
        System.out.println("Fruits in the map:");
        for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Removing a key-value pair from the HashMap
        fruitMap.remove(2);
        System.out.println("Fruits after removal: " + fruitMap);
        
        // Checking the size of the HashMap
        System.out.println("Number of key-value pairs: " + fruitMap.size());
    }
}
