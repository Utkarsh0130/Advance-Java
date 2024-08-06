// This program demonstrates using the throw keyword in Java

public class ThrowKeywordExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will cause an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
