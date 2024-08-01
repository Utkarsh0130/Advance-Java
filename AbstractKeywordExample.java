// This program demonstrates the use of the 'abstract' keyword in Java

// Abstract class
abstract class Animal {
    abstract void makeSound(); // Abstract method (no body)

    void eat() {
        System.out.println("Animal eats.");
    }
}

// Concrete subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractKeywordExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
