// This program demonstrates using multiple catch blocks in Java

public class TryMultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 30 / 0; // This will cause an ArithmeticException and ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        }
    }
}
