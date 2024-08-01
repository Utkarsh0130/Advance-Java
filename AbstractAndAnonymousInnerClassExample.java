// This program demonstrates the combination of abstract classes and anonymous inner classes in Java

abstract class Animal {
    abstract void makeSound();
    void eat() {
        System.out.println("Animal eats.");
    }
}

public class AbstractAndAnonymousInnerClassExample {
    public static void main(String[] args) {
        // Anonymous inner class extending abstract class
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Dog barks.");
            }
        };

        dog.makeSound();
        dog.eat();
    }
}
