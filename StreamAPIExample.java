// This program demonstrates the use of Stream API in Java

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 4, 1, 5, 6, 3, 4);
        
        // Using map to square each number
        System.out.println("Squared numbers:");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);
        
        // Using filter to find even numbers
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
        
        // Using reduce to find the sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);
        
        // Using sorted to sort the numbers
        System.out.println("Sorted numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
