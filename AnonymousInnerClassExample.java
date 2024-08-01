// This program demonstrates the use of anonymous inner classes in Java

abstract class Animal {
    abstract void makeSound();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Anonymous inner class
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Dog barks.");
            }
        };

        dog.makeSound();
    }
}
