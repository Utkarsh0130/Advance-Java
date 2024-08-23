// This program demonstrates the use of the forEach method in Java

import java.util.Arrays;
import java.util.List;

public class ForEachMethodExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        
        // Using forEach method with lambda expression
        System.out.println("Using lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));
        
        // Using forEach method with method reference
        System.out.println("Using method reference:");
        fruits.forEach(System.out::println);
    }
}
