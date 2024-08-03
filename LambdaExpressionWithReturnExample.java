// This program demonstrates the use of lambda expressions with return statements in Java

@FunctionalInterface
interface MyFunctionalInterfaceWithReturn {
    int add(int a, int b);
}

public class LambdaExpressionWithReturnExample {
    public static void main(String[] args) {
        // Using lambda expression with return
        MyFunctionalInterfaceWithReturn addition = (a, b) -> {
            return a + b;
        };

        int result = addition.add(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
