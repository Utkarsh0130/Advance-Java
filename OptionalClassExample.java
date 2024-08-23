// This program demonstrates the use of Optional class in Java

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        // Creating an Optional object that contains a value
        Optional<String> optionalWithValue = Optional.of("Hello, World!");
        
        // Creating an Optional object that is empty
        Optional<String> emptyOptional = Optional.empty();
        
        // Checking if value is present
        if (optionalWithValue.isPresent()) {
            System.out.println("Optional with value: " + optionalWithValue.get());
        }
        
        // Using orElse to provide a default value
        String result = emptyOptional.orElse("Default Value");
        System.out.println("Result from empty Optional: " + result);
        
        // Using ifPresent to execute code if value is present
        optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));
    }
}
