// This program demonstrates the exception hierarchy in Java

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 30 / 0; // Causes an ArithmeticException and ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            // This will catch all exceptions since Exception is the superclass of all exceptions
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
