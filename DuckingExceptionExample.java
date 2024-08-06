// This program demonstrates ducking exceptions using throws in Java

public class DuckingExceptionExample {
    public static void main(String[] args) {
        try {
            methodA(); // Method call that throws an exception
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    static void methodA() throws Exception {
        methodB();
    }

    static void methodB() throws Exception {
        throw new Exception("Exception in methodB");
    }
}
