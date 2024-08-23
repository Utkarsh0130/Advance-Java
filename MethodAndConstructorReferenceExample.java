// This program demonstrates the use of Method References and Constructor References in Java

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// A class representing a person
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}

public class MethodAndConstructorReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Using method reference to an instance method of a particular object
        Person person = new Person("John");
        Supplier<String> nameSupplier = person::getName;
        System.out.println("Name from method reference: " + nameSupplier.get());

        // Using method reference to a static method
        names.forEach(System.out::println);
        
        // Using constructor reference to create a new instance of Person
        names.stream()
             .map(Person::new) // Constructor reference
             .forEach(Person::printName); // Method reference
    }
}
